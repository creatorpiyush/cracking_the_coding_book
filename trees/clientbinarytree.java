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

    }

}
