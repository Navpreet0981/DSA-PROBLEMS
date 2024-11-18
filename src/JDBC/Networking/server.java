package JDBC.Networking;

import  java.net.*;
import java.io.*;
import java.sql.*;

public class server {

    static final String Driver = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/my_database";
    static final String User = "root";
    static final String Pass = "116081Gb.";

    public static void main(String[] args) {

        Connection cnn = null;
        Statement st = null;
        PreparedStatement st1 = null;
        ResultSet rs = null;
        try {
            // Load driver
            Class.forName(Driver);
            System.out.println("Connecting with DB...");
            // Establish connection
            cnn = DriverManager.getConnection(URL, User, Pass);
            st=cnn.createStatement();
            ServerSocket ss= new ServerSocket(2020);
            System.out.println("Waiting For Client Request...");
            Socket s =ss.accept();
            System.out.println("Connected With Client");
            InputStream is = s.getInputStream();
            DataInputStream dis =new DataInputStream(is);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            int id = dis.readInt();
            String sql = "SELECT * FROM nav1";
            rs = st.executeQuery(sql);
            while (rs.next()){
                if (id == rs.getInt("id")){
                    String msg = "Available";
                    dos.writeUTF(msg);
                    dos.writeInt(rs.getInt("id"));
                    dos.writeUTF(rs.getString("name"));
                    dos.writeInt(rs.getInt("age"));
                    break;
                }else if (rs.last()){
                    if (id != rs.getInt("id")){
                        String msg = "Member With id: "+id+"Does not Exist";
                        dos.writeUTF(msg);
                    }
                }
            }
        }catch (Exception e){
            System.out.println("exception:- "+e);
        }
    }
}

/*
javac -cp ".:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src/JDBC/mysql-connector-j-9.1.0.jar" JDBC/Networking/server.java

java -cp ".:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src/JDBC/mysql-connector-j-9.1.0.jar" JDBC.Networking.server

 */