package trees;

public class bst {

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

    private Node root;
    private int size;

    public void add(int data) {
        if (this.root == null) {
            this.root = new Node(data, null, null);
            this.size++;
        } else {
            this.add(this.root, data);
        }
    }

    private void add(Node node, int data) {
        if (data < node.data) {
            if (node.left != null) {
                this.add(node.left, data);
            } else {
                node.left = new Node(data, null, null);
                this.size++;
            }
        } else if (data > node.data) {
            if (node.right != null) {
                this.add(node, data);
            } else {
                node.right = new Node(data, null, null);
                this.size++;
            }
        }
    }

}
