package S5;

import javax.swing.*;

public class TrafficSignalTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Signal");
        TrafficSignal signal = new TrafficSignal();
        
        signal.init();
        frame.add(signal);
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
