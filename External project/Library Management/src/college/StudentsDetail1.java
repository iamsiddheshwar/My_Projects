package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Tanay
 */
public class StudentsDetail1 extends javax.swing.JFrame {

    String UserID,loginAs,year,tablename;
     boolean Sem1=false,Sem2=false;
     int batch;
     int[] show={0};
      
    public StudentsDetail1(String _UserID,String _loginAs) {
        this.UserID = _UserID;
        this.loginAs=_loginAs;
        initComponents();
           hideall();
           show = new int[10]; 
           
    
    
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
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
        jLabel3.setText("Filter result");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 20, 270, 70);

        jLabel4.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel4.setText("Filter 2: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(550, 160, 150, 40);

        jComboBox1.setBackground(new java.awt.Color(221, 221, 221));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "First year (FE)", "Second year (SE)", "Third year (TE)", "Fourth year (BE)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(110, 270, 310, 50);

        jTextField1.setBackground(new java.awt.Color(221, 221, 221));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(590, 260, 310, 50);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Search by PRN :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, 210, 230, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Of students currently in :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 220, 280, 50);

        jButton1.setBackground(new java.awt.Color(221, 221, 221));
        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jButton1.setText("Show result");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 500, 210, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jButton2.setText("Check if PRN exists");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(720, 320, 180, 40);

        jButton3.setBackground(new java.awt.Color(221, 221, 221));
        jButton3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jButton3.setText("Show result");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(640, 500, 210, 50);

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton1.setText(" FE Sem2");
        jRadioButton1.setOpaque(false);
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(260, 330, 107, 25);

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton2.setText("SE Sem2");
        jRadioButton2.setOpaque(false);
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(260, 360, 107, 25);

        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton3.setText("FE Sem1");
        jRadioButton3.setOpaque(false);
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(140, 330, 107, 25);

        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton4.setText("SE Sem1");
        jRadioButton4.setOpaque(false);
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(140, 360, 107, 25);

        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton5.setText("TE Sem1");
        jRadioButton5.setOpaque(false);
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(140, 390, 107, 25);

        jRadioButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton6.setText("TE Sem2");
        jRadioButton6.setOpaque(false);
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(260, 390, 107, 25);

        jRadioButton7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton7.setText("BE Sem1");
        jRadioButton7.setOpaque(false);
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(140, 420, 107, 25);

        jRadioButton8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton8.setText("BE Sem2");
        jRadioButton8.setOpaque(false);
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(260, 420, 107, 25);

        jRadioButton9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton9.setText("FE Sem2");
        jRadioButton9.setOpaque(false);
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(800, 360, 107, 25);

        jRadioButton10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton10.setText("FE Sem1");
        jRadioButton10.setOpaque(false);
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(640, 360, 100, 31);

        jRadioButton11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton11.setText("SE Sem1");
        jRadioButton11.setOpaque(false);
        jPanel1.add(jRadioButton11);
        jRadioButton11.setBounds(640, 390, 100, 31);

        jRadioButton12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton12.setText("SE Sem2");
        jRadioButton12.setOpaque(false);
        jPanel1.add(jRadioButton12);
        jRadioButton12.setBounds(800, 390, 107, 25);

        jRadioButton13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton13.setText("TE Sem1");
        jRadioButton13.setOpaque(false);
        jPanel1.add(jRadioButton13);
        jRadioButton13.setBounds(640, 420, 100, 31);

        jRadioButton14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton14.setText("TE Sem2");
        jRadioButton14.setOpaque(false);
        jPanel1.add(jRadioButton14);
        jRadioButton14.setBounds(800, 420, 107, 25);

        jRadioButton15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton15.setText("BE Sem1");
        jRadioButton15.setOpaque(false);
        jPanel1.add(jRadioButton15);
        jRadioButton15.setBounds(640, 450, 100, 31);

        jRadioButton16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton16.setText("BE Sem2");
        jRadioButton16.setOpaque(false);
        jPanel1.add(jRadioButton16);
        jRadioButton16.setBounds(800, 450, 107, 25);

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(550, 200, 380, 370);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(80, 200, 380, 370);

