package termB.sadnaTech.lesson1;

import javax.swing.*;
import java.awt.*;

public class MainContent extends JPanel {
    private int player1;

    Player player = new Player();
    public MainContent(int x , int y , int width, int height){
        this.setBounds(x,y,width,height);
        this.setBackground(Color.red);
        this.setLayout(null);
        player.setX(100);
        player.setY(200);
        this.moveRight();

    }

    public void moveRight(){
        new Thread(() ->{
            while(true){
                this.player.moveRight();
                this.player.moveDown();
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
        player.paint(graphics);
    }
}
