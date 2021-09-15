import javax.swing.*;
import java.awt.*;

public class Grafico extends JPanel {
    private int[] quantidade;
    private int escolha;
    private int qntdColunas;

    public Grafico(int escolha, int[] quantidade, int qntdColunas){
        this.escolha = escolha;
        this.quantidade = quantidade;
        this.qntdColunas = qntdColunas;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w = 30;
        int h = 30;
        int y = 0;
        int x = 0;

        switch (escolha){
            case 1:
                // grafico da esquerda para a direita
                for(int i = 0; i < qntdColunas; i++){
                    for(int j = 0; j < quantidade[i]; j++){
                        x = 10 * j * 3;
                        g.drawRect(x, y, w, h);
                    }
                    y += 50;
                }
                break;

            case 2:
                // grafico de cima para baixo
                for(int i = 0; i < qntdColunas; i++){
                    for(int j = 0; j < quantidade[i]; j++){
                        y = 10 * j * 3;
                        g.drawRect(x, y, w, h);

                    }
                    x += 50;
                }
                break;

            case 3:
                //da direita para a esquerda
                for(int i = 0; i < qntdColunas; i++){
                    x = 370;
                    for(int j = 0; j < quantidade[i]; j++){
                        g.drawRect(x, y, w, h);
                        x -= 30;
                    }
                    y += 50;
                }
                break;

            case 4:
                //de baixo para cima
                for(int i = 0; i < qntdColunas; i++){
                    y = 335;
                    for(int j = 0; j < quantidade[i]; j++){
                        g.drawRect(x, y, w, h);
                        y -= 30;
                    }
                    x += 50;
                }
                break;
        }
    }

    public int[] getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int[] quantidade) {
        this.quantidade = quantidade;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int getQntdColunas() {
        return qntdColunas;
    }

    public void setQntdColunas(int qntdColunas) {
        this.qntdColunas = qntdColunas;
    }
}
