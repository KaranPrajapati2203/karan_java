package java_placement;

public class Employee_Info {
	
	 public static void main(String[] args) {
	        Employee e1 = new Employee("Robert", 1994, "64C-Wallstreet",45000);
	        Employee e2 = new Employee("Sam", 2000, "68D-Wallstreet",75000);
	        Employee e3 = new Employee("John", 1999, "26B-Wallstreet",66000);

	        System.out.println("Name\tYear of joining\t\tAddress");
	        System.out.println(e1.name + "\t" + e1.yearOfJoining + "\t\t" + e1.address);
	        System.out.println(e2.name + "\t" + e2.yearOfJoining + "\t\t" + e2.address);
	        System.out.println(e3.name + "\t" + e3.yearOfJoining + "\t\t" + e3.address);
	    }
	
}
