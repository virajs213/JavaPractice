package JDBC;

import java.sql.*;

public class JavaJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/viraj";
        String username = "postgres";
        String password = "password";
        final String SELECT_QUERY = "select * from emp;";
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(SELECT_QUERY);
        System.out.println("Id "+ " Name "+" Job "+ " MGR ");
        while (rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getString(3)+" ");
            System.out.println(rs.getString("mgr"));
        }
    }
}