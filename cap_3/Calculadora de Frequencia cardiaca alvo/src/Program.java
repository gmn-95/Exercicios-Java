import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter your birth Date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        String[] bd = birthDate.split("/");
        int day = Integer.parseInt(bd[0]);
        int month = Integer.parseInt(bd[1]);
        int year= Integer.parseInt(bd[2]);

        HeartRates hr = new HeartRates(name, lastName, day, month, year);

        System.out.println();
        System.out.println("Name: " + hr.getName() + " " + hr.getLastName());
        System.out.println("Birth date: " + hr.getDay() + "/" + hr.getMonth() + "/" + hr.getYear());
        System.out.println("Age: " + hr.ageInYears());
        System.out.println("Maximum Heart Rate: " + hr.maximumHeartRate());
        System.out.println("Target Heart Rate: " + hr.targetHeartRate());


        sc.close();
    }
}
