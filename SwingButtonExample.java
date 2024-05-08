import javax.swing.*;

public class SwingButtonExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Button Example");

        // Create a JButton
        JButton button = new JButton("Click here");

        // Add the button to the JFrame
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
