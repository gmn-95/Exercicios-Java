import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Employee1: ");
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter annual salary: ");
        double annualSalary = sc.nextDouble();

        Employee employee1 = new Employee(name, lastName, annualSalary);

        System.out.println();
        System.out.println("Employee2: ");
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter last name: ");
        lastName = sc.nextLine();

        System.out.print("Enter annual salary: ");
        annualSalary = sc.nextDouble();

        Employee employee2 = new Employee(name, lastName, annualSalary);

        System.out.println();
        System.out.println("Employee1: ");
        System.out.println("Name: " + employee1.getName() + " " + employee1.getLastName());
        System.out.println("Annual salary: " + employee1.getAnnualSalary());

        System.out.println();
        System.out.println("Employee2: ");
        System.out.println("Name: " + employee2.getName() + " " + employee2.getLastName());
        System.out.println("Annual salary: " + employee2.getAnnualSalary());

        employee1.salaryIncrease(0.10);
        employee2.salaryIncrease(0.10);

        System.out.println();
        System.out.println("Employee1: Annual salary with 10% of increase: " + employee1.getAnnualSalary());
        System.out.println("Employee2: Annual salary with 10% of increase: " + employee2.getAnnualSalary());

        sc.close();
    }
}
