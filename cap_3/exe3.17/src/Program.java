import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Last name: ");
        String lastName = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        System.out.print("Height in meters (ex: 1.80):  ");
        double height = sc.nextDouble();

        System.out.print("Weight in kg (ex: 70.5): ");
        double weight = sc.nextDouble();

        String[] bd = birthDate.split("/");

        int day = Integer.parseInt(bd[0]);
        int month = Integer.parseInt(bd[1]);
        int year = Integer.parseInt(bd[2]);

        HealthProfile hp = new HealthProfile(name, lastName, day, month, year, height, weight);

        System.out.println();
        System.out.println("Health Profile: ");
        System.out.println("Name: " + hp.getName());
        System.out.println("Last name: " + hp.getLastName());
        System.out.println("Birth date: " + hp.getDay() + "/" + hp.getMonth() + "/" + hp.getYear());
        System.out.println("Age: " + hp.ageInyears());
        System.out.println("\nMaxmum Heart Rate: " + hp.maxmumHeartRate());
        System.out.printf("Target Heart Rate: %.2f", hp.targetHeartRate());
        System.out.printf("\nIMC: %.2f", hp.imc());

        System.out.println("\n");
        System.out.println("|-----------------------------------------|");
        System.out.println("|                IMC table                |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| Abaixo do peso         |    Abaixo 18.5 |");
        System.out.println("| Peso normal            |    18.5 - 24.9 |");
        System.out.println("| Sobrepeso              |      25 - 29.9 |");
        System.out.println("| Obesidade Grau |       |      30 - 34.9 |");
        System.out.println("| Obesidade Grau ||      |      35 - 39.9 |");
        System.out.println("| Obesidade Grau |||     |        >= 40   |");
        System.out.println("|-----------------------------------------|");

        sc.close();
    }
}
