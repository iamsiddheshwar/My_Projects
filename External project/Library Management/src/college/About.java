package college;

/**
 *
 * @author Tanay
 */
public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("HP Simplified Light", 0, 48)); // NOI18N
        jLabel2.setText("About title");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 10, 300, 70);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel3.setText("College Management System");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 110, 490, 60);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(238, 238, 238));
        jTextArea1.setFont(new java.awt.Font("HP Simplified Light", 0, 22)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("A Database Management System developed using Java and Swing for the appliocation interface and SQL as a database,\n to ease the managmenet of collegerelated affairs. Students and teachers can create account whhich will be forwarded to \nthe HOD for verification.HOD can accept or reject the applocation for creation of a account.\nStudnet's dashboard consists of his/her details,noticeboard and respective results.Student can view only their respective data.\nNone of the field iseditable bythe student.\nTeacher's dashboard consists of result and noticeboard. Teacher can only post message on notice board which can be viewed \nby all the participants.Teacher can update the result of students via PRN or in group.\nHOD is at top of this heirarcy model he/she can update result of student, post OR delete message from noticeboard.\nEvery message on notice board is available for 10 days only.");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        jPanel1.add(jTextArea1);
        jTextArea1.setBounds(30, 170, 1130, 310);

        jLabel4.setFont(new java.awt.Font("HP Simplified Light", 0, 48)); // NOI18N
        jLabel4.setText("About us...");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 500, 220, 80);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(238, 238, 238));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("HP Simplified Light", 0, 24)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("\tTanay D. Patel\t\tKunal Singh\t\tAmmar Khan\n\t307165\t\t307167\t\t307166\n\tT.E. (IT)\t\tT.E. (IT)\t\tT.E. (IT)");
        jTextArea2.setBorder(null);
        jTextArea2.setOpaque(false);
        jPanel1.add(jTextArea2);
        jTextArea2.setBounds(110, 800, 1020, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanay\\Downloads\\my pic.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 600, 110, 140);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Backward Arrow.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 20, 60, 60);

        jLabel10.setText("Home");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 70, 50, 30);

        jLabel1.setBackground(new java.awt.Color(227, 227, 227));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        this.dispose();
        Welcome a= new Welcome();
        a.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
