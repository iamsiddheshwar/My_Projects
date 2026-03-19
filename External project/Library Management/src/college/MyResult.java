package college;

import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tanay
 */
public class MyResult extends javax.swing.JFrame {
int[] show={0};
    String UserID,loginAs,year,prn;
    String sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    public MyResult(String _UserID,String _loginAs,String _year,String _prn) {
        this.UserID = _UserID;
        this.loginAs=_loginAs;
        this.year=_year;
        this.prn=_prn;
        initComponents();
        hideall();
        setvisible();
        show = new int[10]; 
       if(jCheckBox3.isSelected())
        {show[1]=1;JOptionPane.showMessageDialog(null,show[1]);}
           if(jCheckBox1.isSelected())
           {show[2]=1;}
           if(jCheckBox4.isSelected())
           {show[3]=1;}
           if(jCheckBox2.isSelected())
           {show[4]=1;}
           if(jCheckBox5.isSelected())
           {show[5]=1;}
           if(jCheckBox6.isSelected())
           {show[6]=1;}
            if(jCheckBox7.isSelected())
           {show[7]=1;}
            if(jCheckBox8.isSelected())
           {show[8]=1;}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified Light", 0, 48)); // NOI18N
        jLabel3.setText("My Result");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 20, 330, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backward Arrow.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 70, 60);

        jCheckBox1.setText("FE Sem 2");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(600, 90, 83, 25);

        jCheckBox2.setText("SE Sem 2");
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(720, 90, 85, 25);

        jCheckBox3.setText("FE Sem 1");
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(600, 40, 93, 25);

        jCheckBox4.setText("SE Sem 1");
        jPanel1.add(jCheckBox4);
        jCheckBox4.setBounds(720, 40, 85, 25);

        jCheckBox5.setText("TE Sem 1");
        jPanel1.add(jCheckBox5);
        jCheckBox5.setBounds(840, 40, 85, 25);

        jCheckBox6.setText("TE Sem 2");
        jPanel1.add(jCheckBox6);
        jCheckBox6.setBounds(840, 90, 85, 25);

        jCheckBox7.setText("BE Sem 1");
        jPanel1.add(jCheckBox7);
        jCheckBox7.setBounds(960, 40, 83, 25);

