import java.util.*;

public class VectorOdd {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(15);
        numbers.add(12);
        numbers.add(22);
        numbers.add(11);
        numbers.add(100);
        numbers.add(76);

        // System.out.println(numbers);
        Enumeration<Integer> en = numbers.elements();

        while (en.hasMoreElements()) {
            int num = en.nextElement();
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
