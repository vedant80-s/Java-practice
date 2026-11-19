/*
 *  Write a program to create a table Student with columns id, name, and age using Statement.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root", "root");
                    PreparedStatement ps = c.prepareStatement(
                            "create table Student(id VARCHAR(50) , name VARCHAR(50) , age VARCHAR(10))");) {

                int res = ps.executeUpdate();
                if (res == 0)
                    System.out.println("Table Ban Gaya");
                else
                    System.out.println("Table Nahi Bana");
                c.close();
                System.out.println("Connection Close Succcesful");
            }
        } catch (SQLException | ClassNotFoundException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
