/*
 * Write a Java program to connect to a database using DriverManager and Connection.
 * Print a success message when the connection is established.
 */

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Que1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Driver load or register kara hai
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection banaya hai
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Time_pass", "root", "root");
        System.out.println("Connection Extablished Success");
        c.close();
        System.out.println("Connection Close Success");
    }
}













// Scanner sc = new Scanner(System.in);
// System.out.print("Enter Your Name: ");
// String name = sc.nextLine();
// System.out.print("Enter Your Email: ");
// String email = sc.nextLine();
// System.out.print("Enter Your House No: ");
// String houseNO = sc.nextLine();
// System.out.println("Success");
// PreparedStatement preparedStatement = c.prepareStatement("insert into
// Kuch_Bhi values(?,?,?)");
// preparedStatement.setString(1, name);
// preparedStatement.setString(2, email);
// preparedStatement.setString(3, houseNO);