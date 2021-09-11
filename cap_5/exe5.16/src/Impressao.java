import javax.swing.*;
import java.awt.*;

public class Impressao extends JPanel {
    private int[] quantidade;
    private int escolha;
    private int qntdColunas;

    public Impressao (int escolha, int[] quantidade, int qntdColunas){
        this.escolha = escolha;
        this.quantidade = quantidade;
        this.qntdColunas = qntdColunas;
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w = 30;
        int h = 30;
        int y;
        int x;

        switch (escolha){
            case 1:
                // grafico da esquerda para a direita
                y = getWidth() / 2;
                for(int i = 0; i < qntdColunas; i++){
                    for(int j = 0; j < quantidade[i]; j++){
                        x = 10 * j * 3;
                        g.drawRect(x, y, w, h);
                        //  g.drawString("*", 10 * j * 3, y); // realizando o gráfico com '*'
                    }
                    y += 50;
                }
                break;

            case 2:
                // grafico de cima para baixo
                x = getHeight() / 3;
                for(int i = 0; i < qntdColunas; i++){
                    for(int j = 0; j < quantidade[i]; j++){
                        y = 10 * j * 3;
                        g.drawRect(x, y, w, h);

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
