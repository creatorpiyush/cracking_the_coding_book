package trees;

import java.util.Scanner;

public class binarytree {

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    Node root;
    int size;

    public binarytree() {
        Scanner s = new Scanner(System.in);
        this.root = takeinput(s, null, false);
    }

    private Node takeinput(Scanner s, Node parent, boolean isLeft) {
        if (parent == null) {
            System.out.println("Enter data for root Node : ");
        } else if (isLeft) {
            System.out.println("Enter data for Left child of " + parent.data);
        } else {
            System.out.println("Enter data for Right child of " + parent.data);
        }

        int data = s.nextInt();
        Node node = new Node(data, null, null);
        this.size++;

        System.out.println("Do you have Left child of " + node.data);
        boolean choice = s.nextBoolean();
        if (choice) {
            node.left = this.takeinput(s, node, true);
        }
        System.out.println("Do you have right child of " + node.data);
        choice = s.nextBoolean();
        if (choice) {
            node.right = this.takeinput(s, node, false);
        }

        return node;
    }

    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        if (node.left != null) {
            System.out.print(node.left.data + " => ");
        } else {
            System.out.print("End => ");
        }
        System.out.print(node.data);
        if (node.right != null) {
            System.out.print(" <= " + node.right.data);
        } else {
            System.out.print(" <= End");
        }
        System.out.println();
        if (node.left != null) {
            this.display(node.left);
        }
        if (node.right != null) {
            this.display(node.right);
        }
    }

    public int size() {
        return this.size(this.root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        int lsize = this.size(node.left);
        int rsize = this.size(node.right);
        int mysize = lsize + rsize + 1;
        return mysize;
    }

    public int max() {
        return this.max(this.root);
    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int lmax = this.max(node.left);
        int rmax = this.max(node.right);
        int mymax = Math.max(node.data, Math.max(lmax, rmax));

        return mymax;
    }

    public int min() {
        return this.min(this.root);
    }

    private int min(Node node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int lmin = this.min(node.left);
        int rmin = this.min(node.right);
        int mymin = Math.min(node.data, Math.min(lmin, rmin));

        return mymin;
    }

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lheight = this.height(node.left);
        int rheight = this.height(node.right);
        int myheight = Math.max(lheight, rheight) + 1;

        return myheight;
    }

    public boolean find(int data) {
        return this.find(this.root, data);
    }

    private boolean find(Node node, int data) {
        if (node == null) {
            return false;
        }
        if (node.data == data) {
            return true;
        } else if (this.find(node.left, data)) {
            return true;
        } else if (this.find(node.right, data)) {
            return true;
        } else {
            return false;
        }
    }

    public void preorder() {
        this.preorder(this.root);
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        this.preorder(node.left);
        this.preorder(node.right);

    }

    public void inorder() {
        this.inorder(this.root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }

        this.inorder(node.left);
        System.out.print(node.data + " ");
        this.inorder(node.right);
    }

}
