import java.util.*;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] arr1 = { 30, 20, 10, 990, 55 };
        int[] arr2 = { 1, 2, 5, 4, 3 };

        System.out.println("Enter your choice:");
        System.out.println("1 = sort array, 2 = Total of all elements, 3 = Merge two arrays");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                Arrays.sort(arr1);
                System.out.println("Sorted array arr1:");
                for (int num : arr1) {
                    System.out.print(num + " ");
                }
                break;

            case 2:
                int total = 0;
                for (int num : arr1) {
                    total = total + num;
                }
                System.out.println("Total of all elements in arr1: " + total);
                break;

            case 3:
                System.out.println("The merged array is:");
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
}
