package GUI.SWING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCount implements ActionListener {
    JFrame f = new JFrame("Word count");
    JLabel l1, l2;
    TextArea area;
    Button b;
    WordCount(){
        l1 =new JLabel();
        l1.setBounds(50, 50,100,30);
        l2 =new JLabel();
        l2.setBounds(160, 50,100,30);
        area = new TextArea("Enter Text Here");
        area.setBounds(20, 100, 300,300);
        b = new Button("Count");
        b.setBounds(100,400,100,30);
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        f.setSize(400,450);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("No Of Words:- "+words.length);
        l2.setText("Alphabets:- "+text.length());
    }

    public static void main(String[] args) {
        new WordCount();
    }
}
