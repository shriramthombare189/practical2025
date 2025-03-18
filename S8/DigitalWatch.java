package S8;

import java.applet.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
<applet code="DigitalWatch.java" width="300" height="150">
</applet>
*/

public class DigitalWatch extends Applet implements Runnable {
    private Thread timer;
    private SimpleDateFormat formatter;
    private String currentTime;
    private Font digitalFont;
    private Color backgroundColor, timeColor;
    
    public void init() {
        // Initialize components
        formatter = new SimpleDateFormat("HH:mm:ss");
        currentTime = formatter.format(new Date());
        digitalFont = new Font("Arial", Font.BOLD, 48);
        backgroundColor = new Color(0, 0, 0);
        timeColor = new Color(0, 255, 0);
        setBackground(backgroundColor);
    }
    
    public void start() {
        if (timer == null) {
            timer = new Thread(this);
            timer.start();
        }
    }
    
    public void stop() {
        timer = null;
    }
    
    public void run() {
        Thread current = Thread.currentThread();
        while (timer == current) {
            repaint();
            try {
                Thread.sleep(1000);  // Update every second
                currentTime = formatter.format(new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void paint(Graphics g) {
        // Calculate center position
        int width = getWidth();
        int height = getHeight();
        
        // Create a double buffer
        Image buffer = createImage(width, height);
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        
        // Enable antialiasing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                           RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draw background
        g2.setColor(backgroundColor);
        g2.fillRect(0, 0, width, height);
        
        // Draw time
        g2.setFont(digitalFont);
        g2.setColor(timeColor);
        
        // Center the text
        FontMetrics fm = g2.getFontMetrics();
        int textWidth = fm.stringWidth(currentTime);
        int textHeight = fm.getHeight();
        int x = (width - textWidth) / 2;
        int y = (height + textHeight / 2) / 2;
        
        g2.drawString(currentTime, x, y);
        
        // Draw the buffer to the screen
        g.drawImage(buffer, 0, 0, this);
    }
}
