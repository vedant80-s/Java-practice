/*
 * Write a program to perform a transaction: 
 * insert two records in the Student table, commit if both succeed, rollback if any fails.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Que9 {
    public static void main(String[] args) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_Pass", "root", "root") ;
            ps = c.prepareStatement("insert into student(id , name) values(?,?)");
            ps.setInt(1, 5);
            ps.setString(2, "A");
            int i = ps.executeUpdate();
            if(i > 0) System.out.println("Success");
            else System.out.println("Failed");
            ps.setInt(1, 3);
            ps.setString(2, "B");
            i = ps.executeUpdate();
            if(i > 0) System.out.println("Success 2");
            else System.out.println("Failed 2");
        } catch (SQLException | ClassNotFoundException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            ps.close();
            c.close();
            System.out.println("Prepared Statement "+ps.isClosed() +" & Connection Close Successful "+ c.isClosed());
        }
    }
}