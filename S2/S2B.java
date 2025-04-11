import javax.swing.*;
import java.awt.*;
class S2B extends JPanel implements Runnable {
    int waveOffset = 0;

public void paintComponent(Graphics g) {
super.paintComponent(g);
 int width = 300, height = 200;
        int x = 100, y = 100;

        g.setColor(Color.BLACK);
        g.fillRect(x - 10, y, 10, 250);

        g.setColor(Color.ORANGE);
        g.fillRect(x, y, width, height / 3);

        g.setColor(Color.WHITE);
        g.fillRect(x, y + height / 3, width, height / 3);

        g.setColor(Color.GREEN);
        g.fillRect(x, y + 2 * height / 3, width, height / 3);

        g.setColor(Color.BLUE);
        g.drawOval(x + width / 2 - 25, y + height / 3 + 5, 50, 50);        
    }
    public void run() {
        while (true) {
            waveOffset += 5;
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Waving Flag");
        S2B flag = new S2B();
        frame.add(flag);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Thread t = new Thread(flag);
        t.start();
    }
}
