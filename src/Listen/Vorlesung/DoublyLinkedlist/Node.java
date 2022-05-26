package Listen.Vorlesung.DoublyLinkedlist;


// java beans
public class Node {
    private int value;
    private Node next;
    private Node vorgänger;

    public Node(int value, Node next , Node vorgänger) {
        this.value = value;
        this.next = next;
        this.vorgänger =  vorgänger;
    }

    public Node getVorgänger() {
        return vorgänger;
    }

    public void setVorgänger(Node vorgänger) {
        this.vorgänger = vorgänger;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
