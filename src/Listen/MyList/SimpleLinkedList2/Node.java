package Listen.MyList.SimpleLinkedList2;


// java beans
public class Node <E> {
    private E value;
    private Node next;

    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
