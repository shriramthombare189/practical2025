import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class BouncingBall extends JPanel implements Runnable {
    private int x = 50, y = 50; // Ball position
    private int dx = 5, dy = 5; // Ball movement speed
    private final int BALL_SIZE = 30;
    private Color ballColor = Color.RED; // Initial ball color
    private Random random = new Random();

    public BouncingBall() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(ballColor);
        g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
    }

    @Override
    public void run() {
        while (true) {
            x += dx;
            y += dy;

            // Collision with walls
            if (x <= 0 || x >= getWidth() - BALL_SIZE) {
                dx = -dx;
                changeColor();
            }
            if (y <= 0 || y >= getHeight() - BALL_SIZE) {
                dy = -dy;
                changeColor();
            }

            repaint(); // Refresh the screen
            try {
                Thread.sleep(30); // Adjust speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void changeColor() {
        ballColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall ballPanel = new BouncingBall();
        frame.add(ballPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
