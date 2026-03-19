package college;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Tanay
 */
public class CreateAccount3 extends javax.swing.JFrame {


private final ButtonGroup G1,G2;
    String loginAs,UserID,MS="Unknown",DOB;
    String Gender="Unknown";
    String Designation="--select--";
    public CreateAccount3(String _UserID,String _loginAs) {
        initComponents();
        this.UserID= _UserID;
        this.loginAs= _loginAs;
        G1 = new ButtonGroup();
        G1.add(jRadioButton1);
        G1.add(jRadioButton2);
        G2 = new ButtonGroup();
        G2.add(jRadioButton3);
        G2.add(jRadioButton4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified Light", 0, 50)); // NOI18N
        jLabel3.setText("Create account - 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 20, 380, 70);

        jTextField1.setBackground(new java.awt.Color(221, 221, 221));
        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 340, 230, 40);

        jTextField2.setBackground(new java.awt.Color(221, 221, 221));
        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(470, 340, 230, 40);

        jTextField5.setBackground(new java.awt.Color(221, 221, 221));
        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(780, 340, 230, 40);

        jTextField6.setBackground(new java.awt.Color(221, 221, 221));
        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 470, 230, 40);

        jTextField4.setBackground(new java.awt.Color(221, 221, 221));
        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField4.setBorder(null);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(470, 470, 230, 40);

        jRadioButton2.setFont(new java.awt.Font("HP Simplified Light", 1, 22)); // NOI18N
        jRadioButton2.setText("Married");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(170, 720, 110, 40);

        jRadioButton1.setFont(new java.awt.Font("HP Simplified Light", 1, 22)); // NOI18N
        jRadioButton1.setText("Unmarried");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(310, 720, 140, 40);

        jLabel18.setText("*By continuing you agree that 'the information given is true and best of your knowledge'.");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(320, 890, 510, 20);

        jButton1.setBackground(new java.awt.Color(237, 237, 237));
        jButton1.setFont(new java.awt.Font("HP Simplified Light", 1, 18)); // NOI18N
        jButton1.setText("Save & Continue.");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 920, 170, 50);

        jRadioButton3.setFont(new java.awt.Font("HP Simplified Light", 1, 24)); // NOI18N
        jRadioButton3.setText(" M");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(890, 600, 60, 40);

