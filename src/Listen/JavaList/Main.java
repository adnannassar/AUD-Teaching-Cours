package Listen.JavaList;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random random = new Random();
        for(int i = 0 ; i<1000000; i++){
            set.add(random.nextInt());
        }
        System.out.println(set);
    }
}
