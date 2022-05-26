package Listen.Vorlesung.DoublyLinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node end;

    private int size;


    public DoublyLinkedList() {
    }

    public DoublyLinkedList(Node head) {
        this.head = head;
        this.end = head;
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

    public void add(int index, int value) {
        if (index < 0) {
            System.out.println("Negative Indexe sind nicht erlaube!");
        } else if (index == 0) {
            Node newNode = new Node(value, null, null);
            if (isEmpty()) {
                end = head = newNode;
            } else {
                head.getNext().setVorgänger(newNode);
                newNode.setNext(head.getNext());
                head.setNext(newNode);
                newNode.setVorgänger(head);
            }
            size++;
        } else if (index >= size) {
            addEnd(value);
            size++;
        } else {
            Node newNode = new Node(value, null, null);
            Node pointer = head;
            int i = 0;
            while (i != index) {
                pointer = pointer.getNext();
                i++;
            }
            newNode.setVorgänger(pointer);
            newNode.setNext(pointer.getNext());
            pointer.getNext().setVorgänger(newNode);
            pointer.setNext(newNode);

            size++;
        }
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
            /*
            Node pointer = head;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setValue(value);
             */
            end.setValue(value);
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
        Node newNode = new Node(value, null, null);
        head = newNode;
        end = newNode;
    }

    private void addEnd(int value) {
        Node newNode = new Node(value, null, null);
        Node pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        newNode.setVorgänger(pointer);
        pointer.setNext(newNode);
        end = newNode;
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

    public Node getEnd() {
        return end;
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
