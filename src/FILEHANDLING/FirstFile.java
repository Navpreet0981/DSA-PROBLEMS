package FILEHANDLING;
import java.io.File;

public class FirstFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\DSA_JAVA\\src\\FILEHANDLING\\text.txt");
        System.out.println("isFile:- "+f.isFile());
        System.out.println("Name:- " + f.getName());
        System.out.println("size:- "+ f.length());
        System.out.println("Path:- "+ f.getPath());
        System.out.println("Parent:- "+ f.getParent());
        System.out.println("isHidden:- "+f.isHidden());
    }
}
