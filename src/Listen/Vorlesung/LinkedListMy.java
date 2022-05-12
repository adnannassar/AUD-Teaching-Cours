package Listen.Vorlesung;

public class LinkedListMy {
    private Node head; // null
    private int size;

    public LinkedListMy() {
    }

    public LinkedListMy(Node head) {
        this.head = head;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int value) {
        if (isEmpty()) {
            addStart(value);
        } else {
            addEnd(value);
        }
        size++;
    }

    public void set(int index, int value) {
        // set(-1,value) --> index negativ
        if (index < 0) {
            System.out.println("Negative indexe sind nicht erlaubt!");
        }
        // set(0 ,value) --> index = head
        else if (index == 0) {
            head.setValue(value);
        }
        // set(index > size ex. 1200, value) --> index = after end
        else if (index > size) {
            addEnd(value);
            size++;
        }
        // set(index = end ex 4, value) --> index = end
        else if (index == size - 1) {
            Node pointer = head;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setValue(value);
        }

        // set(2,value) --> index = 2 normal case
        else {
            Node pointer = head;
            int i = 0;
            while (i < index) {
                pointer = pointer.getNext();
                i++;
            }
            pointer.setValue(value);
        }
    }

    private void addStart(int value) {
        Node newNode = new Node(value, null);
        head = newNode;
    }

    private void addMiddle() {
        // empty
    }

    private void addEnd(int value) {
        Node newNode = new Node(value, null);
        Node pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        pointer.setNext(newNode);
    }

    public void print() {
        Node pointer = head;
        while (pointer.getNext() != null) {
            System.out.print(pointer.getValue() + " -> ");
            pointer = pointer.getNext();
        }
        System.out.println(pointer.getValue());
    }

    public Node getHead() {
        return head;
    }

    public int size() {
        return size;
    }

    public void printInfo() {
        print();
        System.out.println("Head of the list: " + head.getValue());
        System.out.println("Size of the list: " + size);
    }


}
