package termB.sadnaTech.lesson1;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {
    public Menu(int x , int y , int width, int height){
        this.setBounds(x,y,width,height);
        this.setBackground(Color.BLUE);
        GridLayout gridLayout = new GridLayout(2,2);
        this.setLayout(gridLayout);

        JButton button1 = new JButton("Button 1");
        this.add(button1);
        JButton button2 = new JButton("Button 2");
        this.add(button2);
        JButton button3 = new JButton("Button 3");
        this.add(button3);
        JButton button4 = new JButton("Button 4");
        this.add(button4);
    }


}