        jRadioButton4.setFont(new java.awt.Font("HP Simplified Light", 1, 24)); // NOI18N
        jRadioButton4.setText("  F");
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(780, 600, 60, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("* All fields are compulsary *");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(870, 770, 200, 70);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Enter the details");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(130, 230, 140, 30);

        jLabel9.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel9.setText("Set  username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(570, 40, 140, 40);

        jTextField12.setBackground(new java.awt.Color(221, 221, 221));
        jTextField12.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField12.setBorder(null);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(740, 700, 230, 40);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("----------------");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(760, 60, 170, 70);

        jLabel20.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel20.setText("Personal  details");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(760, 40, 160, 40);

        jLabel5.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel5.setText("Security details");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(970, 40, 160, 40);

        jTextField11.setBackground(new java.awt.Color(221, 221, 221));
        jTextField11.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField11.setBorder(null);
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(170, 600, 230, 40);

        jComboBox1.setFont(new java.awt.Font("HP Simplified Light", 0, 21)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "Assistant Professor", "Associate Professor", "Professor" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(780, 470, 240, 40);

        jDateChooser2.setBackground(new java.awt.Color(221, 221, 221));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jDateChooser2.setInheritsPopupMenu(true);
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(470, 600, 240, 40);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(238, 238, 238));
        jTextArea1.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("First name\t\tMiddle name\t\tLast name\n\n\n\nQualification\t\tExperience (in years)\tDesignation\n\n\n\nContact\t\tDate of Birth\t\tGender\n\n\n\nMarital status");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        jPanel1.add(jTextArea1);
        jTextArea1.setBounds(170, 300, 870, 470);

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel16.setName("dd"); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(130, 260, 940, 560);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
       if(jRadioButton4.isSelected()==true)
        {
            Gender="Female";
        } // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       if(jRadioButton3.isSelected()==true)
        {
            Gender= "Male";
        } // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()==true)
        {
            MS= "Married";
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()==true)
        {
            MS= "Unmarried";
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Designation =jComboBox1.getSelectedItem().toString();
        if (Designation.equals("--select--"))
        {
            JOptionPane.showMessageDialog(null, "Select your designation");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        //Validate Middle name
        int key=evt.getKeyCode();
        if(!((key>=evt.VK_A&&key<=evt.VK_Z)||(key==evt.VK_SHIFT)||(key==evt.VK_CAPS_LOCK)||(key==evt.VK_TAB)||(key==evt.VK_BACK_SPACE)))
        {
            jTextField2.setText("");
            JOptionPane.showMessageDialog(null, "Only letters allowed");
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        //Validate first name
        int key=evt.getKeyCode();
        if(!((key>=evt.VK_A&&key<=evt.VK_Z)||(key==evt.VK_SHIFT)||(key==evt.VK_CAPS_LOCK)||(key==evt.VK_TAB)||(key==evt.VK_BACK_SPACE)))
        {
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null, "Only letters allowed");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        //Validate Last name
        int key=evt.getKeyCode();
        if(!((key>=evt.VK_A&&key<=evt.VK_Z)||(key==evt.VK_SHIFT)||(key==evt.VK_CAPS_LOCK)||(key==evt.VK_TAB)||(key==evt.VK_BACK_SPACE)))
        {
            jTextField5.setText("");
            JOptionPane.showMessageDialog(null, "Only letters allowed");
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        //Validate contact number
        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==evt.VK_BACK_SPACE)
        {
            long length= Long.parseLong(jTextField11.getText());
            if (length>9999999999L)
            {
                JOptionPane.showMessageDialog(null, "Number cannot be longer than 10 digits");
                jTextField11.setText("");
            }
            
        }
        else
        {
            jTextField11.setText("");
            JOptionPane.showMessageDialog(null, "Only digits are allowed");
        }           
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
       //Validate Experience
        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==evt.VK_BACK_SPACE)
        {
            int length= Integer.parseInt(jTextField4.getText());
            if (length>99)
            {
                JOptionPane.showMessageDialog(null, "Number cannot be greater than 99.");
                jTextField4.setText("");
            }
            
        }
        else
        {
            jTextField4.setText("");
            JOptionPane.showMessageDialog(null, "Only digits are allowed");
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
       boolean GoAhead=true;
       String FirstName= jTextField1.getText();
       String MiddleName= jTextField2.getText();
       String LastName= jTextField5.getText();
       String Quali= jTextField6.getText();
       String Experience= jTextField4.getText();
       String Contact= jTextField11.getText();
       
      
       if(FirstName.equals("") || MiddleName.equals("") || LastName.equals("") || Experience.equals("") || Contact.equals("") || Quali.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill details completly.");
            GoAhead=false;
        }
       
       if (Designation.equals("--select--"))
        {
            JOptionPane.showMessageDialog(null, "Select your designation");
            GoAhead=false;
        }
       if(Gender.equals("Unknown"))
        {
            JOptionPane.showMessageDialog(null, "Select gender.");
            GoAhead=false;
        }
       if(MS.equals("Unknown"))
        {
            JOptionPane.showMessageDialog(null, "Fill marital status.");
            GoAhead=false;
        }
        long length= Long.parseLong(jTextField11.getText());
        if(length<1000000000L)
        {
            JOptionPane.showMessageDialog(null, "Incorrect mobile number.");
            GoAhead=false;
        }
       try{
       DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
       jTextField12.setText(df.format(jDateChooser2.getDate()));
       DOB =jTextField12.getText();
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null, "Enter birth date.");GoAhead=false;
       }
       if(GoAhead==true)
       {
        try  {
        
       //setup connection with database
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/college","root","TANay@99");  
        String query = "insert into teacher (Userid,firstname,lastname,middlename,contact,designation,Experience,Qualification,DOB,gender,maritalstatus) values (?,?,?,?,?,?,?,?,?,?,?) ";
       PreparedStatement preparedStmt = con.prepareStatement(query);
       
         preparedStmt.setString (1, UserID);
         preparedStmt.setString (2, FirstName);
         preparedStmt.setString (3, LastName);
         preparedStmt.setString (4, MiddleName);
         preparedStmt.setString (5, Contact);
         preparedStmt.setString (6, Designation);
         preparedStmt.setString (7, Experience);
         preparedStmt.setString (8, Quali);
         preparedStmt.setString (9, DOB);
         preparedStmt.setString (10, Gender);
         preparedStmt.setString (11, MS);
        
          preparedStmt.execute();
      
        CreateAccount4 c4= new CreateAccount4(UserID,loginAs);
        c4.setVisible(true);
        this.setVisible(false);//Proceed to next page
       
     }
           catch(Exception e) 
     {
         JOptionPane.showMessageDialog(null,
         "Please fill details Correctly & Completly."); 
     }
       }
    }//GEN-LAST:event_jButton1MousePressed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
