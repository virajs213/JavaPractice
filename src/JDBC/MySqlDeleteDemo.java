package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlDeleteDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/viraj";
        String username = "postgres";
        String password = "password";
      final String QUERY = "delete from emp where empno = ?";
      Connection con = null;
      PreparedStatement ps = null;
      try {
          Class.forName("org.postgresql.Driver");
          con = DriverManager.getConnection(url, username, password);
          ps = con.prepareStatement(QUERY);
          ps.setInt(1, 121);
          int no = ps.executeUpdate();
          System.out.println(no + "row/s affected");
      } catch (ClassNotFoundException | SQLException e) {
          System.out.println(e.getMessage());

      } finally {
          con.close();
          ps.close();
      }
    }
}
