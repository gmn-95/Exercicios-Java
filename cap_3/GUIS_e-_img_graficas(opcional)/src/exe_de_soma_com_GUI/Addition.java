package exe_de_soma_com_GUI;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        boolean stop = true;
        int number1;
        int number2;

        while (stop) {
            try{
                // mostra uma mensagem e pede ao usuário para informar um número
                JOptionPane.showMessageDialog(null, "CÁLCULADORA BÁSICA");
                String n1 = JOptionPane.showInputDialog("Enter first number: ");
                String n2 = JOptionPane.showInputDialog("Enter second number: ");

                if(n1 == null || n2 == null){
                    stop = false;
                }
                else{
                    // converte String em Int
                    number1 = Integer.parseInt(n1);
                    number2 = Integer.parseInt(n2);

                    int sum = number1 + number2;

                    String result = String.format("%d + %d = %d", number1, number2, sum);
                    // mostra uma mensagem na tela
                    JOptionPane.showMessageDialog(null, result);
                    stop = false;
                }

            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error! Try again!");
            }
        }

        input.close();
    }
}
