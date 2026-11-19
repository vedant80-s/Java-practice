/*
 *  Write a program to update a record in the Student table using PreparedStatement.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root", "root");
                    PreparedStatement ps = c.prepareStatement("update Student set id = ? , age = ? where age = 34");) {
                ps.setString(1, "W23");
                ps.setString(2, "45");
                int i = ps.executeUpdate();
                if (i > 0) {
                    System.out.println("Table Update Ho Gaya Re");
                } else {
                    System.out.println("Table Update Nahi Hua Re");
                }
                ps.close();
                System.out.println("Prepared Statement Closed: " + ps.isClosed());
                c.close();
                System.out.println("Connection Close Succcesful");
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.printf("Exception: %s", e.getMessage());
        }
    }
}