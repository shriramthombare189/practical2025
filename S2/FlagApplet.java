import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("removal")
class FlagApplet extends Applet implements Runnable {
    private Thread thread1, thread2, thread3;
    private int y1 = 0, y2 = 0, y3 = 0;
        
    public void init() {
        setSize(400, 300); // Set the size of the applet
    }

    public void start() {
        // Create and start three threads for each color of the flag
        thread1 = new Thread(this);
        thread2 = new Thread(this);
        thread3 = new Thread(this);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void run() {
        try {
            while (true) {
                // Each thread will increment its respective y-coordinate
                if (Thread.currentThread() == thread1) {
                    y1 += 1;
                    if (y1 > getHeight()) y1 = 0;
                } else if (Thread.currentThread() == thread2) {
                    y2 += 1;
                    if (y2 > getHeight()) y2 = 0;
                } else if (Thread.currentThread() == thread3) {
                    y3 += 1;
                    if (y3 > getHeight()) y3 = 0;
                }

                repaint(); // Request the applet to redraw itself
                Thread.sleep(50); // Slow down the animation
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        // Draw the flag with three colors
        g.setColor(Color.ORANGE);
        g.fillRect(100, y1, 200, 50); // Top stripe (Orange)

        g.setColor(Color.WHITE);
        g.fillRect(100, y2, 200, 50); // Middle stripe (White)

        g.setColor(Color.GREEN);
        g.fillRect(100, y3, 200, 50); // Bottom stripe (Green)

        // Draw the Ashoka Chakra (Blue Circle)
        g.setColor(Color.BLUE);
        g.drawOval(190, y2 + 10, 20, 20);
    }

    public void stop() {
        // Stop the threads when the applet is stopped
        thread1 = null;
        thread2 = null;
        thread3 = null;
    }
}
