import java.util.Locale;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("\nEnter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("\nAdding %.2f to account1 balance\n\n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("\nEnter deposit amount for account2: ");
        depositAmount = input.nextDouble();

        System.out.printf("\nAdding %.2f to account2 balance\n\n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        // withdraw
        System.out.print("\nEnter withdraw amount for account1: ");
        double withdrawAmount = input.nextDouble();

        System.out.printf("\nRemoving %.2f to account1 balance\n\n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("\nEnter withdraw amount for account2: ");
        withdrawAmount = input.nextDouble();

        System.out.printf("\nRemoving %.2f to account2 balance\n\n", withdrawAmount);
        account2.withdraw(withdrawAmount);
        input.close();

        displayAccount(account1);
        displayAccount(account2);

    }

    public static void displayAccount(Account account){
        System.out.printf("%s balance: $%.2f\n", account.getName(), account.getBalance());
    }
}
