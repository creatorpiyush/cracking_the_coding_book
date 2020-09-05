package LL;

public class circularlinkedlist {

    private class Node {
        int data;
        Node next;

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

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        return this.tail.data;
    }

    public int getAt(int index) throws Exception {
        return this.getNodeAt(index).data;
    }

    public int removeFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }
        Node rv = this.head;
        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
        return rv.data;
    }

    public int removeLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }
        Node rv = this.tail;
        if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node temp = this.getNodeAt(this.size - 2);
            temp.next = null;
            this.tail = temp;
        }
        this.size--;
        return rv.data;
    }

    public int removeAt(int index) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is empty");
        }
        if (index == 0) {
            return this.removeFirst();
        } else if (index == this.size - 1) {
            return this.removeLast();
        } else {
            Node temp = this.getNodeAt(index - 1);
            Node rv = temp.next;
            temp.next = temp.next.next;
            this.size--;
            return rv.data;
        }
    }

    public void display() {
        Node temp = this.head;
        do {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        } while (temp != this.head);
        System.out.println("end");
    }

}
