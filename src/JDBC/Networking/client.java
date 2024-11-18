package JDBC.Networking;
import  java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try{
            int id;
            Socket s = new Socket("127.0.0.1",2020);
            System.out.println("Connected With Server");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Member id:- ");
            id = Integer.parseInt(br.readLine());
            dos.writeInt(id);
            String m = dis.readUTF();
            if (m.equals("Available")){
                System.out.println("Member Id:- "+dis.readInt());
                System.out.println("Member Name:- "+ dis.readUTF());
                System.out.println("Member Age:- "+dis.readInt());
            }else {
                System.out.println(m);
            }
        }catch (Exception e){
            System.out.println("Exception:- "+e);
        }
    }
}

/*
javac -cp ".:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src/JDBC/mysql-connector-j-9.1.0.jar" JDBC/Networking/client.java

java -cp ".:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src/JDBC/mysql-connector-j-9.1.0.jar" JDBC.Networking.client

 */