
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;



public class Second extends javax.swing.JFrame {
private String user,projAct;
    ResultSet rs,rs1,rs3 =null;
    PreparedStatement  pst=null,pst1=null,pst2=null,pst3=null;
    Connection conn=null;
    String sql=null,sql1=null, sql2=null,sql3=null;
    String pid;
    int maxGenerations=15;int maxMemberInOneGeneration=15;
    String searchString= null, searchString2=null;
      ArrayList<String>  list1 = new ArrayList<>();
      ArrayList<String>  list22 = new ArrayList<>();
      Set<String> list2 = new HashSet<>(list22);
       ArrayList<String>  list33 = new ArrayList<>();
        Set<String> list3 = new HashSet<>(list33);
        ArrayList<String>  list44 = new ArrayList<>();
         Set<String> list4 = new HashSet<>(list44);
         ArrayList<String>  list55 = new ArrayList<>();
          Set<String> list5 = new HashSet<>(list55);
          ArrayList<String>  list66 = new ArrayList<>();
           
           Set<String> list6 = new HashSet<>(list66);
           ArrayList<String>  list8 = new ArrayList<>();
    String vendorCode=""; String employedWith="";
     String paidAcba=""; String paidAla=""; String age ="";String YearOfDeath="";
     
    public Second() {
        user=Login.user;
        projAct=   Login.projAct ;
      
        this.pid = "";
        initComponents();
        conn= javaconnect.connecrDb();
        fillcombo(); fillcombo1();
         cb1.setModel(new DefaultComboBoxModel(list1.toArray()));
     
         cb8.setModel(new DefaultComboBoxModel(list8.toArray()));
         update.setVisible(false);
         insert.setVisible(false);
         familytree.setVisible(false);
         jButton10.setVisible(false);
        jButton9.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        btn1.setVisible(false);
        jLabel2.setVisible(false);
        jt1.setVisible(false);
         
         
    }
    
