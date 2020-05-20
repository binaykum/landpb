
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnectpap
{
  Connection conn = null;
  
  public static Connection connecrDb()
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pappb", "binay", "binay");
      JOptionPane.showMessageDialog(null, "connection established");
      return conn;
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
    return null;
  }
}
