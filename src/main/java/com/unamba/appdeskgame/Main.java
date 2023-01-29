package com.unamba.appdeskgame;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        FrmPrincipal frmPrincipal = new FrmPrincipal();

        frmPrincipal.getContentPane().setBackground(Color.BLACK);//asignamos a frmPrincipal el color negro
        frmPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);//asignacion de tamaño de pantalla
        frmPrincipal.setVisible(true);
        Snake snake = new Snake(2);//creacion de un objeto de type Snake
        for (SnakeBody item : snake.body) {
            frmPrincipal.getContentPane().add(item.getBodySection());
        }
  logicProcess process=new logicProcess(snake);
  process.start();
    }
}
