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
        this.leftprint(this.root, 1);
    }

    static int max_level = 0;

    private void leftprint(Node node, int level) {

        if (node == null) {
            return;
        }

        if (max_level < level) {
            System.out.print(node.data + " ");
            max_level = level;
        }

        this.leftprint(node.left, level + 1);
        this.leftprint(node.right, level + 1);

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
