/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbcquizmt;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class infoAdminAccount extends javax.swing.JFrame {
    private static Connection conn;
    /**
     * Creates new form inforAdminAccount
     */
    public infoAdminAccount() {
        initComponents();
        setIcon();
        showInfo();
    }
    public void showInfo(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
             String show = "select * from Admin where Adminname=?";
             PreparedStatement pst = conn.prepareStatement(show);
             pst.setString(1,LoginForm.namelogin.getText());
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                 String displayInfo = "select * from Admin where Adminname=? ";
                 PreparedStatement pst1 = conn.prepareStatement(displayInfo);
                 pst1.setString(1, LoginForm.namelogin.getText());
                 ResultSet result = pst1.executeQuery();
                 if(result.next()){
                     String namep = result.getString(1);
                     String genderp = result.getString(3);
                     String addressp = result.getString(4);
                     String emailp = result.getString(5);
                     String birthdayp = result.getString(6);
                     
                     shownamea.setText(namep);
                     showgendera.setText(genderp);
                     showaddressa.setText(addressp);
                     showemaila.setText(emailp);
                     showbirthdaya.setText(birthdayp);
                  
                 }
                     
                 
                 
             }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        shownamea = new javax.swing.JLabel();
        showgendera = new javax.swing.JLabel();
        showaddressa = new javax.swing.JLabel();
        showemaila = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        showbirthdaya = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KBC Quiz");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(226,240,240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setText("My Account");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(232, 232, 232))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel3.setText("Name:");
        jLabel3.setAlignmentX(0.5F);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel4.setText("Gender:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel5.setText("Address:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 167, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 214, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel7.setText("Birthday:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 261, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jButton1.setText("Got it");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 120, 40));

        shownamea.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel2.add(shownamea, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 70, 390, 30));

        showgendera.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel2.add(showgendera, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 400, 30));

        showaddressa.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel2.add(showaddressa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 400, 30));

        showemaila.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel2.add(showemaila, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 400, 30));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        showbirthdaya.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel2.add(showbirthdaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 400, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 620, 380));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assset/sky1.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new menuAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(infoAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoAdminAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel showaddressa;
    private javax.swing.JLabel showbirthdaya;
    private javax.swing.JLabel showemaila;
    private javax.swing.JLabel showgendera;
    private javax.swing.JLabel shownamea;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));
    }
}
