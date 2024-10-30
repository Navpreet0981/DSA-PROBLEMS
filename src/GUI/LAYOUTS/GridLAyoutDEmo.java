package GUI.LAYOUTS;
import java.awt.*;
public class GridLAyoutDEmo {
    GridLAyoutDEmo(){
        Frame f= new Frame();
        Button b1 = new Button("First");
        Button b2 = new Button("Second");
        Button b3 = new Button("Third");
        Button b4 = new Button("Fourth");
        Button b5 = new Button("Fifth");
        Button b6 = new Button("Sixth");

        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
        f.setLayout(new GridLayout(3,3));

        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLAyoutDEmo();
    }
}
