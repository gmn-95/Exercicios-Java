import javax.swing.*;

public class ImpressaoTest {
    public static void main(String[] args) {

        String qntdColunas = JOptionPane.showInputDialog("Quantidade de colunas do gráfico: ");
        int colunas = Integer.parseInt(qntdColunas);

        String lado = JOptionPane.showInputDialog("Digite 1, para o gráfico na esquerda: " +
                "\nDigite 2, para o gráfico em cima: ");
        int escolha = Integer.parseInt(lado);

        String[] input = new String[colunas];
        for(int i = 0; i < colunas; i++){
            input[i] = JOptionPane.showInputDialog("Enter the number: ");
        }

        int[] quantidade = new int[colunas];
        Impressao panel;

        for(int i = 0; i < colunas; i++){
            quantidade[i] = Integer.parseInt(input[i]);
        }

        panel = new Impressao(escolha, quantidade, colunas);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
    }
}
