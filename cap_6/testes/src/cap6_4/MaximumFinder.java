package cap6_4;

import java.util.Locale;
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three floating-point values separated by spaces: ");

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double result = maximum(n1, n2, n3);

        System.out.println("Maximum is: " + result);
    }

    public static double maximum(double x, double y, double z){
        return Math.max(x, Math.max(y, z));
    }
}