        jCheckBox8.setText("BE Sem 2");
        jPanel1.add(jCheckBox8);
        jCheckBox8.setBounds(960, 90, 83, 25);

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jButton1.setText("Show");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1120, 50, 130, 50);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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
        jTable1.setRowHeight(40);
        jTable1.setRowMargin(2);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(360, 180, 1060, 80);

        jTable4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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
        jTable4.setRowHeight(40);
        jTable4.setRowMargin(2);
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(360, 340, 1060, 80);

        jTable3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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
        jTable3.setRowHeight(40);
        jTable3.setRowMargin(2);
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(360, 500, 1060, 80);

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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
        jTable2.setRowHeight(40);
        jTable2.setRowMargin(2);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(360, 670, 1060, 80);

        jTextArea1.setBackground(new java.awt.Color(214, 224, 235));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(1480, 160, 400, 120);

        jTextArea2.setBackground(new java.awt.Color(214, 224, 235));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(1480, 330, 400, 120);

        jTextArea3.setBackground(new java.awt.Color(214, 224, 235));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane7);
        jScrollPane7.setBounds(1480, 490, 400, 120);

        jTextArea4.setBackground(new java.awt.Color(214, 224, 235));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        jPanel1.add(jScrollPane8);
        jScrollPane8.setBounds(1480, 650, 400, 120);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Third Year      :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 490, 220, 80);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Fourth Year    :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 670, 230, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Second Year   :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 340, 200, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("First Year       :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 180, 180, 60);

        jSeparator1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(560, 130, 700, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        DashboardStudent DS= new DashboardStudent(UserID,loginAs);
        DS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        hideall();
        setvisible();
        show[1]=show[2]=show[3]=show[4]=show[5]=show[6]=show[7]=show[8]=0;
        if(jCheckBox3.isSelected())
        {show[1]=1;}
        if(jCheckBox1.isSelected())
        {show[2]=1;}
        if(jCheckBox4.isSelected())
        {show[3]=1;}
        if(jCheckBox2.isSelected())
        {show[4]=1;}
        if(jCheckBox5.isSelected())
        {show[5]=1;}
        if(jCheckBox6.isSelected())
        {show[6]=1;}
        if(jCheckBox7.isSelected())
        {show[7]=1;}
        if(jCheckBox8.isSelected())
        {show[8]=1;}
        getresult();
    }//GEN-LAST:event_jButton1MousePressed
public void setvisible()
{
   boolean sem1result=true,sem2result=true;
        hideall();
      Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
     int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
    //  int currentMonth=7;
       if ((currentMonth>=8 && currentMonth <=12))
        {
            sem1result=false;
        }
        if ((currentMonth>=1 && currentMonth <7))
        {
            sem2result=false;
        }
        if (year.equals("First year (FE)")&& sem1result==true &&sem2result==false)
        {jCheckBox3.setVisible(true);}
        else if (year.equals("Second year (SE)") && sem1result==true &&sem2result==false )
        {jCheckBox3.setVisible(true);jCheckBox1.setVisible(true);jCheckBox4.setVisible(true);}
        else if (year.equals("Third year (TE)")&& sem1result==true &&sem2result==false)
        {jCheckBox3.setVisible(true);jCheckBox1.setVisible(true);jCheckBox4.setVisible(true);jCheckBox2.setVisible(true);jCheckBox5.setVisible(true);}
        else if (year.equals("Fourth year (BE)") && sem1result==true &&sem2result==false)
        {jCheckBox3.setVisible(true);jCheckBox1.setVisible(true);jCheckBox4.setVisible(true);jCheckBox2.setVisible(true);jCheckBox5.setVisible(true);jCheckBox6.setVisible(true);jCheckBox7.setVisible(true);}
        else if (year.equals("Second year (SE)") && sem1result==false )
        {jCheckBox3.setVisible(true);jCheckBox1.setVisible(true);}
        else if (year.equals("Third year (TE)") && sem1result==false )
        {jCheckBox3.setVisible(true);jCheckBox1.setVisible(true);jCheckBox4.setVisible(true);jCheckBox2.setVisible(true);}
        else if (year.equals("Fourth year (BE)") && sem1result==false)
        {jCheckBox3.setVisible(true);jCheckBox1.setVisible(true);jCheckBox4.setVisible(true);jCheckBox2.setVisible(true);jCheckBox5.setVisible(true);jCheckBox6.setVisible(true);}
        else if(year.equals("First year (FE)")&& sem1result==false)
        {
            JOptionPane.showMessageDialog(null,"No result found for FE.\nAs the result of 1st sem is declared in January next year");
        }
        else if(year.equals("Fourth year (BE)")&& sem2result==true && sem1result==true)
       {jCheckBox1.setVisible(true);jCheckBox2.setVisible(true);jCheckBox3.setVisible(true);jCheckBox4.setVisible(true);jCheckBox5.setVisible(true);jCheckBox6.setVisible(true);jCheckBox7.setVisible(true);jCheckBox8.setVisible(true);}
        else if(year.equals("First year (FE)")&& sem2result==true && sem1result==true)
        {jCheckBox1.setVisible(true);jCheckBox3.setVisible(true);}
        else if(year.equals("Second year (SE)")&& sem2result==true && sem1result==true)
        {jCheckBox1.setVisible(true);jCheckBox2.setVisible(true);jCheckBox3.setVisible(true);jCheckBox4.setVisible(true);}
        else if(year.equals("Third year (TE)")&& sem2result==true && sem1result==true)
        {jCheckBox1.setVisible(true);jCheckBox2.setVisible(true);jCheckBox3.setVisible(true);jCheckBox4.setVisible(true);jCheckBox5.setVisible(true);jCheckBox6.setVisible(true);}
}
public void hideall()
{
    jCheckBox1.setVisible(false);
    jCheckBox2.setVisible(false);
    jCheckBox3.setVisible(false);
    jCheckBox4.setVisible(false);
    jCheckBox5.setVisible(false);
    jCheckBox6.setVisible(false);
    jCheckBox7.setVisible(false);
    jCheckBox8.setVisible(false); 
    jScrollPane1.setVisible(false);
    jScrollPane2.setVisible(false);
    jScrollPane3.setVisible(false);
    jScrollPane4.setVisible(false);
    jScrollPane5.setVisible(false);
    jScrollPane6.setVisible(false);
    jScrollPane7.setVisible(false);
    jScrollPane8.setVisible(false);
    jTable1.setVisible(false);
    jTable2.setVisible(false);
    jTable3.setVisible(false);
    jTable4.setVisible(false);
    jLabel4.setVisible(false);
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jLabel7.setVisible(false);
    jTextArea1.setVisible(false);
    jTextArea2.setVisible(false);
    jTextArea3.setVisible(false);
    jTextArea4.setVisible(false);
}
public void getresult()
{
     if(show[1]==1)
        {sem1="a.Maths1,a.physics,a.graphics,a.electronics,a.bce";}
     else{sem1=" ";}
        if(show[2]==1)
        {sem2="a.maths2,a.chemistry,a.bme,a.electrical,a.Mechanics";}
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
    try{
    
       Class.forName("com.mysql.cj.jdbc.Driver");  
       Connection con=DriverManager.getConnection(  
       "jdbc:mysql://localhost:3306/college","root","TANay@99");
       int[] sub={0};
       sub = new int[10]; 
      if(sem1.equals(" ")&&sem2.equals("a.maths2,a.chemistry,a.bme,a.electrical,a.Mechanics"))
       {
           jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
            jLabel7.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem2+" from feresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);
            stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
          String[]   tblHead={"Rollno","PRN","Maths2","Sub7istry","Mechanical ","Electrical","Mechanics"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0); 
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub6 = rs.getString(3);
                    String Sub7 = rs.getString(4);
                    String Sub8 = rs.getString(5);
                    String Sub10 = rs.getString(6);
                    String Sub9 = rs.getString(7);
                    sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    sub[4]=Integer.parseInt(Sub9);
                    String[] item={PRN,Roll,Sub6,Sub7,Sub8,Sub10,Sub9};
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<5;i++)
                    {
                        if(sub[i]>=20)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem2 result:\n Passed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea1.setVisible(true);
                    jScrollPane5.setVisible(true);
                    jTextArea1.setText(Result);
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10+" "+Sub9);
                }
                jTable1.setModel(dtm1);
       }
       if (sem2.equals(" ")&&sem1.equals("a.Maths1,a.physics,a.graphics,a.electronics,a.bce"))  
       {
            jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
            jLabel7.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem1+" from feresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);
            stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"PRN","Roll no.","Maths 1","Sub2sics","EnngGraphics","Electronics","Civil"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String  Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(7);
                    String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5);
                    sub[0]=Integer.parseInt(Sub1);
                    sub[1]=Integer.parseInt(Sub2);
                    sub[2]=Integer.parseInt(Sub3);
                    sub[3]=Integer.parseInt(Sub4);
                    sub[4]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<5;i++)
                    {
                        if(sub[i]>=20)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem1 result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea1.setVisible(true);
                    jScrollPane5.setVisible(true);
                    jTextArea1.setText(Result);
                }
                jTable1.setModel(dtm1);
       }
       if (sem1.equals("a.Maths1,a.physics,a.graphics,a.electronics,a.bce")&&sem2.equals("a.maths2,a.chemistry,a.bme,a.electrical,a.Mechanics"))
       {
            jScrollPane1.setVisible(true);
            jTable1.setVisible(true);
            jLabel7.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem1+","+sem2+" from feresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);
            stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
 String[]   tblHead={"PRN","Roll no.","Maths 1","Physics","EDrawing","Electronics","Civil","Maths2","Sub7istry","Mechanical ","Electrical","Mechanics"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
           while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String  Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(7);
                    String Sub6 = rs.getString(8);
                    String Sub7 = rs.getString(9);
                    String Sub8 = rs.getString(10);
                    String Sub10 = rs.getString(11);
                    String Sub9 = rs.getString(12);String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5,Sub6,Sub7,Sub8,Sub10,Sub9};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10+" "+Sub9);
                    sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    sub[4]=Integer.parseInt(Sub9);
                    sub[5]=Integer.parseInt(Sub1);
                    sub[6]=Integer.parseInt(Sub2);
                    sub[7]=Integer.parseInt(Sub3);
                    sub[8]=Integer.parseInt(Sub4);
                    sub[9]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<10;i++)
                    {
                        if(sub[i]>=20)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="First year result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea1.setVisible(true);
                    jScrollPane5.setVisible(true);
                    jTextArea1.setText(Result);
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
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem4+" from seresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
          String[]   tblHead={"Rollno","PRN","DS","COA","DELD","FDS","PSOOP"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);//   where batch=""
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub6 = rs.getString(3);
                    String Sub7 = rs.getString(4);
                    String Sub8 = rs.getString(5);
                    String Sub10 = rs.getString(6);
                    String Sub9 = rs.getString(7);
                    String[] item={PRN,Roll,Sub6,Sub7,Sub8,Sub10,Sub9};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10+" "+Sub9);
                   sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    sub[4]=Integer.parseInt(Sub9);
                    int pass=0,fail=0,i;
                    String result="pass";
                    for(i=0;i<5;i++)
                    {
                        if(sub[i]>=20)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem4 result:\n Passed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea2.setVisible(true);
                    jScrollPane6.setVisible(true);
                    jTextArea2.setText(Result);
                }
                jTable4.setModel(dtm1);
       }
       if(sem4.equals(" ")&&sem3.equals("a.ds,a.coa,a.deld,a.fds,a.psoop"))  
       {
           jScrollPane4.setVisible(true);
            jTable4.setVisible(true);
            jLabel5.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem3+" from seresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"Rollno","PRN","Maths3","Graphics","PAI","DSF","FCCN"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
            while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(7);
                    String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5);
                    sub[0]=Integer.parseInt(Sub1);
                    sub[1]=Integer.parseInt(Sub2);
                    sub[2]=Integer.parseInt(Sub3);
                    sub[3]=Integer.parseInt(Sub4);
                    sub[4]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<5;i++)
                    {
                        if(sub[i]>=20)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem3 result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea2.setVisible(true);
                    jScrollPane6.setVisible(true);
                    jTextArea2.setText(Result);
                }
                jTable4.setModel(dtm1);
       }
       if (sem3.equals("a.ds,a.coa,a.deld,a.fds,a.psoop")&&sem4.equals("a.maths3,a.cg,a.pai,a.dsf,a.fccn"))
       {
           jScrollPane4.setVisible(true);
            jTable4.setVisible(true);
            jLabel5.setVisible(true);
       PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem3+","+sem4+" from seresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
           
            String[]   tblHead={"Rollno","PRN","DS","COA","DELD","FDS","PSOOP","Maths3","Graphics","PAI","DSF","FCCN"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String  Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(7);
                    String Sub6 = rs.getString(8);
                    String Sub7 = rs.getString(9);
                    String Sub8 = rs.getString(10);
                    String Sub10 = rs.getString(11);
                    String Sub9 = rs.getString(12);String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5,Sub6,Sub7,Sub8,Sub10,Sub9};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10+" "+Sub9);
                  sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    sub[4]=Integer.parseInt(Sub9);
                    sub[5]=Integer.parseInt(Sub1);
                    sub[6]=Integer.parseInt(Sub2);
                    sub[7]=Integer.parseInt(Sub3);
                    sub[8]=Integer.parseInt(Sub4);
                    sub[9]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<10;i++)
                    {
                        if(sub[i]>=20)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Second year result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea2.setVisible(true);
                    jScrollPane6.setVisible(true);
                    jTextArea2.setText(Result);
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
        PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem6+" from teresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
      String[]   tblHead={"Rollno","PRN","CNT","SP","DAA","CC","DS&DBA"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
           while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub6 = rs.getString(3);
                    String Sub7 = rs.getString(4);
                    String Sub8 = rs.getString(5);
                    String Sub10 = rs.getString(6);
                    String Sub9 = rs.getString(7);
                    String[] item={PRN,Roll,Sub6,Sub7,Sub8,Sub10,Sub9};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10+" "+Sub9);
                    sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    sub[4]=Integer.parseInt(Sub9);
                    int pass=0,fail=0,i;
                    String result="pass";
                    for(i=0;i<5;i++)
                    {
                        if(sub[i]>=28)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem6 result:\n Passed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea3.setVisible(true);
                    jScrollPane7.setVisible(true);
                    jTextArea3.setText(Result);
                }
                jTable3.setModel(dtm1);
       }
       if(sem6.equals(" ")&&sem5.equals("a.toc,a.sepm,a.hci,a.dbms,a.os"))  
       {
           jScrollPane3.setVisible(true);
            jTable3.setVisible(true);
            jLabel4.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem5+" from teresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"Rollno","PRN","TOC","SEPM","HCI","DBMS","OS"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
       while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String  Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(7);
                    String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5);
                    sub[0]=Integer.parseInt(Sub1);
                    sub[1]=Integer.parseInt(Sub2);
                    sub[2]=Integer.parseInt(Sub3);
                    sub[3]=Integer.parseInt(Sub4);
                    sub[4]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<5;i++)
                    {
                        if(sub[i]>=28)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem5 result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea3.setVisible(true);
                    jScrollPane7.setVisible(true);
                    jTextArea3.setText(Result);
                }
                jTable3.setModel(dtm1);
       }
       else if (sem5.equals("a.toc,a.sepm,a.hci,a.dbms,a.os")&&sem6.equals("a.cnt,a.sp,a.daa,a.cc,a.dsbda"))
       {
           jScrollPane3.setVisible(true);
            jTable3.setVisible(true);
            jLabel4.setVisible(true);
       PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem5+","+sem6+" from teresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
           String[]   tblHead={"Rollno","PRN","TOC","SEPM","HCI","DBMS","OS","CNT","SP","DAA","CC","DS&DBA"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
           while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String  Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(7);
                    String Sub6 = rs.getString(8);
                    String Sub7 = rs.getString(9);
                    String Sub8 = rs.getString(10);
                    String Sub10 = rs.getString(11);
                    String Sub9 = rs.getString(12);String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5,Sub6,Sub7,Sub8,Sub10,Sub9};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10+" "+Sub9);
                    sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    sub[4]=Integer.parseInt(Sub9);
                    sub[5]=Integer.parseInt(Sub1);
                    sub[6]=Integer.parseInt(Sub2);
                    sub[7]=Integer.parseInt(Sub3);
                    sub[8]=Integer.parseInt(Sub4);
                    sub[9]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<10;i++)
                    {
                        if(sub[i]>=28)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Third year result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea3.setVisible(true);
                    jScrollPane7.setVisible(true);
                    jTextArea3.setText(Result);
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
        PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem8+" from beresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
          String[]   tblHead={"Rollno","PRN","DCS","UC","Elective3","Elective4"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub6 = rs.getString(3);
                    String Sub7 = rs.getString(4);
                    String Sub8 = rs.getString(5);
                    String Sub10 = rs.getString(6);
                    String[] item={PRN,Roll,Sub6,Sub7,Sub8,Sub10};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10);
                    sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    int pass=0,fail=0,i;
                    String result="pass";
                    for(i=0;i<4;i++)
                    {
                        if(sub[i]>=28)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem8 result:\n Passed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea4.setVisible(true);
                    jScrollPane8.setVisible(true);
                    jTextArea4.setText(Result);
                }
                jTable2.setModel(dtm1);
       }
       if(sem8.equals(" ")&&sem7.equals("a.infosecurity,a.ml,a.softdesign,a.elective1,a.elective2"))  
       {
           jScrollPane2.setVisible(true);
            jTable2.setVisible(true);
            jLabel6.setVisible(true);
            PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem7+" from beresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
            String[]   tblHead={"Rollno","PRN","InfoSec.","MachineL","S.Design","Elective1","Elective2"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
       while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String  Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(6);
                    String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5);
                    sub[0]=Integer.parseInt(Sub1);
                    sub[1]=Integer.parseInt(Sub2);
                    sub[2]=Integer.parseInt(Sub3);
                    sub[3]=Integer.parseInt(Sub4);
                    sub[4]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<5;i++)
                    {
                        if(sub[i]>=28)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Sem7 result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea4.setVisible(true);
                    jScrollPane8.setVisible(true);
                    jTextArea4.setText(Result);
                }
                jTable2.setModel(dtm1);
       }
       if (sem7.equals("a.infosecurity,a.ml,a.softdesign,a.elective1,a.elective2")&&sem8.equals("a.dcs,a.uc,a.elective3,a.elective4"))
       {
           jScrollPane2.setVisible(true);
            jTable2.setVisible(true);
            jLabel6.setVisible(true);
       PreparedStatement stmt=con.prepareStatement("select a.prn,b.rollno,"+sem7+","+sem8+" from beresult a,student b where a.prn=b.prn and b.year=? and a.prn=?");
            stmt.setString(1, year);stmt.setString(2, prn);
            ResultSet rs=stmt.executeQuery(); 
         String[]   tblHead={"Rollno","PRN","InfoSec.","MachineL","S.Design","Elective1","Elective2","DCS","UC","Elective3","Elective4"};
            DefaultTableModel dtm1=new DefaultTableModel(tblHead,0);
          while (rs.next())
            {
                    String PRN = rs.getString(1);
                    String Roll = rs.getString(2);
                    String Sub1 = rs.getString(3);
                    String Sub2 = rs.getString(4);
                    String  Sub3= rs.getString(5);
                    String Sub4 = rs.getString(6);
                    String Sub5 = rs.getString(7);
                    String Sub6 = rs.getString(8);
                    String Sub7 = rs.getString(9);
                    String Sub8 = rs.getString(10);
                    String Sub10 = rs.getString(11);
                    String[] item={PRN,Roll,Sub1,Sub2,Sub3,Sub4,Sub5,Sub6,Sub7,Sub8,Sub10};
                    dtm1.addRow(item);
                    System.out.println(PRN+" "+Roll+" "+Sub1+" "+Sub2+" "+Sub3+" "+Sub4+" "+Sub5+" "+Sub6+" "+Sub7+" "+Sub8+" "+Sub10);
                   sub[0]=Integer.parseInt(Sub6);
                    sub[1]=Integer.parseInt(Sub7);
                    sub[2]=Integer.parseInt(Sub8);
                    sub[3]=Integer.parseInt(Sub10);
                    sub[5]=Integer.parseInt(Sub1);
                    sub[6]=Integer.parseInt(Sub2);
                    sub[7]=Integer.parseInt(Sub3);
                    sub[8]=Integer.parseInt(Sub4);
                    sub[9]=Integer.parseInt(Sub5);
                    int pass=0,fail=0,i=0;
                    String result="pass";
                    for(i=0;i<9;i++)
                    {
                        if(sub[i]>=28)
                        {pass+=1;}
                        else{fail+=1;}
                    }
                    if(fail>0)
                    {result="fail";}
                    String Result="Fourth year result-->\nPassed :"+pass+"\nFailed:"+fail+"\nOverall Result= "+result;
                    jTextArea4.setVisible(true);
                    jScrollPane8.setVisible(true);
                    jTextArea4.setText(Result);
            }
                jTable2.setModel(dtm1);
       }
   }
  catch (Exception e)
    {JOptionPane.showMessageDialog(null, "Error in fetching result from database.");}
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
