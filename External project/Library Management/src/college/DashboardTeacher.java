package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tanay
 */
public class DashboardTeacher extends javax.swing.JFrame {

    /**
     * Creates new form DashboardTeacher
     */
    String UserID,loginAs;
    public DashboardTeacher(String _UserID,String _loginAs) {
        this.UserID = _UserID;
        this.loginAs=_loginAs;
        initComponents();
        String Account;
        if(loginAs.equals(" loginstudent "))
        {
            Account="Student";
        }
        else
        {
            Account="Teacher";
        }
        
        
         try
        {
             //setup connection with database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college","Student","Student@99");
            
            PreparedStatement stmt=con.prepareStatement
            ("select *,datediff(curdate(),dob) from "+Account+" where UserID = ?");
            stmt.setString(1, UserID);
            String _title="";
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
            jLabel19.setText("SCOEIT"+rs.getString(2));  
            jLabel15.setText(rs.getString(1));
            jLabel30.setText(rs.getString(7));  
            jLabel10.setText(rs.getString(9));  
            jLabel11.setText(rs.getString(8)+" years");    
            jLabel29.setText(rs.getString(12));
            jLabel26.setText(rs.getString(6));
            jLabel31.setText(rs.getString(10));
            if(rs.getString(11).equals("Male"))
            {
                 _title="Mr.";
            }
            else
            {
                 _title="Mrs.";
            }
            jLabel24.setText(_title+" "+rs.getString(3)+"  "+rs.getString(5)+"  "+rs.getString(4));//name and title
            int days=rs.getInt(13);
            int years=days/365;
            jLabel13.setText(String.valueOf(years)+" years");
            }
                      
        }
         catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,
                "Unable to connect to database.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel4.setText("Admission ID :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1960, -140, 210, 50);

        jLabel8.setFont(new java.awt.Font("HP Simplified Light", 0, 48)); // NOI18N
        jLabel8.setText("Hello,");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(190, 30, 120, 60);

        jLabel14.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel14.setText("1234/ABCD");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(2180, -150, 230, 70);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jButton1.setText("Results");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 450, 350, 60);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jButton2.setText("Student's details");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(450, 570, 350, 60);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanay\\Downloads\\logout.png")); // NOI18N
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(30, 20, 60, 60);

        jLabel22.setText("Logout");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(50, 70, 48, 16);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jButton3.setText("Notice board");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 330, 350, 60);

        jLabel18.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel18.setText("Teacher ID      :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(1280, 120, 260, 70);

        jLabel20.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel20.setText("My details :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1250, 60, 170, 40);

        jLabel19.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel19.setText("SCOEIT01");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(1500, 130, 310, 50);

        jLabel10.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel10.setText("PHD.");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1500, 330, 310, 60);

        jLabel5.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel5.setText("Qualification   :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1280, 320, 210, 60);

        jLabel6.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel6.setText("Experience     :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1280, 390, 230, 60);

        jLabel11.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel11.setText("02");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1510, 390, 220, 60);

        jLabel3.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel3.setText("Username      :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1280, 190, 290, 50);

        jLabel15.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel15.setText("username");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1500, 190, 260, 50);

        jLabel7.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel7.setText("Age                  :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1280, 470, 230, 40);

        jLabel13.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel13.setText("28");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1510, 460, 220, 60);

        jLabel16.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel16.setText("Contact            : ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1280, 680, 230, 40);

        jLabel26.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel26.setText("9403130058");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(1520, 670, 250, 60);

        jLabel12.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel12.setText("Marital Status :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1280, 520, 220, 70);

        jLabel29.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel29.setText("M/UM");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(1510, 520, 260, 70);

        jLabel24.setFont(new java.awt.Font("HP Simplified Light", 0, 70)); // NOI18N
        jLabel24.setText("Tanay Dharmendra Patel");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(180, 120, 890, 100);

        jLabel28.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel28.setText("Designation   : ");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(1280, 260, 250, 50);

        jLabel30.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel30.setText("Proffesor");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(1500, 260, 310, 50);

        jLabel31.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel31.setText("1999-05-28");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(1510, 600, 250, 60);

        jLabel23.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jLabel23.setText("Date of birth   :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1280, 610, 230, 40);

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1250, 110, 560, 630);

        jSeparator1.setToolTipText("");
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(410, 420, 420, 40);

        jSeparator2.setToolTipText("");
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(420, 650, 420, 30);

        jSeparator3.setToolTipText("");
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(420, 540, 420, 40);

        jSeparator4.setToolTipText("");
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(410, 300, 420, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanay\\Desktop\\Final\\Background.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
       //Navigate to Teachers noticeboard panel'
       TeacherNoticeboard n = new TeacherNoticeboard(UserID,loginAs);
       n.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        //Redirect to common result filter page
        StudentsDetail1 s1 = new StudentsDetail1(UserID,loginAs);
        s1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
         StudentsDetail2 s2 = new StudentsDetail2(UserID,loginAs);
        s2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
