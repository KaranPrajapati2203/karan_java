import java.util.TreeMap;
import java.util.*;

public class Test_TreeEmp {

    public static void main(String[] args) {

        try {
            TreeMap<Employee, String> etree = new TreeMap<Employee, String>();

            etree.put(new Employee(1, "suhaas"), "Manager");
            etree.put(new Employee(2, "rajeev"), "TeamLader");

            System.out.println(etree);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Employee implements Comparable<Employee> {

    private int eno;
    private String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    // Getters and setters...

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.eno, otherEmployee.eno);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
    }
}
