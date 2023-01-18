package Fase;

import javax.swing.*;
import java.awt.*;

public class Chao {
    private int x, y;
    private int altura, largura;
    private Image imagem;

    public void setY(int y) {
        this.y = y;
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

    public Image getImagem() {
        return imagem;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void load(String caminhoImg){
        ImageIcon referencia = new ImageIcon(caminhoImg);
        imagem = referencia.getImage();
        altura = imagem.getHeight(null);
        largura = imagem.getWidth(null);
    }
}
