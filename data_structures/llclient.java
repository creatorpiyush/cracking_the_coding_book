package data_structures;

public class llclient {

    public static void main(String[] args) throws Exception {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addLast(20);
        ll.addAt(30, 1);
        ll.addFirst(40);

        ll.display();

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAt(1));
        System.out.println(ll.getAt(2));

        System.out.println(ll.removeFirst());
        ll.display();
        System.out.println(ll.removeLast());
        ll.display();
        System.out.println(ll.removeAt(1));
        ll.display();

    }

}
