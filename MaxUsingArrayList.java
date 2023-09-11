import java.util.*;

public class MaxUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(22);
        nums.add(9090);
        nums.add(220);
        nums.add(120);
        nums.add(5599);

        System.out.println(nums);

        checkMax(nums);
    }

    public static void checkMax(ArrayList<Integer> nums) {
        int max = nums.get(0); 

        for (int i = 1; i < nums.size(); i++) {
            int currentNum = nums.get(i);
            if (currentNum > max) {
                max = currentNum; 
            }
        }
        System.out.println("Maximum value in the ArrayList: " + max);
    }
}
