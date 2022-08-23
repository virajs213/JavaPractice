package JDBC;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlUpdateDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    String url = "jdbc:postgresql://localhost:5432/viraj";
    String username = "postgres";
    String password = "password";

    final String QUERY = "update emp set job = ? where empno = ?";
     Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection(url,username,password);
    PreparedStatement ps= con.prepareStatement(QUERY);
    ps.setString(1,"SALESMAN");
    ps.setInt(2,121);
    int no= ps.executeUpdate();
        System.out.println(no +"row/s affected");


    }
}
