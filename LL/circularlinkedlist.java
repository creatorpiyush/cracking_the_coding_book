package LL;

public class circularlinkedlist {

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data, Node next) {

            this.data = data;
            this.next = next;

        }

    }

    int size;
    public Node head;
    public Node tail;

    private final int def_capacity = 10;

    public circularlinkedlist() {

        this.head = null;
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
        if (isEmpty()) {
            this.tail = node;
        }
        this.size++;
    }

    public void addLast(int data) {
        Node node = new Node(data, this.head);
        if (isEmpty()) {
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
            throw new Exception("Enter a valid index");
        }
        int counter = 0;
        Node temp = this.head;
        while (counter < index) {
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    public void AddAt(int data, int index) throws Exception {

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

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        return this.head.data;
    }

}
