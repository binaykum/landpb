import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Test
  extends JFrame
{
  private JButton jButton1;
  private JButton jButton2;
  private JButton jButton3;
  private JButton jButton4;
  private JButton jButton5;
  private JButton jButton6;
  private JComboBox<String> jComboBox1;
  private JComboBox<String> jComboBox2;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JPanel jPanel1;
  private JScrollPane jScrollPane1;
  private JTable jTable1;
  private JTextField tf1;
  private JTextField tf2;
  private JTextField tf3;
  private JTextField tf4;
  private JTextField tf5;
  
  public Test()
  {
    initComponents();
  }
  
  private void initComponents()
  {
    this.jPanel1 = new JPanel();
    this.jButton2 = new JButton();
    this.jButton3 = new JButton();
    this.jButton1 = new JButton();
    this.jLabel1 = new JLabel();
    this.tf1 = new JTextField();
    this.jLabel2 = new JLabel();
    this.tf2 = new JTextField();
    this.jButton4 = new JButton();
    this.jButton5 = new JButton();
    this.jLabel3 = new JLabel();
    this.jComboBox1 = new JComboBox();
    this.jComboBox2 = new JComboBox();
    this.tf3 = new JTextField();
    this.tf4 = new JTextField();
    this.tf5 = new JTextField();
    this.jButton6 = new JButton();
    this.jScrollPane1 = new JScrollPane();
    this.jTable1 = new JTable();
    
    setDefaultCloseOperation(3);
    
    this.jPanel1.setBorder(BorderFactory.createLineBorder(new Color(255, 51, 0)));
    
    this.jButton2.setText("jButton2");
    
    this.jButton3.setText("jButton3");
    
    this.jButton1.setText("plotMaster");
    this.jButton1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Test.this.jButton1ActionPerformed(evt);
      }
    });
    GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
    this.jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
      .addComponent(this.jButton1, -1, -1, 32767)
      .addComponent(this.jButton2, -1, -1, 32767)
      .addComponent(this.jButton3, -2, 83, -2))
      .addContainerGap()));
    
    jPanel1Layout.setVerticalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jButton1)
      .addGap(26, 26, 26)
      .addComponent(this.jButton2)
      .addGap(32, 32, 32)
      .addComponent(this.jButton3)
      .addContainerGap()));
    

    this.jLabel1.setText("villageName");
    
    this.tf1.setText("villageName");
    this.tf1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Test.this.tf1ActionPerformed(evt);
      }
    });
    this.jLabel2.setText("phasseName");
    
    this.tf2.setText("phaseName");
    this.tf2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Test.this.tf2ActionPerformed(evt);
      }
    });
    this.jButton4.setText("Add");
    this.jButton4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Test.this.jButton4ActionPerformed(evt);
      }
    });
    this.jButton5.setText("Add");
    
    this.jLabel3.setText("plot");
    
    this.jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    
    this.jComboBox2.setModel(new DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    
    this.tf3.setText("khataName");
    
    this.tf4.setText("khataNo");
    
    this.tf5.setText("acqdArea");
    
    this.jButton6.setText("Add");
    
    this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
    









    this.jScrollPane1.setViewportView(this.jTable1);
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(22, 22, 22)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jScrollPane1, -2, -1, -2)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.jPanel1, -2, -1, -2)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(54, 54, 54)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel1)
      .addComponent(this.jLabel2))
      .addGap(46, 46, 46)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.tf1, -2, -1, -2)
      .addComponent(this.tf2, -2, -1, -2))
      .addGap(59, 59, 59)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jButton5)
      .addComponent(this.jButton4)))
      .addGroup(layout.createSequentialGroup()
      .addGap(63, 63, 63)
      .addComponent(this.jLabel3)
      .addGap(44, 44, 44)
      .addComponent(this.jComboBox1, -2, -1, -2)
      .addGap(31, 31, 31)
      .addComponent(this.jComboBox2, -2, -1, -2)
      .addGap(18, 18, 18)
      .addComponent(this.tf3, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
      .addComponent(this.tf4, -2, -1, -2)
      .addGap(18, 18, 18)
      .addComponent(this.tf5, -2, -1, -2)
      .addGap(34, 34, 34)
      .addComponent(this.jButton6)))))
      .addContainerGap(71, 32767)));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(20, 20, 20)
      .addComponent(this.jPanel1, -2, -1, -2))
      .addGroup(layout.createSequentialGroup()
      .addGap(30, 30, 30)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel1)
      .addComponent(this.tf1, -2, -1, -2)
      .addComponent(this.jButton4))
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel2)
      .addComponent(this.tf2, -2, -1, -2)
      .addComponent(this.jButton5))
      .addGap(28, 28, 28)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel3)
      .addComponent(this.jComboBox1, -2, -1, -2)
      .addComponent(this.jComboBox2, -2, -1, -2)
      .addComponent(this.tf3, -2, -1, -2)
      .addComponent(this.tf4, -2, -1, -2)
      .addComponent(this.tf5, -2, -1, -2)
      .addComponent(this.jButton6))))
      .addGap(57, 57, 57)
      .addComponent(this.jScrollPane1, -2, 240, -2)
      .addContainerGap(126, 32767)));
    

    pack();
  }
  
  private void tf2ActionPerformed(ActionEvent evt) {}
  
  private void jButton1ActionPerformed(ActionEvent evt) {}
  
  private void jButton4ActionPerformed(ActionEvent evt)
  {
    Connection conn = null;
    Statement stat = null;
    ResultSet rs = null;
    String query1 = "select * from plot_master;";
    try
    {
      int count = 0;
      stat = conn.prepareStatement(query1);
      rs = stat.executeQuery(query1);
      System.out.println(query1);
      while (rs.next()) {
        count += 1;
      }
      this.tf2.setText(Integer.toString(count));
      JOptionPane.showMessageDialog(null, " database connection sucessful");
      

      conn.close();
    }
    catch (Exception e)
    {
      JPanel panel = new JPanel();
      JOptionPane.showMessageDialog(panel, " database connection unsucessful");
    }
  }
  
  private void tf1ActionPerformed(ActionEvent evt) {}
  
  public static void main(String[] args)
    throws SQLException
  {
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Test().setVisible(true);
      }
    });
  }
}
