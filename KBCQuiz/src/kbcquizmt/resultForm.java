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
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static kbcquizmt.questionAnswer.index;

/**
 *
 * @author ASUS
 */
public class resultForm extends javax.swing.JFrame {
   private static Connection conn;
   DecimalFormat df = new DecimalFormat("$#,##0.##");
    /**
     * Creates new form resultForm
     */
    public resultForm() {
        initComponents();
        setIcon();
        createSetQuestion();
        insert();
        prize();
    }
    
  public void prize(){
      
        if(index==0){
           resultForm.money.setText("0");

        }
        if(index==1){ 
                       resultForm.anstrue.setText("1");
                       resultForm.money.setText("$50");
                   }
                   if(index==2){
                      resultForm.anstrue.setText("2");
                       resultForm.money.setText("$100");
                  }
                   if(index==3){
                     resultForm.anstrue.setText("3");
                       resultForm.money.setText("$200");
                  }
                   if(index==4){
                      resultForm.anstrue.setText("4");
                       resultForm.money.setText("$400");
                  }
                   if(index==5){
                      resultForm.anstrue.setText("5");
                       resultForm.money.setText("$800");
                  }
                   if(index==6){
                      resultForm.anstrue.setText("6");
                       resultForm.money.setText("$1,600");
                  }
                   if(index==7){
                      resultForm.anstrue.setText("7");
                       resultForm.money.setText("$3,200");
                  }
                   if(index==8){
                      resultForm.anstrue.setText("8");
                       resultForm.money.setText("$6,400");
                  }
                   if(index==9){
                      resultForm.anstrue.setText("9");
                       resultForm.money.setText("$12,500");
                  }
                   if(index==10){
                      resultForm.anstrue.setText("10");
                       resultForm.money.setText("$25,000");
                  }
                   if(index==11){
                      resultForm.anstrue.setText("11");
                       resultForm.money.setText("$50,000");
                  }
                   if(index==12){
                      resultForm.anstrue.setText("12");
                       resultForm.money.setText("$1,000,000");
                  }
                   if(index==13){
                      resultForm.anstrue.setText("13");
                       resultForm.money.setText("$5,000,000");
                  }
        
        
    }
    public void createSetQuestion(){
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
            String delete = "drop table SetQuestion";
            PreparedStatement pst = conn.prepareStatement(delete);
            int rs = pst.executeUpdate();
            String create = " CREATE TABLE [dbo].[SetQuestion](\n"
                    + "	[Setid] [int] IDENTITY(1,1) NOT NULL,\n"
                    + "	[Questionid] [int] NOT NULL,\n"
                    + "	[Questionname] [nvarchar](1000) NOT NULL,\n"
                    + "	[Category] [nvarchar](100) NOT NULL,\n"
                    + "	[AnswerA] [nvarchar](500) NOT NULL,\n"
                    + "	[AnswerB] [nvarchar](500) NOT NULL,\n"
                    + "	[AnswerC] [nvarchar](500) NOT NULL,\n"
                    + "	[AnswerD] [nvarchar](500) NOT NULL,\n"
                    + "	[AnswerRight] [nvarchar](500) NOT NULL,\n"
                    + " CONSTRAINT [PK_SetQuestion] PRIMARY KEY CLUSTERED \n"
                    + "(\n"
                    + "	[Setid] ASC\n"
                    + ")WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]\n"
                    + ") ON [PRIMARY]";

            PreparedStatement pst1 = conn.prepareStatement(create);
            int rs1 = pst1.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void insert(){
       int testid=1;
        
     String trans="";
        try {
            
           double prize0=0;
           double prize1=50;
           double prize2=100;
           double prize3=200;
           double prize4=400;
           double prize5=800;
           double prize6=1200;
           double prize7=3200;
           double prize8=6400;
           double prize9=12000;
           double prize10=25000;
           double prize11=50000;
           double prize12=1000000;
           double prize13=5000000;
           
           
            int quantityRight=0;
            
            
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
                        String fetch = "select Testid from PlayGame";
             PreparedStatement pst1 = conn.prepareStatement(fetch);
                                      ResultSet rs1 = pst1.executeQuery();

                  while(rs1.next()){   
                      testid = rs1.getInt(1);
                        
                  }
                  if(questionAnswer.index==0){
                       trans= df.format(prize0);

                  }
                if (questionAnswer.index == 1) {
                 trans= df.format(prize1);
                 
                    
                }
                if (questionAnswer.index == 2) {
                    trans= df.format(prize2);
                }
                if (questionAnswer.index == 3) {
                    trans= df.format(prize3);
                   
                }
                if (questionAnswer.index == 4) {
                   trans= df.format(prize4);
                    
                }
                if (questionAnswer.index == 5) {
                   trans= df.format(prize5);
                    
                }
                if (questionAnswer.index == 6) {
                   trans= df.format(prize6);
                }
                if (questionAnswer.index == 7) {
                   trans= df.format(prize7);
                   
                }
                if (questionAnswer.index == 8) {
                  trans= df.format(prize8);
                }
                if (questionAnswer.index == 9) {
                   trans= df.format(prize9);
                }
                if (questionAnswer.index == 10) {
                   trans= df.format(prize10);
                }
                if (questionAnswer.index == 11) {
                 trans= df.format(prize11);
                }
                if (questionAnswer.index == 12) {
                   trans= df.format(prize12);
                }
                if (questionAnswer.index == 13) {
                    trans= df.format(prize13);
                  
                }
                
                
                
                if (questionAnswer.index == 1) {
                   quantityRight=  1;
                    
                }
                if (questionAnswer.index == 2) {
                    quantityRight=   2;
                }
                if (questionAnswer.index == 3) {
                    quantityRight=  3;
                   
                }
                if (questionAnswer.index == 4) {
                  quantityRight=   4;
                    
                }
                if (questionAnswer.index == 5) {
                    quantityRight=  5;
                    
                }
                if (questionAnswer.index == 6) {
                    quantityRight=  6;
                }
                if (questionAnswer.index == 7) {
                    quantityRight=  7;
                   
                }
                if (questionAnswer.index == 8) {
                    quantityRight=   8;
                }
                if (questionAnswer.index == 9) {
                    quantityRight=  9;
                }
                if (questionAnswer.index == 10) {
                    quantityRight=   10;
                }
                if (questionAnswer.index == 11) {
                   quantityRight=  11;
                }
                if (questionAnswer.index == 12) {
                   quantityRight=   12;
                }
                if (questionAnswer.index == 13) {
                   quantityRight= 13;
                  
                }
            String insert = "insert into Result(Testid,Prizemoney,QuantityAnsRight) values(?,?,?)";

            PreparedStatement pst = conn.prepareStatement(insert);
            pst.setInt(1, testid);
            pst.setString(2, trans);
            pst.setInt(3, quantityRight); 
              
              int result = pst.executeUpdate();
        } catch (Exception e) {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        namePlayerResult = new javax.swing.JLabel();
        categoryQuestionResult = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        anstrue = new javax.swing.JLabel();
        gotIt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jLabel10.setText("jLabel10");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel2.setText("Your Result");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Category of Question:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Quantity of Question:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setText("Quantity of question you answered right:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setText("Prize Money: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KBC Quiz");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(226,240,240));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel12.setText("Name: ");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel13.setText("Category of Question: ");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel14.setText("Quantity of Question:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel15.setText("Quantity of question you answered right: ");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel16.setText("Prize Money:");

        namePlayerResult.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        categoryQuestionResult.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel19.setText("13");

        anstrue.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N

        gotIt.setBackground(new java.awt.Color(153, 255, 153));
        gotIt.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        gotIt.setText("Got it");
        gotIt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotItActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel11.setText("Your Result");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        money.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        money.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryQuestionResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anstrue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namePlayerResult, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(gotIt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(namePlayerResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryQuestionResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(anstrue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gotIt)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 480));
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 620, 400));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 620, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assset/sky1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 570));

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

