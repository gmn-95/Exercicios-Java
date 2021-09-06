//Usando JOptionPane para exibir múltiplas linhas em uma caixa de diálogo.
import javax.swing.*;

public class Dialog1 {
    public static void main(String[] args) {

        //exibe um diálogo com uma mensagem
        //JOptionPane.showMessageDialog(null, "Amo Você!");

        // pede para o usuário inserir seu nome
        String name = JOptionPane.showInputDialog("What is your name? ");
        String mensage;
        if(name == null){
            mensage = "Welcome to Java Programming!";
        }
        else {
            // cria a mensagem
            mensage = String.format("Welcome, %s, to Java Programming!", name);
        }

        //exibe a mensagem para o usuário
        JOptionPane.showMessageDialog(null, mensage);

    }
}
