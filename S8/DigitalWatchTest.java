package S8;

import javax.swing.*;
import java.awt.*;

public class DigitalWatchTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Watch");
        DigitalWatch watch = new DigitalWatch();
        
        watch.init();
        frame.add(watch);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        watch.start();
    }
}
