/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbcquizmt;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static kbcquizmt.menuForm.hiname;

/**
 *
 * @author ASUS
 */
public class menuAdmin extends javax.swing.JFrame {
private static Connection conn;
    /**
     * Creates new form menuAdmin
     */
    public menuAdmin() {
        initComponents();
        setIcon();
        showName();
    }
    public void showName(){
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
                     hiname.setText(namep);                    
                 }     
             }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
     public void setColor(JPanel c){
        c.setBackground(new Color(204,255,204));
    }
    public void resetColor(JPanel c){
        c.setBackground(Color.white);
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hiname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRoot = new javax.swing.JPanel();
        adminList = new javax.swing.JPanel();
        clickA = new javax.swing.JLabel();
        questionList = new javax.swing.JPanel();
        clickQ = new javax.swing.JLabel();
        resultList = new javax.swing.JPanel();
        clickR = new javax.swing.JLabel();
        myAccount = new javax.swing.JPanel();
        clickMA = new javax.swing.JLabel();
        logOut = new javax.swing.JPanel();
        clickL = new javax.swing.JLabel();
        playerList = new javax.swing.JPanel();
        clickP = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Menu Admin - KBC Quiz");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255,255,255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setText("Welcome ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        hiname.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jPanel2.add(hiname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 270, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel4.setText("To");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assset/logokbcquiz.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 310, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 510, 370));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 530));

        panelRoot.setBackground(new java.awt.Color(255, 255, 255));
        panelRoot.setForeground(new java.awt.Color(255, 255, 255));
        panelRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminList.setBackground(new java.awt.Color(255, 255, 255));
        adminList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminListMouseExited(evt);
            }
        });

        clickA.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        clickA.setText("Manage Admin Account");
        clickA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickAMouseExited(evt);
            }
        });

        javax.swing.GroupLayout adminListLayout = new javax.swing.GroupLayout(adminList);
        adminList.setLayout(adminListLayout);
        adminListLayout.setHorizontalGroup(
            adminListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminListLayout.setVerticalGroup(
            adminListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminListLayout.createSequentialGroup()
                .addComponent(clickA)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        panelRoot.add(adminList, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 190, 50));

        questionList.setBackground(new java.awt.Color(255, 255, 255));
        questionList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                questionListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                questionListMouseExited(evt);
            }
        });

        clickQ.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        clickQ.setText("Manage Question List");
        clickQ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickQMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickQMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickQMouseExited(evt);
            }
        });

        javax.swing.GroupLayout questionListLayout = new javax.swing.GroupLayout(questionList);
        questionList.setLayout(questionListLayout);
        questionListLayout.setHorizontalGroup(
            questionListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickQ, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        questionListLayout.setVerticalGroup(
            questionListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionListLayout.createSequentialGroup()
                .addComponent(clickQ)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        panelRoot.add(questionList, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 180, 50));

        resultList.setBackground(new java.awt.Color(255, 255, 255));
        resultList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resultListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resultListMouseExited(evt);
            }
        });

        clickR.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        clickR.setText("Manage Result List");
        clickR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout resultListLayout = new javax.swing.GroupLayout(resultList);
        resultList.setLayout(resultListLayout);
        resultListLayout.setHorizontalGroup(
            resultListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickR, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        resultListLayout.setVerticalGroup(
            resultListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultListLayout.createSequentialGroup()
                .addComponent(clickR)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        panelRoot.add(resultList, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 160, 50));

        myAccount.setBackground(new java.awt.Color(255, 255, 255));
        myAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myAccountMouseExited(evt);
            }
        });

        clickMA.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        clickMA.setText("My Account");
        clickMA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickMAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickMAMouseExited(evt);
            }
        });

        javax.swing.GroupLayout myAccountLayout = new javax.swing.GroupLayout(myAccount);
        myAccount.setLayout(myAccountLayout);
        myAccountLayout.setHorizontalGroup(
            myAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickMA, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        myAccountLayout.setVerticalGroup(
            myAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myAccountLayout.createSequentialGroup()
                .addComponent(clickMA)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        panelRoot.add(myAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 110, 50));

        logOut.setBackground(new java.awt.Color(255, 255, 255));
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });

        clickL.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        clickL.setText("    Log Out");
        clickL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout logOutLayout = new javax.swing.GroupLayout(logOut);
        logOut.setLayout(logOutLayout);
        logOutLayout.setHorizontalGroup(
            logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clickL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        logOutLayout.setVerticalGroup(
            logOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutLayout.createSequentialGroup()
                .addComponent(clickL)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        panelRoot.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 100, 30));

        playerList.setBackground(new java.awt.Color(255, 255, 255));

        clickP.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        clickP.setText("Manage Player Account");
        clickP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clickP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickPMouseExited(evt);
            }
        });

        javax.swing.GroupLayout playerListLayout = new javax.swing.GroupLayout(playerList);
        playerList.setLayout(playerListLayout);
        playerListLayout.setHorizontalGroup(
            playerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerListLayout.createSequentialGroup()
                .addComponent(clickP)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        playerListLayout.setVerticalGroup(
            playerListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerListLayout.createSequentialGroup()
                .addComponent(clickP)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        panelRoot.add(playerList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        jPanel1.add(panelRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assset/sky1.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1010, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminListMouseClicked

    private void adminListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminListMouseEntered
         
    }//GEN-LAST:event_adminListMouseEntered

    private void adminListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminListMouseExited
       
    }//GEN-LAST:event_adminListMouseExited

    private void questionListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionListMouseEntered
              
    }//GEN-LAST:event_questionListMouseEntered

    private void questionListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionListMouseExited
        
    }//GEN-LAST:event_questionListMouseExited

    private void resultListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultListMouseEntered
            
    }//GEN-LAST:event_resultListMouseEntered

    private void resultListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultListMouseExited
        
    }//GEN-LAST:event_resultListMouseExited

    private void myAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccountMouseEntered
          
    }//GEN-LAST:event_myAccountMouseEntered

    private void myAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccountMouseExited
        
    }//GEN-LAST:event_myAccountMouseExited

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        
    }//GEN-LAST:event_logOutMouseExited

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
           
    }//GEN-LAST:event_logOutMouseEntered

    private void clickPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPMouseClicked
        new manageAccountplayer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clickPMouseClicked

    private void clickAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAMouseClicked
        new manageAdminAccount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clickAMouseClicked

    private void clickQMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickQMouseClicked
        new questionForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clickQMouseClicked

    private void clickRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRMouseClicked
       new resultFormManage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clickRMouseClicked

    private void clickMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMAMouseClicked
        new infoAdminAccount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clickMAMouseClicked

    private void clickLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickLMouseClicked
        new welcomeForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clickLMouseClicked

    private void clickPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPMouseExited
        resetColor(playerList);

    }//GEN-LAST:event_clickPMouseExited

    private void clickPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPMouseEntered
          setColor(playerList);
    }//GEN-LAST:event_clickPMouseEntered

    private void clickAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAMouseEntered
          setColor(adminList);

    }//GEN-LAST:event_clickAMouseEntered

    private void clickAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickAMouseExited
         resetColor(adminList);
    }//GEN-LAST:event_clickAMouseExited

    private void clickQMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickQMouseEntered
        setColor(questionList);
    }//GEN-LAST:event_clickQMouseEntered

    private void clickQMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickQMouseExited
        resetColor(questionList);
    }//GEN-LAST:event_clickQMouseExited

    private void clickRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRMouseEntered
        setColor(resultList);
    }//GEN-LAST:event_clickRMouseEntered

    private void clickRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRMouseExited
        resetColor(resultList);
    }//GEN-LAST:event_clickRMouseExited

    private void clickMAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMAMouseEntered
          setColor(myAccount);
    }//GEN-LAST:event_clickMAMouseEntered

    private void clickMAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMAMouseExited
        resetColor(myAccount);
    }//GEN-LAST:event_clickMAMouseExited

    private void clickLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickLMouseEntered
           setColor(logOut);
    }//GEN-LAST:event_clickLMouseEntered

    private void clickLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickLMouseExited
     resetColor(logOut);
    }//GEN-LAST:event_clickLMouseExited

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
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminList;
    private javax.swing.JLabel clickA;
    private javax.swing.JLabel clickL;
    private javax.swing.JLabel clickMA;
    private javax.swing.JLabel clickP;
    private javax.swing.JLabel clickQ;
    private javax.swing.JLabel clickR;
    private javax.swing.JLabel hiname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel logOut;
    private javax.swing.JPanel myAccount;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JPanel playerList;
    private javax.swing.JPanel questionList;
    private javax.swing.JPanel resultList;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));
    }
}
