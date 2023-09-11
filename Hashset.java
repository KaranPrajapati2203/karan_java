import java.util.*;

public class Hashset {

    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();

        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet2: " + evenNumbers);

        // Intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumbers);

        // Difference between HashSet1 and HashSet2
        HashSet<Integer> primeNumbers1 = new HashSet<>();
        primeNumbers1.add(2);
        primeNumbers1.add(3);
        primeNumbers1.add(5);
        System.out.println("HashSet1: " + primeNumbers1);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers1.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers1);
    }

}
