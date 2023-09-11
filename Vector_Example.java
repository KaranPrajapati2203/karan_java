import java.util.*;

public class Vector_Example {

    public static void main(String[] args) {
        Vector<String> animals = new Vector<>(5);
        Vector<Integer> numbers = new Vector<>(5);

        numbers.add(12);
        numbers.add(2);
        numbers.add(1);
        numbers.add(20);
        numbers.add(11);
        numbers.add(21);
        numbers.add(56);
        numbers.add(78);
        numbers.add(89);
        numbers.add(90);

        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        // Using get()

        // String element = animals.get(0);
        // System.out.println("Element at index 0: " + element);

        // Using iterator()

        // Iterator<String> iterate = animals.iterator();
        // System.out.print("Vector: ");
        // while (iterate.hasNext()) {
        //     System.out.print(iterate.next());
        //     System.out.print(", ");
        // }

        Enumeration<String> en = animals.elements();

        // traversing elements of Vector using Enumeration

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
        System.out.println(animals.capacity());
        animals.clear();

        Enumeration<Integer> em = numbers.elements();
        while (em.hasMoreElements()) {
            System.out.println(em.nextElement());
        }

        System.out.println("CApacity" + numbers.capacity());
        System.out.print(animals);

        System.out.println(numbers.get(2));
    }
}