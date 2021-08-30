import javax.swing.*;

public class DrawPanel2Test {
    public static void main(String[] args) {

        // cria um painel com o nosso desenho
        DrawPanel2 panel2 = new DrawPanel2();

        //cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel2); // adiciona o painel ao frame
        application.setSize(450, 450); // configura o tamanho do frame
        application.setVisible(true); // torna o fram visível
    }
}
