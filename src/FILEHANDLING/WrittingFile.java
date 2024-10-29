package FILEHANDLING;

import java.io.*;


public class WrittingFile {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\DSA_JAVA\\src\\FILEHANDLING\\text.txt");
        PrintWriter out = new PrintWriter(f);
        out.println("Writing through Code");
        out.close();
        f.close();
    }


}
