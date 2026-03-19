package college;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tanay
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private final ButtonGroup G;
    public String loginAs;
    public Login() {
        initComponents();
        G = new ButtonGroup();
        G.add(jRadioButton1);
        G.add(jRadioButton2);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 80)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 90, 210, 170);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backward Arrow.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 10, 60, 80);

        jRadioButton1.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jRadioButton1.setText("Teacher");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(690, 260, 150, 50);

        jRadioButton2.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jRadioButton2.setText("Student");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(510, 260, 150, 50);

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 44)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 350, 280, 50);

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 44)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 530, 290, 50);

        jPasswordField1.setBackground(new java.awt.Color(221, 221, 221));
        jPasswordField1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(470, 600, 430, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Forward Arrow.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(660, 670, 50, 70);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Create Account.");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(650, 750, 110, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Forgot Password ?");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(780, 750, 120, 40);

        jTextField1.setBackground(new java.awt.Color(221, 221, 221));
        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 30)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(470, 420, 430, 60);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 240, 470, 550);

        jLabel10.setText("Home");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 70, 50, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()==true)
        {
           loginAs= " loginteacher ";
          
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        this.dispose();
        CreateAccount c = new CreateAccount();
        c.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        ForgotPassword1 FP= new ForgotPassword1();
        FP.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        Welcome l= new Welcome();
        l.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()==true)
        {
            loginAs= " loginstudent ";
           
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
     String UserID= jTextField1.getText();
     UserID=UserID.toLowerCase();
     String Password = String.valueOf(jPasswordField1.getPassword());

     try
     {  
        //setup connection with database
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/college","Student","Student@99");  
        
        boolean alreadyExists= false;
        boolean status=false;
        boolean PassW=false;
        PreparedStatement stmt=con.prepareStatement
        ("select * from "+loginAs+" where UserID = ? and Status=1");
        stmt.setString(1, UserID);
        ResultSet rs=stmt.executeQuery(); 
       
        while(rs.next())
        {
            alreadyExists=true;//Username is present and active
            stmt=con.prepareStatement
            ("select userID from "+ loginAs +" where UserID = ? and Password= ? and status=1");
            stmt.setString(1,UserID);
            stmt.setString(2,Password);
            rs=stmt.executeQuery();
            //to check account status and password
            while(rs.next())
            {PassW=true;status=true;break;}
            
            if (PassW==false)
            {
            status=true;
            }
        }
        if (alreadyExists==false)
        {
            stmt=con.prepareStatement
            ("select UserID,Password from "+ loginAs +" where UserID = ? and status=0");
            stmt.setString(1,UserID);
            rs=stmt.executeQuery();
            //to check account status and password
            while(rs.next())
            {status=false;alreadyExists=true;break;}
        }
       
     if(alreadyExists==false)
        {
            JOptionPane.showMessageDialog(null,"Account Does not exists ");
        }
     
        else if(alreadyExists==true && status==true && PassW==true)
        {  
            if (loginAs.equals(" loginstudent "))
            {
                DashboardStudent DS= new DashboardStudent(UserID,loginAs);
                DS.setVisible(true);
                this.dispose();            
            }
            else if (loginAs.equals(" loginteacher ")&& (UserID.equals("hod")||(UserID.equals("jakade")) ) )      
            {
                DashboardHod DH= new DashboardHod(UserID,loginAs);
                DH.setVisible(true);
                this.dispose(); 
            }
            else
            {
                DashboardTeacher DT= new DashboardTeacher(UserID,loginAs);
                DT.setVisible(true);
                this.dispose(); 
            }
            
     }   
        else if(alreadyExists==true && status==true && PassW==false)
        {
            JOptionPane.showMessageDialog(null,"Incorrect Password !");
        }
        else if(alreadyExists==true && status==false)
        {
            JOptionPane.showMessageDialog(null,"Account is not ACTIVE ! ");
        }
        con.close();
     }

     catch(Exception e) 
     {
         JOptionPane.showMessageDialog(null,
                 "Erorr  060.\nPlease enter complete details.");
         
     }
    }//GEN-LAST:event_jLabel6MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
