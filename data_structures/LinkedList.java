package data_structures;

/**
 * stack
 */
public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    int size;
    Node head, tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data, this.head);
        this.head = node;
        if (this.isEmpty()) {
            this.tail = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data, null);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    private Node getNodeAt(int index) throws Exception {
        if (index < 0 || index >= this.size) {
            throw new Exception("Invalid Index");
        }

        int counter = 0;
        Node temp = this.head;
        while (counter < index) {
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public void addAt(int data, int index) throws Exception {
        if (index == 0) {
            this.addFirst(data);
        } else if (index == this.size) {
            this.addLast(data);
        } else {
            Node temp = this.getNodeAt(index - 1);
            Node node = new Node(data, temp.next);
            temp.next = node;
            this.size++;
        }

    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("End");
    }

}