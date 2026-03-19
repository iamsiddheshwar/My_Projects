/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tanay
 */
public class DisplayResult extends javax.swing.JFrame {

    /**
     * Creates new form DisplayResult
     */
    String sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8,year;
String UserID,loginAs;
    public DisplayResult(int show[], String _year,String _UserID,String _loginAs) {
        this.year=_year;
      this.UserID = _UserID;
      this.loginAs=_loginAs;
        initComponents();
        if(show[1]==1)
        {sem1="a.Maths1,a.physics,a.graphics,a.electronics,a.bce";}
        else{sem1=" ";}
        if(show[2]==1)
        {sem2="a.maths2,a.chemistry,a.bme,a.electrical,a.mechanics";}
        else{sem2=" ";}
     
        if(show[3]==1)
        {sem3="a.ds,a.coa,a.deld,a.fds,a.psoop";}
        else{sem3=" ";}
        if(show[4]==1)
        {sem4="a.maths3,a.cg,a.pai,a.dsf,a.fccn";}
        else{sem4=" ";}
        if(show[5]==1)
        {sem5="a.toc,a.sepm,a.hci,a.dbms,a.os";}
        else{sem5=" ";}
        if(show[6]==1)
        {sem6="a.cnt,a.sp,a.daa,a.cc,a.dsbda";}
        else{sem6=" ";}
        if(show[7]==1)
        {sem7="a.infosecurity,a.ml,a.softdesign,a.elective1,a.elective2";}
        else{sem7=" ";}
        if(show[8]==1)
        {sem8="a.dcs,a.uc,a.elective3,a.elective4";}
        else{sem8=" ";}
    hideall();
        getresult();
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Result");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backward Arrow.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 60, 70);

        jLabel3.setFont(new java.awt.Font("HP Simplified Light", 0, 48)); // NOI18N
        jLabel3.setText("Result");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 10, 230, 90);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "", "null", "null", "Title 8", "null", "Title 10", "Title 11"
            }
        ));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 150, 850, 370);

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jTable2.setRowHeight(22);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(1000, 630, 850, 370);

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jTable3.setRowHeight(22);
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(60, 630, 850, 370);

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jTable4.setRowHeight(22);
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(1000, 150, 840, 370);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Third Year");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 570, 150, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Second Year");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1380, 90, 150, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Fourth Year");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1400, 570, 150, 60);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("First Year");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 90, 150, 60);

        jLabel1.setBackground(new java.awt.Color(221, 221, 234));
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
          StudentsDetail1 s = new StudentsDetail1(UserID,loginAs);
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MousePressed
public void getresult()
{
        
      
    try{
    
       Class.forName("com.mysql.cj.jdbc.Driver");  
       Connection con=DriverManager.getConnection(  
       "jdbc:mysql://localhost:3306/college","root","TANay@99");
    
      
       if(sem1.equals(" ")&&sem2.equals("a.maths2,a.chemistry,a.bme,a.electrical,a.mechanics"))
       {
           jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
            jLabel7.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem2+" from feresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
          
            String[]   tblHead={"PRN","Rollno","Maths2","Chemistry","Mechanical ","Electrical","Mechanics"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M2 = rs.getString(3);
                    String Chem = rs.getString(4);
                    String Bme = rs.getString(5);
                    String Elec = rs.getString(6);
                    String mech = rs.getString(7);
                    String[] item={PRN,Roll,M2,Chem,Bme,Elec,mech};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M2+" "+Chem+" "+Bme+" "+Elec+" "+mech);
                }
                jTable1.setModel(dtm1);
       }
       if (sem2.equals(" ")&&sem1.equals("a.Maths1,a.physics,a.graphics,a.electronics,a.bce"))  
       {
            jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
            jLabel7.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem1+" from feresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"PRN","Rollno","Maths 1","Physics","EnngGraphics","Electronics","Civil"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
           
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String bce = rs.getString(7);
                    String[] item={PRN,Roll,M1,Phy,EG,Electr,bce};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+bce);
                }
                jTable1.setModel(dtm1);
       }
       if (sem1.equals("a.Maths1,a.physics,a.graphics,a.electronics,a.bce")&&sem2.equals("a.maths2,a.chemistry,a.bme,a.electrical,a.mechanics"))
       {
            jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
            jLabel7.setVisible(true);
            
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem1+","+sem2+" from feresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 

           String[]   tblHead={"PRN","Rollno","Maths 1","Physics","EDrawing","Electronics","Civil","Maths2","Chemistry","Mechanical ","Electrical","Mechanics"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
           
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String bce = rs.getString(7);
                    String M2 = rs.getString(8);
                    String Chem = rs.getString(9);
                    String Bme = rs.getString(10);
                    String Elec = rs.getString(11);
                    String mech = rs.getString(12);String[] item={PRN,Roll,M1,Phy,EG,Electr,bce,M2,Chem,Bme,Elec,mech};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+bce+" "+M2+" "+Chem+" "+Bme+" "+Elec+" "+mech);
                }
                jTable1.setModel(dtm1);
       }
       
       //   FE result ends;
    
       // For SE result;
       
       if(sem3.equals(" ")&&sem4.equals("a.maths3,a.cg,a.pai,a.dsf,a.fccn"))
       {
            jScrollPane4.setVisible(true);
            jTable4.setVisible(true);
            jLabel5.setVisible(true);
            
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem4+" from seresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
         
            
            String[]   tblHead={"PRN","Rollno","DS","COA","DELD","FDS","PSOOP"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M2 = rs.getString(3);
                    String Chem = rs.getString(4);
                    String Bme = rs.getString(5);
                    String Elec = rs.getString(6);
                    String mech = rs.getString(7);
                    String[] item={PRN,Roll,M2,Chem,Bme,Elec,mech};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M2+" "+Chem+" "+Bme+" "+Elec+" "+mech);
                }
                jTable4.setModel(dtm1);
       }
       if(sem4.equals(" ")&&sem3.equals("a.ds,a.coa,a.deld,a.fds,a.psoop"))  
       {
           jScrollPane4.setVisible(true);
            jTable4.setVisible(true);
            jLabel5.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem3+" from seresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"PRN","Rollno","Maths3","Graphics","PAI","DSF","FCCN"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
           
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String bce = rs.getString(7);
                    String[] item={PRN,Roll,M1,Phy,EG,Electr,bce};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+bce);
                }
                jTable4.setModel(dtm1);
       }
       if (sem3.equals("a.ds,a.coa,a.deld,a.fds,a.psoop")&&sem4.equals("a.maths3,a.cg,a.pai,a.dsf,a.fccn"))
       {
           jScrollPane4.setVisible(true);
            jTable4.setVisible(true);
            jLabel5.setVisible(true);
       PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem3+","+sem4+" from seresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
           
            String[]   tblHead={"PRN","Rollno","DS","COA","DELD","FDS","PSOOP","Maths3","Graphics","PAI","DSF","FCCN"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String bce = rs.getString(7);
                    String M2 = rs.getString(8);
                    String Chem = rs.getString(9);
                    String Bme = rs.getString(10);
                    String Elec = rs.getString(11);
                    String mech = rs.getString(12);String[] item={PRN,Roll,M1,Phy,EG,Electr,bce,M2,Chem,Bme,Elec,mech};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+bce+" "+M2+" "+Chem+" "+Bme+" "+Elec+" "+mech);
                }
                jTable4.setModel(dtm1);
       }
       // SE result ends;
    
       // For TE result;
       if(sem5.equals(" ")&&sem6.equals("a.cnt,a.sp,a.daa,a.cc,a.dsbda"))
       {
           jScrollPane3.setVisible(true);
            jTable3.setVisible(true);
            jLabel4.setVisible(true);
        PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem6+" from teresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
      
            
            String[]   tblHead={"PRN","Rollno","CNT","SP","DAA","CC","DS&DBA"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M2 = rs.getString(3);
                    String Chem = rs.getString(4);
                    String Bme = rs.getString(5);
                    String Elec = rs.getString(6);
                    String mech = rs.getString(7);
                    String[] item={PRN,Roll,M2,Chem,Bme,Elec,mech};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M2+" "+Chem+" "+Bme+" "+Elec+" "+mech);
                }
                jTable3.setModel(dtm1);
       }
       if(sem6.equals(" ")&&sem5.equals("a.toc,a.sepm,a.hci,a.dbms,a.os"))  
       {
           jScrollPane3.setVisible(true);
            jTable3.setVisible(true);
            jLabel4.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem5+" from teresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"PRN","Rollno","TOC","SEPM","HCI","DBMS","OS"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
      
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String bce = rs.getString(7);
                    String[] item={PRN,Roll,M1,Phy,EG,Electr,bce};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+bce);
                }
                jTable3.setModel(dtm1);
       }
       else if (sem5.equals("a.toc,a.sepm,a.hci,a.dbms,a.os")&&sem6.equals("a.cnt,a.sp,a.daa,a.cc,a.dsbda"))
       {
           jScrollPane3.setVisible(true);
            jTable3.setVisible(true);
            jLabel4.setVisible(true);
       PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem5+","+sem6+" from teresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
            
            String[]   tblHead={"PRN","Rollno","TOC","SEPM","HCI","DBMS","OS","CNT","SP","DAA","CC","DS&DBA"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String bce = rs.getString(7);
                    String M2 = rs.getString(8);
                    String Chem = rs.getString(9);
                    String Bme = rs.getString(10);
                    String Elec = rs.getString(11);
                    String mech = rs.getString(12);String[] item={PRN,Roll,M1,Phy,EG,Electr,bce,M2,Chem,Bme,Elec,mech};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+bce+" "+M2+" "+Chem+" "+Bme+" "+Elec+" "+mech);
                }
                jTable3.setModel(dtm1);
       }
       // TE result ends;
    
       // For BE result;
       if(sem7.equals(" ")&&sem8.equals("a.dcs,a.uc,a.elective3,a.elective4"))
       {
           jScrollPane2.setVisible(true);
            jTable2.setVisible(true);
            jLabel6.setVisible(true);
        PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem8+" from beresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
         
            
            String[]   tblHead={"PRN","Rollno","DCS","UC","Elective3","Elective4"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
         
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M2 = rs.getString(3);
                    String Chem = rs.getString(4);
                    String Bme = rs.getString(5);
                    String Elec = rs.getString(6);
                    
                    String[] item={PRN,Roll,M2,Chem,Bme,Elec};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M2+" "+Chem+" "+Bme+" "+Elec);
                }
                jTable2.setModel(dtm1);
       }
       if(sem8.equals(" ")&&sem7.equals("a.infosecurity,a.ml,a.softdesign,a.elective1,a.elective2"))  
       {
           jScrollPane2.setVisible(true);
            jTable2.setVisible(true);
            jLabel6.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem7+" from beresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"PRN","Rollno","InfoSec.","MachineL","S.Design","Elective1","Elective2"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
      
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String Elect2 = rs.getString(6);
                    String[] item={PRN,Roll,M1,Phy,EG,Electr,Elect2};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+Elect2);
                }
                jTable2.setModel(dtm1);
       }
       if (sem7.equals("a.infosecurity,a.ml,a.softdesign,a.elective1,a.elective2")&&sem8.equals("a.dcs,a.uc,a.elective3,a.elective4"))
       {
           jScrollPane2.setVisible(true);
            jTable2.setVisible(true);
            jLabel6.setVisible(true);
       PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem7+","+sem8+" from beresult a,student b where a.prn=b.prn and b.year=?");
            stmt.setString(1, year);
            ResultSet rs=stmt.executeQuery(); 
         
            String[]   tblHead={"PRN","Rollno","InfoSec.","MachineL","S.Design","Elective1","Elective2","DCS","UC","Elective3","Elective4"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String M1 = rs.getString(3);
                    String Phy = rs.getString(4);
                    String  EG= rs.getString(5);
                    String Electr = rs.getString(6);
                    String bce = rs.getString(7);
                    String M2 = rs.getString(8);
                    String Chem = rs.getString(9);
                    String Bme = rs.getString(10);
                    String Elec = rs.getString(11);
                   
                    String[] item={PRN,Roll,M1,Phy,EG,Electr,bce,M2,Chem,Bme,Elec};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+M1+" "+Phy+" "+EG+" "+Electr+" "+bce+" "+M2+" "+Chem+" "+Bme+" "+Elec);
                }
                jTable2.setModel(dtm1);
       }
    
    
    
    }
    
    
    
    
    
    catch (Exception e)
    {JOptionPane.showMessageDialog(null, "Error in fetching result from database.");}
}
public void hideall()
{
    jScrollPane1.setVisible(false);
    jTable1.setVisible(false);
    jScrollPane2.setVisible(false);
    jTable2.setVisible(false);
    jScrollPane3.setVisible(false);
    jTable3.setVisible(false);
    jScrollPane4.setVisible(false);
    jTable4.setVisible(false);
    jLabel4.setVisible(false);
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jLabel7.setVisible(false);
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
