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

public class TeacherNoticeboard extends javax.swing.JFrame {

    String message="",UserID,loginAs,firstname,lastname;
    public TeacherNoticeboard(String _UserID,String _loginAs) {
        this.UserID=_UserID;
        this.loginAs=_loginAs;
        initComponents();
     
        this.getDetails();  //noticeboard
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Noticeboard Control panel (Teachers).");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backward Arrow.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 70, 60);

        jLabel3.setFont(new java.awt.Font("HP Simplified Light", 0, 48)); // NOI18N
        jLabel3.setText("Noticeboard...");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 20, 470, 70);

        textArea1.setBackground(new java.awt.Color(214, 224, 235));
        textArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textArea1.setRows(1);
        jPanel1.add(textArea1);
        textArea1.setBounds(1340, 110, 440, 260);

        textArea2.setBackground(new java.awt.Color(214, 224, 235));
        textArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textArea2.setEditable(false);
        textArea2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textArea2.setRows(1);
        jPanel1.add(textArea2);
        textArea2.setBounds(140, 140, 970, 530);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Post message:-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1330, 60, 170, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Post");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1480, 390, 160, 60);

        jTextField1.setBackground(new java.awt.Color(221, 221, 221));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(1550, 560, 200, 50);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparator1.setDoubleBuffered(true);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(1320, 468, 490, 2);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Delete message :-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1330, 500, 220, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1490, 640, 160, 60);

        jLabel7.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel7.setText("Message ID :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1350, 560, 190, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Every message is automatically deleted after 10 days.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1370, 720, 420, 70);

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1310, 40, 510, 730);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
         String MessageTyped=textArea1.getText();
          try{  
               
              Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/college","root","TANay@99");
               
                PreparedStatement stmt=con.prepareStatement
                    ("select Firstname,lastname from teacher where userid = ? ");
                stmt.setString(1, UserID);
                ResultSet rs=stmt.executeQuery();
                
                while(rs.next())   
                {
                firstname=rs.getString(1);
                lastname=rs.getString(2);
                }
                stmt = con.prepareStatement(" insert into noticeboard (name,datestamp,message) values (?,now(),?)");
                
                stmt.setString (1, firstname+" "+lastname);
                stmt.setString (2, MessageTyped);
                textArea1.setText("");
                stmt.execute();
               
                message="";
                this.getDetails();  //noticeboard
          }
          catch(Exception e)
          {
           JOptionPane.showMessageDialog(null,
                "error in posting message to noticeboard.");   
          }
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
       String deleteID = jTextField1.getText();
       try
       {
            Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/college","root","TANay@99");
                
               PreparedStatement stmt = con.prepareStatement(" delete from noticeboard where messageid ="+deleteID+" ;");
               stmt.execute();
               message="";
                jTextField1.setText("");
                this.getDetails();  //noticeboard
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,
                "error in deleting message from noticeboard.");   
       }
    }//GEN-LAST:event_jButton2MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
           if (UserID.equals("hod") )      
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
    }//GEN-LAST:event_jLabel2MouseClicked


public void getDetails()
   {
                
       try{  
                Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/college","root","TANay@99");
              PreparedStatement stmt=con.prepareStatement("call deletemessage()");  
                ResultSet rs=stmt.executeQuery(); 
                
                stmt=con.prepareStatement("SELECT * from noticeboard");  
                rs=stmt.executeQuery();
                
                while(rs.next()){
                    String id =rs.getString(1);
                    String name = rs.getString(2);
                    String datestamp = rs.getString(3);
                    String message1 = rs.getString(4);
                  
                    message="Message ID:-"+id+"  By:- "+name+"\t\t\t"+datestamp+"\t:\n\n"+message1+"\n--------------------------------------------------------------------------------------------------------\n\n"+message; 
                }
                 textArea2.setText(message);
                                 
   
    
       }
       catch (Exception e)
       {
          JOptionPane.showMessageDialog(null,
                "error in loading noticeboard.");
       }}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
