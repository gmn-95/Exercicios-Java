import javax.swing.*;
import java.awt.*;

public class DrawPanel1 extends JPanel {

    public void paintComponent(Graphics g){

        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); // largura total
        int height = getHeight(); // altura total
        int cont = 1;
        int passos = 0;

        while (width - passos >= 0){
            // canto superior esquerdo
            g.drawLine(0, 0, passos, height - passos);

            // canto inferior direito
            g.drawLine(width, height, passos, height - passos);

            // canto superior direito
            g.drawLine(width, 0, passos, passos);

            // canto inferior esquerdo
            g.drawLine(0, height, passos, passos);

            passos += 15;
            cont++;
        }



    }
}
