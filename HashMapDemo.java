
//Program to demonstrate HashMap class
// package com.tnsif.dayeighteen.map;
import java.util.*;

// import com.tnsif.dayeighteen.Employee;
class HashMapDemo {
    public static void main(String args[]) {

        // Hashmap with String key and Integer Value - Sorted on Keys order
        HashMap<String, Integer> bookMap = new HashMap<String, Integer>();

        bookMap.put("Let Us C", 320);
        bookMap.put("The Complete Referece C++ ", 450);
        bookMap.put("The Complete Referece Java 2", 465);
        bookMap.put("Python Programming", 599);
        bookMap.put("Application Development using Spring Boot", 600);
        System.out.println("Book Details are ");
        System.out.println(bookMap);

        System.out.println("Traversing a HashMap");

        Set set = bookMap.entrySet(); // Get a set of the entries
        Iterator i = set.iterator(); // Get an iterator
        while (i.hasNext()) { // Display elements
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        // Hash map with null keys and null values
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("Nitin", "nitin123@gmail.com");
        hm1.put("Deepak", null);
        hm1.put(null, "abc");
        hm1.put("Harish", null);
        hm1.put(null, null);
        hm1.put("Ravi", "ravi123@gmail.com");
        System.out.println("Person Hashmap with name and emailId");
        System.out.println(hm1);

        // Hashmap with Integer key and User defined Object as a Value
        HashMap<Integer, Employee> EmployeeMap = new HashMap<Integer, Employee>();
        EmployeeMap.put(10001, new Employee(1, "Aniket", 78));
        EmployeeMap.put(10005, new Employee(2, "Sumit", 84));
        EmployeeMap.put(10006, new Employee(3, "Amit", 81));
        EmployeeMap.put(10003, new Employee(5, "Ankit", 72));
        EmployeeMap.put(10004, new Employee(4, "Anil", 78));
        System.out.println("Employee Details are " + EmployeeMap);
    }
}
