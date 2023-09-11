package java_placement;

class Example {
    static int staticVariable = 10;
    final int finalVariable = 20;
    
    static void staticMethod() {
        System.out.println("This is a static method");
    }
    
    final void finalMethod() {
        System.out.println("This is a final method");
    }
    
    public static void main(String[] args) {
        System.out.println(Example.staticVariable); // Accessing static variable
        
        Example.staticMethod(); // Calling static method
        
        Example obj = new Example();
        System.out.println(obj.finalVariable); // Accessing final variable
        
        obj.finalMethod(); // Calling final method
    }
}
