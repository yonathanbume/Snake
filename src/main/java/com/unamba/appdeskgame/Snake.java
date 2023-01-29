
package com.unamba.appdeskgame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class Snake {
    public List<SnakeBody> body;
    private final int bodyDimension = 20;
    
    //creacion de un constructor vacio
    public Snake() {
     }
    //creacion de constructor con parametros 
    public Snake(int bodyElementQuantity) {
        body = new ArrayList<>();
        
        int positionX = (bodyElementQuantity * bodyDimension) - bodyDimension;
        for (int i = 0; i < bodyElementQuantity; i++) {
            //instanciacion de un objrto jbutton
            JButton btnTemp = new JButton();
            
            int posX = positionX - (bodyDimension * i);
            int posY = 40;
            
            btnTemp.setBounds(posX, posY, bodyDimension, bodyDimension);
            btnTemp.setEnabled(false);//desabilitamos efectos de un button
            btnTemp.setBackground(Color.YELLOW);//asignacion de color a nuestro snake
            
            SnakeBody snakeBody = new SnakeBody();//instanciacion de un objeto de tipo snakeBody
            
            snakeBody.setBodySection(btnTemp);
            snakeBody.setPositionX(posX);
            snakeBody.setPositionY(posY);
            
            body.add(snakeBody);
      
        }
        
    }
}
