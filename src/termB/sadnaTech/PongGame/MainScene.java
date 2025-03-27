package termB.sadnaTech.PongGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;

public class MainScene extends JPanel {
    private int leftPaddleY = 250;
    private int rightPaddleY = 250;
    private int ballX = 0;
    private int ballY = 0;
    private double ballSpeedX = 5;// Added ball speed variable
    private double ballSpeedY = 1;
    private boolean wPressed = false;
    private boolean sPressed = false;
    private boolean upPressed = false;
    private boolean downPressed = false;
    private int leftScore = 0; // Added left score variable
    private int rightScore = 0; // Added right score variable
    private Timer gameTimer;
    private boolean gameStarted = false;
    private int hitCounter = 0;


    public MainScene() {
        setFocusable(true);
        requestFocusInWindow();

        JButton startButton = new JButton("Start Game");
        startButton.setFont(new Font("Arial", Font.BOLD, 18));
        startButton.addActionListener(e -> {
            gameStarted = true;
            startButton.setVisible(false);
            resetBall();
        });
        this.add(startButton);

        InputMap im = getInputMap(WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = getActionMap();

        im.put(KeyStroke.getKeyStroke("pressed W"), "W_PRESSED");
        im.put(KeyStroke.getKeyStroke("released W"), "W_RELEASED");
        im.put(KeyStroke.getKeyStroke("pressed S"), "S_PRESSED");
        im.put(KeyStroke.getKeyStroke("released S"), "S_RELEASED");
        im.put(KeyStroke.getKeyStroke("pressed UP"), "UP_PRESSED");
        im.put(KeyStroke.getKeyStroke("released UP"), "UP_RELEASED");
        im.put(KeyStroke.getKeyStroke("pressed DOWN"), "DOWN_PRESSED");
        im.put(KeyStroke.getKeyStroke("released DOWN"), "DOWN_RELEASED");

        am.put("W_PRESSED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { wPressed = true; }
        });
        am.put("W_RELEASED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { wPressed = false; }
        });
        am.put("S_PRESSED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) {sPressed = true; }
        });
        am.put("S_RELEASED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { sPressed = false; }
        });
        am.put("UP_PRESSED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { upPressed = true; }
        });
        am.put("UP_RELEASED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { upPressed = false; }
        });
        am.put("DOWN_PRESSED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { downPressed = true; }
        });
        am.put("DOWN_RELEASED", new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { downPressed = false; }
        });

        gameTimer = new Timer(10, e -> {
            if (!gameStarted) return;// Stop timer if game has not started
            if(upPressed && rightPaddleY > 0){
                rightPaddleY -= 10;
            }
            if(downPressed && rightPaddleY < getHeight() -100){
                rightPaddleY += 10;
            }
            if(wPressed && leftPaddleY > 0){
                leftPaddleY -= 10;

            }
            if (sPressed && leftPaddleY < getHeight() -100){
                leftPaddleY += 10;
            }



            // Check for ball collision with paddles
            // Collision with left paddle
            if (ballX <= 60 && ballY + 20 >= leftPaddleY && ballY <= leftPaddleY + 100) {
                ballSpeedX *= -1;
                ballX = 60;
                hitCounter++;
                if(hitCounter != 0 && hitCounter % 5 == 0){
                    ballSpeedX *= 1.3;
                    ballSpeedY *= 1.3;
                }
            }


            // Collision with right paddle
            if (ballX + 20 >= getWidth() - 60 && ballY + 20 >= rightPaddleY && ballY <= rightPaddleY + 100) {
                ballSpeedX *= -1;
                ballX = getWidth() - 80;
                hitCounter++;
                if(hitCounter != 0 && hitCounter % 5 == 0){
                    ballSpeedX *= 1.3;
                    ballSpeedY *= 1.3;
                }
            }


            if (ballX < 0) {
                rightScore++;
                checkWin();
                resetBall();
            } else if (ballX > getWidth() -50) {
                leftScore++;
                checkWin();
                resetBall();
            }



            ballX += ballSpeedX;// Move the ball
            ballY += ballSpeedY;

            // Bounce off top and bottom edges
            if (ballY <= 0 || ballY + 20 >= getHeight()) {
                ballSpeedY *= -1;
            }

            repaint();
        });
        gameTimer.start();
    }

    private void checkWin() {
        if (leftScore == 5 || rightScore == 5) {
            gameStarted = false;
            String winner = leftScore == 5 ? "Left Player Wins!" : "Right Player Wins!";
            int option = JOptionPane.showConfirmDialog(this, winner + "\nPlay again?", "Game Over", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                leftScore = 0;
                rightScore = 0;
                resetBall();
                gameStarted = true;
            }
        }
    }

    private void resetBall() {
        ballX = getWidth() / 2 - 10;
        ballY = getHeight() / 2 - 10;

        ballSpeedX = 5 * (Math.random() < 0.5 ? 1 : -1);
        ballSpeedY = 2 * (Math.random() < 0.5 ? 1 : -1);


        hitCounter = 0;

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(50, leftPaddleY, 10, 100);
        g.fillRect(getWidth() - 60, rightPaddleY, 10, 100);
        if (gameStarted) {
            g.fillOval(ballX, ballY, 20, 20);
        }
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString(leftScore + " : " + rightScore, getWidth() / 2 - 30, 70);
    }
}
