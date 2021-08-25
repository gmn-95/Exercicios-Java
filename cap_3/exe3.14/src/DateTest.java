import java.util.Locale;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        Date1 date = new Date1(day, month, year);

        date.displayDate();


        sc.close();
    }
}
