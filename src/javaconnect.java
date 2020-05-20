import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class javaconnect {
  Connection conn = null;
  
 
  
  public static Connection connecrDb()
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://10.1.252.145/landpb", Login.user, Login.passwd);
    // JOptionPane.showMessageDialog(null, "connection from javaconnect established  "+Login.user);
      return conn;
    }
    catch (HeadlessException | ClassNotFoundException | SQLException e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
    return null;
  }
}
