package Sort.HashCodeAndEquals;

import Sort.Entities.Person;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Set {
    public static void main(String[] args) {
        Person p1 = new Person("Iman", 27);
        Person p2 = new Person("Ranim", 27);
        Person p3 = new Person("Adnan", 22);
        Person p4 = new Person("Adnan", 25);
        Person p5 = new Person("XYZ", 20);
        Person p6 = new Person("XYZ", 20);

        // hashCode
        System.out.println("p5 hashCode :" + p5.hashCode());
        System.out.println("p6 hashCode :" + p6.hashCode());

        LinkedList<Person> integerLinkedList = new LinkedList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
        System.out.println("List: " + integerLinkedList);

        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
        System.out.println("Set:  " + linkedHashSet);


    }
}
