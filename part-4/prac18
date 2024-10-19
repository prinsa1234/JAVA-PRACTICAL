import java.util.Scanner;
import java.lang.String;
class Member {
    String name;
    int age;
    String phoneNum;
    String address;
    double salary;
    
    // Constructor
    Member(String name, int age, String phoneNum, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.address = address;
        this.salary = salary;
    }
    
    // Method to print the salary
    void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}

class Employee extends Member {
    String specialization;

    // Constructor
    Employee(String name, int age, String phoneNum, String address, double salary, String specialization) {
        super(name, age, phoneNum, address, salary);
        this.specialization = specialization;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    String department;

    // Constructor
    Manager(String name, int age, String phoneNum, String address, double salary, String department) {
        super(name, age, phoneNum, address, salary);
        this.department = department;
    }

    // Method to display manager details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
    }
}

public class prac18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Age: ");
        int empAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Phone Number: ");
        String empPhoneNum = scanner.nextLine();
        System.out.print("Address: ");
        String empAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        System.out.print("Specialization: ");
        String empSpecialization = scanner.nextLine();

        Employee emp = new Employee(empName, empAge, empPhoneNum, empAddress, empSalary, empSpecialization);
        System.out.println("\nEmployee Details:");
        emp.displayDetails();

        // Input for Manager
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Age: ");
        int mgrAge = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Phone Number: ");
        String mgrPhoneNum = scanner.nextLine();
        System.out.print("Address: ");
        String mgrAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline
        System.out.print("Department: ");
        String mgrDepartment = scanner.nextLine();

        Manager mgr = new Manager(mgrName, mgrAge, mgrPhoneNum, mgrAddress, mgrSalary, mgrDepartment);
        System.out.println("\nManager Details:");
        mgr.displayDetails();

        scanner.close();
    }
}
