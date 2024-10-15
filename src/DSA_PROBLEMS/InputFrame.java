import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFrame extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button;

    public InputFrame() {
        // Set up the JFrame
        setTitle("Input Frame");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create components
        textField = new JTextField(30); // 30 columns
        button = new JButton("Submit");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(textField);
        add(button);

        // Register ActionListener for the button
        button.addActionListener(this);
    }

    // ActionListener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Button is clicked
            String input = textField.getText(); // Get input from the text field
            JOptionPane.showMessageDialog(this, "You entered: " + input); // Show a dialog with the input
        }
    }

    public static void main(String[] args) {
        // Create and show the frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InputFrame frame = new InputFrame();
                frame.setVisible(true);
            }
        });
    }
}
