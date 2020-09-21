package trees;

public class clientbst {

    public static void main(String[] args) {

        bst bst = new bst();

        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(7);
        bst.add(12);
        bst.add(20);

        bst.display();

        System.out.println(bst.max());

        System.out.println(bst.min());

        bst.remove(5);
        bst.display();

        bst.roottoleaf();
    }

}
