package FILEHANDLING;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFille {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\DSA_JAVA\\src\\FILEHANDLING\\text.txt");
        BufferedReader in = new BufferedReader(f);

        String line = in.readLine();
        System.out.println(line);
        f.close();


    }
}
