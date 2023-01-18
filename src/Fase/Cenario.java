package Fase;

import Players.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Cenario extends JPanel implements ActionListener {
    private Image fundo;
    private Personagens player;

    private Vilao vilao;

    private Chao chao;

    private Timer timer;


    public Cenario(){
        setFocusable(true);
        setDoubleBuffered(true);

        chao = new Chao();
        chao.load("assets\\chao.png");
        chao.setY(528);

        ImageIcon bg = new ImageIcon("assets\\bg.jpg");
        fundo = bg.getImage();

        player = new Personagens();
        player.load("assets\\personagem.png");


        vilao = new Vilao();
        vilao.load("assets\\vilao.png");
        vilao.setX(700);
        vilao.setY(230);

        addKeyListener(new TecladoAdapter());

        timer = new Timer(5, this);
        timer.start();

    }



    public void paint(Graphics g){
        player.Colisao(chao.getY(), chao.getAltura());
        Graphics2D graficos = (Graphics2D) g;
        //pintando imagem na tela e sua posição
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);
        graficos.drawImage(vilao.getImagem(), vilao.getX(), vilao.getY(), this);
        graficos.drawImage(chao.getImagem(), chao.getX(), chao.getY(), this);
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
    }

    private class TecladoAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            player.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e){
            player.keyRelease(e);
        }
    }

}
