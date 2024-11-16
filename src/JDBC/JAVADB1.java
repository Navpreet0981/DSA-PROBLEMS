package JDBC;

import java.sql.*;
public class JAVADB1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Establishing Connection");

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "116081Gb.");
            System.out.println("Creating Satatement Object..");

            Statement st = cn.createStatement();
            String sql;
            sql = "Select * from Nav1";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                int r = rs.getInt("id");
                String n = rs.getString("name");
                int age = rs.getInt("age");


                System.out.println("S.no:- "+r);
                System.out.println("Name:- "+n);
                System.out.println("Age:- "+age);
            }


        }catch (Exception e){
            System.out.println("Exception:- "+e);
            e.printStackTrace();
        }

    }
}
