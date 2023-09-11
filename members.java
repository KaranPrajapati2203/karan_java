package java_placement;

class members {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
        Employe employe = new Employe("John Doe", 30, "1234567890", "123 Main St", 5000.0, "Software Development");
        Manager manager = new Manager("Jane Smith", 40, "9876543210", "456 Oak St", 8000.0, "Human Resources");

        System.out.println("Employee Details:");
        System.out.println("Name: " + employe.name);
        System.out.println("Age: " + employe.age);
        System.out.println("Phone Number: " + employe.phoneNumber);
        System.out.println("Address: " + employe.address);
        employe.printSalary();
        System.out.println("Specialization: " + employe.specialization);

        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
  }

