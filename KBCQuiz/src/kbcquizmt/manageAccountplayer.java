/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbcquizmt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static kbcquizmt.manageAdminAccount.dataadmin;
import static kbcquizmt.register.conn;
import static kbcquizmt.register.textname;

/**
 *
 * @author ASUS
 */
public class manageAccountplayer extends javax.swing.JFrame {
    private static Connection conn;
    DefaultTableModel tb = new DefaultTableModel();
    private String gender;

    /**
     * Creates new form manageAccountplayer
     */
    public manageAccountplayer() {
        initComponents();
        setIcon();
        load();
        getHeader();
       
    }
     public void getHeader(){
        JTableHeader tb = dataplayer.getTableHeader();
        tb.setForeground(Color.black);
        
       tb.setFont(new Font("Time New Roman",Font.PLAIN,18));
    }
    public void clear(){
        name.setText("");
        password.setText("");
        address.setText("");
        email.setText("");
        ((JTextField)birthday.getDateEditor().getUiComponent()).setText("");
        
        buttonGroup1.clearSelection();
         
    }
      public void load(){
        try{
             String enable;
                  String disable;
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
       
           int number;
           Vector row, column;
           column = new Vector();
           Statement st = conn.createStatement();
           ResultSet rs= st.executeQuery("select Playername,Gender,Address,Email,Birthday,Totlaprizemoney,Status from Player");
           ResultSetMetaData metadata= rs.getMetaData();
           number = metadata.getColumnCount();
           for(int i = 1;i<=number;i++){
               column.add(metadata.getColumnName(i));
           }
           tb.setColumnIdentifiers(column);
           while(rs.next()){
               row = new Vector();
               for(int i=1;i<=number;i++){
                  row.addElement(rs.getString(i));
               }
               tb.addRow(row);
               dataplayer.setModel(tb);
           }
           dataplayer.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
               @Override
               public void valueChanged(ListSelectionEvent e) {
                   if(dataplayer.getSelectedRow()>=0){                    
                      name.setText(dataplayer.getValueAt(dataplayer.getSelectedRow(), 0)+ "");
                 //    password.setText(dataplayer.getValueAt(dataplayer.getSelectedRow(), 1)+ "");
                       address.setText(dataplayer.getValueAt(dataplayer.getSelectedRow(), 2)+ "");
                      email.setText(dataplayer.getValueAt(dataplayer.getSelectedRow(), 3)+ "");  
                      ((JTextField)birthday.getDateEditor().getUiComponent()).setText(dataplayer.getValueAt(dataplayer.getSelectedRow(), 4)+ "");
                     

      

                      
                   }
               }
           });
            
                
             
                
                
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

        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        insertaccount = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        fm = new javax.swing.JRadioButton();
        m = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        updatedata = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataplayer = new javax.swing.JTable();
        birthday = new com.toedter.calendar.JDateChooser();
        status = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KBC Quiz");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(226,240,240)
        );
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertaccount.setBackground(new java.awt.Color(153, 255, 153));
        insertaccount.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        insertaccount.setText("Insert");
        insertaccount.setBorder(null);
        insertaccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertaccountActionPerformed(evt);
            }
        });
        jPanel2.add(insertaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 25));

        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 200, 25));

        address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 200, 25));

        buttonGroup1.add(fm);
        fm.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        fm.setText("Female");
        fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmActionPerformed(evt);
            }
        });
        jPanel2.add(fm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        buttonGroup1.add(m);
        m.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        m.setText("Male");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        jPanel2.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Playername");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        email.setToolTipText("");
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 200, 25));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setText("Address");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setText("Birthday");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Gender");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel11.setText("Status");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        updatedata.setBackground(new java.awt.Color(153, 255, 153));
        updatedata.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        updatedata.setText("Update");
        updatedata.setBorder(null);
        updatedata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedataActionPerformed(evt);
            }
        });
        jPanel2.add(updatedata, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 100, 25));

        delete.setBackground(new java.awt.Color(153, 255, 153));
        delete.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(null);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 100, 25));

        menu.setBackground(new java.awt.Color(153, 255, 153));
        menu.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        menu.setText("Menu");
        menu.setBorder(null);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 100, 25));

        password.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 25));

        jPanel4.setBackground(new java.awt.Color(255,255,255,150));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel3.setText("Manage Player Account");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel3)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        jPanel7.setBackground(new java.awt.Color(255,255,255,150));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel2.setText("Account Player List");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 960, 40));

        dataplayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataplayer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dataplayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataplayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataplayer.setFocusable(false);
        dataplayer.setIntercellSpacing(new java.awt.Dimension(2, 2));
        dataplayer.setRowHeight(20);
        dataplayer.setSelectionBackground(new java.awt.Color(153, 255, 153));
        dataplayer.setSelectionForeground(new java.awt.Color(0, 0, 0));
        dataplayer.getTableHeader().setResizingAllowed(false);
        jScrollPane2.setViewportView(dataplayer);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 960, 300));
        jPanel2.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 200, -1));

        status.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enable", "Disable" }));
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 200, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 960, 530));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\KBCQuiz\\asset\\sky1.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
          

                        

 
       
    
    private void insertaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertaccountActionPerformed

       
        String name1 = name.getText();
        String PATTERN ="^[a-zA-Z]{1,60}$";
        Pattern pt = Pattern.compile(PATTERN);
        Matcher match=pt.matcher(name.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Please enter your name only contains character!");
        }
        String PATTERN1 ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,50})";
        Pattern pt1 =Pattern.compile(PATTERN1);
        Matcher match1=pt1.matcher(password.getText());
        if(!match1.matches()){
            JOptionPane.showMessageDialog(this, "Password must contain at least one digit, one lowercase,one uppercase character, length from 8 to 50 characters!");
        }
        String address1 = address.getText();
        if(address1.equals("")){
           JOptionPane.showMessageDialog(this, "Please enter your address!");
        }
        String PATTERN2 ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pt2 =Pattern.compile(PATTERN2);
        Matcher match2 = pt2.matcher(email.getText());
        if(!match2.matches()){
            JOptionPane.showMessageDialog(this, "Email invalid!\nExample: parkjyeon@gmail.com");
        }
        String birthday1= ((JTextField)birthday.getDateEditor().getUiComponent()).getText();
        if(birthday1.equals("")){
           JOptionPane.showMessageDialog(this, "Please enter your birthday!");
        }
         if(!fm.isSelected() && !m.isSelected()){
             JOptionPane.showMessageDialog(this, "Please choose your gender!");
         }
        
        if(fm.isSelected()||m.isSelected()&&match.matches()&&match1.matches()&&!address1.equals("")&&match2.matches()&&!birthday1.equals("")){
        
         try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
              String check = "select * from Player where Playername=?";
              PreparedStatement pst1 = conn.prepareStatement(check);
              pst1.setString(1,name.getText());
              ResultSet rs = pst1.executeQuery();
              if(rs.next()){
                  JOptionPane.showMessageDialog(this, "Name has already used!");
              }
              
              else{
                  
                  
              PreparedStatement pst = conn.prepareStatement("insert into Player(Playername,Password,Gender,Address,Email,Birthday,Status) values(?,?,?,?,?,?,?)");
              pst.setString(1,name.getText());
              pst.setString(2,password.getText());
              pst.setString(3, gender); 
              pst.setString(4,address.getText());  
              pst.setString(5,(email.getText()));         
                      
              pst.setString(6,((JTextField)birthday.getDateEditor().getUiComponent()).getText());
              
              pst.setString(7, status.getSelectedItem().toString());
              int result = pst.executeUpdate();
              if(result>0){
                  JOptionPane.showMessageDialog(this, "Insert successfully!");
                  tb.setRowCount(0);
                  load();
                  clear();
              }
              else{
                  JOptionPane.showMessageDialog(this, "Insert unsucessufuly!");
                 
              }
        
              }
              clear();
         }
         catch(Exception e){
             System.out.println(e.getMessage());
         }
        }
    }//GEN-LAST:event_insertaccountActionPerformed

    private void fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmActionPerformed
        gender ="Female";
    }//GEN-LAST:event_fmActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        gender ="Male";
    }//GEN-LAST:event_mActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void updatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedataActionPerformed
         String name1 = name.getText();
        String PATTERN ="^[a-zA-Z]{1,60}$";
        Pattern pt = Pattern.compile(PATTERN);
        Matcher match=pt.matcher(name.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Please enter your name only contains character!");
        }
