package S7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberDisplay extends JFrame implements Runnable {
    private JTextField numberField;
    private JButton startButton;
    private Thread numberThread;
    private boolean isRunning;
    
    public NumberDisplay() {
        // Setup the frame
        setTitle("Number Display");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Create components
        numberField = new JTextField(20);
        numberField.setEditable(false);
        startButton = new JButton("Start");
        
        // Add components
        add(new JLabel("Numbers: "));
        add(numberField);
        add(startButton);
        
        // Add button listener
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isRunning) {
                    startCounting();
                } else {
                    stopCounting();
                }
            }
        });
        
        setLocationRelativeTo(null);
    }
    
    private void startCounting() {
        isRunning = true;
        startButton.setText("Stop");
        numberThread = new Thread(this);
        numberThread.start();
    }
    
    private void stopCounting() {
        isRunning = false;
        startButton.setText("Start");
        numberThread = null;
    }
    
    public void run() {
        try {
            int number = 1;
            while (isRunning && number <= 100) {
                numberField.setText(String.valueOf(number));
                Thread.sleep(100); // Delay of 100ms
                number++;
                
                if (number > 100) {
                    number = 1; // Reset to 1 after reaching 100
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
