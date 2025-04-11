import javax.swing.*;
import java.awt.*;
import java.util.Random;
class S3B extends JPanel implements Runnable {
    private int x = 50, y = 50;
    private int dx = 5, dy = 5;
    private final int BALL_SIZE = 30;
    private Color ballColor = Color.RED;
    private Random random = new Random();

    public S3B() {
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
if (x <= 0 || x >= getWidth() - BALL_SIZE) {
                dx = -dx;
                changeColor();
            }
            if (y <= 0 || y >= getHeight() - BALL_SIZE) {
                dy = -dy;
                changeColor();
            }
repaint();
            try {
                Thread.sleep(30);
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
        S3B ballPanel = new S3B();
        frame.add(ballPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
