package data_structures.trees;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {

    class Node {
        int data;
        Node left, right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    int size = 0;
    Node root;

    BinaryTree() {
        Scanner s = new Scanner(System.in);
        this.root = this.takeInput(s, null, false);
    }

    private Node takeInput(Scanner s, Node parent, boolean isLeft) {
        if (parent == null) {
            System.out.print("Enter data for root of the tree : ");
        } else if (isLeft) {
            System.out.print("Enter data for Left Child of " + parent.data + ":");
        } else {
            System.out.print("Enter data for Right Child of " + parent.data + ":");
        }

        int data = s.nextInt();
        Node node = new Node(data, null, null);
        this.size++;

        System.out.print("Do you have a Left child of " + node.data + " : ");
        boolean choice = s.nextBoolean();
        if (choice) {
            node.left = this.takeInput(s, node, true);
        }

        System.out.print("Do you have a Right child of " + node.data + " : ");
        choice = s.nextBoolean();
        if (choice) {
            node.right = this.takeInput(s, node, false);
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
        return lsize + rsize + 1;
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
        return Math.max(node.data, Math.max(lmax, rmax));
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

        return Math.min(node.data, Math.min(lmin, rmin));
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

    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {

        if (node == null) {
            return -1;
        }

        int lheight = this.height(node.left);
        int rheight = this.height(node.right);

        return Math.max(lheight, rheight) + 1;
    }

    public void preOrder() {
        this.preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    public void inOrder() {
        this.inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        this.inOrder(node.left);
        System.out.print(node.data + " ");
        this.inOrder(node.right);
    }

    public void postOrder() {
        this.postOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrder() {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node rv = queue.remove();
            System.out.print(rv.data + " ");
            if (rv.left != null) {
                queue.add(rv.left);
            }
            if (rv.right != null) {
                queue.add(rv.right);
            }
        }
    }

}
