package NETWORKING.TCP_P1;
import java.net.*;
import java.io.*;

//Connecting Both server.java and the client.java file user Socket and ServerSocket program..

public class server  {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket server = new ServerSocket(4521);
            Socket c = server.accept();

            OutputStream os = c.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            //send a string
            dos.writeUTF("Welcome to network Programming");

            c.close();
        }
        catch (Exception e){
            System.out.println("Exception: "+e);
        }
    }
}