//        String PATTERN1 ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,50})";
//        Pattern pt1 =Pattern.compile(PATTERN1);
//        Matcher match1=pt1.matcher(password.getText());
//        if(!match1.matches()){
//            JOptionPane.showMessageDialog(this, "Password must contain at least one digit, one lowercase,one uppercase character, length from 8 to 50 characters!");
//        }
        String address1 = address.getText();
        if(address1.equals("")){
           JOptionPane.showMessageDialog(this, "Please enter your address!");
        }
        String PATTERN2 ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pt2 =Pattern.compile(PATTERN2);
        Matcher match2 = pt2.matcher(email.getText());
        if(!match2.matches()){
            JOptionPane.showMessageDialog(this, "Email invalid!\nExample: parkjyeon@gmail.com");
        }
        String birthday1= ((JTextField)birthday.getDateEditor().getUiComponent()).getText();
        if(birthday1.equals("")){
           JOptionPane.showMessageDialog(this, "Please enter your birthday!");
        }
         if(!fm.isSelected() && !m.isSelected()){
             JOptionPane.showMessageDialog(this, "Please choose your gender!");
         }
        if(fm.isSelected() || m.isSelected()&& !address1.equals("")&&match2.matches()&&!birthday1.equals("")){

        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
           

           String update= "update Player set Password=?, Gender=?,Address=?,Email=?,Birthday=?,Status=? where Playername=?";
             PreparedStatement pst = conn.prepareStatement(update);
              pst.setString(7, name.getText());
              pst.setString(1,password.getText());
              pst.setString(2, gender); 
              pst.setString(3,address.getText());  
              pst.setString(4,(email.getText()));         
                      
              pst.setString(5,((JTextField)birthday.getDateEditor().getUiComponent()).getText());
              pst.setString(6, status.getSelectedItem().toString());
              pst.executeUpdate();
              JOptionPane.showMessageDialog(this, "update Successfully");            
              tb.setRowCount(0);
              load();
              
              clear();
        }
         
    
         catch(Exception e){
             System.out.println(e.getMessage());
         }
        }
         
    }//GEN-LAST:event_updatedataActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        new menuAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         String name1 = name.getText();
        String PATTERN ="^[a-zA-Z]{1,60}$";
        Pattern pt = Pattern.compile(PATTERN);
        Matcher match=pt.matcher(name.getText());
        if(!match.matches()){
            JOptionPane.showMessageDialog(this, "Please enter your name only contains character!");
        }
