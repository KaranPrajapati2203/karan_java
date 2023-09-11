import java.util.*;

public class Queue_ArayDqueue {

   public static void main(String[] args) {
      ArrayDeque<String> animals = new ArrayDeque<>();

      // Using add()
      animals.add("Dog");

      // Using addFirst()
      animals.addFirst("Cat");

      // Using addLast()
      animals.addLast("Horse");

      System.out.println("ArrayDeque: " + animals);
      // Get the first element
      String firstElement = animals.getFirst();
      System.out.println("First Element: " + firstElement);

      // Get the last element
      String lastElement = animals.getLast();
      System.out.println("Last Element: " + lastElement);

      /*
       * // Using poll()
       * String element = animals.poll();
       * System.out.println("Removed Element: " + element);
       * System.out.println("New ArrayDeque: " + animals);
       * 
       * // Using pollFirst()
       * String firstElement1 = animals.pollFirst();
       * System.out.println("Removed First Element: " + firstElement1);
       */

      // Using pollLast()
      String lastElement1 = animals.pollLast();
      System.out.println("Removed Last Element: " + lastElement1);
      System.out.println("New ArrayDeque: " + animals);

      // Using iterator()
      Iterator<String> iterate = animals.iterator();
      while (iterate.hasNext()) {
         System.out.print(iterate.next());
         System.out.print(", ");
      }

      System.out.print("\nArrayDeque in reverse order: ");
      // Using descendingIterator()
      Iterator<String> desIterate = animals.descendingIterator();
      while (desIterate.hasNext()) {
         System.out.print(desIterate.next());
         System.out.print(", ");
      }
   }
}