        jLabel7.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jLabel7.setText("Filter 1: ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 160, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        jLabel1.setText("--select--,First year (FE),Second year (SE),Third year (TE),Fourth year (BE)");
        jLabel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        if (year.equals("--select--") )
        {
            JOptionPane.showMessageDialog(null,"No year selected");
        }
        else if(jRadioButton1.isSelected()||jRadioButton2.isSelected()||jRadioButton3.isSelected()||jRadioButton4.isSelected()||jRadioButton5.isSelected()||jRadioButton6.isSelected()||jRadioButton7.isSelected()||jRadioButton8.isSelected())
        {
           if(jRadioButton3.isSelected())
           {show[1]=1;}
           if(jRadioButton1.isSelected())
           {show[2]=1;}
           if(jRadioButton4.isSelected())
           {show[3]=1;}
           if(jRadioButton2.isSelected())
           {show[4]=1;}
           if(jRadioButton5.isSelected())
           {show[5]=1;}
           if(jRadioButton6.isSelected())
           {show[6]=1;}
            if(jRadioButton7.isSelected())
           {show[7]=1;}
            if(jRadioButton8.isSelected())
           {show[8]=1;}
            
            DisplayResult d = new DisplayResult(show,year,UserID,loginAs);
            d.setVisible(true);
            this.dispose();
         
        }
        else
        {JOptionPane.showMessageDialog(null,"Select at least 1 semester");}
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        boolean present=checkprn();
        if (present==false)
        {
            JOptionPane.showMessageDialog(null,"PRN not present.");
        }
        else
        {
            
        boolean sem1result=true,sem2result=true;
        hideall();
      Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
       int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
      int currentYear = localCalendar.get(Calendar.YEAR);
    //  int currentMonth=7;
    
        if((currentYear-batch)<0)
        {
            
        if ((currentMonth>=8 && currentMonth <=12))
        {
            sem1result=false;
        }
        if ((currentMonth>=1 && currentMonth <7))
        {
            sem2result=false;
        }
        
        if (year.equals("First year (FE)")&& sem1result==true &&sem2result==false)
        {jRadioButton10.setVisible(true);}
        else if (year.equals("Second year (SE)") && sem1result==true &&sem2result==false)
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);}
        else if (year.equals("Third year (TE)")&& sem1result==true&&sem2result==false)
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton13.setVisible(true);jRadioButton12.setVisible(true);}
        else if (year.equals("Fourth year (BE)") && sem1result==true&&sem2result==false)
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton13.setVisible(true);jRadioButton12.setVisible(true);jRadioButton14.setVisible(true);jRadioButton15.setVisible(true);}
        
        
        else if (year.equals("Second year (SE)") && sem1result==false )
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);}
        else if (year.equals("Third year (TE)") && sem1result==false )
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton12.setVisible(true);}
        else if (year.equals("Fourth year (BE)") && sem1result==false )
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton12.setVisible(true);jRadioButton13.setVisible(true);jRadioButton14.setVisible(true);}
        else if(year.equals("First year (FE)")&& sem1result==false)
        {
            JOptionPane.showMessageDialog(null,"No result found for FE.\nAs the result of 1st sem is declared in January ");
        }
        else if(year.equals("Fourth year (BE)")&& sem2result==true &&sem1result==true)
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton13.setVisible(true);jRadioButton12.setVisible(true);jRadioButton14.setVisible(true);jRadioButton15.setVisible(true);jRadioButton16.setVisible(true);}
        else if(year.equals("First year (FE)")&& sem2result==true &&sem1result==true)
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);}
        else if(year.equals("Second year (SE)")&& sem2result==true &&sem1result==true)
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton12.setVisible(true);}
        else if(year.equals("Third year (TE)")&& sem2result==true &&sem1result==true)
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton13.setVisible(true);jRadioButton12.setVisible(true);jRadioButton14.setVisible(true);}
        
        
        }
        
        
    else
        {jRadioButton10.setVisible(true);jRadioButton9.setVisible(true);jRadioButton11.setVisible(true);jRadioButton13.setVisible(true);jRadioButton12.setVisible(true);jRadioButton14.setVisible(true);jRadioButton15.setVisible(true);jRadioButton16.setVisible(true);}
        
        if(jRadioButton9.isSelected()||jRadioButton10.isSelected()||jRadioButton11.isSelected()||jRadioButton12.isSelected()||jRadioButton13.isSelected()||jRadioButton14.isSelected()||jRadioButton15.isSelected()||jRadioButton16.isSelected())
        {
            if(jRadioButton10.isSelected())
           {show[1]=1;}
           if(jRadioButton9.isSelected())
           {show[2]=1;}
           if(jRadioButton11.isSelected())
           {show[3]=1;}
           if(jRadioButton12.isSelected())
           {show[4]=1;}
           if(jRadioButton13.isSelected())
           {show[5]=1;}
           if(jRadioButton14.isSelected())
           {show[6]=1;}
            if(jRadioButton15.isSelected())
           {show[7]=1;}
            if(jRadioButton16.isSelected())
           {show[8]=1;}
        String prn=jTextField1.getText();
        DisplayResultPersonal d = new DisplayResultPersonal(show,year,UserID,loginAs,prn);
        d.setVisible(true);
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Select which semester result you want to see.");
        }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       year = jComboBox1.getSelectedItem().toString();
        jTextField1.setText(""); 
        boolean sem1result=true,sem2result=true;
        hideall();
      Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
    int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
      // int currentMonth=7;
        
        if ((currentMonth>=8 && currentMonth <=12))
        {
            sem1result=false;
        }
        if ((currentMonth>=1 && currentMonth <7))
        {
            sem2result=false;
        }
        
        if (year.equals("First year (FE)")&& sem1result==true &&sem2result==false)
        {jRadioButton3.setVisible(true);}
        else if (year.equals("Second year (SE)") && sem1result==true &&sem2result==false )
        {jRadioButton3.setVisible(true);jRadioButton1.setVisible(true);jRadioButton4.setVisible(true);}
        else if (year.equals("Third year (TE)")&& sem1result==true &&sem2result==false)
        {jRadioButton3.setVisible(true);jRadioButton1.setVisible(true);jRadioButton4.setVisible(true);jRadioButton2.setVisible(true);jRadioButton5.setVisible(true);}
        else if (year.equals("Fourth year (BE)") && sem1result==true &&sem2result==false)
        {jRadioButton3.setVisible(true);jRadioButton1.setVisible(true);jRadioButton4.setVisible(true);jRadioButton2.setVisible(true);jRadioButton5.setVisible(true);jRadioButton6.setVisible(true);jRadioButton7.setVisible(true);}
        
        
        else if (year.equals("Second year (SE)") && sem1result==false )
        {jRadioButton3.setVisible(true);jRadioButton1.setVisible(true);}
        else if (year.equals("Third year (TE)") && sem1result==false )
        {jRadioButton3.setVisible(true);jRadioButton1.setVisible(true);jRadioButton4.setVisible(true);jRadioButton2.setVisible(true);}
        else if (year.equals("Fourth year (BE)") && sem1result==false)
        {jRadioButton3.setVisible(true);jRadioButton1.setVisible(true);jRadioButton4.setVisible(true);jRadioButton2.setVisible(true);jRadioButton5.setVisible(true);jRadioButton6.setVisible(true);}
        else if(year.equals("First year (FE)")&& sem1result==false)
        {
            JOptionPane.showMessageDialog(null,"No result found for FE.\nAs the result of 1st sem is declared in January next year");
        }
        else if(year.equals("Fourth year (BE)")&& sem2result==true && sem1result==true)
       {jRadioButton1.setVisible(true);jRadioButton2.setVisible(true);jRadioButton3.setVisible(true);jRadioButton4.setVisible(true);jRadioButton5.setVisible(true);jRadioButton6.setVisible(true);jRadioButton7.setVisible(true);jRadioButton8.setVisible(true);}
        else if(year.equals("First year (FE)")&& sem2result==true && sem1result==true)
        {jRadioButton1.setVisible(true);jRadioButton3.setVisible(true);}
        else if(year.equals("Second year (SE)")&& sem2result==true && sem1result==true)
        {jRadioButton1.setVisible(true);jRadioButton2.setVisible(true);jRadioButton3.setVisible(true);jRadioButton4.setVisible(true);}
        else if(year.equals("Third year (TE)")&& sem2result==true && sem1result==true)
        {jRadioButton1.setVisible(true);jRadioButton2.setVisible(true);jRadioButton3.setVisible(true);jRadioButton4.setVisible(true);jRadioButton5.setVisible(true);jRadioButton6.setVisible(true);}

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed

        boolean present=checkprn();
        if (present==false)
        {
            JOptionPane.showMessageDialog(null,"PRN not present.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"PRN present.");
        }
        
    }//GEN-LAST:event_jButton2MousePressed

