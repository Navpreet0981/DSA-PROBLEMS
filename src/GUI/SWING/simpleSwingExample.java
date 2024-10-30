package GUI.SWING;
import javax.swing.*;
public class simpleSwingExample {
    JFrame f;
    simpleSwingExample(){
        f = new JFrame("Simple Sweing Example");
        JLabel l = new JLabel("Enter Your Name");
        l.setBounds(50,100,100,30);
        JTextField t = new JTextField("Navv");
        t.setBounds(200,100,100,40);
        JButton b = new JButton("Click");
        b.setBounds(130,150,100,40);
        f.add(l);f.add(t);f.add(b);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new simpleSwingExample();
    }
}
