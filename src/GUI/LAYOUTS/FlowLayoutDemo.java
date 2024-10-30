package GUI.LAYOUTS;
import java.awt.*;
public class FlowLayoutDemo {
    FlowLayoutDemo(){
        Frame f = new Frame();
        Button b1 = new Button("First");
        Button b2 = new Button("Second");
        Button b3 = new Button("Third");
        Button b4 = new Button("Fourth");
        Button b5 = new Button("Fifth");

        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
//        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
//        f.setLayout(new FlowLayout(FlowLayout.LEADING));
//        f.setLayout(new FlowLayout(FlowLayout.TRAILING));
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
