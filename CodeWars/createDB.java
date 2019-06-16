import java.sql.Connection;
import java.sql.DriverManager;

public class createDB {
  public static void main(String[] args) {
    Connection c = null;

    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/learnyousql", "postgres", "password");
    } catch (Exception e) {

      e.printStackTrace();
    }
    System.out.println(" connected successfuly to postgres database");

  }
}