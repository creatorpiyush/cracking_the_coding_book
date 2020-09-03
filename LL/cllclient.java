package LL;

public class cllclient {

    public static void main(String[] args) throws Exception {

        circularlinkedlist cll = new circularlinkedlist();

        cll.addFirst(10);
        cll.addLast(20);
        System.out.println(cll.getFirst());
        System.out.println(cll.getLast());

    }

}
