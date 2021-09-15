import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        String qntdColunas = JOptionPane.showInputDialog("Quantidade de colunas do gráfico (MAX 8) : ");
        int colunas = Integer.parseInt(qntdColunas);
        int escolha = 0;

        do{
            String lado = JOptionPane.showInputDialog("1 - Gráfico na esquerda: " +
                    "\n2 - Gráfico em cima: " +
                    "\n3 - Gráfico na direita: " +
                    "\n4 - Gráfico em baixo: ");
            escolha = Integer.parseInt(lado);

        }while (escolha < 1 || escolha > 4);

        String[] input = new String[colunas];
        for(int i = 0; i < colunas; i++){
            input[i] = JOptionPane.showInputDialog("Coluna " + (i + 1) + ": ");
        }

        int[] quantidade = new int[colunas];
        Grafico panel;

        for(int i = 0; i < colunas; i++){
            quantidade[i] = Integer.parseInt(input[i]);
        }

        panel = new Grafico(escolha, quantidade, colunas);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
    }
}
