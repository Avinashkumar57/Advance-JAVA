import java.awt.*;
import java.awt.event.*;

public class AWTEventHandlingExample extends Frame implements ActionListener {
    Button button;
    Label label;

    public AWTEventHandlingExample() {
        // Set layout
        setLayout(new FlowLayout());

        // Create a button
        button = new Button("Click Me");

        // Create a label
        label = new Label();

        // Add the button and label to the frame
        add(button);
        add(label);

        // Add action listener to the button
        button.addActionListener(this);

        // Set frame properties
        setTitle("AWT Event Handling Example");
        setSize(300, 200);
        setVisible(true);
    }

    // Action performed when button is clicked
    public void actionPerformed(ActionEvent e) {
        // Change label text
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new AWTEventHandlingExample();
    }
}
