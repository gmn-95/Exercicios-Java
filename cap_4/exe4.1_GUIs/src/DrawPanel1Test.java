import javax.swing.*;

public class DrawPanel1Test {
    public static void main(String[] args) {
        // cria um painel que contém nosso desenho
        DrawPanel1 panel1 = new DrawPanel1();

        // cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel1); // adiciona o painel ao frame
        application.setSize(450, 450); // configura o tamanho do frame
        application.setVisible(true); // torna o frama visível
    }
}
