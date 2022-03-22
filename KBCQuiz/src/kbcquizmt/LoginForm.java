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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static kbcquizmt.register.conn;

/**
 *
 * @author ASUS
 */
public class LoginForm extends javax.swing.JFrame {
  private static Connection conn;
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setIcon();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namelogin = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        passwordlogin = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        goregister = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KBC Quiz");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(226,240,240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        namelogin.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        namelogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(namelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 358, 30));

        login.setBackground(new java.awt.Color(153, 255, 153));
        login.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        login.setText("Login");
        login.setBorder(null);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 105, 40));

        passwordlogin.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        passwordlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(passwordlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 358, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel5.setText("You haven't an account?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        goregister.setBackground(new java.awt.Color(0, 0, 0));
        goregister.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        goregister.setForeground(new java.awt.Color(0, 204, 204));
        goregister.setText("Register");
        goregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goregisterMouseClicked(evt);
            }
        });
        jPanel2.add(goregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 84, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setText("Login");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 6, -1, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 550, 320));

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

    private void goregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goregisterMouseClicked
        new register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goregisterMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       
       
        try{           
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
              if(namelogin.getText().equals("") && passwordlogin.getText().equals("")){
                  JOptionPane.showMessageDialog(this, "Please enter name and password!");
              }
              else{
              String checkexistP="select * from Player where Playername=?";
              PreparedStatement pst4 = conn.prepareStatement(checkexistP);
              pst4.setString(1,namelogin.getText());
              ResultSet result4 = pst4.executeQuery(); String checkexistA="select * from Admin where Adminname=?";
              PreparedStatement pst5 = conn.prepareStatement(checkexistA);
              pst5.setString(1,namelogin.getText());
              ResultSet result5 = pst5.executeQuery();
              if(!result4.next() && !result5.next()){
                  JOptionPane.showMessageDialog(this, "You hasn't account!");
                  namelogin.setText("");
                  passwordlogin.setText("");
              }
   
              else{
            

             
            
              String checkP="select * from Player where Playername=?";
              PreparedStatement pst2 = conn.prepareStatement(checkP);
              pst2.setString(1,namelogin.getText());
              ResultSet result2 = pst2.executeQuery();
               
              if(result2.next()){
                 String status = result2.getString(8);
                 if(status.equals("Disable")){
                 
             
                     JOptionPane.showMessageDialog(this, "Your account not exist!");
                    namelogin.setText("");
                  passwordlogin.setText("");
                  
              }
             if(status.equals("Enable")){
                           String loginPlayer = "select * from Player where Playername=? and Password =?";
                                        PreparedStatement pst = conn.prepareStatement(loginPlayer);
               pst.setString(1, namelogin.getText());
              pst.setString(2, passwordlogin.getText());
                ResultSet result = pst.executeQuery();
                 if(result.next()){               
                   new menuForm().setVisible(true);
                    this.setVisible(false);
                    menuForm.hiname.setText(namelogin.getText());
                 }
                 else{

                   JOptionPane.showMessageDialog(null, "Name and Password didn't matched!");
                  namelogin.setText("");
                  passwordlogin.setText("");
                 }
                 
                  }
                  }
              
            
            String checkA="select * from Admin where Adminname=?";
              PreparedStatement pst3 = conn.prepareStatement(checkA);
              pst3.setString(1,namelogin.getText());
              ResultSet result3 = pst3.executeQuery();
              
              if(result3.next()){
                 String status = result3.getString(7);
                  if(status.equals("Disable")){
                     JOptionPane.showMessageDialog(this, "Your account not exist!");
                       namelogin.setText("");
                       passwordlogin.setText("");
                  }
                 if(status.equals("Enable")){
                     String loginAdmin = "select * from Admin where Adminname =? and Password =?";

                      PreparedStatement pst1 = conn.prepareStatement(loginAdmin);

                      pst1.setString(1, namelogin.getText());
                      pst1.setString(2, passwordlogin.getText());

                      ResultSet result1 = pst1.executeQuery();
                        if(result1.next()){               
                   new menuAdmin().setVisible(true);
                    this.setVisible(false);
                    menuForm.hiname.setText(namelogin.getText());
                 }
                        else{
                   JOptionPane.showMessageDialog(null, "Name and Password didn't matched!");
                  namelogin.setText("");
                  passwordlogin.setText("");
                          }          
                  }
                       
                  }
             
                  
              
                
              }
              }
              
              }
       catch(Exception ex){
                    System.out.println(ex.getMessage());
                    
       }
    
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    private void setIcon() {
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel goregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton login;
    public static javax.swing.JTextField namelogin;
    private javax.swing.JPasswordField passwordlogin;
    // End of variables declaration//GEN-END:variables
}