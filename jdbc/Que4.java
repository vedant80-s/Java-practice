/*
 * Write a program to retrieve all records from the Student table using ResultSet and print them.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Que4 {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root", "root");
                    PreparedStatement ps = c.prepareStatement("select * from Student");
                    ResultSet res = ps.executeQuery();) {
                while (res.next()) {
                    System.out.println(res.getString("id") + " " +
                            res.getString("age") + " " +
                            res.getString("name"));
                }
                c.close();
                System.out.println("Connection Close Succcesful");
            }
        } catch (ClassNotFoundException | SQLException |

                NumberFormatException e) {
            System.out.printf("Exception: %s", e.getMessage());
        }
    }
}