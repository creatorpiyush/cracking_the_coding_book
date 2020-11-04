package data_structures;

public class llclient {

    public static void main(String[] args) throws Exception {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addLast(20);
        ll.addAt(30, 1);

        ll.display();

    }

}
