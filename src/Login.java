import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Login   extends JFrame {
  Connection conn = null;
  ResultSet rs = null;
  PreparedStatement pst = null;
  private JButton btn1;
  private JLabel jLabel1;
  private JLabel jLabel2;
  private JPanel jPanel1;
  private JPasswordField pf1;
  private JTextField tf1;
  public static String user,projAct;
  public static String passwd;
  public Login()
  {
        
    initComponents();
    JOptionPane.showMessageDialog(null," login is = guest, and password is = guest ");
  }
  
  private void initComponents()
  {
    this.jPanel1 = new JPanel();
    this.jLabel1 = new JLabel();
    this.jLabel2 = new JLabel();
    this.pf1 = new JPasswordField();
    this.tf1 = new JTextField();
    this.btn1 = new JButton();
    
    setDefaultCloseOperation(3);
    
    this.jPanel1.setBackground(new Color(255, 255, 0));
    this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Login v1.1 - 8 Oct 2018", 0, 0, new Font("Tahoma", 0, 14), new Color(255, 0, 153)));
    this.jPanel1.setForeground(new Color(102, 255, 0));
    
    this.jLabel1.setFont(new Font("Tahoma", 0, 14));
    this.jLabel1.setText("User Name");
    
    this.jLabel2.setFont(new Font("Tahoma", 0, 14));
    this.jLabel2.setText("Password");
    
    this.pf1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Login.this.pf1ActionPerformed(evt);
      }
    });
    this.btn1.setFont(new Font("Tahoma", 0, 14));
    this.btn1.setText("Login");
    this.btn1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Login.this.btn1ActionPerformed(evt);
      }
    });
    GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
    this.jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(35, 35, 35)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jLabel2, -2, 77, -2)
      .addComponent(this.jLabel1))
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addComponent(this.tf1, -2, 82, -2)
      .addComponent(this.pf1, -2, 82, -2)))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(93, 93, 93)
      .addComponent(this.btn1, -2, 75, -2)))
      .addContainerGap(69, 32767)));
    
    jPanel1Layout.setVerticalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(36, 36, 36)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.tf1, -2, -1, -2)
      .addComponent(this.jLabel1, -2, 20, -2))
      .addGap(26, 26, 26)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.jLabel2)
      .addComponent(this.pf1, -2, -1, -2))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, 32767)
      .addComponent(this.btn1)
      .addContainerGap()));
    

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(70, 70, 70)
      .addComponent(this.jPanel1, -2, -1, -2)
      .addContainerGap(88, 32767)));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(47, 47, 47)
      .addComponent(this.jPanel1, -2, -1, -2)
      .addContainerGap(60, 32767)));
    

    pack();
    
    btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });
  }
  
  private void pf1ActionPerformed(ActionEvent evt) {}
  
   
   private void btn1KeyPressed(java.awt.event.KeyEvent evt) {                                    

if (evt.getKeyCode() ==  KeyEvent.VK_ENTER  ){
                     user= tf1.getText(); passwd=  pf1.getText();
       
        String[] projectAct = { "PBCBA", "KDLA", "KDCBA", "CBCBA","PBLA",   "CBLA","PBDP"};
        
        switch (user) {
            case "arbind":
            case "anil":    
                projAct=projectAct[1];
                break;
            case "srikant":
                 projAct=projectAct[1];
                 break; 
            case "ramakant":
            case "suman":
                case "prabhakar":
                 projAct=projectAct[2];
                 break;
        case "dhirendra":
        case "pankaj":
        case "subrata": 
        case "balram":
        case "vishnu": 
             
          projAct=projectAct[0];
                break;       
                
            default:
        
        projAct = (String) JOptionPane.showInputDialog(null,"Kindly select (PB/CB/KD) and act(LA/CBA/DP) ?", "Project and Act",
        JOptionPane.QUESTION_MESSAGE,null, projectAct,  projectAct[0]);
      }
        if ( projAct !=null ){connectrDb();}
        dispose();
                }     // TODO add your handling code here:
    }                  
  
  
  private void btn1ActionPerformed(ActionEvent evt)
  {
       user= tf1.getText(); passwd=  pf1.getText();
       
        String[] projectAct = { "PBCBA",  "CBCBA","PBLA",  "KDCBA","CBLA", "KDLA","PBDP"};
        
        switch (user) {
            case "rajendra":
            case "anil":    
                projAct=projectAct[1];
                break;
        case "subodh":
        case "subrata": 
        case "balram":
        case "vishnu": 
          projAct=projectAct[0];
                break;       
                
            default:
        
        projAct = (String) JOptionPane.showInputDialog(null,"Kindly select (PB/CB/KD) and act(LA/CBA/DP) ?", "Project and Act",
        JOptionPane.QUESTION_MESSAGE,null, projectAct,  projectAct[0]);
      }
        if ( projAct !=null ){connectrDb();}
        dispose();
    
  }
  
  public static void main(String[] args)
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
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Login().setVisible(true);
      }
    });
  }

  //  private Connection connectrDb() {
      private void connectrDb() { 
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://10.1.252.145/landpb", user,passwd);
    First s1 =new First();
       Second s2= new Second();
      s2.setVisible(true);
      s1.dispose();
     
       JOptionPane.showMessageDialog(null, user+"   login successful for \n"+ projAct);
    //   return conn;
      
    }
    catch (HeadlessException | ClassNotFoundException | SQLException e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  //  return null;
    }
}
