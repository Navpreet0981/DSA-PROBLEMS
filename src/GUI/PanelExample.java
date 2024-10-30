package GUI;
import java.awt.*;
public class PanelExample {
    PanelExample(){
        Frame f = new Frame();
        Panel panel = new Panel();
        panel.setBounds(80,80,200,200);
        panel.setBackground(Color.CYAN);
        Button b1 = new Button("BCA");
        b1.setBounds(50,100,80,40);
        b1.setBackground(Color.DARK_GRAY);
        Button b2 = new Button("MCA");
        b2.setBounds(50,100,80,40);
        b2.setBackground(Color.green);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PanelExample();
    }
}
