package Listen.JavaList;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        // enhanced = erweiterte for schleife
        System.out.println();
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
        // Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // For each "Streams-API" using lambda
        list.forEach(item -> System.out.print(item + " "));




    }
}
