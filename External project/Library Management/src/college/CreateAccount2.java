
package college;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Tanay
 */

public class CreateAccount2 extends javax.swing.JFrame {

    /**
     * Creates\ new form CreateAccount2
     */
    private final ButtonGroup G;
    String UserID,loginAs,Gender="Unknown",Year,DOB;
    int CurrentYear,batch;
    public CreateAccount2(String _UserID,String _loginAs) {
      
        initComponents();
        this.UserID = _UserID;
        this.loginAs = _loginAs;
        G = new ButtonGroup();
        G.add(jRadioButton1);
        G.add(jRadioButton2);
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
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal details");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("HP Simplified Light", 0, 50)); // NOI18N
        jLabel3.setText("Create account - 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 20, 370, 70);

        jTextField1.setBackground(new java.awt.Color(221, 221, 221));
        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 330, 230, 40);

        jTextField2.setBackground(new java.awt.Color(221, 221, 221));
        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(470, 330, 230, 40);

        jTextField5.setBackground(new java.awt.Color(221, 221, 221));
        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(780, 330, 230, 40);

        jTextField6.setBackground(new java.awt.Color(221, 221, 221));
        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField6.setBorder(null);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(170, 460, 230, 40);

        jComboBox2.setBackground(new java.awt.Color(221, 221, 221));
        jComboBox2.setFont(new java.awt.Font("HP Simplified Light", 1, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "First year (FE)", "Second year (SE)", "Third year (TE)", "Fourth year (BE)" }));
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setOpaque(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(470, 460, 230, 40);

        jTextField3.setBackground(new java.awt.Color(221, 221, 221));
        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextField3.setBorder(null);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 590, 230, 40);

        jRadioButton2.setFont(new java.awt.Font("HP Simplified Light", 1, 24)); // NOI18N
        jRadioButton2.setText("   F");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(780, 590, 60, 40);

        jRadioButton1.setFont(new java.awt.Font("HP Simplified Light", 1, 24)); // NOI18N
        jRadioButton1.setText("   M");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(870, 590, 80, 40);

        jLabel18.setText("*By continuing you agree that 'the information given is true and best of your knowledge'.");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(320, 830, 510, 20);

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
        jButton1.setBounds(480, 870, 170, 50);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("*All fields are compulsary*");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(830, 680, 220, 50);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("Enter the details");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(130, 230, 130, 30);

