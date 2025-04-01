package termB.sadnaTech.lesson1;

import javax.swing.*;
import java.awt.*;

public class MainContent extends JPanel {
    private Player player1;


    public MainContent(int x , int y , int width, int height){
        this.setBounds(x,y,width,height);
        this.setBackground(Color.red);
        this.setLayout(null);
        this.player1 = new Player();
        this.moveRight();


    }

    public void moveRight(){
        new Thread(() ->{
            while(true){
                this.player1.moveRight();
                this.player1.moveDown();
                try {
                    Thread.sleep(40);
                    repaint();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
//        graphics.setColor(Color.GREEN);
//        graphics.fillRect(100,100,100,100);
//        graphics.setColor(Color.BLUE);
//        graphics.fillRect(200,100,100,100);
        this.player1.paint(graphics);
    }
}
