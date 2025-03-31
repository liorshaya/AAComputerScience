package termB.sadnaTech.lesson1;

import javax.swing.*;

public class Study {
    public static final int WINDOW_WIDTH = 900;
    public static final int WINDOW_HEIGHT = 700;


    public static void main(String[] args) {
        JFrame window = new JFrame("My first GUI");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);

        Menu menu = new Menu(0,0,WINDOW_WIDTH/4 , WINDOW_HEIGHT);
        window.add(menu);

        MainContent mainContent = new MainContent(WINDOW_WIDTH/4 , 0 , WINDOW_WIDTH-WINDOW_WIDTH/4 , WINDOW_HEIGHT);
        window.add(mainContent);

        window.setVisible(true);
    }
}
