
package college;

import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Tanay
 */
public class CreateAccount extends javax.swing.JFrame {

    private final ButtonGroup G;
    public String loginAs;
    
    public CreateAccount() {
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
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Account");
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("HP Simplified Light", 0, 50)); // NOI18N
        jLabel2.setText("Create account - 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 20, 380, 70);

        jLabel3.setFont(new java.awt.Font("HP Simplified Light", 0, 20)); // NOI18N
        jLabel3.setText("Sign up as :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 260, 100, 30);

        jRadioButton1.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jRadioButton1.setText("Teacher");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(720, 300, 150, 50);

        jRadioButton2.setFont(new java.awt.Font("HP Simplified Light", 0, 36)); // NOI18N
        jRadioButton2.setText("Student");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(520, 300, 150, 50);

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 44)); // NOI18N
        jLabel6.setText("Enter username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 380, 350, 50);

        jTextField1.setBackground(new java.awt.Color(221, 221, 221));
        jTextField1.setColumns(5);
        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 30)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(480, 440, 430, 60);

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 0, 44)); // NOI18N
        jLabel7.setText("Enter password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 610, 330, 60);

        jPasswordField1.setBackground(new java.awt.Color(221, 221, 221));
        jPasswordField1.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jPasswordField1.setBorder(null);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(480, 680, 430, 60);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("HP Simplified Light", 0, 18)); // NOI18N
        jButton1.setText("Save and continue");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 830, 210, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Case sensitive");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(830, 730, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backward Arrow.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 30, 60, 50);

        jLabel9.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel9.setText("Set  username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(570, 40, 140, 40);

        jLabel5.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel5.setText("Security details");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(970, 40, 160, 40);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        jButton2.setText("Check avaiblity of username");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(480, 520, 200, 40);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("--------------");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(570, 60, 170, 70);

        jLabel12.setText("Login");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 80, 50, 30);

        jLabel15.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel15.setText("Personal  details");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(760, 40, 160, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Password should have more than 5 characters.");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(480, 720, 320, 60);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Username should be of length 4-15 characters.");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(480, 480, 300, 60);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("Case insensitive");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(820, 490, 120, 40);

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(450, 240, 490, 680);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()==true)
        {
            loginAs= " loginstudent ";
        }//radio student selected
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()==true)
        {
            loginAs= " loginteacher "; 
        }// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         boolean AllGood=true;
    	String Password = String.valueOf(jPasswordField1.getPassword());
    	String  UserID= jTextField1.getText(); 
        UserID=UserID.toLowerCase();
    	int LengthUserID= UserID.length();
    	int LengthPassword=Password.length();
        
    	if(LengthUserID>=4 && LengthUserID<=15)
    	{
    		if(LengthPassword>=5)
                {
    		AllGood=true;
                }
                else
                {
    		AllGood=false;
    		JOptionPane.showMessageDialog(null,"Password should be of atleast 5 characters.");
                }
    	}
    	else{
    		JOptionPane.showMessageDialog(null,"Username should be between '4-15' caharacters.");
    		AllGood=false;
    	}
    	

    	if  (AllGood==true)      
    	{   
    		int cont = JOptionPane.showConfirmDialog(this, "Note: Username cannot be changed in future.\nOnce continued action cannot be revoked.","Continue to create account",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    		if (cont == JOptionPane.YES_OPTION)
    			{AllGood=true;}
    		else{AllGood=false;}      
    		if  (AllGood==true)      
    		{      
    			try
    			{  
        //setup connection with database
    				Class.forName("com.mysql.cj.jdbc.Driver");  
    				Connection con=DriverManager.getConnection(  
    					"jdbc:mysql://localhost:3306/college","root","TANay@99");  

    				boolean alreadyExists= false;
    				PreparedStatement stmt=con.prepareStatement
    				("select * from "+loginAs+" where UserID = ?");
    				stmt.setString(1, UserID);
    				ResultSet rs=stmt.executeQuery(); 
    				while(rs.next())
    				{
    					alreadyExists=true;
    					JOptionPane.showMessageDialog(null,"Username already Exists.\nPlease choose another username"); break;  
    				}
    				if(alreadyExists==false)
    				{
    					if (loginAs== " loginteacher ")
    					{
    						String query = " insert into"+loginAs+"(UserID, Password) values (?, ?)";
    						PreparedStatement preparedStmt = con.prepareStatement(query);
    						preparedStmt.setString (1, UserID);
    						preparedStmt.setString (2, Password);
    						preparedStmt.execute();
    						this.dispose();
    						CreateAccount3 c3 = new CreateAccount3(UserID,loginAs);
    						c3.setVisible(true);
    					}
    					else if (loginAs== " loginstudent ")
    					{
    						String query = " insert into"+loginAs+"(UserID, Password) values (?, ?)";
    						PreparedStatement preparedStmt = con.prepareStatement(query);
    						preparedStmt.setString (1, UserID);
    						preparedStmt.setString (2, Password);
    						preparedStmt.execute();
    						this.dispose();
    						CreateAccount2 c2 = new CreateAccount2(UserID,loginAs);
    						c2.setVisible(true); 
    					}

    				}
    			}
    			catch(Exception e) 
    			{
    				JOptionPane.showMessageDialog(null,
                                "Please fill details completly."); 
    			}
    		}
    	}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        
        Login a = new Login();
        a.setVisible(true);
        this.dispose();// Back to login
    }//GEN-LAST:event_jLabel8MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String UserID= jTextField1.getText();
        int length = UserID.length();
        if (length>=4)
        {
            try
        {
            //set connection with database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college","root","TANay@99");
            
            boolean alreadyExists= false;
            PreparedStatement stmt=con.prepareStatement
            ("select * from "+loginAs+" where UserID = ?");
            stmt.setString(1, UserID);
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                alreadyExists=true;
                JOptionPane.showMessageDialog(null,"Username already Exists.\nPlease choose another username");
            }
            if(alreadyExists==false)
            {JOptionPane.showMessageDialog(null,"Username available.");}
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,
                "Please fill all the details.");
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                "Length of username should be '4-15' characters.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
    	int key=evt.getKeyCode();
    	String username=jTextField1.getText();
    	int LenghtUsername= username.length();
        if((key>=evt.VK_0&&key<=evt.VK_9) || (key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9) || key==evt.VK_BACK_SPACE || (key>=evt.VK_A&&key<=evt.VK_Z) || (key==evt.VK_CAPS_LOCK) || (key==evt.VK_TAB) || (key==evt.VK_PERIOD))
        {
            if(LenghtUsername>15)
            {
    		JOptionPane.showMessageDialog(null,
    			"Length of Username should be '4-15' characters.");
    		jTextField1.setText("");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,
    			"Username consist of letters,numbers and period (.) only.");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        //To check length of password less than 15 characters
        String Password = String.valueOf(jPasswordField1.getPassword());
        int LengthPassword=Password.length();
        if (LengthPassword>15)
        {
            jPasswordField1.setText("");
            JOptionPane.showMessageDialog(null,
    			"Please set password of atmost 15 Characters onyy..");
        }    
        
        
    }//GEN-LAST:event_jPasswordField1KeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
