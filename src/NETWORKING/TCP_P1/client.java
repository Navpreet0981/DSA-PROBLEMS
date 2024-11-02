package NETWORKING.TCP_P1;
import java.net.*;
import java.io.*;
public class client {
    public static void main(String[] args) throws IOException{
        try{
            String localhost = "127.0.0.1";
            Socket s1 = new Socket(localhost, 4521);
            InputStream is = s1.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String st = dis.readUTF();
            System.out.println(st);
        }catch (Exception e){
            System.out.println("exception: "+e );
        }
    }
}