public boolean checkprn()
{ String prn = jTextField1.getText();
hideall();
boolean present=false;
        try{  
                Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/college","root","TANay@99");
                PreparedStatement stmt=con.prepareStatement("select year,batch from student where prn=?");
                stmt.setString (1, prn);
                ResultSet rs=stmt.executeQuery();
                boolean exists=false; 
               
                while (rs.next())
                {
                   year = rs.getString(1);
                   batch = rs.getInt(2);
                   
                   present= true;
                   exists=true; 
                }
                if(exists==false)
                {present=false;}
            }
        catch (Exception e)
        {JOptionPane.showMessageDialog(null, "Error Occured in checking PRN");}
        return present;
}


public void hideall()
{
jRadioButton1.setVisible(false);
    jRadioButton2.setVisible(false);
    jRadioButton3.setVisible(false);
    jRadioButton4.setVisible(false);
    jRadioButton5.setVisible(false);
    jRadioButton6.setVisible(false);
    jRadioButton7.setVisible(false);
    jRadioButton8.setVisible(false);
    jRadioButton9.setVisible(false);
    jRadioButton10.setVisible(false);
    jRadioButton11.setVisible(false);
    jRadioButton12.setVisible(false);
    jRadioButton13.setVisible(false);
    jRadioButton14.setVisible(false);
    jRadioButton15.setVisible(false);
    jRadioButton16.setVisible(false);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
