package LL;

public class cllclient {

    public static void main(String[] args) throws Exception {

        circularlinkedlist cll = new circularlinkedlist();

        cll.addFirst(10);
        cll.addLast(20);
        cll.addLast(30);
        cll.addLast(40);

        System.out.println(cll.getFirst());
        System.out.println(cll.getLast());
        System.out.println(cll.getAt(1));
        System.out.println(cll.getAt(2));

        System.out.println(cll.removeFirst());
        System.out.println(cll.getFirst());

        System.out.println(cll.removeLast());
        System.out.println(cll.getLast());

        System.out.println(cll.removeAt(0));
        System.out.println(cll.getAt(0));

        cll.display();

    }

}
