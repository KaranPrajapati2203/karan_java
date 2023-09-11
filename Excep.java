import java.util.*;

public class Excep {
    public static void checkEven(int number) {
        if (number % 2 != 0) {
            throw new ArithmeticException("Number is odd. Odd numbers are not allowed.");
        }
        System.out.println(number + " is even.");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        try {
            checkEven(num);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}