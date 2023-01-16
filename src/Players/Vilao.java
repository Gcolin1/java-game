package Players;

import javax.swing.*;
import java.awt.*;

public class Vilao {
    private int x;
    private int y = 350;
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

    public Vilao(){
        this.x = getX();
        this.y = getY();


    }

    public void load(String caminhoImg){
        ImageIcon referencia = new ImageIcon(caminhoImg);
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);

        setAltura(altura);
        setLargura(largura);
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }
}
