package Game_engine;

import Fase.Cenario;

import javax.swing.*;

public class Container extends JFrame {
    public Container(){
        add(new Cenario());
        //titulo da janela
        setTitle("RPG GAME");
        //tamanho da janela
        setSize(1050, 600);
        //funçao para fechar a janela quando apertar no x
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //definir a posição onde ira aparecer a janela na tela
        setLocationRelativeTo(null);
        //controle de tamanho da tela
        this.setResizable(false);
        //definindo se tela é visivel
        setVisible(true);
    }
}
