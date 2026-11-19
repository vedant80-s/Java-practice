/*
 * Write a program demonstrating best practices: 
 * close ResultSet, Statement, and Connection in a finally block, and use PreparedStatement to avoid SQL injection.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Que10 {
    public static void main(String[] args) {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root", "root");
            ps = c.prepareStatement("select * from students");
            ResultSet i = ps.executeQuery();
            while (i.next()) {
                System.out.printf("%s %d %s" , i.getString("name") , i.getInt("age") , i.getString("id"));
            }
            System.out.println("Prepared Statement Closed: " + ps.isClosed());
            System.out.println("Connection Close Succcesful");

        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.printf("Exception: %s", e.getMessage());
        } finally {
            try {
                ps.close();
                c.close();
            } catch (SQLException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}