    private void gotItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotItActionPerformed
        try {
     
            String prize,prizeNew;
              String prizeOld;
            int trans=0;
         String trans1="" ;
            
          


            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
            String select = "select * from Player where Playername=?";
            PreparedStatement pst2 = conn.prepareStatement(select);
            pst2.setString(1, questionAnswer.namePlayer.getText());
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next()) {
                prizeOld = rs2.getString(7);
                 if (questionAnswer.index == 0) {
                   
                   prizeNew = "$0";
                   String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                  trans1= df.format(trans);
                   


                }
                if (questionAnswer.index == 1) {
                   
                   prizeNew = "$50";
                   String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                  trans1= df.format(trans);
                   


                }
                if (questionAnswer.index == 2) {
                   prizeNew = "$100";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                   trans1= df.format(trans);

                }
                if (questionAnswer.index == 3) {
                   prizeNew = "$200";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                  trans1=  df.format(trans);
                }
                if (questionAnswer.index == 4) {   
                   
                   prizeNew = "$400";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                  trans1=  df.format(trans);
                }
                if (questionAnswer.index == 5) {
                   prizeNew = "$800";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                 trans1=   df.format(trans);                }
                if (questionAnswer.index == 6) {
                   prizeNew ="$1,200";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                   trans1= df.format(trans);                }
                if (questionAnswer.index == 7) {
                   prizeNew = "$3,200";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                  trans1=  df.format(trans);                }
                if (questionAnswer.index == 8) {
                   prizeNew ="$6,400";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                   trans1= df.format(trans);                }
                if (questionAnswer.index == 9) {
                   prizeNew = "$12,000";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                   trans1= df.format(trans);                }
                if (questionAnswer.index == 10) {
                   prizeNew = "$25,000";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                  trans1=  df.format(trans);                }
                if (questionAnswer.index == 11) {                  
                   prizeNew = "$50,000";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                   trans1= df.format(trans);                }
                if (questionAnswer.index == 12) {

                   prizeNew = "$1,000,000";
                     String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                   trans1= df.format(trans);                }
                if (questionAnswer.index == 13) {

                   prizeNew = "$5,000,000";  
                   String p1=prizeOld.substring(1);
                   String p2 = prizeNew.substring(1);
                   trans= Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
                   trans1= df.format(trans);           
                }
                
                String updatePrize = "update Player set Totlaprizemoney=? where Playername=?";
                PreparedStatement pst3 = conn.prepareStatement(updatePrize);
                pst3.setString(1, trans1);
                pst3.setString(2, questionAnswer.namePlayer.getText());
                int rs3 = pst3.executeUpdate();

           
            }
////           
            

                
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        new menuForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gotItActionPerformed

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
            java.util.logging.Logger.getLogger(resultForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel anstrue;
    public static javax.swing.JLabel categoryQuestionResult;
    private javax.swing.JButton gotIt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel money;
    public static javax.swing.JLabel namePlayerResult;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));
    }
}
