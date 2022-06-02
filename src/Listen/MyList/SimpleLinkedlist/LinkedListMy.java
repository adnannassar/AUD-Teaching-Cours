package Listen.MyList.SimpleLinkedlist;
//
public class LinkedListMy <E extends Comparable<E>> {

    private Node<E> head;
    private Node<E> end;
    private int size;

    public LinkedListMy() {
    }

    public LinkedListMy(Node<E> head) {
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

    public void add(E value) {
        if (isEmpty()) {
            addStart(value);
        } else {
            addEnd(value);
        }
        size++;
    }

    public void add(int index, E value) {
        if (index < 0) {
            System.out.println("Negative Indexe sind nicht erlaube!");
        } else if (index == 0) {
            Node node = new Node(value, null);
            if (isEmpty()) {
                end = head = node;
            } else {
                node.setNext(head.getNext());
                head.setNext(node);
            }
            size++;
        } else if (index >= size) {
            addEnd(value);
            size++;
        } else {
            Node node = new Node(value, null);
            Node pointer = head;
            int i = 0;
            while (i != index) {
                pointer = pointer.getNext();
                i++;
            }
            node.setNext(pointer.getNext());
            pointer.setNext(node);
            size++;
        }
    }

    public void set(int index, E value) {
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

    private void addStart(E value) {
        Node newNode = new Node(value, null);
        head = newNode;
        end = newNode;
    }

    private void addEnd(E value) {
        Node newNode = new Node(value, null);
        Node pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
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

    public void remove(E value) {
        if (isEmpty()) {
            System.out.println("List ist leer!");
        } else {
            if (head.getValue() == value) {
                head = head.getNext();
            } else if (end.getValue() == value) {
                Node pointer = head;
                while (pointer.getNext() != null) {
                    pointer = pointer.getNext();
                }
                end = pointer;
            } else {
                Node pointer = head;
                Node before_pointer = head;
                while (pointer != null) {
                    if(pointer.getValue() == value){
                        before_pointer.setNext(pointer.getNext());
                    }
                    before_pointer = pointer;
                    pointer = pointer.getNext();
                }
            }
        }
    }

    public Iterator<E> iterator (){
        return new ListeIterator<>(head);
    }

}
