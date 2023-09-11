import java.util.Scanner;

public class VariableSumDemo {
    public static int getSum(int... n) {
        int sum = 0;
        for (int num : n) {
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = getSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
