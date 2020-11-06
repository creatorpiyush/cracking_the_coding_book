package data_structures.trees;

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
}
