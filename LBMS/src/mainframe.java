import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mainframe.java
 *
 * Created on 11 Jul, 2020, 7:07:01 PM
 */

/**
 *
 * @author madhu
 */
public class mainframe extends javax.swing.JFrame {


    /** Creates new form mainframe */
    public mainframe() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginFrame = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pf1 = new javax.swing.JPasswordField();
        usertf1 = new javax.swing.JTextField();
        Signup_Frame = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nametf1 = new javax.swing.JTextField();
        usernametf1 = new javax.swing.JTextField();
        pwdf1 = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        Issue_frame = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        return_frame = new javax.swing.JFrame();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        pay_frame = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        dashboard = new javax.swing.JFrame();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton7.setText("Sign In ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        javax.swing.GroupLayout LoginFrameLayout = new javax.swing.GroupLayout(LoginFrame.getContentPane());
        LoginFrame.getContentPane().setLayout(LoginFrameLayout);
        LoginFrameLayout.setHorizontalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFrameLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(261, 261, 261))
                    .addGroup(LoginFrameLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usertf1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGap(179, 179, 179))))
        );
        LoginFrameLayout.setVerticalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginFrameLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usertf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(30, 30, 30))
        );

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14));
        jLabel4.setText("Enter Your Name");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14));
        jLabel5.setText("Enter Your username");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14));
        jLabel6.setText("Enter Your Password");

        nametf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametf1ActionPerformed(evt);
            }
        });

        pwdf1.setText("jPasswordField2");

        jButton8.setText("Create Account");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Signup_FrameLayout = new javax.swing.GroupLayout(Signup_Frame.getContentPane());
        Signup_Frame.getContentPane().setLayout(Signup_FrameLayout);
        Signup_FrameLayout.setHorizontalGroup(
            Signup_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Signup_FrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(Signup_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(Signup_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pwdf1, 0, 0, Short.MAX_VALUE)
                    .addComponent(usernametf1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(nametf1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(70, 70, 70))
            .addGroup(Signup_FrameLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton8)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        Signup_FrameLayout.setVerticalGroup(
            Signup_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Signup_FrameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Signup_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nametf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Signup_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernametf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Signup_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pwdf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(jButton8)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jButton9.setText("ISSUE BOOK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "'0011','FAMOUS FIVE PART-1", "'0012','FAMOUS FIVE PART-1", "'0021','FAMOUS FIVE PART-1", "'0022','FAMOUS FIVE PART-1", "'0031','FAMOUS FIVE PART-1", "'0032','FAMOUS FIVE PART-1", "'0041','FAMOUS FIVE PART-1", "'0042','FAMOUS FIVE PART-1", "'0051','FAMOUS FIVE PART-1", "'0052','FAMOUS FIVE PART-1", "'0011','SECRET SEVEN-1", "'1012','SECRET SEVEN-1", "'1021','SECRET SEVEN-2", "'1022','SECRET SEVEN-2", "'1031','SECRET SEVEN-3", "'1032','SECRET SEVEN-3", "'0011','SECRET SEVEN-1'0011','SECRET SEVEN-1" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JK ROWLING", "ENID BLYTON" }));

        jLabel8.setText("BOOK NAME");

        jLabel9.setText("AUTHOR NAME");

        jLabel10.setText("ISSUE PORTAL");

        javax.swing.GroupLayout Issue_frameLayout = new javax.swing.GroupLayout(Issue_frame.getContentPane());
        Issue_frame.getContentPane().setLayout(Issue_frameLayout);
        Issue_frameLayout.setHorizontalGroup(
            Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Issue_frameLayout.createSequentialGroup()
                .addGroup(Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Issue_frameLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 536, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addGroup(Issue_frameLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(51, 51, 51)
                        .addGroup(Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Issue_frameLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        Issue_frameLayout.setVerticalGroup(
            Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Issue_frameLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel10)
                .addGap(192, 192, 192)
                .addGroup(Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(60, 60, 60)
                .addGroup(Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(Issue_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap())
        );

        jButton11.setText("ISSUE BOOK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("BACK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel11.setText("RETURN BOOK PORTAL");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "'0011','FAMOUS FIVE PART-1", "'0012','FAMOUS FIVE PART-1", "'0021','FAMOUS FIVE PART-1", "'0022','FAMOUS FIVE PART-1", "'0031','FAMOUS FIVE PART-1", "'0032','FAMOUS FIVE PART-1", "'0041','FAMOUS FIVE PART-1", "'0042','FAMOUS FIVE PART-1", "'0051','FAMOUS FIVE PART-1", "'0052','FAMOUS FIVE PART-1", "'0011','SECRET SEVEN-1", "'1012','SECRET SEVEN-1", "'1021','SECRET SEVEN-2", "'1022','SECRET SEVEN-2", "'1031','SECRET SEVEN-3", "'1032','SECRET SEVEN-3", "'0011','SECRET SEVEN-1'0011','SECRET SEVEN-1" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JK ROWLING", "ENID BLYTON" }));

        javax.swing.GroupLayout return_frameLayout = new javax.swing.GroupLayout(return_frame.getContentPane());
        return_frame.getContentPane().setLayout(return_frameLayout);
        return_frameLayout.setHorizontalGroup(
            return_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, return_frameLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 371, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(72, 72, 72))
            .addGroup(return_frameLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel11)
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(return_frameLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(return_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(126, 126, 126)
                .addGroup(return_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        return_frameLayout.setVerticalGroup(
            return_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(return_frameLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel11)
                .addGap(114, 114, 114)
                .addGroup(return_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(return_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(return_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, return_frameLayout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, return_frameLayout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(43, 43, 43))))
        );

        jLabel7.setText("COMING SOON");

        javax.swing.GroupLayout pay_frameLayout = new javax.swing.GroupLayout(pay_frame.getContentPane());
        pay_frame.getContentPane().setLayout(pay_frameLayout);
        pay_frameLayout.setHorizontalGroup(
            pay_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pay_frameLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel7)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pay_frameLayout.setVerticalGroup(
            pay_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pay_frameLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel7)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jButton13.setText("ISSUE BOOK");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("LOG OUT");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("PAYMENT");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("RETURN BOOK");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel14.setText("DASH BOARD");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard.getContentPane());
        dashboard.getContentPane().setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel14)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGap(62, 62, 62)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        jLabel1.setText("Library Management System");

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Monospaced", 0, 14));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
Signup_Frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        LoginFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Connection con = null;
Statement stmt = null;
ResultSet rs = null;

        String Name= nametf1.getText();
       String Username= usernametf1.getText();
       String Password = new String(pwdf1.getPassword());
try{
    con = DriverManager.getConnection("jdbc:mysql://localhost/LBMS", "root", "123456");
   stmt = con.createStatement();
    String sql = "INSERT INTO User(Name, UserID, Pass)VALUES ('" + Name + "', '" + Username + "', '" + Password + "');";
    System.out.println(sql);
    stmt.executeUpdate(sql);
    JOptionPane.showMessageDialog(rootPane, "Congrats! Account created successfully!");
    Signup_Frame.dispose();
    this.setVisible(true);
    stmt.close();
    con.close();
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void nametf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametf1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

         Connection con = null;
Statement stmt = null;
ResultSet rs = null;

        
        String uid = usertf1.getText();
String pwd = new String(pf1.getPassword());
try{
    con = DriverManager.getConnection("jdbc:mysql://localhost/LBMS", "root", "123456");
    stmt = con.createStatement();
    String sql = "SELECT Pass FROM User WHERE UserID = '" + uid + "';";
    System.out.println(sql);
    rs = stmt.executeQuery(sql);
    rs.first();
    String pass = rs.getString(1);
    if(pwd.equals(pass)){
        LoginFrame.dispose();
        mainscreen.setVisible(true);
    }
    else{
    JOptionPane.showMessageDialog(null, "See, your userID or password is wrong. Try again!");
    }
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Issue_frame;
    private javax.swing.JFrame LoginFrame;
    private javax.swing.JFrame Signup_Frame;
    private javax.swing.JFrame dashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametf1;
    private javax.swing.JFrame pay_frame;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pwdf1;
    private javax.swing.JFrame return_frame;
    private javax.swing.JTextField usernametf1;
    private javax.swing.JTextField usertf1;
    // End of variables declaration//GEN-END:variables

}
