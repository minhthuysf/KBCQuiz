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
public class FormAccount extends javax.swing.JFrame  {
    private static Connection conn;
    
   
    /**
     * Creates new form FormAccount
     */

    
    public FormAccount() {
        initComponents();
        setIcon();
        showInfo();
        
    }
    public void showInfo(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
             String show = "select * from Player where Playername=?";
             PreparedStatement pst = conn.prepareStatement(show);
             pst.setString(1,LoginForm.namelogin.getText());
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                 String displayInfo = "select * from Player where Playername=? ";
                 PreparedStatement pst1 = conn.prepareStatement(displayInfo);
                 pst1.setString(1, LoginForm.namelogin.getText());
                 ResultSet result = pst1.executeQuery();
                 if(result.next()){
                     String namep = result.getString(1);
                     String genderp = result.getString(3);
                     String addressp = result.getString(4);
                     String emailp = result.getString(5);
                     String birthdayp = result.getString(6);
                     String prizemoney = result.getString(7);
                     showname.setText(namep);
                     showgender.setText(genderp);
                     showaddress.setText(addressp);
                     showemail.setText(emailp);
                     showbirthday.setText(birthdayp);
                     showprizemoney.setText(prizemoney);
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
        jPanel3 = new javax.swing.JPanel();
        showname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gotit = new javax.swing.JButton();
        showgender = new javax.swing.JLabel();
        showbirthday = new javax.swing.JLabel();
        showemail = new javax.swing.JLabel();
        showaddress = new javax.swing.JLabel();
        showprizemoney = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KBC Quiz");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255,255,255,150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showname.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel3.add(showname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 400, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel3.setText("Name:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel4.setText("Gender:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel5.setText("Birthday:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel6.setText("Email:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel7.setText("Address:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel8.setText("Prize Money:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setText("My Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel2)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        gotit.setBackground(new java.awt.Color(153, 255, 153));
        gotit.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        gotit.setText("Got it");
        gotit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotitActionPerformed(evt);
            }
        });
        jPanel3.add(gotit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 120, 40));

        showgender.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel3.add(showgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 400, 30));

        showbirthday.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel3.add(showbirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 410, 30));

        showemail.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel3.add(showemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 410, 30));

        showaddress.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel3.add(showaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 400, 30));

        showprizemoney.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jPanel3.add(showprizemoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 410, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 630, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assset/sky1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotitActionPerformed
        new menuForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gotitActionPerformed

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
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gotit;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel showaddress;
    private javax.swing.JLabel showbirthday;
    private javax.swing.JLabel showemail;
    private javax.swing.JLabel showgender;
    public static javax.swing.JLabel showname;
    private javax.swing.JLabel showprizemoney;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));
    }
}
