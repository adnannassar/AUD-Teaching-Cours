package Listen.MyList.SimpleLinkedlist;

public class ListeIterator<E extends Comparable<E>> implements Iterator<E> {

    Node<E> iteratorHead;

    public ListeIterator(Node<E> nextObject) {
        this.iteratorHead = nextObject;
    }

    @Override
    public boolean hasNext() {
        return iteratorHead != null;
    }

    @Override
    public E next() {
        E value = iteratorHead.getValue();
        iteratorHead = iteratorHead.getNext();
        return value;
    }
}
