/*
 * Write a program to insert data into the Student table using PreparedStatement.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root",
                    "root");
                    PreparedStatement ps = c.prepareStatement("insert into Student values(?,?,?)");) {

                ps.setString(1, "E22");
                ps.setString(2, "Gupchup Badmos");
                ps.setString(3, "17");
                int res = ps.executeUpdate();
                if (res > 0)
                    System.out.println("Info Insert Success");
                else
                    System.out.println("Info Insert Fail");
                c.close();
                System.out.println("Connection Close Succcesful");
            }
        } catch (ClassNotFoundException e) {
            System.out.printf("Exception: %s", e.getMessage());
        } catch (SQLException ex) {
            System.out.printf("Exception: %s", ex.getMessage());
        }
    }
}
