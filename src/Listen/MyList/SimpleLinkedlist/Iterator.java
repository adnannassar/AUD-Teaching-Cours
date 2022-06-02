package Listen.MyList.SimpleLinkedlist;
public interface Iterator<E extends Comparable<E>> {
    boolean hasNext();
    E next();
}
