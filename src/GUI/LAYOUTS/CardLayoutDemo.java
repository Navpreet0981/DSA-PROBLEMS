package GUI.LAYOUTS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.event.*;
public class CardLayoutDemo extends Frame implements ActionListener {
    CardLayout card;
    Frame c;

    CardLayoutDemo(){

    c = new Frame();
    card = new CardLayout(40,30);
    c.setLayout(card);
    Button b1 = new Button("Apple");
    Button b2 = new Button("Boy");
    Button b3 = new Button("Car");
    b1.setBackground(Color.GRAY);
    b2.setBackground(Color.green);
    b3.setBackground(Color.yellow);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    c.add("a", b1);
    c.add("b", b2);
    c.add("c", b3);

    c.setSize(400,400);
    c.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        card.next(c);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }

}