//        String PATTERN1 ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,50})";
//        Pattern pt1 =Pattern.compile(PATTERN1);
//        Matcher match1=pt1.matcher(password.getText());
//        if(!match1.matches()){
//            JOptionPane.showMessageDialog(this, "Password must contain at least one digit, one lowercase,one uppercase character, length from 8 to 50 characters!");
//        }
        String address1 = address.getText();
        if(address1.equals("")){
           JOptionPane.showMessageDialog(this, "Please enter your address!");
        }
        String PATTERN2 ="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern pt2 =Pattern.compile(PATTERN2);
        Matcher match2 = pt2.matcher(email.getText());
        if(!match2.matches()){
            JOptionPane.showMessageDialog(this, "Email invalid!\nExample: parkjyeon@gmail.com");
        }
        String birthday1= ((JTextField)birthday.getDateEditor().getUiComponent()).getText();
        if(birthday1.equals("")){
           JOptionPane.showMessageDialog(this, "Please enter your birthday!");
        }
//          if(!fm.isSelected() && !m.isSelected()){
//             JOptionPane.showMessageDialog(this, "Please choose your gender!");
//         }
        if(!address1.equals("")&&match2.matches()&&!birthday1.equals("")){

        
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
           String delete = "update Player set status=? where Playername=?";
           PreparedStatement pst = conn.prepareStatement(delete);
           pst.setString(2,name.getText());
           pst.setString(1, "Disable");
        
           pst.executeUpdate();
           JOptionPane.showMessageDialog(this, "Delete successfully!");
           tb.setRowCount(0);
           load();
           clear();
       }
        
       catch(Exception e){
           
       }
        }
    }//GEN-LAST:event_deleteActionPerformed
    
     
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
            java.util.logging.Logger.getLogger(manageAccountplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageAccountplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageAccountplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageAccountplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageAccountplayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser birthday;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JTable dataplayer;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton fm;
    private javax.swing.JButton insertaccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton m;
    private javax.swing.JButton menu;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JButton updatedata;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));
    }
}
