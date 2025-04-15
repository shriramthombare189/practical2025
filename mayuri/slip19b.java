import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class StudentRecordViewer {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Student Record Viewer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Add labels and text fields
        JLabel rNumberLabel = new JLabel("R Number:");
        JTextField rNumberField = new JTextField();
        JLabel sNameLabel = new JLabel("S Name:");
        JTextField sNameField = new JTextField();
        JLabel percentageLabel = new JLabel("Percentage:");
        JTextField percentageField = new JTextField();

        JButton fetchButton = new JButton("Fetch First Record");

        // Disable text fields for editing
        rNumberField.setEditable(false);
        sNameField.setEditable(false);
        percentageField.setEditable(false);

        // Add components to the frame
        frame.add(rNumberLabel);
        frame.add(rNumberField);
        frame.add(sNameLabel);
        frame.add(sNameField);
        frame.add(percentageLabel);
        frame.add(percentageField);
        frame.add(new JLabel()); // Empty space
        frame.add(fetchButton);

        // Action listener for the button
        fetchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Database connection and query
                try {
                    // Connect to the database (adjust credentials accordingly)
                    Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/your_database", "your_username", "your_password");

                    // Query to fetch the first record
                    String query = "SELECT * FROM student LIMIT 1";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        // Populate the text fields with data
                        rNumberField.setText(rs.getString("R_number"));
                        sNameField.setText(rs.getString("S_name"));
                        percentageField.setText(String.valueOf(rs.getFloat("Per")));
                    } else {
                        JOptionPane.showMessageDialog(frame, "No records found in the table.");
                    }

                    // Close resources
                    rs.close();
                    stmt.close();
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
