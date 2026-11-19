/*
 *  Write a program to handle SQL exceptions using try-catch and print meaningful error messages.
 */

package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Que8 {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root", "root");
                    CallableStatement cs = c.prepareCall("call select_Stu(?);")){
                        cs.setInt(1, 3);
                        ResultSet rs = cs.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString("student_name") + " " + rs.getString("course"));
                }
                cs.close();
                rs.close();
                c.close();
                System.out.println("Prepared Statements Closed: " + rs.isClosed() + "\nConnection Close Succcesful");
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.printf("Exception: %s", e.getMessage());
        }
    }   
}
