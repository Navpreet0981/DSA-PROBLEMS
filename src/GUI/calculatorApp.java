package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorApp extends Frame implements ActionListener {
        Frame f = new Frame("Calculator");
        Label l1 = new Label("Enter First Number");
        Label l2 = new Label("Enter Second Number");
        Label l3 = new Label("Result:- ");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        Button b1 = new Button("Add");
        Button b2 = new Button("Sub");
        Button b3 = new Button("Mul");
        Button b4 = new Button("Div");
        Button b5 = new Button("Cncl");
    calculatorApp(){
        l1.setBounds(40,100,150,15);
        l2.setBounds(40,140,150,15);
        l3.setBounds(40,180,150,15);
        t1.setBounds(200,100,100,15);
        t2.setBounds(200,140,100,15);
        t3.setBounds(200,180,100,15);
        b1.setBounds(50,250,45,15);
        b2.setBounds(110,250,45,15);
        b3.setBounds(170,250,45,15);
        b4.setBounds(230,250,45,15);
        b5.setBounds(290,250,45,15);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);

    }
    public  void actionPerformed(ActionEvent a){
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if (a.getSource() == b1){
            t3.setText(String.valueOf(n1 + n2));
        }
        if (a.getSource() == b2){
            t3.setText(String.valueOf(n1 - n2));
        }
        if (a.getSource() == b3){
            t3.setText(String.valueOf(n1 * n2));
        }
        if (a.getSource() == b4){
            t3.setText(String.valueOf(n1 / n2));
        }
        if (a.getSource() == b5){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new calculatorApp();
    }

}
