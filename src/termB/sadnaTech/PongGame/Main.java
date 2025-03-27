package termB.sadnaTech.PongGame;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame window = new JFrame("Pong game");
        window.setResizable(false);
        window.setSize(screenSize.width/2, screenSize.height/2);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MainScene panel = new MainScene();
        window.add(panel);
        panel.setFocusable(true);
        panel.requestFocusInWindow();

        window.setVisible(true);

    }

}
