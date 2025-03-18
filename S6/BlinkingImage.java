package S6;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

public class BlinkingImage extends JFrame implements Runnable {
    private BufferedImage image;
    private boolean isVisible = true;
    private JPanel panel;
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;
    
    public BlinkingImage() {
        loadImage();
        setupFrame();
    }

    private void loadImage() {
        try {
            // Specify a test image path - replace with your actual image path
            String imagePath = "S5/image.jpg";
            File imageFile = new File(imagePath);
            
            if (!imageFile.exists()) {
                System.out.println("Image file not found at: " + imagePath);
                createPlaceholderImage();
                JOptionPane.showMessageDialog(this, 
                    "Image file not found at: " + imagePath + "\nUsing placeholder image.");
                return;
            }

            System.out.println("Attempting to load image from: " + imagePath);
            image = ImageIO.read(imageFile);
            System.out.println("Image loaded successfully");

        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
            createPlaceholderImage();
            JOptionPane.showMessageDialog(this, 
                "Error loading image. Using placeholder.\nError: " + e.getMessage());
        }
    }

    private void createPlaceholderImage() {
        System.out.println("Creating placeholder image");
        image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        
        // Create gradient background
        GradientPaint gradient = new GradientPaint(
            0, 0, Color.BLUE, 200, 200, Color.CYAN);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, 200, 200);
        
        // Add text
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Placeholder Image", 20, 100);
        g2d.dispose();
    }

    private void setupFrame() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (isVisible && image != null) {
                    // Calculate dimensions to maintain aspect ratio
                    double scale = Math.min(
                        (double) getWidth() / image.getWidth(),
                        (double) getHeight() / image.getHeight()
                    );
                    
                    int width = (int) (image.getWidth() * scale);
                    int height = (int) (image.getHeight() * scale);
                    int x = (getWidth() - width) / 2;
                    int y = (getHeight() - height) / 2;
                    
                    g.drawImage(image, x, y, width, height, this);
                }
            }
        };
        
        setTitle("Blinking Image");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.BLACK);
        add(panel);
        setLocationRelativeTo(null);
        
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            try {
                isVisible = !isVisible;
                panel.repaint();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
