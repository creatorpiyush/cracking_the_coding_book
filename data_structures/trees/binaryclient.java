package data_structures.trees;

public class binaryclient {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        System.out.println();
        bt.display();

        System.out.println(bt.size());

        System.out.println(bt.max());

        System.out.println(bt.min());

        System.out.println(bt.find(12));
        System.out.println(bt.find(10));

        System.out.println(bt.height());

        bt.preOrder();

        System.out.println();
        bt.inOrder();

        System.out.println();
        bt.postOrder();

        System.out.println();
        bt.levelOrder();

    }

}
