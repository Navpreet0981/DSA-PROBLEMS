package GUI;
import java.awt.*;

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame f= new Frame("file dialog demo");
        f.setVisible(true);
        f.setSize(700,700);
        FileDialog fd = new FileDialog(f,"File Dialog Box");
        fd.setVisible(true);
    }
}
