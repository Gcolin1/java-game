package Players;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Personagens {
    private int x, y;
    private int dx, dy;
    private Image imagem;
    private int altura, largura;

    public void setX(int x) {
        this.x = x;
    }

    public Image getImagem() {
        return imagem;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Personagens(){
        this.x = getX();
        this.y = getY();
    }

    public void load(String caminhoImg){
        ImageIcon referencia = new ImageIcon(caminhoImg);
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }

    public void update(){
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_SPACE){
            dy = 3;
            dy -= 3;
        }

        if (codigo == KeyEvent.VK_RIGHT){
            dx = 3;
        }

        if (codigo == KeyEvent.VK_LEFT){
            dx = -3;
        }
    }

    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_SPACE){
            dy = 0;
        }

        if (codigo == KeyEvent.VK_RIGHT){
            dx = 0;
        }

        if (codigo == KeyEvent.VK_LEFT){
            dx = 0;
        }
    }
}
