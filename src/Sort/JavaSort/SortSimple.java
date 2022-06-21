package Sort.JavaSort;

import Sort.ArrayTools.ArrayTools;
import Sort.Entities.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SortSimple {
    public static void main(String[] args) {
        Person p1 = new Person("Iman", 27);
        Person p2 = new Person("Ranim", 24);
        Person p3 = new Person("Adnan", 22);
        Person p4 = new Person("XYZ", 25);


        Person array[] = {p1, p2, p3, p4};

        ArrayTools.printArray(array);
        // 1. class Arrays
        /*
        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
         */
        Arrays.sort(array);
        ArrayTools.printArray(array);

        LinkedList<Person> personLinkedList = new LinkedList<>(Arrays.asList(p1, p2, p3, p4));
        /*
        personLinkedList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
         */
        System.out.println(personLinkedList);
        Collections.sort(personLinkedList);
        System.out.println(personLinkedList);
    }
}
