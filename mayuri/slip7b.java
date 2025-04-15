import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class NumberDisplay implements Runnable {
    private JTextField textField;

    public NumberDisplay(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100); // Adds a small delay for better visibility
                textField.setText(String.valueOf(i)); // Updates the text field with the current number
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Number Display");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextField and JButton
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        JButton button = new JButton("Start Counting");

        // Add components to the frame
        frame.add(textField, "North");
        frame.add(button, "Center");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new thread to run the number display logic
                Thread thread = new Thread(new NumberDisplay(textField));
                thread.start();
            }
        });

        frame.setVisible(true);
    }
}
