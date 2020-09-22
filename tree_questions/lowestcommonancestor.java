package tree_questions;

/**
 * lowestcommonancestor
 */

class Node {
    int data;
    Node left, right;

    Node(int item) {
        this.data = item;
        this.left = this.right = null;
    }
}

public class lowestcommonancestor {

    Node root;

    public Node findLCA(int n1, int n2) {
        return this.findLCA(this.root, n1, n2);
    }

    private Node findLCA(Node node, int n1, int n2) {
        if (node == null) {
            return null;
        }
        if (node.data == n1 || node.data == n2) {
            return node;
        }

        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);

        if (left_lca != null && right_lca != null) {
            return node;
        }

        return (left_lca != null) ? left_lca : right_lca;
    }

    public static void main(String[] args) {
        lowestcommonancestor tree = new lowestcommonancestor();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(tree.findLCA(4, 5).data);
    }

}