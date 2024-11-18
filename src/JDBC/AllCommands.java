package JDBC;

import java.io.*;
import java.sql.*;

public class AllCommands {

    static final String Driver = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/my_database"; //To Manipulate Commands In This Database And Also To create New Table In This DB
    static final String URL2 = "jdbc:mysql://localhost:3306/"; //To Create New Database
    static final String User = "root";
    static final String Pass = "116081Gb.";

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Connection cnn = null;
        Connection cnn2 = null;
        Statement st = null;
        Statement st2 = null;
        PreparedStatement st1 = null;
        ResultSet rs = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Load driver
            Class.forName(Driver);

            // Establish connection
            cnn = DriverManager.getConnection(URL, User, Pass);

            /*
            cnn2 = DriverManager.getConnection(URL2, User, Pass);//Manipulate URL2
            st2 = cnn2.createStatement();
            rs = st2.executeQuery("create database db2"); //Will Create New DB
            rs = st2.executeQuery("create table nav2(id int(30), name varchar(40), age int(10)"); //Will Create New TABLE

             */
            System.out.println("Enter Your Choice \n 1:Display \n 2:Insert \n 3:Delete  \n 4:Update  \n 5:Search ");
            int ch = Integer.parseInt(in.readLine());

            switch (ch) {
                case 1: // Display
                    st = cnn.createStatement();
                    rs = st.executeQuery("SELECT * FROM nav1");
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id"));
                        System.out.println("Name: " + rs.getString("name"));
                        System.out.println("Age: " + rs.getInt("age"));
                        System.out.println();
                    }
                    break;

                case 2: // Insert
                    System.out.println("Enter ID: ");
                    int id = Integer.parseInt(in.readLine());
                    System.out.println("Enter Name: ");
                    String name = in.readLine();
                    System.out.println("Enter Age: ");
                    int age = Integer.parseInt(in.readLine());

                    st1 = cnn.prepareStatement("INSERT INTO nav1 VALUES (?, ?, ?)");
                    st1.setInt(1, id);
                    st1.setString(2, name);
                    st1.setInt(3, age);

                    if (st1.executeUpdate() > 0) {
                        System.out.println("Record inserted successfully.");
                    }
                    break;

                case 3: // Delete
                    System.out.println("Enter ID to delete: ");
                    id = Integer.parseInt(in.readLine());

                    st1 = cnn.prepareStatement("DELETE FROM nav1 WHERE id = ?");
                    st1.setInt(1, id);

                    if (st1.executeUpdate() > 0) {
                        System.out.println("Record deleted successfully.");
                    } else {
                        System.out.println("No such record found.");
                    }
                    break;

                case 4: // Update
                    System.out.println("Enter ID to update: ");
                    id = Integer.parseInt(in.readLine());
                    System.out.println("Enter New Name: ");
                    name = in.readLine();
                    System.out.println("Enter New Age: ");
                    age = Integer.parseInt(in.readLine());

                    st1 = cnn.prepareStatement("UPDATE nav1 SET name = ?, age = ? WHERE id = ?");
                    st1.setString(1, name);
                    st1.setInt(2, age);
                    st1.setInt(3, id);

                    if (st1.executeUpdate() > 0) {
                        System.out.println("Record updated successfully.");
                    } else {
                        System.out.println("No such record found.");
                    }
                    break;

                case 5: // Search
                    System.out.println("Enter ID to search: ");
                    id = Integer.parseInt(in.readLine());

                    st1 = cnn.prepareStatement("SELECT * FROM nav1 WHERE id = ?");
                    st1.setInt(1, id);
                    rs = st1.executeQuery();

                    if (rs.next()) {
                        System.out.println("Name: " + rs.getString("name"));
                        System.out.println("Age: " + rs.getInt("age"));
                    } else {
                        System.out.println("No such record found.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            if (rs != null) rs.close();
            if (st1 != null) st1.close();
            if (st != null) st.close();
            if (cnn != null) cnn.close();
        }
    }
}

/*
To Run This Code Run These Commands

javac -cp ".:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src/JDBC/mysql-connector-j-9.1.0.jar" JDBC/AllCommands.java

java -cp ".:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src:/c/Users/DELL/OneDrive/Desktop/DSA_JAVA/src/JDBC/mysql-connector-j-9.1.0.jar" JDBC.AllCommands

 */