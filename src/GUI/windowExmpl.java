package GUI;

import java.awt.*;
public class windowExmpl extends Frame{

    public void paint(Graphics g){
        g.drawString("Hello", 40, 40);
    }
    public static void main(String[] args) {
        windowExmpl appwin = new windowExmpl();
        appwin.setSize(new Dimension(200,200));
        appwin.setTitle("AWT Based application");
        appwin.setVisible(true);

    }

}