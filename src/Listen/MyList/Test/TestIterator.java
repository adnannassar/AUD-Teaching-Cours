package Listen.MyList.Test;


import Listen.MyList.SimpleLinkedlist.Iterator;
import Listen.MyList.SimpleLinkedlist.LinkedListMy;

public class TestIterator {

    public static void main(String[] args) {
        LinkedListMy<Integer> myLinkedList = new LinkedListMy<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        Iterator<Integer> it = myLinkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
