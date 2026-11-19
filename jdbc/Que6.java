/*
 *  Write a program to delete a record from the Student table using PreparedStatement.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que6 {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root", "root");
                    PreparedStatement ps = c.prepareStatement("delete from Student where name IN('Aryan Sen' , 'Kuch Bhi') ");) {
                int i = ps.executeUpdate();
                if (i > 0)
                    System.out.println("Puri Table Delete Ho Gayi Hai");
                else
                    System.out.println("Puri Table Delete Nahi Hui Hai");
                System.out.println("Deleted Row: " + i);
                ps.close();
                c.close();
                System.out.println("Prepared Statements Closed: " + ps.isClosed() + "\nConnection Close Succcesful");
            }
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {
            System.out.printf("Exception: %s", e.getMessage());
        }
    }
}