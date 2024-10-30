package GUI.LAYOUTS;
import java.awt.*;
public class BorderLayoutDemo {
    Frame f;
    BorderLayoutDemo(){
        f = new Frame();
        Button b1 = new Button("Header");
        Button b2 = new Button("Footer");
        Button b3 = new Button("left-Side-Bar");
        Button b4 = new Button("Right-Side-Bar");
        Button b5 = new Button("Center");
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
