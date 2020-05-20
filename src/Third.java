import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Third   extends JFrame {
  Connection conn = null;
  ResultSet rs = null;
  ResultSet rs1 = null;
  PreparedStatement pst = null;
  PreparedStatement pst1 = null;
  private JButton btn2;
  private JButton btn3;
             private JButton btn4; //added
  private ButtonGroup buttonGroup1;
  private JComboBox<String> cb1;
  private JComboBox<String> cb10;
  private JComboBox<String> cb2;
  private JComboBox<String> cb3;
  private JComboBox<String> cb4;
  private JComboBox<String> cb5;
  private JComboBox<String> cb6;
  private JComboBox<String> cb7;
  private JComboBox<String> cb9;
  private JCheckBox cx1;
  private JCheckBox cx2;
  private JCheckBox cx3;
  private JCheckBox cx4;
  private JCheckBox cx5;
  private JCheckBox cx6;
  private JCheckBox cx7;
  private JLabel jLabel1;
  private JPanel jPanel1;
  private JPanel jPanel3;
  private JScrollPane jScrollPane1;
  private JScrollPane jScrollPane4;
  private JRadioButton rb1;
  private JRadioButton rb2;
  private JTable t1;
  private JTextArea ta3;
  private JDateChooser tf1;
  private JTextField tf2;
  private JTextField tf3;
  private JTextField tf4;
  private JTextField tf5;
  private String user,projAct;
  public static String [] villageList = new String [30];
  public static String [] priorityUsagewise = new String [15];
  public static String [] priorityTimewise = new String [10];
    public static String [] phaseName = new String [22];
  public Third(){
    initComponents();
    this.conn = javaconnect.connecrDb();
   user= Login.user;projAct=Login.projAct;
    fillcombo1();
    fillcombo5();
    fillcombo6();fillcombo7();fillcombo16();
    this.btn2.setVisible(false);
    btn4.setVisible(false);
    
    this.cb2.setVisible(false);
    this.cb3.setVisible(false);
    this.rb1.setVisible(false);
    this.rb2.setVisible(false);
    
   
  }
  
  private void fillcombo1()
  { int p=0;
  
    try
    {
      this.cb1.addItem("select");
      String sql = " select distinct villageName from z_notification_master where projAct= "+ '"'+Login.projAct+'"';
      this.pst = this.conn.prepareStatement(sql);
      this.rs = this.pst.executeQuery();
      while (this.rs.next())
      {
        String villageName = this.rs.getString(1);
        this.cb1.addItem(villageName);
      
          villageList[p] = villageName;
                 p++;

      }
       
      villageList[p+1] = "Others"; villageList[p]="      ";
      p=0;
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  }
  private void fillcombo16()
  {int p=0;
    try
    {
      String sql = " select distinct phaseName from z_notification_master where projAct= "+ '"'+Login.projAct+'"';
      this.pst = this.conn.prepareStatement(sql);
      this.rs = this.pst.executeQuery();
      while (this.rs.next())
      {
        String villageName = this.rs.getString(1);
        this.cb4.addItem(villageName);
       phaseName[p] = villageName;
                 p++; 
      }
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  }
  private void fillcombo2()
  {
    String sql1 = "select plotNo from z_plot_master where  z_plot_master.projAct= "+'"' +Login.projAct+  '"'+" and villageName= '" + this.cb1.getSelectedItem().toString() +"' and Substring(landType,1,1)=\"T\" "+" order by cast(plotNo as unsigned);";
    
    try
    {
      this.pst = this.conn.prepareStatement(sql1);
      this.rs = this.pst.executeQuery();
      while (this.rs.next())
      {
        String plot = this.rs.getString(1);
        this.cb2.addItem(plot);
      }
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  }
  
  private void fillcombo3()
  {
    String sql1 = "select distinct(khataNo) from z_plot_master where  z_plot_master.projAct= "+'"' +Login.projAct+  '"'+" and villageName= '" + this.cb1.getSelectedItem().toString() + "' and Substring(landType,1,1)=\"T\" "+" order by cast(khataNo as unsigned);";
   
    try
    {
      this.pst = this.conn.prepareStatement(sql1);
      this.rs = this.pst.executeQuery();
      while (this.rs.next())
      {
        String plot = this.rs.getString(1);
        this.cb3.addItem(plot);
      }
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  }
  
  private void initComponents()
  {
    this.buttonGroup1 = new ButtonGroup();
    this.jScrollPane1 = new JScrollPane();
    this.t1 = new JTable();
    this.jPanel1 = new JPanel();
    this.cb5 = new JComboBox();
    this.rb2 = new JRadioButton();
    this.cb9 = new JComboBox();
    this.rb1 = new JRadioButton();
    this.cb6 = new JComboBox();
    this.cb2 = new JComboBox();
    this.cb10 = new JComboBox();
    this.cb4 = new JComboBox();
    this.cb1 = new JComboBox();
    this.cb3 = new JComboBox();
    this.btn3 = new JButton(); 
    
            this.btn4 = new JButton();
    this.cx7 = new JCheckBox();
    this.cx2 = new JCheckBox();
    this.cx3 = new JCheckBox();
    this.cx4 = new JCheckBox();
    this.cx5 = new JCheckBox();
    this.cx1 = new JCheckBox();
    this.cx6 = new JCheckBox();
    this.tf3 = new JTextField();
    this.jPanel3 = new JPanel();
    this.tf2 = new JTextField();
    this.tf1 = new JDateChooser();
    this.tf4 = new JTextField();
    this.jScrollPane4 = new JScrollPane();
    this.ta3 = new JTextArea();
    this.btn2 = new JButton();
    this.cb7 = new JComboBox();
    this.tf5 = new JTextField();
    this.jLabel1 = new JLabel();
    
    setDefaultCloseOperation(3);
    setTitle("Plot_Master");
    setBackground(new Color(153, 153, 255));
    setCursor(new Cursor(0));
    
    this.t1.setBorder(new MatteBorder(null));
    this.t1.setFont(new Font("Tahoma", 0, 13));
    this.t1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null }, { null, null, null, null } }, new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
 
    this.t1.setName("");
    this.t1.setRowHeight(25);
    this.t1.addMouseListener(new MouseAdapter()
    {
      public void mouseClicked(MouseEvent evt)
      {
        Third.this.t1MouseClicked(evt);
      }
    });
    this.jScrollPane1.setViewportView(this.t1);
    
    this.jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Search", 0, 0, new Font("Tahoma", 1, 12)));
    
    this.cb5.setMaximumRowCount(6);
    this.cb5.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.cb5ActionPerformed(evt);
      }
    });
    this.buttonGroup1.add(this.rb2);
    this.rb2.setFont(new Font("Tahoma", 0, 13));
    this.rb2.setText("Khata No");
    this.rb2.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent evt)
      {
        Third.this.rb2ItemStateChanged(evt);
      }
    });
    this.rb2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.rb2ActionPerformed(evt);
      }
    });
    this.cb9.setModel(new DefaultComboBoxModel(new String[] { "No", "Yes" }));
    
    this.buttonGroup1.add(this.rb1);
    this.rb1.setFont(new Font("Tahoma", 0, 13));
    this.rb1.setSelected(true);
    this.rb1.setText("PlotNo");
    this.rb1.setCursor(new Cursor(0));
    this.rb1.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent evt)
      {
        Third.this.rb1ItemStateChanged(evt);
      }
    });
    this.rb1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.rb1ActionPerformed(evt);
      }
    });
    this.cb2.setMaximumRowCount(18);
    this.cb2.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent evt)
      {
        Third.this.cb2ItemStateChanged(evt);
      }
    });
    this.cb2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.cb2ActionPerformed(evt);
      }
    });
    this.cb10.setModel(new DefaultComboBoxModel(new String[] { "No", "Yes" }));
    
   // this.cb4.setModel(new DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V", "VI" }));
    this.cb4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.cb4ActionPerformed(evt);
      }
    });
    this.cb1.setFont(new Font("Tahoma", 0, 13));
    this.cb1.setMaximumRowCount(12);
    this.cb1.setBorder(new MatteBorder(null));
    this.cb1.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent evt)
      {
        Third.this.cb1ItemStateChanged(evt);
      }
    });
    this.cb1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.cb1ActionPerformed(evt);
      }
    });
    this.cb3.setMaximumRowCount(14);
    this.cb3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.cb3ActionPerformed(evt);
      }
    });
    this.btn3.setFont(new Font("Tahoma", 1, 14));
                this.btn4.setFont(new Font("Tahoma", 1, 14));
    this.btn3.setText("Search");
                 this.btn4.setText("ToExcel");
    this.btn3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.btn3ActionPerformed(evt);
      }
    });
    
                     this.btn4.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
          try {
              Third.this.btn4ActionPerformed(evt);
          } catch (IOException ex) {
              Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    });
    
    
    this.cx7.setFont(new Font("Tahoma", 0, 12));
    this.cx7.setSelected(true);
    this.cx7.setText("Village");
    this.cx7.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent evt)
      {
        Third.this.cx7ItemStateChanged(evt);
      }
    });
    this.cx2.setFont(new Font("Tahoma", 0, 12));
    this.cx2.setText("Phase");
    
    this.cx3.setText("PriorityY");
    
    this.cx4.setText("PriorityU");
    
    this.cx5.setText("Verified");
    
    this.cx1.setFont(new Font("Tahoma", 0, 12));
    this.cx1.setText("Plot/Khata");
    this.cx1.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent evt)
      {
        Third.this.cx1ItemStateChanged(evt);
      }
    });
    this.cx6.setText("Work Started");
    
    GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
    this.jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addContainerGap(-1, 32767)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.cx4)
      .addComponent(this.cx3))
      .addGap(791, 791, 791))
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.cb1, -2, 98, -2)
      .addComponent(this.cb2, -2, 84, -2))
      .addGap(647, 647, 647))))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.cx7))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
      .addComponent(this.cx2, -2, 64, -2)
      .addGap(33, 33, 33))
      .addComponent(this.cx5)
      .addComponent(this.cx6))
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.cb9, -2, 87, -2)
      .addComponent(this.cb10, -2, 72, -2)
      .addComponent(this.cb6, -2, 87, -2)
      .addComponent(this.cb5, -2, 87, -2)
      .addComponent(this.cb4, -2, 62, -2)
      .addComponent(this.btn3, -2, 104, -2)
      
            .addComponent(this.btn4, -2, 104, -2)
      ))
              
      .addComponent(this.cx1)))
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addGap(22, 22, 22)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.rb1, -2, 75, -2)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addComponent(this.rb2, -2, 94, -2)
      .addGap(5, 5, 5)
      .addComponent(this.cb3, -2, 82, -2)))))
      .addContainerGap(-1, 32767)));
    
    jPanel1Layout.setVerticalGroup(jPanel1Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.cx7)
      .addComponent(this.cb1, -1, 27, 32767))
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.cx1)
      .addGap(15, 15, 15)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.cb2, -2, -1, -2)
      .addComponent(this.rb1))
      .addGap(3, 3, 3)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.rb2)
      .addComponent(this.cb3, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.cx2)
      .addComponent(this.cb4, -2, -1, -2))
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.cb5, -2, -1, -2)
      .addComponent(this.cx3))
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.cx4)
      .addComponent(this.cb6, -2, -1, -2))
      .addGap(31, 31, 31)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.cb9, -2, -1, -2)
      .addComponent(this.cx5))
      .addGap(18, 18, 18)
      .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.cb10, -2, -1, -2)
      .addComponent(this.cx6))
      .addGap(40, 40, 40)
      .addComponent(this.btn3, -2, 34, -2)
      //.addGap(32, 32, 32)
       .addComponent(this.btn4, -2, 34, -2)
      ));
    

    this.tf3.setFont(new Font("Tahoma", 0, 12));
    this.tf3.setBorder(BorderFactory.createTitledBorder(null, "Summary", 0, 0, new Font("Tahoma", 1, 13)));
    
    this.jPanel3.setBorder(BorderFactory.createTitledBorder(null, "Modify plot detail", 0, 0, new Font("Tahoma", 1, 12)));
    
    this.tf2.setEditable(false);
    this.tf2.setForeground(new Color(0, 51, 255));
    this.tf2.setBorder(BorderFactory.createTitledBorder("Plot"));
    this.tf2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.tf2ActionPerformed(evt);
      }
    });
    this.tf1.setBorder(BorderFactory.createTitledBorder("work Started on"));
    this.tf1.setFont(new Font("Tahoma", 1, 12));
    
    this.tf4.setFont(new Font("Tahoma", 0, 12));
    this.tf4.setBorder(BorderFactory.createTitledBorder("No of houses"));
    
    this.ta3.setColumns(20);
    this.ta3.setLineWrap(true);
    this.ta3.setRows(5);
    this.ta3.setWrapStyleWord(true);
    this.ta3.setBorder(BorderFactory.createTitledBorder("Remarks"));
    this.jScrollPane4.setViewportView(this.ta3);
    
    this.btn2.setFont(new Font("Tahoma", 1, 12));
    this.btn2.setText("update");
    this.btn2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
        Third.this.btn2ActionPerformed(evt);
      }
    });
    this.cb7.setEditable(true);
    this.cb7.setBorder(BorderFactory.createTitledBorder(null, "Reason Unpaid?", 0, 0, new Font("Tahoma", 0, 12)));
    this.cb7.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent evt)
      {
       Third.this.cb7ActionPerformed(evt);
      }
    });
    this.tf5.setBorder(BorderFactory.createTitledBorder("Assets"));
    
    GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
    this.jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(jPanel3Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addContainerGap()
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addComponent(this.tf2, -2, 158, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.cb7, -2, 158, -2)
      .addGap(18, 18, 18)
      .addComponent(this.tf4, -2, 114, -2)
      .addGap(18, 18, 18)
      .addComponent(this.tf5, -2, 147, -2)
      .addGap(26, 26, 26)
      .addComponent(this.tf1, -2, 172, -2))
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addComponent(this.jScrollPane4, -2, 665, -2)
      .addGap(53, 53, 53)
      .addComponent(this.btn2, -2, 99, -2)))
      .addContainerGap(85, 32767)));
    
    jPanel3Layout.setVerticalGroup(jPanel3Layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addGap(16, 16, 16)
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
      .addComponent(this.tf2, -2, -1, -2)
      .addComponent(this.cb7, -2, -1, -2)
      .addComponent(this.tf4, -2, -1, -2)
      .addComponent(this.tf5, -2, -1, -2)))
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.tf1, -2, 76, -2)))
      .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, -1, 32767)
      .addComponent(this.jScrollPane4, -2, 75, -2)
      .addContainerGap(-1, 32767))
      .addGroup(jPanel3Layout.createSequentialGroup()
      .addGap(18, 18, 18)
      .addComponent(this.btn2, -2, 35, -2)
      .addContainerGap(-1, 32767)))));
    

    this.jLabel1.setFont(new Font("Tahoma", 3, 16));
    this.jLabel1.setHorizontalAlignment(0);
    this.jLabel1.setText(Login.projAct+" - Unpaid Plot (Tenancy only) wise action details ");
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap(313, 32767)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addComponent(this.jScrollPane1, GroupLayout.Alignment.TRAILING, -2, 940, -2)
      .addComponent(this.jPanel3, GroupLayout.Alignment.TRAILING, -2, -1, -2))
      .addGap(28, 28, 28))
      .addGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addGap(8, 8, 8)
      .addComponent(this.jPanel1, -2, 287, -2)
      .addGap(127, 127, 127)
      .addComponent(this.tf3, -2, 660, -2))
      .addGroup(layout.createSequentialGroup()
      .addGap(408, 408, 408)
      .addComponent(this.jLabel1, -1, -1, 32767)))
      .addContainerGap(-1, 32767)));
    
    layout.setVerticalGroup(layout
      .createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addContainerGap()
      .addComponent(this.jLabel1, -2, 29, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
      .addComponent(this.tf3, -2, -1, -2)
      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
      .addComponent(this.jScrollPane1, -2, 240, -2)
      .addGap(26, 26, 26)
      .addComponent(this.jPanel3, -2, 198, -2))
      .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
      .addComponent(this.jPanel1, -2, -1, -2)
      .addGap(12, 12, 12)))
      .addContainerGap(-1, 32767)));
    

    pack();
  }
  
  private void rb2ActionPerformed(ActionEvent evt) {}
  
  private void cb1ActionPerformed(ActionEvent evt) {}
  
  private void rb1ActionPerformed(ActionEvent evt) {}
  
  private void cb1ItemStateChanged(ItemEvent evt)
  {
    this.cb2.removeAllItems();
    

    this.cb3.removeAllItems();
    
    fillcombo2();
    fillcombo3();
  }
  
  private void t1MouseClicked(MouseEvent evt)
  {
    fillEdits();
  }
  
  private void cb4ActionPerformed(ActionEvent evt) {}
  
  private void btn3ActionPerformed(ActionEvent evt)
  {
    this.btn2.setVisible(false);
    

    this.tf2.setText(null);
    this.tf4.setText(null);
    this.tf5.setText(null);
    this.ta3.setText(null);
    this.tf1.setDate(null);
    this.cb7.getEditor().setItem("");
    

btn4.setVisible(true);

    searchResults();
  }
  
  private void btn4ActionPerformed(ActionEvent evt) throws IOException
  {
   Second s= new Second();
   s.exportTable(t1, new File("E:\\tabledata.xls"));
           
  }
  
  private void cb3ActionPerformed(ActionEvent evt) {}
  
  private void cb5ActionPerformed(ActionEvent evt) {}
  
  private void cb7ActionPerformed(ActionEvent evt) {}
  
  private void btn2ActionPerformed(ActionEvent evt)
  {
    update();
    searchResults();
  }
  
  private void tf2ActionPerformed(ActionEvent evt) {}
  
  private void cb2ItemStateChanged(ItemEvent evt) {}
  
  private void cb2ActionPerformed(ActionEvent evt) {}
  
  private void rb1ItemStateChanged(ItemEvent evt)
  {
    if ((this.rb1.isSelected()) && (this.rb1.isVisible())) {
      this.cb2.setVisible(true);
    } else {
      this.cb2.setVisible(false);
    }
  }
  
  private void rb2ItemStateChanged(ItemEvent evt)
  {
    if (this.rb2.isSelected()) {
      this.cb3.setVisible(true);
    } else {
      this.cb3.setVisible(false);
    }
  }
  
  private void cx1ItemStateChanged(ItemEvent evt)
  {
    if (!this.cx1.isSelected())
    {
      this.cb2.setVisible(false);
      this.cb3.setVisible(false);
      this.rb1.setVisible(false);
      this.rb2.setVisible(false);
    }
    else
    {
      this.cb2.setVisible(true);
      this.cb3.setVisible(true);
      this.rb1.setVisible(true);
      this.rb2.setVisible(true);
    }
  }
  
  private void cx7ItemStateChanged(ItemEvent evt)
  {
    if ((this.cx7.isSelected()) && (this.cx7.isVisible()))
    {
      this.cx1.setVisible(true);
    }
    else
    {
      this.cx1.setVisible(false);
      this.cx1.setSelected(false);
      this.cb2.setVisible(false);
      this.cb3.setVisible(false);
      this.rb1.setVisible(false);
      this.rb2.setVisible(false);
    }
  }
  
  private void fillEdits()
  {
    try
    {
      int row = this.t1.getSelectedRow();
      String Table_click1 = this.t1.getModel().getValueAt(row, 0).toString();
      String Table_click2 = this.t1.getModel().getValueAt(row, 1).toString();
       String Table_click3 = this.t1.getModel().getValueAt(row, 4).toString();


      String sql = "select * from stvi_and_claims where villageName='" + Table_click1 + "' and plotNo='" + Table_click2 + "' and haalRaiyat='" + Table_click3+ "';";
      this.pst = this.conn.prepareStatement(sql);
      this.rs = this.pst.executeQuery();
      
      if (this.rs.next())
      {
        String add1 = this.rs.getString("villageName");
        String add2 = this.rs.getString("plotNo");
        String add3 = this.rs.getString("housesNo");
        String add4 = this.rs.getString("assets");
        String add5 = this.rs.getString("reasonUnpaid");
        String add6 = this.rs.getString("remarks");
        java.sql.Date add7 = this.rs.getDate("workStartedOn");
        this.tf2.setText(add1 + " :  PlotNo- " + add2);
        this.tf4.setText(add3);
        this.tf5.setText(add4);
        this.ta3.setText(add6);
        this.tf1.setDate(add7);
        this.cb7.getEditor().setItem(add5);
        
        this.btn2.setVisible(true);
      }
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
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
      Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new First().setVisible(true);
      }
    });
  }
  
  private void fillcombo5()
  { int p=0;
    try
    {
      String sql = " select priorityUsagewise from z_priority_usage_master where projAct= "+ '"'+Login.projAct+'"';
      this.pst = this.conn.prepareStatement(sql);
      this.rs = this.pst.executeQuery();
      while (this.rs.next())
      {
        String villageName = this.rs.getString(1);
        this.cb6.addItem(villageName);
         priorityUsagewise[p] = villageName;
                 p++;
      }
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  }
  
  private void fillcombo6()
  {int p=0;
    try
    {
      String sql = " select priorityTimewise from z_priority_time_master where projAct= "+ '"'+Login.projAct+'"';
      this.pst = this.conn.prepareStatement(sql);
      this.rs = this.pst.executeQuery();
      while (this.rs.next())
      {
        String villageName = this.rs.getString(1);
        this.cb5.addItem(villageName);
       priorityTimewise[p] = villageName;
                 p++; 
      }
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  }
  
  private void fillcombo7()
  {
    try
    {
      String sql = " select verified from z_verified_master";
      
      this.pst = this.conn.prepareStatement(sql);
      this.rs = this.pst.executeQuery();
      while (this.rs.next())
      {
        String villageName = this.rs.getString(1);
      //  this.cb7.addItem(villageName);
       String[] reasonUnpaid = {"Title dispute", "Recovery", "notWilling","shareRatioIssue","docMoreThanland","JobDemand",  "Others2"};
         this.cb7.setModel(new DefaultComboBoxModel(reasonUnpaid));

      }
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
  }
  
  private void update()
  {
    int p = JOptionPane.showConfirmDialog(null, "Do u really want to save", "save", 0);
    if (p == 0) {
      try
      {
        int row = this.t1.getSelectedRow();
        String Table_click1 = this.t1.getModel().getValueAt(row, 0).toString();
        String Table_click2 = this.t1.getModel().getValueAt(row, 1).toString();
        String Table_click3 = this.t1.getModel().getValueAt(row, 4).toString();
        String s1 = "assets='" + this.tf5.getText() + "'";
        String s2 = ", housesNo='" + this.tf4.getText() + "'";
        String s3 = ", remarks='" + this.ta3.getText() + "'";
        //String s4="";
        String s4 = ", reasonUnpaid='" + this.cb7.getSelectedItem().toString() + "'";
        



        java.util.Date date1 = this.tf1.getDate();
        if (date1 != null)
        {
          java.sql.Date sqldate1 = new java.sql.Date(date1.getTime());
          s4 = s4 + ", workStartedOn='" + sqldate1 + "'";
        }
        String sql = " update  stvi_and_claims  set  " + s1 + s2 + s3 + s4 + "  , modifiedBy=current_user(), modifiedDate=curDate() Where villageName= '" + Table_click1 + "' and plotNo= '" + Table_click2 + "' and haalRaiyat= '" + Table_click3 +"' ; ";
      

        this.pst = this.conn.prepareStatement(sql);
       int rowsUpdated= this.pst.executeUpdate();
       
       JOptionPane.showMessageDialog(null,Integer.toString(rowsUpdated) + " no of rows updated" );
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(null, e);
      }
      finally
      {
        this.tf2.setText(null);
        this.tf4.setText(null);
        this.tf5.setText(null);
        this.ta3.setText(null);
        this.tf1.setDate(null);
        this.cb7.getEditor().setItem("");
        this.btn2.setVisible(false);
      }
    }
  }
  
  private void searchResults()
  {
    this.tf3.removeAll();
    try
    {
      String s = "";
      String sa = "";
      if ((this.cx7.isSelected()) && (this.cb1.getSelectedItem().toString() != "select"))
      {
        String s1 = this.cb1.getSelectedItem().toString();
        
        s1 = " and  z_plot_master.villageName=\"" + s1 + '"';
        s = s + s1;
        if (this.cx1.isSelected())
        {
          if (this.rb1.isSelected())
          {
            String s2 = this.cb2.getSelectedItem().toString();
            if (!s2.isEmpty())
            {
              s2 = " and z_plot_master.plotNo=\"" + s2 + '"';
              s = s + s2;
            }
          }
          if (this.rb2.isSelected())
          {
            String s3 = this.cb3.getSelectedItem().toString();
            s3 = " and z_plot_master.khataNo=\"" + s3 + '"';
            s = s + s3;
          }
        }
      }
      if (this.cx2.isSelected())
      {
        String s4 = this.cb4.getSelectedItem().toString();
        if (!s4.isEmpty())
        {
          s4 = " and phaseName=\"" + s4 + '"';
          s = s + s4;
        }
      }
      if (this.cx3.isSelected())
      {
        String s5 = this.cb5.getSelectedItem().toString();
        
        s5 = " and priorityTimewise=\"" + s5 + '"';
        s = s + s5;
      }
      if (this.cx4.isSelected())
      {
        String s6 = this.cb6.getSelectedItem().toString();
        
        s6 = " and priorityUsagewise=\"" + s6 + '"';
        s = s + s6;
      }
      if (this.cx5.isSelected()) {
        if (this.cb9.getSelectedItem().toString() == "Yes")
        {
          String s7 = " and verified=\"All verified\"";
          s = s + s7;
        }
        else if (this.cb9.getSelectedItem().toString() == "No")
        {
          String s7 = " and verified != \"All verified\"";
          s = s + s7;
        }
      }
      if (this.cx6.isSelected()) {
        if (this.cb10.getSelectedItem().toString() == "No")
        {
          String s8 = " and z_plot_master.workStartedOn is  null ";
          s = s + s8;
        }
        else if (this.cb10.getSelectedItem().toString() == "Yes")
        {
          String s8 = " and z_plot_master.workStartedOn is not null  ";
          s = s + s8;
        }
      }
      s=s+ " and z_plot_master.projAct="+'"'+Login.projAct+'"';
      if (!s.isEmpty())
      {
        s = "   where" + s.substring(4);
        
        sa = s;
      }
      String sql = "";
      
 //     sql = " select z_plot_master.villageName as Village,z_plot_master.plotNo,phaseName as Phase,khataNo,khatiyaniArea,acqdArea, sum(paidArea) as paidArea, (acqdArea-coalesce(paidArea,0)) as unpaidArea,priorityTimewise as Priority,priorityUsagewise as Priority,housesNo,assets,workStartedOn  from landpb.z_plot_master  left outer join landpb.plot_vendor_wise_paidarea on z_plot_master.villageName=plot_vendor_wise_paidarea.villageName and z_plot_master.plotNo=plot_vendor_wise_paidarea.plotNo    " + s + "  group by  z_plot_master.villageName, z_plot_master.plotNo";
  //  sql= "select stvi_and_claims.villageName as Village,stvi_and_claims.plotNo,phaseName as Phase  priorityTimewise as Priority,priorityUsagewise as Priority, reasonUnpaid, stvi_and_claims.workStartedOn   from landpb.z_plot_master  left outer join landpb.stvi_and_claims on z_plot_master.villageName = stvi_and_claims.villageName and z_plot_master.plotNo=stvi_and_claims.plotNo   " + s + "  group by  stvi_and_claims.villageName, stvi_and_claims.plotNo";
 //where phaseName="I" and priorityTimewise="3-5" and priorityUsagewise="Magazine" and  left(landType,2) ="Te" and workStartedOn is  null   and  z_plot_master.projAct="PBCBA" 
     
      
      sql = " select z_plot_master.villageName as Village,z_plot_master.plotNo,phaseName as Phase,khataNo,haalRaiyat,claimArea,reasonUnpaid,claimtype,  priorityTimewise as Priority,priorityUsagewise as Priority,landDocType, stvi_and_claims.workStartedOn  from landpb.z_plot_master  left outer join landpb.stvi_and_claims on z_plot_master.projAct=stvi_and_claims.projAct and z_plot_master.villageName=stvi_and_claims.villageName and z_plot_master.plotNo=stvi_and_claims.plotNo    " + s + " and CRno is null and Substring(landType,1,1)=\"T\"";


 this.pst = this.conn.prepareStatement(sql);
      
      this.rs = this.pst.executeQuery();
      
      this.t1.setModel(DbUtils.resultSetToTableModel(this.rs));
      


      // for sum(unpaid) to edit the code
      
 String sql4 = " select reasonUnpaid, count(distinct stvi_and_claims.projAct, stvi_and_claims.villageName, stvi_and_claims.plotNo),sum(claimArea) from stvi_and_claims   join  z_plot_master on z_plot_master.projAct=stvi_and_claims.projAct and z_plot_master.villageName=stvi_and_claims.villageName and z_plot_master.plotNo=stvi_and_claims.plotNo  "+ s + " and CRno is null and Substring(landType,1,1)=\"T\" " +"group by reasonUnpaid";
         //  left join (select villageName, plotNo, sum(paidArea) as paidArea1 from  plot_vendor_wise_paidarea group by villageName, plotNo) as T on z_plot_master.villageName=T.villageName and z_plot_master.plotNo=T.plotNo  " + s;
   //   System.out.println(sql4);
//(acqdArea-coalesce(paidArea,0)) as unpaidArea,


      this.pst1 = this.conn.prepareStatement(sql4);
       String k="" ;
      this.rs1 = this.pst1.executeQuery();
      while(this.rs1.next())
      {
       
        k = k+ "; " +rs1.getString(1)+ ", Nos-"+rs1.getString(2)+", claimArea-"+  String.format("%.02f", rs1.getFloat(3));
         
          // this.tf3.setText(" Total :   No of plots= " + Integer.toString(add1) + ";  AcqdArea= " +  String.format("%.02f", add2) + " ;  PaidArea= " +  String.format("%.02f", add3)+ " ;  unPaidArea= " +  String.format("%.02f",(add2-add3)));
     
      }
      
           
      // end of sum(unpaid)
      
      
      

      String sql1 = " select count(distinct  z_plot_master.projAct,z_plot_master.villageName, z_plot_master.plotNo),sum( acqdArea), sum(paidArea1) from z_plot_master  left join (select projAct, villageName, plotNo, sum(paidArea) as paidArea1 from  plot_vendor_wise_paidarea group by villageName, plotNo) as T on z_plot_master.projAct=T.projAct and z_plot_master.villageName=T.villageName and z_plot_master.plotNo=T.plotNo " + s        + "  and Substring(landType,1,1)=\"T\"";
      
//(acqdArea-coalesce(paidArea,0)) as unpaidArea,


      this.pst1 = this.conn.prepareStatement(sql1);
      
      this.rs1 = this.pst1.executeQuery();
      if (this.rs1.next())
      {
        int add1 = this.rs1.getInt(1);
        float add2 = this.rs1.getFloat(2);
        
        float add3 = this.rs1.getFloat(3);
        //this.tf3.setText(" Total: No of plots= " + Integer.toString(add1) + "; AcqdArea= " + Float.toString(add2) + " ; PaidArea= " + Float.toString(add3)+ " ; unPaidArea= " + Float.toString(add2-add3));
      this.tf3.setText(" Total : No of plots= " + Integer.toString(add1) + ";  AcqdArea= " +  String.format("%.02f", add2) + " ;    unPaidArea= " +  String.format("%.02f",(add2-add3))+" "+k);
     
      }
      return;
    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    }
    finally
    {
      try
      {
        this.rs.close();
        this.rs1.close();
        this.pst.close();
        this.pst1.close();
      }
      catch (Exception e)
      {
        JOptionPane.showMessageDialog(null, "error from searchResults");
      }
    }
  }
}