    private void fillcombo() {
      
        try {
            
           
        sql= "select * from pap_master order by name;";
        pst=conn.prepareStatement(sql);
        rs= pst.executeQuery();
        while(rs.next()){
            
            String name1 = rs.getString("name");  list1.add(name1);
              String name2 = rs.getString("residentOf");  list2.add(name2);
                String name3 = rs.getString("_id");  list3.add(name3);
                  String name4 = rs.getString("aadharNo");  list4.add(name4);
                    String name5 = rs.getString("contactNo");  list5.add(name5);
                      String name6 = rs.getString("vendorCode");  list6.add(name6);
          
        }
        
        
        }catch (Exception e){
            JOptionPane.showMessageDialog( null,e);
        }

    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        cb8 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        familytree = new javax.swing.JButton();
        rb4 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rb6 = new javax.swing.JRadioButton();
        cb1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        plot1 = new javax.swing.JButton();
        plot2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btn1.setText("Insert");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        t2.setAutoCreateRowSorter(true);
        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t2.setCellSelectionEnabled(true);
        t2.setRowHeight(40);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t2);
        t2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton8.setText("search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Export to Excel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        cb8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb8ActionPerformed(evt);
            }
        });
        cb8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cb8KeyPressed(evt);
            }
        });

        jButton10.setText("Details");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt1KeyReleased(evt);
            }
        });

        jLabel2.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(cb8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(62, 62, 62)
                                .addComponent(jButton6)
                                .addGap(74, 74, 74)
                                .addComponent(jButton9)
                                .addGap(205, 205, 205)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 530, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(cb8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(btn1)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("All Tables", jPanel2);

        t1.setAutoCreateRowSorter(true);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t1.setRowHeight(40);
        t1.setRowMargin(3);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        familytree.setText("Family Tree");
        familytree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familytreeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb4);
        rb4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb4.setText("Aadhar No");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb2.setText("Resident Of");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb1.setSelected(true);
        rb1.setText("Name");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb3.setText("PAP_id");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb5);
        rb5.setText("Contact No");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search PAP by");

        buttonGroup1.add(rb6);
        rb6.setText("Vendor Code");
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });

        cb1.setEditable(true);
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        cb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cb1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cb1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cb1KeyTyped(evt);
            }
        });

        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update)
                        .addGap(65, 65, 65)
                        .addComponent(insert)
                        .addGap(49, 49, 49)
                        .addComponent(familytree)
                        .addGap(223, 223, 223))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(rb1)
                                    .addComponent(rb4)
                                    .addComponent(rb5))
                                .addGap(335, 335, 335))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb2)
                                    .addComponent(rb3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 804, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb2)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(familytree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rb6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("PAP search", jPanel1);

        plot1.setText("All Plot Details");
        plot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plot1ActionPerformed(evt);
            }
        });

        plot2.setText("Unpaid Plot Details");
        plot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plot2ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton7");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plot2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(plot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(359, 359, 359)
                .addComponent(jButton7)
                .addContainerGap(921, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plot1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plot2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plot Details", jPanel3);

        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("PriorityArea Payment staus");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("PriorityArea Unpaid status");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Total Payment Status");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Payment Status All projects");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("claimant and Pap status");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Employment Status");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(761, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(720, 720, 720))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addGap(12, 12, 12)
                .addComponent(jRadioButton3)
                .addGap(6, 6, 6)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(328, 328, 328))
        );

        jTabbedPane1.addTab("Reports", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1594, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("GM Land", jPanel5);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sl no", "plotNo", "phase", "acqdArea", "unpaid", "asseedA", "", "Vendor1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jButton12.setText("Add plot");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("remove plot");

        jButton14.setText("Add claimant");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Remove claimant");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton16.setText("Check");

        jButton17.setText("Submit");

        jButton18.setText("draft Save");

        jLabel3.setText("projAct");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 204));
        jLabel4.setText("THis page is under Construction");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton18)
                .addGap(76, 76, 76)
                .addComponent(jButton17)
                .addGap(144, 144, 144))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addGap(234, 234, 234))))
        );

        jTabbedPane1.addTab("FreshPayment", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1594, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ERPayment", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1594, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("later", jPanel8);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setText("plotwiseVpayments-vendor");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("CBA notifiedarea vs plotwisearea");

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("GMlandplotwisevs trasferred");

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("plotwiseVpayments-CRno");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jButton4.setText("submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton11.setText("Export to Excel");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton10)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jRadioButton7)
                        .addGap(127, 127, 127)
                        .addComponent(jRadioButton8)
                        .addGap(75, 75, 75)
                        .addComponent(jRadioButton9))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(88, 88, 88)
                .addComponent(jButton11)
                .addGap(419, 419, 419))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton10)
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton11))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ErrorCheck", jPanel9);

        jTabbedPane1.setSelectedIndex(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fileName=null; String query=null;

        if (jRadioButton1.isSelected()) { fileName="priorityPaid";

            query= " select z_plot_master.villageName, coalesce(phaseName,0)  as phaseName, z_plot_master.phaseName, priorityTimewise,priorityUsagewise,coalesce(round(sum( acqdArea),2),0) as acqdArea, count(distinct z_plot_master.plotNo) as acqdPlotNos , count(distinct v_plotwise_paidarea.plotNo) as paidPlotNos,coalesce(round(sum(paidAreaS),2),0) as paidArea from\n" + "z_plot_master left join  v_plotwise_paidarea on z_plot_master.projAct= v_plotwise_paidarea.projAct and z_plot_master.villageName= v_plotwise_paidarea.villageName and z_plot_master.plotNo= v_plotwise_paidarea.plotNo where z_plot_master.projAct="+"'"+projAct+"'"+"and SUBSTRING(landType, 1, 1)= \"T\" group by\n" + "z_plot_master.villageName,z_plot_master.phaseName,priorityTimewise,priorityUsagewise order by priorityTimewise desc,priorityUsagewise desc";
        }
        if (jRadioButton2.isSelected()) { fileName="priorityUnpaid";
            query= "select z_plot_master.villageName,   coalesce(phaseName,0) as phaseName,  reasonUnpaid, coalesce(round(sum( acqdArea),2),0) as acqdArea,  priorityTimewise, priorityUsagewise,count(distinct stvi_and_claims.plotNo) as unpaidPlotNos,coalesce(round(sum(claimArea),2),0) as unPaidArea from z_plot_master right join  stvi_and_claims on z_plot_master.projAct= stvi_and_claims.projAct and z_plot_master.villageName= stvi_and_claims.villageName and z_plot_master.plotNo= stvi_and_claims.plotNo \n" +
            "where z_plot_master.projAct="+"'"+projAct+"'"+"  group by z_plot_master.villageName\n" +
            ",z_plot_master.phaseName,reasonUnpaid ,priorityTimewise, priorityUsagewise order by priorityTimewise desc,priorityUsagewise desc";}
        if (jRadioButton3.isSelected()) { fileName="paymentTotal";
            query = "select z_plot_master.villageName,   coalesce(phaseName,0) as phaseName, coalesce(round(sum( acqdArea),2),0) as acqdArea, count(distinct z_plot_master.plotNo) as acqdPlotNos , count(distinct v_plotwise_paidarea.plotNo) as paidPlotNos,coalesce(round(sum(paidAreaS),2),0) as paidArea from z_plot_master left join  v_plotwise_paidarea on z_plot_master.projAct= v_plotwise_paidarea.projAct and z_plot_master.villageName= v_plotwise_paidarea.villageName and z_plot_master.plotNo= v_plotwise_paidarea.plotNo where z_plot_master.projAct= "+"'"+projAct+"'"+" and SUBSTRING(landType, 1, 1)= "+"'"+"T"+"'"+" group by z_plot_master.villageName,z_plot_master.phaseName";
        }

        if (jRadioButton4.isSelected()) { fileName="paymentAllProjects";

            query="select z_plot_master.projAct,count(z_plot_master.plotNo) as TotalplotNos ,landType,round(sum(acqdArea),2)  as acqdArea,round((paidAreaS),2) as paidArea from z_plot_master left join v_plotwise_paidarea on z_plot_master.projAct=v_plotwise_paidarea.projAct and z_plot_master.villageName=v_plotwise_paidarea.villageName and  z_plot_master.plotNo=v_plotwise_paidarea.plotNo  group by projAct,landType order by projAct desc";}
        if (jRadioButton5.isSelected()) { fileName="claimantPap";

            query= "SELECT projAct, count(name) as noOfPaps,  count(aadharNo) as papsWithAadharNo,count(vendorCode) as paidPaps, count(annuitantNo) as AnnuitantNos  FROM landpb.pap_master group by projAct";}
        if (jRadioButton6.isSelected()) { fileName="employmentPap";

            query="select employedWith,  employedAs,  count(employedWith) as NosEmployed from pap_master group by employedWith,employedAs";}
        //  String reportSrcFile = "dist/test3.jrxml";
        // String reportSrcFile = "dist/" +fileName+".jrxml";
        String reportSrcFile = "\\\\10.1.252.145\\Users\\Public\\dist/" +fileName+".jrxml";
        //System.out.println(query);
        try {

            Map<String, Object> map = new HashMap<>();
            // HashMap param = new HashMap();

            map.put("projAct", projAct);
            map.put ("user", user);

            ReportGenerator rp = new ReportGenerator();
            // new ReportGenarator().genarateReport( ReportGenarator.REPORT, map, conn);
            rp.genarateReport(reportSrcFile , query,map, conn);

        } catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

        fileName=null;  query=null;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void plot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plot2ActionPerformed
        // TODO add your handling code here:
        Third s3= new Third();
        s3.setVisible(true);
    }//GEN-LAST:event_plot2ActionPerformed

    private void plot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plot1ActionPerformed
        First s1= new First();
        s1.setVisible(true);
    }//GEN-LAST:event_plot1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        try {
            String value="";
            DefaultTableModel model=(DefaultTableModel) t1.getModel();
            int row=t1.getSelectedRow(); int column=t1.getSelectedColumn();
            if(t1.getValueAt(row, column)!=null) {value= t1.getValueAt(row, column).toString();}

            //   if(str != null && !str.isEmpty()) { /* do your stuffs here */ }
            //if(value.isEmpty()){value= "  ";}
            String columnN=t1.getColumnName(t1.getSelectedColumn());
            String newValue= newValue1( columnN,value);

            // String newValue= JOptionPane.showInputDialog(null,t1.getColumnName(t1.getSelectedColumn()) , value);

            int p = JOptionPane.showConfirmDialog(null, "Do u really want to save\n\n"+ t1.getColumnName(column)+" as  "+newValue+" instead of   "+value+ " for _id= "+t1.getValueAt(row,0) , "save", 0);
            if (p == 0) {

                if (!t1.getColumnName(column).equals("_id")){
                    try {
                        if(newValue.isEmpty() ){sql2= "update pap_master set   modifiedBy=current_user(), modifiedDate=curDate() , validation="+ " 'toBeValidated' "+ ","+t1.getColumnName(column)   +"=null" +newValue+ " where _id = "+t1.getValueAt(row,0)+";";  }
                        if(!newValue.isEmpty() ){ sql2= "update pap_master set modifiedBy=current_user(), modifiedDate=curDate() , validation="+ " 'toBeValidated' "+ ","+t1.getColumnName(column)   +"='" +newValue+ "' where _id = "+t1.getValueAt(row,0)+";"; }
                        //  sql2= "update pap_master set "+t1.getColumnName(column)   +"='" +newValue+ "' where _id = "+t1.getValueAt(row,0)+";";

                        pst2=conn.prepareStatement(sql2);
                        pst2.executeUpdate();
                        model.setValueAt(newValue, row, column);
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }

                }
                else {
                    JOptionPane.showMessageDialog(null, " can not edit _id, Contact Binay");
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Which personal field u want to update - kindly select and residentOf must not be blank");
            JOptionPane.showMessageDialog(null,e);

        }finally {
            sql2=null;
            pst2=null;
        }
    }//GEN-LAST:event_updateActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        String value="",partA="", partB=""; String columnN;
        int totalColumns= t1.getColumnCount();String sql3="Insert into pap_master  ";
        for (int i=2;i<totalColumns;++i){
            DefaultTableModel model=(DefaultTableModel) t1.getModel();
            columnN= t1.getColumnName(i);
            String nvalue= newValue1( columnN, value);

            //  String nvalue=JOptionPane.showInputDialog(null,t1.getColumnName(i) , value);

            if (nvalue != null && !nvalue.isEmpty()) {partA=partA+", "+t1.getColumnName(i); partB= partB+", "+ "'"+nvalue+"'";}
        }
        partA=partA.substring(1);partB=partB.substring(1);
        // sql3=sql3+" ("+partA+" ) "+" values "  +" ("+partB+"); ";
        sql3=sql3+" ("+partA+" ,projAct,modifiedBy,modifiedDate ) "+" values "  +" ("+partB+","+'"'+ projAct +'"'+" , current_user(),curdate()); ";

        //if(value.isEmpty()){value= "  ";}
        // String newValue= JOptionPane.showInputDialog(null,  t1.getColumnName(t1.getSelectedColumn()) , value);
