package S7;

public class NumberDisplayMain {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumberDisplay().setVisible(true);
            }
        });
    }
}
