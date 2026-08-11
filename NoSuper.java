// EXP.3: Programs on various types of inheritance and Exception handling
// NAME: Aryan Khedekar
// UIN: 251P107
import java.util.Scanner;

class Person {
    String name;
    int age;
}

class Employee extends Person {
    double salary;
}

class Manager extends Employee {
    String dept;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + dept);
    }
}

public class NoSuper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Manager m = new Manager();

            System.out.print("Name: ");
            m.name = sc.nextLine();

            System.out.print("Age: ");
            m.age = Integer.parseInt(sc.nextLine());

            System.out.print("Salary: ");
            m.salary = Double.parseDouble(sc.nextLine());

            if (m.salary < 0)
                throw new Exception("Salary cannot be negative!");

            System.out.print("Department: ");
            m.dept = sc.nextLine();

            System.out.println("\n--- Manager Details ---");
            m.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
