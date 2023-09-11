public class FinallyReturnExample {
    public static int getValue() {
        int result = 2;

        try {
            if (result > 5) {
                return 15;
            }
        } catch (Exception e) {
            return 25;
        } finally {
            return 35;
        }
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println("Returned value: " + value);
    }
}