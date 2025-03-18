package S5;

import java.applet.*;
import java.awt.*;

/*
</applet>
*/

@SuppressWarnings("removal")
public class TrafficSignal extends Applet implements Runnable {
    private Thread thread;
    private String currentColor = "RED";
    
    public void init() {
        setBackground(Color.WHITE);
        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        // Draw signal box
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 250);
        
        // Draw lights
        if (currentColor.equals("RED")) {
            g.setColor(Color.RED);
            g.fillOval(70, 70, 60, 60);
            g.setColor(Color.GRAY);
            g.fillOval(70, 140, 60, 60);
            g.fillOval(70, 210, 60, 60);
        } else if (currentColor.equals("YELLOW")) {
            g.setColor(Color.GRAY);
            g.fillOval(70, 70, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(70, 140, 60, 60);
            g.setColor(Color.GRAY);
            g.fillOval(70, 210, 60, 60);
        } else {
            g.setColor(Color.GRAY);
            g.fillOval(70, 70, 60, 60);
            g.fillOval(70, 140, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(70, 210, 60, 60);
        }
        
        // Display current signal text
        g.setColor(Color.BLACK);
        g.drawString("Current Signal: " + currentColor, 50, 330);
    }

    public void run() {
        while (true) {
            try {
                if (currentColor.equals("RED")) {
                    Thread.sleep(5000); // Red light for 5 seconds
                    currentColor = "GREEN";
                } else if (currentColor.equals("GREEN")) {
                    Thread.sleep(4000); // Green light for 4 seconds
                    currentColor = "YELLOW";
                } else {
                    Thread.sleep(2000); // Yellow light for 2 seconds
                    currentColor = "RED";
                }
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
