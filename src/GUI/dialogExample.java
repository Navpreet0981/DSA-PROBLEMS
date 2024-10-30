package GUI;
import java.awt.*;

public class dialogExample {
    private static Dialog d;
    dialogExample(){
        Frame f = new Frame();
        d = new Dialog(f,"Dialog Box", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("Ok");
        d.add(new Label("Dialog Boc Example Button"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new dialogExample();
    }
}