//System.out.println(sql3);
        int p = JOptionPane.showConfirmDialog(null, "Do u really want to save\n\n"+partB , "save", 0);
        if (p == 0) {

            try {
                pst2=conn.prepareStatement(sql3);
                pst2.execute();
                JOptionPane.showMessageDialog(null, " one record saved");

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally {
                sql2=null;
                pst2=null;

            }

        }
    }//GEN-LAST:event_insertActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try {
            rs.close();
            conn.close();
            pst.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed

    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        searchResults();        // TODO add your handling code here:
        update.setVisible(true);
        insert.setVisible(true);
        familytree.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1KeyTyped

    private void cb1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb1KeyReleased

    }//GEN-LAST:event_cb1KeyReleased

    private void cb1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb1KeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() ==  KeyEvent.VK_ENTER  ){

            System.out.println(" binay kumar test");
            searchResults();        // TODO add your handling code here:
            update.setVisible(true);
            insert.setVisible(true);
            familytree.setVisible(true);
        }
    }//GEN-LAST:event_cb1KeyPressed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
        cb1.removeAllItems();// TODO add your handling code here:
        cb1.setModel(new DefaultComboBoxModel(list6.toArray()));
    }//GEN-LAST:event_rb6ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        cb1.removeAllItems(); cb1.setModel(new DefaultComboBoxModel(list5.toArray()));
    }//GEN-LAST:event_rb5ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        cb1.removeAllItems(); cb1.setModel(new DefaultComboBoxModel(list3.toArray()));
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
        cb1.removeAllItems();

        cb1.setModel(new DefaultComboBoxModel(list1.toArray()));
        //fillcombo1();
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        cb1.removeAllItems();// TODO add your handling code here:
        cb1.setModel(new DefaultComboBoxModel(list2.toArray()));
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        cb1.removeAllItems(); // TODO add your handling code here:
        cb1.setModel(new DefaultComboBoxModel(list4.toArray()));
    }//GEN-LAST:event_rb4ActionPerformed

    private void familytreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familytreeActionPerformed
        try {
            familyTree(); // TODO add your handling code here:
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Kindly select the person by clicking mouse - to see family tree");
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_familytreeActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked

        fatherSpouseDetails();// TODO add your handling code here:
    }//GEN-LAST:event_t1MouseClicked

    private void jt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt1KeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        //  String query= jt1.getText().toLowerCase();
        String query= jt1.getText();
        filter(query);
    }//GEN-LAST:event_jt1KeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try{
            String s="";
            DefaultTableModel model=(DefaultTableModel) t2.getModel();
            for(int q=0;q< model.getColumnCount();++q ) {
                s=s+ model.getColumnName(q) + "           :         "+ model.getValueAt(t2.getSelectedRow()  , q)   +"\n";
            }
            JOptionPane.showMessageDialog(null, s);
        }
        catch (Exception e){
            JOptionPane.showConfirmDialog(null, e+  " : Kindly select any row to view details");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            exportTable(t2, new File("E:\\tabledata.xls"));
        } catch (IOException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton10.setVisible(true);
        jButton9.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        btn1.setVisible(true);
        jLabel2.setVisible(true);
        jt1.setVisible(true);
        searchResults2();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_t2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String delete_id= t2.getValueAt(t2.getSelectedRow(),0).toString();

        try {

            DefaultTableModel model=(DefaultTableModel) t2.getModel();

            sql2 = " DELETE FROM "+ searchString2 + " WHERE _id="+delete_id;

            int p = JOptionPane.showConfirmDialog(null, "Do u really want to delete \n\n"+ " for _id= "+delete_id , "save", 0);
            if (p == 0) {

                try {
                    pst2=conn.prepareStatement(sql2);
                    pst2.executeUpdate();
                    JOptionPane.showMessageDialog(null, "One record with _id="+ delete_id +  "  \n Deleted");
                } catch (Exception ex) {
                    Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "One record with _id="+ delete_id +  "  \n Not Deleted");
                }

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Which record u want to Delete - kindly select");
            JOptionPane.showMessageDialog(null,e);

        }finally {

            searchResults2();
            sql2=null;
            pst2=null;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        updatet2();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:

        insert2();
        searchResults2();
    }//GEN-LAST:event_btn1ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        searchResults3();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        try {
            exportTable(jTable1, new File("E:\\tabledata.xls"));
        } catch (IOException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed
  
           
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
 DefaultTableModel fresh=  (DefaultTableModel) jTable2.getModel();
        fresh.addColumn("test"); 

 // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       DefaultTableModel fresh=  (DefaultTableModel) jTable2.getModel();
      // fresh.add jTable2.getSelectedRow()
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void cb8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb8KeyPressed
System.out.println("Check for key codes: " + evt.getKeyCode());
if(evt.getKeyCode()   == KeyEvent.VK_ENTER  )
{
       // TODO add your handling code here:
        jButton10.setVisible(true);
        jButton9.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        btn1.setVisible(true);
        jLabel2.setVisible(true);
        jt1.setVisible(true);
        searchResults2();
}// TODO add your handling code here:
    }//GEN-LAST:event_cb8KeyPressed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("Check for key codes: " + evt.getActionCommand());
