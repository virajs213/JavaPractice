package JDBC;

import java.sql.SQLException;
import java.sql.*;
public class MysqlInsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/viraj";
        String username = "postgres";
        String password = "password";
        //final String QUERY = "insert into emp value(121,'Viraj','SD','2322','2022-12-01',5000,500,40);";
        final String QUERY = "insert into emp values(?,?,?,?,?,?,?,?);";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = con.prepareStatement(QUERY);
        ps.setInt(1,1211);
        ps.setString(2,"Marry");
        ps.setString(3,"Salesman");
        ps.setInt(4,7369);
        System.out.println("Current time in millis: "+System.currentTimeMillis());
        ps.setDate(5,new Date(System.currentTimeMillis()));
        ps.setDouble(6,7000);
        ps.setDouble(7,100);
        ps.setInt(8,40);
        int no = ps.executeUpdate();
        System.out.println(no + " row/s  affected");
    }
}