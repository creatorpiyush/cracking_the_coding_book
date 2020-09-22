package tree_questions;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        this.data = item;
        this.left = this.right = null;
    }
}

public class printleft {
    Node root;

    public void leftprint() {
        this.leftprint(this.root);
    }

    private void leftprint(Node node) {
        if (node.left != null) {
            System.out.print(node.left.data + " ");
        }

        if (node.left != null) {
            this.leftprint(node.left);
        }
    }

    public static void main(String[] args) {
        printleft tree = new printleft();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.leftprint();
    }

}
