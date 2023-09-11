public class UserDefinedThrow {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        methodWithThrow();

        /*
         * try {
         * methodWithThrows1();
         * }catch(Exception e)
         * {
         * System.out.println(e.getMessage());
         * }
         */

    }

    static void methodWithThrow() {
        try {
            NumberFormatException ex = new NumberFormatException(); // Creating an object to NumberFormatException
                                                                    // explicitly
            throw ex; // throwing NumberFormatException object explicitly using throw keyword
        } catch (NumberFormatException ex) {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }
    }
    /*
     * static void methodWithThrows1() throws NumberFormatException,
     * NullPointerException
     * {
     * int i = Integer.parseInt("aa"); //This statement throws NumberFormatException
     * 
     * String s = null;
     * 
     * System.out.println(s.length()); //This statement throws NullPointerException
     * }
     */

}