//if(evt.getKeyCode()   == KeyEvent.VK_ENTER  )
{
       // TODO add your handling code here:
        jButton10.setVisible(true);
        jButton9.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        btn1.setVisible(true);
        jLabel2.setVisible(true);
        jt1.setVisible(true);
        searchResults2();
    }//GEN-LAST:event_cb8ActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb8;
    private javax.swing.JButton familytree;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jt1;
    private javax.swing.JButton plot1;
    private javax.swing.JButton plot2;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    
    
    private void searchResults() {
       
    try { String k= "";
        searchString= cb1.getSelectedItem().toString();
        searchString="%"+searchString+"%";
        
        String fields= "_id ,projAct,residentOf,salutation,name,aadharNo,"
                + "contactNo,gender,parentId,spouseId,DOB,DOBvDocument,vendorCode,bankName,bankAccoutNo,DOD,"
                + "remarks,employedWith,employedAs,employeeId,YOMarriage";
        if (rb1.isSelected()){ sql1= "select "+fields+" from pap_master where name like '" +searchString+"'"; }
        if (rb2.isSelected()){ sql1= "select "+fields+" from pap_master where residentOf like '"+searchString+"'";  }
        if (rb3.isSelected()){ sql1= "select "+fields+" from pap_master where _id like '"+searchString+"'";  }
        if (rb4.isSelected()){ sql1= "select "+fields+" from pap_master where aadharNo like '"+searchString+"'";  }
        if (rb5.isSelected()){ sql1= "select "+fields+" from pap_master where contactNo like '"+searchString+"'";  }
        if (rb6.isSelected()){ sql1= "select "+fields+" from pap_master where vendorCode like '"+searchString+"'";  }
         sql1=sql1+" order by modifiedDate desc";
       
         //JOptionPane.showMessageDialog(null,sql);
            pst1 = conn.prepareStatement(sql1);
             rs1 = pst1.executeQuery();
             t1.setModel(DbUtils.resultSetToTableModel(this.rs1));
             
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }      
        
    }

    private void fatherSpouseDetails() {
        try
    {
      int row = this.t1.getSelectedRow();
       pid = t1.getModel().getValueAt(row, 0).toString();

        String  s= "";
      
                 String fid= findfid(pid);
               
                 String[] sid =new String[2];// new line
                 sid= findsid(pid);
               
               if (findName(fid).equals("")){s= s+" Father details NA";} else { s=" S/O  "+ findName(fid);}
               if (findName(sid[0]).equals("")){s= s+"\n Spouse details NA";} else { s=s+"\n H/W  "+ findName(sid[0] );}
              if (!findName(sid[1]).equals("")) { s=s+"\n H/W  "+ findName(sid[1] );}
             
           
      
        JOptionPane.showMessageDialog(null,s);

    }
    catch (Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
    } 
    
    }

    

    private void familyTree() {
     
        // to know the female members son/daughter, fillin in motherid in parentId field. 
        // entry to be made similtaneously in spose id of both the members to get clear results.
        // spouse2 entry also has to provisioned for.
       int i=0,j=0;
      String name;String ppp ;
      PrintWriter writer = null;
    try {
            writer = new PrintWriter("grapha.dot");
            String [][] fMember  = new String[maxGenerations][maxMemberInOneGeneration]; // it can take max six geneation with each as thirtyt members
           
        
            int row = this.t1.getSelectedRow();
                writer.println("digraph program1  {");
              
                String residentOf="";
            pid = t1.getModel().getValueAt(row,  0).toString();
        
            
            if (t1.getModel().getValueAt(row,1)!=null){residentOf="\n ("+ t1.getModel().getValueAt(row,1  ).toString()+")";}
      
            writer.println(" node [shape=box]  ;");  
           writer.println("subgraph clusterHeader { style="+'"'+ "invis" +'"'+ " \n HEADER  [label=  "+'"'+"Family Tree of\n"+findName(pid)+residentOf.toLowerCase()+'"'+",fontsize=12,levelloc=t,leveljust=centre];}");
            
              writer.println(" node [color=Blue]  ;");
        
            while(findfid(pid)!=null   ){
              pid= findfid(pid);          
            } // find the eldest generation in the tree.
            
            
             // now code to find the family tree without spouse.
            String fid=pid;        
            fMember[i][j]=fid;
                vendorCode=findVendorCode(fid);
                if(vendorCode!=null && !vendorCode.isEmpty()){
                    ppp =paidArea(vendorCode);
                       paidAcba=" (cba- "+ppp+")";
                        if(ppp.isEmpty()){paidAcba="";}
                   }
                  writer.println(fMember[i][j]+" [label= "+'"'+findName(fMember[i][j])+"\n"+paidAcba+'"'+"];");
                 
                paidAcba="";
                   i=1;
                    // String fid= fMember[i][j];
            for (int ii=0;ii<maxGenerations;ii++){        
            for (int jj=0;jj<maxMemberInOneGeneration;jj++){  
               
               fid=fMember[ii][jj];
               
            
               if (fMember[ii][jj]!=null){
                                 if (j>0){  i++;j=0;        } // j++;    
            try {
                         
                rs.beforeFirst();
                               
                while(rs.next()){
                    
                            
        
                     if(rs.getString("parentId")!=null) {
                         
               
                    if( rs.getString("parentId").equals(fid)){
                    j++; 
                     fMember[i][j]=rs.getString("_id");
                     vendorCode=rs.getString("vendorCode");
                     if(rs.getString("employedWith")!=null) {
                  
                        employedWith = " ("+rs.getString("employedWith") +")";
                     }
                    name= rs.getString("salutation")+" "+rs.getString("name");
                  //  name= rs.getString("salutation")+" "+rs.getString("name");
                    name = name.replace("null", ""); 
                   if(vendorCode!=null && !vendorCode.isEmpty()){
                       ppp =paidArea(vendorCode);
                       paidAcba=" (cba- "+ppp+")";
                        if(ppp.isEmpty()){paidAcba="";}
                   }
                    writer.println(fMember[i][j]+" [label= "+'"'+name+"\n"+paidAcba+employedWith+'"'+"];");
                    paidAcba="";employedWith="";
                    writer.println (fid+"->"+fMember[i][j]+";");
                 
                    
                     }   
              
                     }
                 }
             
            }catch (Exception e){
                         
                          JOptionPane.showMessageDialog(null,"from while");
                          JOptionPane.showMessageDialog(null,e);
                     }
                     
   }
    }
           }
            
            // Now code for  first spouse
       
                int p=1; // subgrpah cluster numbering
            for (int ii=0;ii<maxGenerations;ii++){        
            for (int jj=0;jj<maxMemberInOneGeneration;jj++){  
               
             
               if (fMember[ii][jj]!=null){
                              //   if (j>0){                      i++;j=0;        } // j++;  
                              
                          String[]   spouseId=findsid(fMember[ii][jj]);
                          if (spouseId[0] !=null){
                              String spouseName=findName(spouseId[0]);
                              String spouse2Name=findName(spouseId[1]);
                           writer.println("subgraph cluster_"+Integer.toString(p)+" {");     
                              vendorCode=findVendorCode(spouseId[0]);
                          if(vendorCode!=null && !vendorCode.isEmpty()){
                              ppp =paidArea(vendorCode);
                          paidAcba=" (cba- "+ppp+")";
                           if(ppp.isEmpty()){paidAcba="";}
                         }
                     writer.println(spouseId[0] +" [label= "+'"'+spouseName+"\n"+paidAcba+'"'+"];");
                     paidAcba="";
                   // writer.println (fMember[ii][jj]+"->"+spouseId+";");
                 
                     writer.println (fMember[ii][jj]+"->"+spouseId[0] +" [color=green, arrowhead=none];");
                      
                    
                    
                     // for spouse2 code
                     String spouse2text="";
                     if (spouseId[1]!=null){
                         vendorCode=findVendorCode(spouseId[1]);paidAcba="";
                          if(vendorCode!=null && !vendorCode.isEmpty()){
                              ppp =paidArea(vendorCode);
                       paidAcba=" (cba- "+ppp+")";
                      if(ppp.isEmpty()){paidAcba="";}
                   }
                         writer.println(spouseId[1] +" [label= "+'"'+spouse2Name+"\n"+paidAcba+'"'+"];");
                         paidAcba="";
                   
                     writer.println (fMember[ii][jj]+"->"+spouseId[1] +" [color=green, arrowhead=none];");
                     spouse2text=spouseId[1] +";";
                      
                    }
                     // for spouse2 code over with some part in next line
                     
                     
                      writer.println("{rank = same;"+ fMember[ii][jj]+";"+spouseId[0] +";"+spouse2text+" }");
                      
                         p++; 
                         writer.println("}");
                          
                          }
                    
            }j++;
            }i++;
           }
                             
                writer.println("}");
                writer.close();
      
    }catch (HeadlessException | FileNotFoundException e){
        JOptionPane.showMessageDialog(null, e);
    }   catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                                    
                try {
        Process p = Runtime.getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler grapha.dot");
        p.waitFor();
        } catch (IOException | InterruptedException e) {
            
            JOptionPane.showMessageDialog(null, e);
        } 
            }
   

    private String findName(String pid) throws SQLException {  // find full name for given id
       String s= "";
          try{
                          
        rs.beforeFirst();
                while(rs.next()){
                    
                    if(rs.getString("_id").equals(pid)){
                         s= s+ rs.getString("salutation")+" "+rs.getString("name");
                    // s= s+ rs.getString("salutation")+" "+rs.getString("name")+" "+rs.getString("middleName")+" "+rs.getString("surname");
                    }
                                                
                }
        s=s.replace("null", "");
      
            }catch (SQLException e){
      JOptionPane.showMessageDialog(null, e);
      s = e.toString();
            } finally {
                
                rs.beforeFirst();
                return s;
            }
            
    }

    private String findfid(String pid) throws SQLException {  // find father's id of person
        String fid="";  
        rs.beforeFirst();
        while(rs.next()){
          //  JOptionPane.showMessageDialog(null, rs.getString("_id"));
            if(rs.getString("_id").equals(pid)){
                 fid= rs.getString("parentId");
                 
              
            }     
        }
        rs.beforeFirst();
        return fid;
        
    }
    private String[] findsid(String pid) throws SQLException { // find spouse id(first) of person 
       //String sid="";
       String[] sid=new String[2];
       sid[0]="";
       sid[1]="";
        try {
            rs.beforeFirst();
            
       
            while(rs.next()){
          //  JOptionPane.showMessageDialog(null, rs.getString("_id"));
             if(rs.getString("_id").equals(pid)){
               
                  sid[0]= rs.getString("spouseId");
                   sid[1]= rs.getString("spouse2Id");
                   
              }
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
            sid[0]= ex.toString();
        }
       
        rs.beforeFirst();
        return sid;
    }

    private String paidArea(String vendorCode) {
       String sql3="",s="";
       PreparedStatement pst3;
       ResultSet rs3;
        sql3= "select round(sum(paidAreaSum),2) from v_vendorwise_paidarea_frompayments where vendorCode="+'"'+vendorCode+'"'+"  group by vendorCode order by vendorCode;";
        //System.out.println(sql3);
        try {
            pst3=conn.prepareStatement(sql3);
            rs3= pst3.executeQuery();
            rs3.beforeFirst();
            while(rs3.next()){
                s=rs3.getString(1);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
           
            return s;
        }
               
//To change body of generated methods, choose Tools | Templates.
    }

    private String findVendorCode(String Id) throws SQLException {
        
        String s="";
        try {
            rs.beforeFirst();
            while (rs.next()){
                if (Id.equals(rs.getString("_id"))){
                    s=rs.getString("vendorCode");
                }
            }rs.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            return s;
        }
            
        
    }
    
    /*
    private void fatherSpouseDetails() {
        try
    {
      int row = this.t1.getSelectedRow();
      
       pid = t1.getModel().getValueAt(row, 0).toString();
       
   
        String  s= "";
      
                 String fid= findfid(pid);
               
                 String[] attribute =new String[8];// new line
                 attribute= findAttributes(pid);
                System.out.println(attribute[0]);
               if (findName(attribute[2]).equals("")){s= s+" Father details NA";} else { s=" S/O  "+ findName(attribute[2]);}
               if (findName(attribute[0]).equals("")){s= s+"\n Spouse details NA";} else { s=s+"\n H/W  "+ findName(attribute[0] );}
             if (!findName(attribute[1]).equals("")) { s=s+"\n H/W  "+ findName(attribute[1] );}
             
           
     
        JOptionPane.showMessageDialog(null,attribute[0]+" "+attribute[1]+"  "+attribute[2]+ "ggg");

    }
    catch (Exception e)
    {JOptionPane.showMessageDialog(null,"ggff");
      JOptionPane.showMessageDialog(null, e);
       
    } 
    
    }

    

    private void familyTree() {
     
        // to know the female members son/daughter, fillin in motherid in parentIdfield. 
        // entry to be made similtaneously in spose id of both the members to get clear results.
        // spouse2 entry also has to provisioned for.
       int i=0,j=0;
      String name;
      PrintWriter writer = null;
    try {
            writer = new PrintWriter("grapha.dot");
            String [][] fMember  = new String[7][40]; // it can take max six geneation with each as thirtyt members
           
        
            int row = this.t1.getSelectedRow();
                writer.println("digraph program1  {");
              
                String residentOf="";
            pid = t1.getModel().getValueAt(row,  0).toString();
        
            
            if (t1.getModel().getValueAt(row,1)!=null){residentOf=" ("+ t1.getModel().getValueAt(row,1).toString()+")";}
      
            writer.println(" node [shape=box]  ;");  
           writer.println("subgraph clusterHeader { style="+'"'+ "invis" +'"'+ " \n HEADER  [label=  "+'"'+"Family Tree of "+findName(pid)+residentOf+'"'+",fontsize=20,levelloc=t,leveljust=centre];}");
            
              writer.println(" node [color=Blue]  ;");
        
            while( findfid(pid)!=null   ){
              pid= findfid(pid);          
            } // find the eldest generation in the tree.
            
            
             // now code to find the family tree without spouse.
            String fid=pid;        
            fMember[i][j]=fid;
                vendorCode=findVendorCode(fid);
                if(vendorCode!=null){
                       paidAcba=" (CBA-"+paidArea(vendorCode)+")";
                   }
                  writer.println(fMember[i][j]+" [label= "+'"'+findName(fMember[i][j])+"\n"+paidAcba+'"'+"];");
                 
                paidAcba="";
                   i=1;
                    // String fid= fMember[i][j];
            for (int ii=0;ii<7;ii++){        
            for (int jj=0;jj<40;jj++){  
               
               fid=fMember[ii][jj];
               
            
               if (fMember[ii][jj]!=null){
                                 if (j>0){  i++;j=0;        } // j++;    
            try {
                         
                rs.beforeFirst();
                               
                while(rs.next()){
                    
                            
        
                     if(rs.getString("parentId")!=null) {
                         
               
                    if( rs.getString("parentId").equals(fid)){
                    j++; 
                    String[] Attributes= new String[6];
                    Attributes= findAttributes(rs.getString("_id"));
                  //   fMember[i][j]=rs.getString("_id");
                     vendorCode=Attributes[4];
                     
                     if(Attributes[3]!=null) {
                  
                        employedWith = " ("+Attributes[3] +")";
                     }
                   // name= rs.getString("salutation")+" "+rs.getString("name")+""+rs.getString("middleName")+" "+rs.getString("surname");
                    name=Attributes[7];
                    name = name.replace("null", ""); 
                   if(vendorCode!=null){
                       paidAcba=" (CBA-"+paidArea(vendorCode)+")";
                   }
                    writer.println(fMember[i][j]+" [label= "+'"'+name+"\n"+paidAcba+employedWith+'"'+"];");
                    paidAcba="";
                    writer.println (fid+"->"+fMember[i][j]+";");
                 
                    
                     }   
              
                     }
                 }
             
            }catch (Exception e){
                         
                          JOptionPane.showMessageDialog(null,"from while");
                          JOptionPane.showMessageDialog(null,e);
                     }
                     
   }
    }
           }
            
            // Now code for  first spouse
       
                int p=1; // subgrpah cluster numbering
            for (int ii=0;ii<7;ii++){        
            for (int jj=0;jj<40;jj++){  
               
             
               if (fMember[ii][jj]!=null){
                              //   if (j>0){                      i++;j=0;        } // j++;  
                              
                          String[]   Attributes= new String[8];
                                 Attributes= findAttributes(fMember[ii][jj]);
                          if (Attributes[0] !=null){
                              String spouseName=findName(Attributes[0]);
                              String spouse2Name=findName(Attributes[1]);
                           writer.println("subgraph cluster_"+Integer.toString(p)+" {");     
                              vendorCode=findVendorCode(Attributes[0]);
                          if(vendorCode!=null){
                          paidAcba=" (CBA-"+paidArea(vendorCode)+")";
                         }
                     writer.println(Attributes[0] +" [label= "+'"'+spouseName+"\n"+paidAcba+'"'+"];");
                     paidAcba="";
                   // writer.println (fMember[ii][jj]+"->"+spouseId+";");
                 
                     writer.println (fMember[ii][jj]+"->"+Attributes[0] +" [color=green, arrowhead=none];");
                      
                    
                    
                     // for spouse2 code
                     String spouse2text="";
                     if (Attributes[1]!=null){
                         vendorCode=findVendorCode(Attributes[1]);paidAcba="";
                          if(vendorCode!=null){
                       paidAcba=" (CBA-"+paidArea(vendorCode)+")";
                   }
                         writer.println(Attributes[1] +" [label= "+'"'+spouse2Name+"\n"+paidAcba+'"'+"];");
                         paidAcba="";
                   
                     writer.println (fMember[ii][jj]+"->"+Attributes[1] +" [color=green, arrowhead=none];");
                     spouse2text=Attributes[1] +";";
                      
                    }
                     // for spouse2 code over with some part in next line
                     
                     
                      writer.println("{rank = same;"+ fMember[ii][jj]+";"+Attributes[0] +";"+spouse2text+" }");
                      
                         p++; 
                         writer.println("}");
                          
                          }
                    
            }j++;
            }i++;
           }
                             
                writer.println("}");
                writer.close();
      
    }catch (HeadlessException | FileNotFoundException e){
        JOptionPane.showMessageDialog(null, e);
    }   catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                                    
                try {
        Process p = Runtime.getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler grapha.dot");
        p.waitFor();
        } catch (IOException | InterruptedException e) {
            
            JOptionPane.showMessageDialog(null, e);
        } 
            }
   

    private String findName(String pid) throws SQLException {  // find full name for given id
       String s= "";
          try{
                          
        rs.beforeFirst();
                while(rs.next()){
                    
                    if(rs.getString("_id").equals(pid)){
                        
                     s= s+ rs.getString("salutation")+" "+rs.getString("name")+" "+rs.getString("middleName").replace("null","")+" "+rs.getString("surname").replace("null","");
                    }
                                                
                }
        s=s.replace("null", "");
      
            }catch (SQLException e){
      JOptionPane.showMessageDialog(null, e);
      s = e.toString();
            } finally {
                
                rs.beforeFirst();
                return s;
            }
            
    }

    private String findfid(String pid) throws SQLException {  // find father's id of person
        String fid="";  
        rs.beforeFirst();
        while(rs.next()){
          //  JOptionPane.showMessageDialog(null, rs.getString("_id"));
            if(rs.getString("_id").equals(pid)){
                 fid= rs.getString("parentId");
                 
              
            }     
        }
        rs.beforeFirst();
        return fid;
        
    }
    private String[] findAttributes(String pid) throws SQLException { // find spouse id(first) of person 
       //String sid="";
       String[] Attributes=new String[8];
      // Attributes[0]="";       Attributes[1]="";       Attributes[2]="";
      // Attributes[3]=""; Attributes[4]=""; Attributes[5]="";Attributes[6]="";Attributes[7]="";
        try {
            rs.beforeFirst();
            
       
            while(rs.next()){
          //  JOptionPane.showMessageDialog(null, rs.getString("_id"));
             if(rs.getString("_id").equals(pid)){
               System.out.println("rs result"+rs.getString(vendorCode));
                  Attributes[0]= rs.getString("spouseId");
                   Attributes[1]= rs.getString("spouse2Id");
                    Attributes[2]= rs.getString("parentId");
                     Attributes[3]= rs.getString("employedWith");
                      Attributes[4]= rs.getString("vendorCode");
                       Attributes[5]= rs.getString("gender");
                        Attributes[6]= rs.getString("salutation");
                      Attributes[7]= rs.getString("salutation")+" "+rs.getString("name");
                    //  Attributes[8]= (rs.getDate(sysDate)- rs.getDate("DOB")).toString() ;  // age in years
                    //   Attributes[9]= rs.getDate("DOD"); // year of death
                    // Attributes[10]= rs.getString("status");
                    
                    System.out.println("rs result"+rs.getString(vendorCode));
              }
        
             if(Attributes[0].isEmpty()) {System.out.println(" Test test test");}
             if(  Attributes[0] !=null){ System.out.println("worst worst");}
            }
        } catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
        rs.beforeFirst();
        return Attributes;
    }

    private String paidArea(String vendorCode) {
       String sql3="",s="";
       PreparedStatement pst3;
       ResultSet rs3;
        sql3= "select sum(paidArea) from CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `binay`@`localhost` 
    SQL SECURITY DEFINER
VIEW `v_vendorwise_paidarea` AS
    SELECT 
        `plot_vendor_wise_paidarea`.`vendorCode` AS `vendorCode`,
        SUM(`plot_vendor_wise_paidarea`.`paidArea`) AS `paidAreaS`
    FROM
        `plot_vendor_wise_paidarea`
    GROUP BY `plot_vendor_wise_paidarea`.`vendorCode` where vendorCode="+'"'+vendorCode+'"'+";";  // to change to view
        try {
            pst3=conn.prepareStatement(sql3);
            rs3= pst3.executeQuery();
            rs3.beforeFirst();
            while(rs3.next()){
                s=rs3.getString(1);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
           
            return s;
        }
               
//To change body of generated methods, choose Tools | Templates.
    }

    private String findVendorCode(String Id) throws SQLException {
        
        String s="";
        try {
            rs.beforeFirst();
            while (rs.next()){
                if (Id.equals(rs.getString("_id"))){
                    s=rs.getString("vendorCode");
                }
            }rs.beforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            return s;
        }
            
        
    }*/

    private void fillcombo1() {
    try {
            
           
        sql3= "show tables;";
        pst3=conn.prepareStatement(sql3);
        rs3= pst3.executeQuery();
        while(rs3.next()){
            
            String tables = rs3.getString(1);  list8.add(tables);
              
          
        }
        
        
        }catch (Exception e){
            JOptionPane.showMessageDialog( null,e);
        }   
    
    sql3=null;
    pst3=null; 
    try {
        rs3.close();
    } catch (SQLException ex) {
        Logger.getLogger(Second.class.getName()).log(Level.SEVERE, null, ex);
    }
;
    
    }

    private void searchResults2() {
         try { 
         searchString2= cb8.getSelectedItem().toString();
         sql3 = "select * from "+searchString2+" order by modifiedDate desc;";
       if (!Login.user.equals("guest")){
       sql3 = "select * from "+searchString2+" where projAct = "+"'"+Login.projAct+"'"+" order by modifiedDate desc;";}
       
        
       
               
      //  System.out.println(sql3 +Login.user);
         //   System.out.println(sql3);
            pst3 = conn.prepareStatement(sql3);
             rs3 = pst3.executeQuery();
             t2.setModel(DbUtils.resultSetToTableModel(this.rs3));
             
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }      
         }

    public void exportTable(JTable table, File file) throws IOException {
           TableModel model = table.getModel();
            FileWriter out = new FileWriter(file);
            for(int i=0; i < model.getColumnCount(); i++) {
        out.write(model.getColumnName(i) + "\t");
            }
            out.write("\n");

            
        
            for(int i=0; i< model.getRowCount(); i++) {
        for(int j=0; j < model.getColumnCount(); j++) {
            
             //   if (model.getValueAt(i,j) != null)
   // out.write(model.getValueAt(i,j).toString()+"\t");
            out.write(model.getValueAt(i,j)+"\t");
            // out.write(model.getValueAt(i,j).toString()+"\t");
            }
            out.write("\n");
        }

        out.close();
        JOptionPane.showMessageDialog(null,"Excel file written successfully  "+ file);
        
          try {
        Process p = Runtime.getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler E:\\tabledata.xls");
        p.waitFor();
        } catch (IOException | InterruptedException e) {
            
            JOptionPane.showMessageDialog(null, e);
        } 
    }

    private void updatet2() {
        
          try {
              String value="";
              DefaultTableModel model=(DefaultTableModel) t2.getModel();
       int row=t2.getSelectedRow(); int column=t2.getSelectedColumn();
       // System.out.println(row + "  "+column);
       if(t2.getValueAt(row, column)!=null) {value= t2.getValueAt(row, column).toString();}
       
       //   if(str != null && !str.isEmpty()) { /* do your stuffs here */ }
       //if(value.isEmpty()){value= "  ";}
        String columnN = t2.getColumnName(t2.getSelectedColumn());
        String newValue = newValue1(columnN, value);
       // String newValue= JOptionPane.showInputDialog(null,t2.getColumnName(t2.getSelectedColumn()) , value);
       // System.out.println(newValue);
         int p = JOptionPane.showConfirmDialog(null, "Do u really want to save\n\n"+ t2.getColumnName(column)+" as  "+newValue+" instead of   "+value+ " for _id= "+t2.getValueAt(row,0) , "save", 0);
    if (p == 0) { 
        
        if (!t2.getColumnName(column).equals("_id")){
            try {
                if(newValue.isEmpty() ){sql2= "update "+searchString2 +" set modifiedBy=current_user(), modifiedDate=curDate(), validation="+ " 'toBeValidated' "+ ","  +t2.getColumnName(column)   +"=null" +newValue+ " where _id = "+t2.getValueAt(row,0)+";";  }
                if(!newValue.isEmpty() ){ sql2= "update "+searchString2 +" set modifiedBy=current_user(), modifiedDate=curDate(), validation="+ " 'toBeValidated' "+ ","+t2.getColumnName(column)   +"='" +newValue+ "' where _id = "+t2.getValueAt(row,0)+";"; }
              //  sql2= "update pap_master set "+t1.getColumnName(column)   +"='" +newValue+ "' where _id = "+t1.getValueAt(row,0)+";";
           
                pst2=conn.prepareStatement(sql2); 
                pst2.executeUpdate();
                JOptionPane.showMessageDialog(null, " data updated");
                model.setValueAt(newValue, row, column);
        }catch (Exception e){
         JOptionPane.showMessageDialog(null,e);
    }
       
    }
       else {
            JOptionPane.showMessageDialog(null, " can not edit _id, Contact Binay");
        }
    }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Which personal field u want to updateT2 - kindly select");
            JOptionPane.showMessageDialog(null,e);
           
        }finally {
              sql2=null;
              pst2=null;
          }
       
        
       }

    private void insert2() {
        
      String value="",partA="", partB=""; String columnN;
       int totalColumns= t2.getColumnCount();String sql3="Insert into   "+searchString2 +" ";
       for (int i=2;i<totalColumns-3;++i){
             DefaultTableModel model=(DefaultTableModel) t2.getModel();
             
            columnN= t2.getColumnName(i);
             String nvalue= newValue1( columnN, value); 
         
     //       String nvalue=JOptionPane.showInputDialog(null,t2.getColumnName(i) , value);
             
             
             if (nvalue != null && !nvalue.isEmpty()) {partA=partA+", "+t2.getColumnName(i); partB= partB+", "+ "'"+nvalue+"'";}
       }
       partA=partA.substring(1);partB=partB.substring(1);
     // sql3=sql3+" ("+partA+" ) "+" values "  +" ("+partB+"); ";
        sql3=sql3+" ("+partA+" ,projAct,modifiedBy,modifiedDate ) "+" values "  +" ("+partB+","+'"'+ projAct +'"'+" , current_user(),curdate()); ";
       //System.out.println(sql3);
      // old from t1   sql3=sql3+" ("+partA+" ,projAct,modifiedBy,modifiedDate ) "+" values "  +" ("+partB+","+'"'+ projAct +'"'+" , current_user(),curdate()); ";
    
       //if(value.isEmpty()){value= "  ";}
       // String newValue= JOptionPane.showInputDialog(null,  t1.getColumnName(t1.getSelectedColumn()) , value);
        
         int p = JOptionPane.showConfirmDialog(null, "Do u really want to save\n\n"+partB , "save", 0);
    if (p == 0) { 
      
       
            try {
                 pst2=conn.prepareStatement(sql3); 
                pst2.execute();
               JOptionPane.showMessageDialog(null, " one record saved");
                
        }catch (Exception e){
         JOptionPane.showMessageDialog(null,e);
    }finally {
              sql2=null;
              pst2=null;
             
          }
       
  
    }    
    
    }

    private String newValue1( String columnN,String value) {
            String newValue="";
         
     switch ( columnN ){
       
    //  if ( t1.getColumnName(t1.getSelectedColumn()).equalsIgnoreCase("gender") ) {  
    case "gender":
          String[] gender = {"M",  "F"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select gender", "Gender",
        JOptionPane.QUESTION_MESSAGE,null, gender,  gender[0]);
          return newValue;
    case "salutation":
          String[] salutation = {"Sri",  "Smt","Md","Mos", "Mr",  "Mrs", "Lt", "Ms"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select salutation", "Salutation",
        JOptionPane.QUESTION_MESSAGE,null, salutation,  salutation[0]);
          return newValue;
    
    case "employedWith":
          String[] employedWith = {"","Ambey",  "Thriveni", "UPL", "Co-Socity", "Others" };
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select Indirect employment status", "Employed with",
        JOptionPane.QUESTION_MESSAGE,null, employedWith,  employedWith[0]);
          return newValue;
    case "projAct":     
          String[] projAct = { "PBCBA",  "CBCBA","PBLA",  "KDCBA","CBLA", "KDLA","PBDP"};
        newValue = (String) JOptionPane.showInputDialog(null,"Kindly select (PB/CB/KD) and act(LA/CBA/DP) ?", "Project and Act",
        JOptionPane.QUESTION_MESSAGE,null, projAct,  projAct[0]);
          return newValue;
    
    case "landType":
          String[] landType = {"Tenancy", "TBakast", "GM","GMKhas",  "GMAam","GMJJ",  "GMForest"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select type of land", "Type of land",
        JOptionPane.QUESTION_MESSAGE,null, landType,  landType[0]);
          return newValue;
    case "landDocType":
          String[] landDocType = {"Khatiyan", "SaleDeed", "TitleSuit","Hukumnama",  "Others1","Others2", };
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select type of land document", "Type of land document",
        JOptionPane.QUESTION_MESSAGE,null, landDocType,  landDocType[0]);
          return newValue;   
     
    case "papStatus":
          String[] papStatus = {"Recovery", "Defaulter", "followUpRecovery","ER on hold",  "furtherPayOnHold","Others1",  "Others2"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select PAP status", "PAP Status",
        JOptionPane.QUESTION_MESSAGE,null, papStatus,  papStatus[0]);
          return newValue;  
    case "reasonUnpaid":
         String[] reasonUnpaid = {"Title dispute", "Recovery", "notWilling","shareRatioIssue","docMoreThanland","JobDemand","GMlandPmtDemand", "homestead", "Others"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select reasonUnpaid", "reasonUnpaid",
        JOptionPane.QUESTION_MESSAGE,null, reasonUnpaid,  reasonUnpaid[0]);
          return newValue;   
    case "pitType":
          String[] pitType = {"WestPit", "EastPit", "NorthWest", "Underground","NotKnown","other1",  };
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select type of land document", "Type of land document",
        JOptionPane.QUESTION_MESSAGE,null, pitType,  pitType[0]);
          return newValue;   
    case "full_part":
          String[] full_part = {"Full", "Part", "PartWithLA","PartWithKD",  "PartWithCB","PartWithCBA",  "Others2"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select whether full or part land is acquired", "full_part",
        JOptionPane.QUESTION_MESSAGE,null, full_part,  full_part[0]);
          return newValue;  
   
    case "residentOf":
        
   case "villageName":
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select place/village of residence", "Resident of village",
        JOptionPane.QUESTION_MESSAGE,null,  First.villageList ,    First.villageList[0]);
          return newValue;      
     case "priorityTimewise":
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select priority", "priorityTimewise",
        JOptionPane.QUESTION_MESSAGE,null,  First.priorityTimewise ,    First.priorityTimewise[0]);
          return newValue;    
    case "claimType":
         String[] claimType = {"stVI", "stVIwithPossession", "award_LA", "StVIw/oPossession","stVIbutNotRightful","possessionOnly", "documentOnly","inProcessStVI",  "poss & doc Both", "Others"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select type of claim", "claimType",
        JOptionPane.QUESTION_MESSAGE,null,  claimType ,    claimType[0]);
          return newValue;       
          
          case "phaseName":
             // String[] phaseName = {"I", "II", "III","IV",  "V","VI",  "Others"};
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select phase Name", "Phase Name",
        JOptionPane.QUESTION_MESSAGE,null,  First.phaseName ,   First.phaseName[0]);
          return newValue;   
    case "priorityUsagewise":
      newValue = (String) JOptionPane.showInputDialog(null,"Kindly select priority ", "priorityUsagewise",
        JOptionPane.QUESTION_MESSAGE,null,  First.priorityUsagewise ,    First.priorityUsagewise[0]);
          return newValue;     
    case  "aadharNo" : 
           
         newValue= JOptionPane.showInputDialog(null,columnN , value);
           if (validateAadharNumber( newValue)) { return newValue; 
    }else {
               JOptionPane.showMessageDialog(null, "Incorrect Aadhar no entered");
               return "";
           }
    default: 
         newValue= JOptionPane.showInputDialog(null,columnN , value);
           return newValue;      
          
            } 
 }
    
    public static boolean validateAadharNumber(String aadharNumber){
        Pattern aadharPattern = Pattern.compile("\\d{12}");
        boolean isValidAadhar = aadharPattern.matcher(aadharNumber).matches();
        if(isValidAadhar){
            isValidAadhar = VerhoeffAlgorithm.validateVerhoeff(aadharNumber);
        }
        return isValidAadhar;
    }

    private void filter(String query) {
       
            DefaultTableModel dm=(DefaultTableModel) t2.getModel();
       TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel> (dm);
       t2.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter("(?i)"+query) );

    
    }

    private void searchResults3() {
        String query=null; 
         if (jRadioButton7.isSelected()) { //fileName="priorityPaid";

            query= " SELECT v_vendorwise_paidarea_frompayments.projAct, v_vendorwise_paidarea_frompayments.vendorCode, v_vendorwise_paidarea_fromplotwise.vendorCode, v_vendorwise_paidarea_frompayments.paidAreaSum as areafromPaymentdetails, v_vendorwise_paidarea_fromplotwise.paidAreaSum as  areafromplot_vendor_wise_paidarea \n" +
"from v_vendorwise_paidarea_frompayments   left join v_vendorwise_paidarea_fromplotwise\n" +
" on v_vendorwise_paidarea_frompayments.projAct= v_vendorwise_paidarea_fromplotwise.projAct and v_vendorwise_paidarea_frompayments.projAct="+"'"+projAct+"'"+" and  v_vendorwise_paidarea_fromplotwise.projAct="+"'"+projAct+"'"+" and v_vendorwise_paidarea_frompayments.vendorCode= v_vendorwise_paidarea_fromplotwise.vendorCode \n" +
" where v_vendorwise_paidarea_frompayments.paidAreaSum-v_vendorwise_paidarea_fromplotwise.paidAreaSum!=0  or v_vendorwise_paidarea_fromplotwise.vendorCode is null or v_vendorwise_paidarea_frompayments.vendorCode is null union SELECT v_vendorwise_paidarea_frompayments.projAct, v_vendorwise_paidarea_frompayments.vendorCode, v_vendorwise_paidarea_fromplotwise.vendorCode, v_vendorwise_paidarea_frompayments.paidAreaSum as areafromPaymentdetails, v_vendorwise_paidarea_fromplotwise.paidAreaSum as  areafromplot_vendor_wise_paidarea \n" +
"from v_vendorwise_paidarea_frompayments   right join v_vendorwise_paidarea_fromplotwise\n" +
" on v_vendorwise_paidarea_frompayments.projAct= v_vendorwise_paidarea_fromplotwise.projAct and v_vendorwise_paidarea_frompayments.projAct="+"'"+projAct+"'"+" and  v_vendorwise_paidarea_fromplotwise.projAct="+"'"+projAct+"'"+" and v_vendorwise_paidarea_frompayments.vendorCode= v_vendorwise_paidarea_fromplotwise.vendorCode \n" +
" where v_vendorwise_paidarea_frompayments.paidAreaSum-v_vendorwise_paidarea_fromplotwise.paidAreaSum!=0  or v_vendorwise_paidarea_fromplotwise.vendorCode is null or v_vendorwise_paidarea_frompayments.vendorCode is null;";
                    
           //       query= " select z_plot_master.villageName, coalesce(phaseName,0)  as phaseName, z_plot_master.phaseName, priorityTimewise,priorityUsagewise,coalesce(round(sum( acqdArea),2),0) as acqdArea, count(distinct z_plot_master.plotNo) as acqdPlotNos , count(distinct v_plotwise_paidarea.plotNo) as paidPlotNos,coalesce(round(sum(paidAreaS),2),0) as paidArea from\n" + "z_plot_master left join  v_plotwise_paidarea on z_plot_master.projAct= v_plotwise_paidarea.projAct and z_plot_master.villageName= "
           //        + "v_plotwise_paidarea.villageName and z_plot_master.plotNo= v_plotwise_paidarea.plotNo where z_plot_master.projAct="+"'"+projAct+"'"+"and SUBSTRING(landType, 1, 1)= \"T\" group by\n" + "z_plot_master.villageName,z_plot_master.phaseName,priorityTimewise,priorityUsagewise order by priorityTimewise desc,priorityUsagewise desc";
        
         }
         
        
         if (jRadioButton10.isSelected()) {  
             query= "call CRnoError("+"'"+projAct+"'"+")";
         }
         
        System.out.println(query);
         try { 
        
        
       
               
      //  System.out.println(sql3 +Login.user);
         //   System.out.println(sql3);
            pst3 = conn.prepareStatement(query);
             rs3 = pst3.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(this.rs3));
             
             sql3=null;
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }         }

   

    
    }


