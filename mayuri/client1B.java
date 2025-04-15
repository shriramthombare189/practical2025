import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

class SimpleClient {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Client");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        JButton sendButton = new JButton("Send");

        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.CENTER);
        frame.add(sendButton, BorderLayout.SOUTH);

        frame.setVisible(true);

        try {
            Socket socket = new Socket("localhost", 5000);
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            sendButton.addActionListener(e -> {
                String message = textField.getText();
                output.println(message);
                textField.setText("");
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
