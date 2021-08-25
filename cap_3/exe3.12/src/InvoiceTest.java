import java.util.Locale;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product description: ");
        String description = sc.nextLine();

        System.out.print("Enter the quantity: ");
        int quanitty = sc.nextInt();

        System.out.print("Enter the price: $");
        double price = sc.nextDouble();

        Invoice invoice = new Invoice("35874H", description, quanitty, price);
        System.out.println();
        System.out.println("INVOICE: ");
        System.out.println("Invoice Number: " + invoice.getInvoiceNumber());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price: $" + invoice.getPrice());
        System.out.println();
        System.out.println("amount to be paid: $" + invoice.getInvoice());



        sc.close();
    }
}
