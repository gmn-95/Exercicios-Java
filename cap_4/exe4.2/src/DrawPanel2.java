import javax.swing.*;
import java.awt.*;

public class DrawPanel2 extends JPanel {

    // desenha um X a partir dos cantos do painel
    public void paintComponent(Graphics g){

        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); // largura total
        int height = getHeight(); // alura total

        int bordaX,bordaY;
        int cont = 1;
        int loop = 1;

        bordaX = width/15;
        bordaY = height/15;

        while (loop < 15){
            // canto superior esquerdo
            g.drawLine(0, bordaY * cont, bordaX * cont, height);

            // canto inferior esquerdo
              g.drawLine(0, height - bordaY * cont, bordaX * cont, 0);

            // canto superior direito
            g.drawLine(width, bordaY * cont, width - bordaX * cont, height);

            g.drawLine(width, height - bordaY * cont, width - bordaX * cont, 0);
            
            loop++;
            cont++;
        }
    }
}
