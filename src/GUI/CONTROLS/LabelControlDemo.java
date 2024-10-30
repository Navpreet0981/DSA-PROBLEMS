package GUI.CONTROLS;
import java.awt.*;
public class LabelControlDemo {

    public static void main(String[] args) {

    Frame f= new Frame("Label Control");
    Label l1,l2;
    l1= new Label("JAVA");
    l1.setBounds(50,100,100,30);
    l2= new Label("Programming");
    l2.setBounds(50,100,100,30);

    f.add(l1); f.add(l2);
    f.setSize(300,300);
    f.setVisible(true);
    }
}