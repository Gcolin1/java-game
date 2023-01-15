package Players;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Personagens implements ActionListener {
    private int x = 100;
    private int y = 350;
    private int dx, dy;
    private Image imagem;
    private Timer timer;
    private int altura, largura;

    private boolean isAtaque = false;

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

        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isAtaque == true){
            ataque();
            isAtaque = false;
        }

        if (isAtaque == false){
            load("assets\\personagem.png");
        }
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

    public void ataque(){
        isAtaque = true;
        ImageIcon referencia = new ImageIcon("assets\\personagemAtaque.png");
        imagem = referencia.getImage();
    }

    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_Z){
            ataque();
        }

        if (codigo == KeyEvent.VK_SPACE){
            dy = -5;
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
