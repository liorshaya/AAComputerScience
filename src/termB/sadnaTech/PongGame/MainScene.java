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
    private int countdown = -1;
    private boolean showStartMenu = true;
    private boolean vsComputer = false;
    private String difficulty = "medium";

    public MainScene() {
        setFocusable(true);
        requestFocusInWindow();

//        JButton startButton = new JButton("Start Game");
//        startButton.setFont(new Font("Arial", Font.BOLD, 20));
//        startButton.addActionListener(e -> {
//            gameStarted = true;
//            startButton.setVisible(false);
//            resetBall();
//        });
//        this.add(startButton);

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel title = new JLabel("Pong Game", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 32));
        menuPanel.add(title);

        JButton vsPlayerBtn = new JButton("1 vs 1");
        JButton vsCompBtn = new JButton("Play vs Computer");

        JComboBox<String> difficultySelector = new JComboBox<>(new String[]{"Easy", "Medium", "Hard"});
        difficultySelector.setSelectedItem("Medium");

        JButton startBtn = new JButton("Start Game");

        menuPanel.add(vsPlayerBtn);
        menuPanel.add(vsCompBtn);
        menuPanel.add(new JLabel("Difficulty:", SwingConstants.CENTER));
        menuPanel.add(difficultySelector);
        menuPanel.add(startBtn);

        this.setLayout(new BorderLayout());
        this.add(menuPanel, BorderLayout.CENTER);

        vsPlayerBtn.addActionListener(e -> {
            vsComputer = false;
            difficulty = "medium";
        });

        vsCompBtn.addActionListener(e -> {
            vsComputer = true;
        });

        difficultySelector.addActionListener(e -> {
            difficulty = ((String) difficultySelector.getSelectedItem()).toLowerCase();
        });

        startBtn.addActionListener(e -> {
            showStartMenu = false;
            this.remove(menuPanel);
            this.setLayout(null); // reset layout
            startGame();
        });

//
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
            if (!gameStarted) return;
            if (!vsComputer) {
                // שליטה רגילה של שחקן
                if (upPressed && rightPaddleY > 0) {
                    rightPaddleY -= 10;
                }
                if (downPressed && rightPaddleY < getHeight() - 100) {
                    rightPaddleY += 10;
                }
            } else {

                // שליטה של מחשב
                double aiSpeed;
                switch (difficulty) {
                    case "easy" -> aiSpeed = 1;
                    case "hard" -> aiSpeed = 3;
                    default -> aiSpeed = 2.5; // medium
                }
                if (ballX > getWidth() / 2) { // AI מגיב רק כשהכדור מתקרב אליו
                    int paddleCenter = rightPaddleY + 50;
                    int ballCenter = ballY + 10;

                    int tolerance = 10; // אזור חיץ שלא מגיבים בו

                    if (ballX > getWidth() * 0.6) { // AI מגיב רק כשהכדור ממש מתקרב
                        if (Math.abs(paddleCenter - ballCenter) > tolerance) {
                            if (paddleCenter < ballCenter && rightPaddleY < getHeight() - 100) {
                                rightPaddleY += aiSpeed;
                            } else if (paddleCenter > ballCenter && rightPaddleY > 0) {
                                rightPaddleY -= aiSpeed;
                            }
                        }
                    }
                }

                // AI פשוט: נע לכיוון מרכז הכדור
                int paddleCenter = rightPaddleY + 50;
                int ballCenter = ballY + 10;

                if (paddleCenter < ballCenter && rightPaddleY < getHeight() - 100) {
                    rightPaddleY += aiSpeed;
                } else if (paddleCenter > ballCenter && rightPaddleY > 0) {
                    rightPaddleY -= aiSpeed;
                }
            }
            if(wPressed && leftPaddleY > 0){
                leftPaddleY -= 10;

            }
            if (sPressed && leftPaddleY < getHeight() -100){
                leftPaddleY += 10;
            }
            if(countdown >= 0){
                repaint();
                return;
            }



            // Check for ball collision with paddles
            // Collision with left paddle
            if (ballX <= 60 && ballY + 20 >= leftPaddleY && ballY <= leftPaddleY + 100) {
                ballSpeedX *= -1;
                ballX = 60;
                hitCounter++;

                double relativeIntersectY = (leftPaddleY + 50) - (ballY + 10);
                double normalized = relativeIntersectY / 50;
                ballSpeedY = -normalized * 5;
                ballSpeedY += (Math.random() - 0.5);

                if (Math.abs(ballSpeedY) < 1.0) {
                    ballSpeedY = (ballSpeedY >= 0) ? 1.0 : -1.0;
                }

                if(hitCounter != 0 && hitCounter % 5 == 0){
                    ballSpeedX *= 1.1;
                    ballSpeedY *= 1.1;
                    ballSpeedY += (Math.random() - 0.5);
                }
            }


            // Collision with right paddle
            if (ballX + 20 >= getWidth() - 60 && ballY + 20 >= rightPaddleY && ballY <= rightPaddleY + 100) {
                ballSpeedX *= -1;
                ballX = getWidth() - 80;
                hitCounter++;

                double relativeIntersectY = (rightPaddleY + 50) - (ballY + 10);
                double normalized = relativeIntersectY / 50;
                ballSpeedY = -normalized * 5;
                ballSpeedY += (Math.random() - 0.5);

                if (Math.abs(ballSpeedY) < 1.0) {
                    ballSpeedY = (ballSpeedY >= 0) ? 1.0 : -1.0;
                }

                if(hitCounter != 0 && hitCounter % 5 == 0){
                    ballSpeedX *= 1.1;
                    ballSpeedY *= 1.1;
                    ballSpeedY += (Math.random() - 0.5);
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
            if (Math.abs(ballSpeedY) < 0.5) {
                ballSpeedY = (ballSpeedY >= 0) ? 1.5 : -1.5;
            }

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
        countdown = 3;

        Timer countdownTimer = new Timer(1000 ,new AbstractAction() {

            public void actionPerformed(ActionEvent e){
                countdown--;

                if(countdown < 0){
                    ((Timer) e.getSource()).stop();
                }
                repaint();

            }

        });
        countdownTimer.setInitialDelay(0);
        countdownTimer.start();
    }





    @Override
    protected void paintComponent(Graphics g) {
        if (showStartMenu) return;
        super.paintComponent(g);
        g.fillRect(50, leftPaddleY, 10, 100);
        g.fillRect(getWidth() - 60, rightPaddleY, 10, 100);
        if (gameStarted) {
            g.fillOval(ballX, ballY, 20, 20);
        }
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString(leftScore + " : " + rightScore, getWidth() / 2 - 30, 70);

        if(countdown > 0){
            g.setFont(new Font("Ariel" , Font.BOLD , 60));
            g.setColor(Color.RED);
            g.drawString(String.valueOf(countdown), getWidth() /2 -15 , getHeight() / 2 + 100);
        }
        if(countdown == 0){
            g.setFont(new Font("Ariel" , Font.BOLD , 60));
            g.setColor(Color.RED);
            g.drawString("GO!!", getWidth() /2 -60 , getHeight() / 2 + 100);
        }
    }

    private void startGame() {
        gameStarted = true;
        resetBall();
        requestFocusInWindow();
    }
}
