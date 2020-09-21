package trees;

public class clientbinarytree {

    public static void main(String[] args) {

        binarytree bt = new binarytree();

        bt.display();

        System.out.println(bt.size());

        System.out.println(bt.max());

        System.out.println(bt.min());

        System.out.println(bt.height());

        System.out.println(bt.find(50));

        bt.preorder();

        System.out.println();
        bt.inorder();

        System.out.println();
        bt.postorder();

        System.out.println();
        bt.levelorder();

        System.out.println();
        bt.roottoleaf();
    }

}
