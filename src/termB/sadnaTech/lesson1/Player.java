package termB.sadnaTech.lesson1;

import java.awt.*;

public class Player {
    private int x;
    private int y;

    public Player(){
        this.x = 100;
        this.y = 100;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveRight(){
        this.x++;
    }
    public void moveLeft(){
        this.x--;
    }

    public void moveUp(){
        this.y--;
    }

    public void moveDown(){
        this.y++;
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.fillRect(this.x,this.y,100,100);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(this.x-20,this.y+100,140,140);


    }


}
