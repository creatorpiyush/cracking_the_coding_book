package practice;

import java.util.Scanner;

/**
 * binarytree
 */

public class binarytree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            data = this.data;
            left = this.left;
            right = this.right;
        }
    }

    private int size;
    private Node root;

    public binarytree() {
        Scanner s = new Scanner(System.in);
        this.root = takeNodeInput(s, null, false);
    }

    private Node takeNodeInput(Scanner s, Node parent, boolean isLeft) {

        if (parent == null) {
            System.out.println("Enter Data for root Node : ");
        } else if (isLeft) {
            System.out.println("Enter the Left Node of " + parent.data + ": ");
        } else {
            System.out.println("Enter the Right Node of " + parent.data + ": ");
        }

        int data = s.nextInt();
        Node node = new Node(data, null, null);
        this.size++;

        System.out.println("Do you have left child" + node.data + " : ");
        boolean choice = s.nextBoolean();
        if(choice){
            node.left = this.takeNodeInput(s, node, true);
        }
        System.out.println("Do you have right child" + node.data + " : ");
        choice = s.nextBoolean();
        if(choice){
            node.right = this.takeNodeInput(s, node, false)
        }

        return node;

    }

    public void display(){
        this.display(this.root);
    }

    private void display(Node node) {
        
    }

}