package com.unamba.appdeskgame;

public class logicProcess extends Thread {

    private int posx;
    private int posy;
    private Snake snakes;

    public logicProcess() {
    }

    public logicProcess(Snake snake) {
        this.snakes = snake;
    }

    @Override
    public void run() {
        for (;;) {
            posx = GameEvent.positionx;
            posy = GameEvent.positiony;
            for (SnakeBody item : snakes.body) {
       //         while(posx!=item.getPositionX() && posy!=item.getPositionY()){
            if(item.getPositionX()<posx){
                item.setPositionX(item.getPositionX()+10);
            }
              /* if(item.getPositionY()<posy){
                item.setPositionY(item.getPositionY()+10);
            }*/
                   if(item.getPositionX()>posx){
                item.setPositionX(item.getPositionX()-10);
            }
               if(item.getPositionY()>posy){
                item.setPositionY(item.getPositionY()-10);
            }
          //      }
               item.setBounds();
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                
            }
        }
    }
}