        jLabel9.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel9.setText("Set  username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(570, 40, 140, 40);

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

        jDateChooser2.setBackground(new java.awt.Color(221, 221, 221));
        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jDateChooser2.setInheritsPopupMenu(true);
        jDateChooser2.setNextFocusableComponent(jButton1);
        jPanel1.add(jDateChooser2);
        jDateChooser2.setBounds(470, 590, 240, 40);

        jLabel5.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel5.setText("Security details");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(970, 40, 160, 40);

        jComboBox1.setBackground(new java.awt.Color(221, 221, 221));
        jComboBox1.setFont(new java.awt.Font("HP Simplified Light", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "01", "02", "03" }));
        jComboBox1.setBorder(null);
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(780, 460, 230, 40);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(238, 238, 238));
        jTextArea1.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("First name\t\tMiddle name\t\tLast name\n\n\n\nPRN\t\tYear\t\tDivision\n\n\n\nContact\t\tDate of Birth\t\tGender\n\n\n\n");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        jPanel1.add(jTextArea1);
        jTextArea1.setBounds(170, 290, 910, 380);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(130, 260, 920, 470);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel1.setText("name");
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(860, 550, 50, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()==true)
        {
            Gender= "Female";
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()==true)
        {
            Gender= "Male";
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        boolean GoAhead=true;
        String FirstName= jTextField1.getText();
        String MiddleName= jTextField2.getText();
        String LastName= jTextField5.getText();
        String PRN= jTextField6.getText();
        String Contact= jTextField3.getText();
        if(FirstName.equals("") || MiddleName.equals("") || LastName.equals("") || PRN.equals("") || Contact.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Fill details completly.");
            GoAhead=false;
        }
        String Year =jComboBox2.getSelectedItem().toString();
        if (Year.equals("--select--"))
        {
            JOptionPane.showMessageDialog(null, "Select your study year");
            GoAhead=false;
        }
        String Division =jComboBox1.getSelectedItem().toString();
        if (Division.equals("--select--"))
        {
            JOptionPane.showMessageDialog(null, "Select your division");
            GoAhead=false;
        }
        long length= Long.parseLong(jTextField3.getText());
        if(length<1000000000)
        {
            JOptionPane.showMessageDialog(null, "Incorrect mobile number.");
            GoAhead=false;
        }
        if(Gender.equals("Unknown"))
        {
            JOptionPane.showMessageDialog(null, "Select gender.");
            GoAhead=false;
        }
        try{
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd");
        jTextField4.setText(df.format(jDateChooser2.getDate()));
        DOB =jTextField4.getText();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, "Enter date of birth." );GoAhead=false;}
        
        if(GoAhead==true)
        {
        try  
        {
            
        //setup connection with database
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/college","root","TANay@99");  
        
        String query = "select year(curdate())";
        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet rs=stmt.executeQuery();
      
        
        while(rs.next())
            {   
                CurrentYear =rs.getInt(1);
                
                if(Year.equals("First year (FE)"))
                {batch=CurrentYear+4;}
                else if(Year.equals("Second year (SE)"))
                {batch=CurrentYear+3;}
                else if(Year.equals("Third year (TE)"))
                {batch=CurrentYear+2;}
                else if(Year.equals("Fourth year (BE)"))
                {batch=CurrentYear+1;}
                
            }
        query = "insert into student (UserID,FirstName,LastName,MiddleName,"
                + "Contact,PRN,Year,Batch,DOB,Division,Gender) "
                + "values (?,?,?,?,?,?,?,?,?,?,?) ";
         PreparedStatement preparedStmt = con.prepareStatement(query);
         preparedStmt.setString (1, UserID);
         preparedStmt.setString (2, FirstName);
         preparedStmt.setString (3, LastName);
         preparedStmt.setString (4, MiddleName);
         preparedStmt.setString (5, Contact);
         preparedStmt.setString (6, PRN);
         preparedStmt.setString (7, Year);
         preparedStmt.setInt    (8, batch);
         preparedStmt.setString (9, DOB);
         preparedStmt.setString (10, Division);
         preparedStmt.setString (11, Gender);
         preparedStmt.execute();
        
        CreateAccount4 c4= new CreateAccount4(UserID,loginAs);
        c4.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
       
        }
           catch(Exception e) 
     {
         JOptionPane.showMessageDialog(null,
         "Please fill details Correctly & Completly."); 
     }
     }
        
        
    
    }//GEN-LAST:event_jButton1MousePressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        //Validate first name
        int key=evt.getKeyCode();
        if(!((key>=evt.VK_A&&key<=evt.VK_Z)||(key==evt.VK_SHIFT)||(key==evt.VK_CAPS_LOCK)||(key==evt.VK_TAB)||(key==evt.VK_BACK_SPACE)))
        {
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null, "Only letters allowed");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
         //Validate Middle name
        int key=evt.getKeyCode();
        if(!((key>=evt.VK_A&&key<=evt.VK_Z)||(key==evt.VK_SHIFT)||(key==evt.VK_CAPS_LOCK)||(key==evt.VK_TAB)||(key==evt.VK_BACK_SPACE)))
        {
            jTextField2.setText("");
            JOptionPane.showMessageDialog(null, "Only letters allowed");
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
         //Validate Last name
        int key=evt.getKeyCode();
        if(!((key>=evt.VK_A&&key<=evt.VK_Z)||(key==evt.VK_SHIFT)||(key==evt.VK_CAPS_LOCK)||(key==evt.VK_TAB)||(key==evt.VK_BACK_SPACE)))
        {
            jTextField3.setText("");
            JOptionPane.showMessageDialog(null, "Only letters allowed");
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        //Validate contact number
        int key=evt.getKeyCode();
        if((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||key==evt.VK_BACK_SPACE)
        {
            long length= Long.parseLong(jTextField3.getText());
            if (length>9999999999L)
            {
                JOptionPane.showMessageDialog(null, "Number cannot be longer than 10 digits");
                jTextField3.setText("");
            }
            
        }
        else
        {
            jTextField3.setText("");
            JOptionPane.showMessageDialog(null, "Only digits are allowed");
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String Year =jComboBox2.getSelectedItem().toString();
        if (Year.equals("--select--"))
        {
            JOptionPane.showMessageDialog(null, "Select your study year");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String Division =jComboBox1.getSelectedItem().toString();
        if (Division.equals("--select--"))
        {
            JOptionPane.showMessageDialog(null, "Select your division");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // Check PRN it only contains letters and number
         int key=evt.getKeyCode();
        if( (key>=evt.VK_0&&key<=evt.VK_9) || (key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9) || key==evt.VK_BACK_SPACE || (key>=evt.VK_A&&key<=evt.VK_Z) || (key==evt.VK_CAPS_LOCK) || (key==evt.VK_TAB) )
        {
            String PRN= jTextField6.getText();
            int LengthPRN = PRN.length();
            if(LengthPRN>10)
            {
                jTextField6.setText("");
                JOptionPane.showMessageDialog(null, "PRN cannot be longer than 10 characters.");
            }
        }
        else
        {
            jTextField6.setText("");
            JOptionPane.showMessageDialog(null, "PRN consist of leters and numbers only.");
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
