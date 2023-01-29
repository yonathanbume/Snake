package com.unamba.appdeskgame;
import javax.swing.JButton;

public class SnakeBody {
  //declarcion de atributos  
    private JButton bodySection;
    private int positionX;
    private int positionY;
  public void setBounds(){
  bodySection.setBounds(positionX, positionY,bodySection.getWidth(),bodySection.getHeight());
  }
//metodos get and set
    public void setBodySection(JButton bodySection) {
        this.bodySection = bodySection;
    }

    public JButton getBodySection() {
        return bodySection;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }
}
