package Fase;
import Players.Personagens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Cenario extends JPanel implements ActionListener {
    private Image fundo;
    private Personagens player;

    private Timer timer;

    public Cenario(){
        setFocusable(true);
        setDoubleBuffered(true);

        ImageIcon bg = new ImageIcon("assets\\bg.jpg");
        fundo = bg.getImage();

        player = new Personagens();
        player.load("assets\\personagem.png");

        addKeyListener(new TecladoAdapter());

        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        //pintando imagem na tela e sua posição
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
    }

    private class TecladoAdapter extends KeyAdapter implements Fase.TecladoAdapter {
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
