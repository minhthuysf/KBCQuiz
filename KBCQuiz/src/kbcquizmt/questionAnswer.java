/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbcquizmt;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import static javafx.scene.Cursor.cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static kbcquizmt.ChooseQuestion.ansRight;
import javax.swing.Timer;

/**
 *
 * @author ASUS
 */
public class questionAnswer extends javax.swing.JFrame {
   private static Connection conn;

   public static int index;
   int count=0;
   int qid=1;
     int ans;
    String ansSelect1;
      String ansSelect2;
        String ansSelect3;
          String ansSelect4;
    String ansRight;
 private static int min,sec;
           Timer time ;

  
    /**
     * Creates new form QuestionAnswer
     */
    public questionAnswer() {
        initComponents();
        setIcon();
        index=0;
        getQuestion(qid);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        countdown();
         
     
    }
    
   public void countdown(){
//       minutes.setText("00");
       // min = Integer.parseInt(minutes.getText());
        second.setText("30");
        sec = Integer.parseInt(second.getText());
        time = new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                sec--;
                second.setText("" + sec);
                
                if(sec==0){
                     if(ans==0){
                     insertPlayGame();
                     new resultForm().setVisible(true);
                     dispose();
                     resultForm.namePlayerResult.setText(namePlayer.getText());
                     resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
                   
                     if (index == 0) {
                         resultForm.anstrue.setText("0");
                           resultForm.money.setText("0");
                       

                     }
                     if (index == 1) {
                         resultForm.anstrue.setText("1");
                         resultForm.money.setText("$50");
                                                 
                     }
                     if (index == 2) {
                         resultForm.anstrue.setText("2");
                         resultForm.money.setText("$100");

                     }
                     if (index == 3) {
                         resultForm.anstrue.setText("3");
                         resultForm.money.setText("$200");

                     }
                     if (index == 4) {
                         resultForm.anstrue.setText("4");
                         resultForm.money.setText("$400");

                     }
                     if (index == 5) {
                         resultForm.anstrue.setText("5");
                         resultForm.money.setText("$800");            

                     }
                     if (index == 6) {
                         resultForm.anstrue.setText("6");
                         resultForm.money.setText("$1,600");

                     }
                     if (index == 7) {
                         resultForm.anstrue.setText("7");
                         resultForm.money.setText("$3,200");   

                         
                     }
                     
                     if (index == 8) {
                         resultForm.anstrue.setText("8");
                         resultForm.money.setText("$6,400");

                     }
                     if (index == 9) {
                         resultForm.anstrue.setText("9");
                         resultForm.money.setText("$12,500");

                     }
                     if (index == 10) {
                         resultForm.anstrue.setText("10");
                         resultForm.money.setText("$25,000");

                     }
                     if (index == 11) {
                         resultForm.anstrue.setText("11");
                         resultForm.money.setText("$50,000");      

                     }
                     if (index == 12) {
                         resultForm.anstrue.setText("12");
                         resultForm.money.setText("$1,000,000");

                     }
                     if (index == 13) {
                         resultForm.anstrue.setText("13");
                         resultForm.money.setText("$5,000,000");

                     }

                     }
                    if (ans == 1) {
                 ansSelect1 = answera.getText();
                 if (ansSelect1.equals(ansRight)) {
                     ans=0;
                            time.stop();
                            countdown();
                     index++;
                     qid++;
                     getQuestion(qid);
                   
                     
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));
                 }
                 else{
                     insertPlayGame();
                     new resultForm().setVisible(true);
                     dispose();
                     resultForm.namePlayerResult.setText(namePlayer.getText());
                     resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
                   
                     if (index == 0) {
                         resultForm.anstrue.setText("0");
                           resultForm.money.setText("0");
                       

                     }
                     if (index == 1) {
                         resultForm.anstrue.setText("1");
                         resultForm.money.setText("$50");
                                                 
                     }
                     if (index == 2) {
                         resultForm.anstrue.setText("2");
                         resultForm.money.setText("$100");

                     }
                     if (index == 3) {
                         resultForm.anstrue.setText("3");
                         resultForm.money.setText("$200");

                     }
                     if (index == 4) {
                         resultForm.anstrue.setText("4");
                         resultForm.money.setText("$400");

                     }
                     if (index == 5) {
                         resultForm.anstrue.setText("5");
                         resultForm.money.setText("$800");            

                     }
                     if (index == 6) {
                         resultForm.anstrue.setText("6");
                         resultForm.money.setText("$1,600");

                     }
                     if (index == 7) {
                         resultForm.anstrue.setText("7");
                         resultForm.money.setText("$3,200");   

                         
                     }
                     
                     if (index == 8) {
                         resultForm.anstrue.setText("8");
                         resultForm.money.setText("$6,400");

                     }
                     if (index == 9) {
                         resultForm.anstrue.setText("9");
                         resultForm.money.setText("$12,500");

                     }
                     if (index == 10) {
                         resultForm.anstrue.setText("10");
                         resultForm.money.setText("$25,000");

                     }
                     if (index == 11) {
                         resultForm.anstrue.setText("11");
                         resultForm.money.setText("$50,000");      

                     }
                     if (index == 12) {
                         resultForm.anstrue.setText("12");
                         resultForm.money.setText("$1,000,000");

                     }
                     if (index == 13) {
                         resultForm.anstrue.setText("13");
                         resultForm.money.setText("$5,000,000");

                     }

                 }
             }
             
                 if(ans==2){
                     ansSelect2 = answerb.getText();
                 if (ansSelect2.equals(ansRight)) {
                                 time.stop();
                            countdown();          
                     ans=0;


                 index++;
                qid++;
                getQuestion(qid);
                 
                     
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));
                 }
                 else{
                     insertPlayGame();
                     new resultForm().setVisible(true);
                     dispose();
                     resultForm.namePlayerResult.setText(namePlayer.getText());
                     resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
         
                     if (index == 0) {
                         resultForm.anstrue.setText("0");
                           resultForm.money.setText("0");
                       

                     }
                     if (index == 1) {
                         resultForm.anstrue.setText("1");
                         resultForm.money.setText("$50");
                                                 
                     }
                     if (index == 2) {
                         resultForm.anstrue.setText("2");
                         resultForm.money.setText("$100");

                     }
                     if (index == 3) {
                         resultForm.anstrue.setText("3");
                         resultForm.money.setText("$200");

                     }
                     if (index == 4) {
                         resultForm.anstrue.setText("4");
                         resultForm.money.setText("$400");

                     }
                     if (index == 5) {
                         resultForm.anstrue.setText("5");
                         resultForm.money.setText("$800");            

                     }
                     if (index == 6) {
                         resultForm.anstrue.setText("6");
                         resultForm.money.setText("$1,600");

                     }
                     if (index == 7) {
                         resultForm.anstrue.setText("7");
                         resultForm.money.setText("$3,200");   

                         
                     }
                     
                     if (index == 8) {
                         resultForm.anstrue.setText("8");
                         resultForm.money.setText("$6,400");

                     }
                     if (index == 9) {
                         resultForm.anstrue.setText("9");
                         resultForm.money.setText("$12,500");

                     }
                     if (index == 10) {
                         resultForm.anstrue.setText("10");
                         resultForm.money.setText("$25,000");

                     }
                     if (index == 11) {
                         resultForm.anstrue.setText("11");
                         resultForm.money.setText("$50,000");      

                     }
                     if (index == 12) {
                         resultForm.anstrue.setText("12");
                         resultForm.money.setText("$1,000,000");

                     }
                     if (index == 13) {
                         resultForm.anstrue.setText("13");
                         resultForm.money.setText("$5,000,000");

                     }

                 }
                 }
                 if(ans==3){
                      ansSelect3 = answerc.getText();
                 if (ansSelect3.equals(ansRight)) {
                                          time.stop();
                                             countdown();                                    
                     ans=0;


                 index++;
                qid++;
                getQuestion(qid);
             
                     
                     
                     
                     
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));
                 }
                 else{
                     insertPlayGame();
                     new resultForm().setVisible(true);
                     dispose();
                     resultForm.namePlayerResult.setText(namePlayer.getText());
                     resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
                   
                     if (index == 0) {
                         resultForm.anstrue.setText("0");
                           resultForm.money.setText("0");
                       

                     }
                     if (index == 1) {
                         resultForm.anstrue.setText("1");
                         resultForm.money.setText("$50");
                                                 
                     }
                     if (index == 2) {
                         resultForm.anstrue.setText("2");
                         resultForm.money.setText("$100");

                     }
                     if (index == 3) {
                         resultForm.anstrue.setText("3");
                         resultForm.money.setText("$200");

                     }
                     if (index == 4) {
                         resultForm.anstrue.setText("4");
                         resultForm.money.setText("$400");

                     }
                     if (index == 5) {
                         resultForm.anstrue.setText("5");
                         resultForm.money.setText("$800");            

                     }
                     if (index == 6) {
                         resultForm.anstrue.setText("6");
                         resultForm.money.setText("$1,600");

                     }
                     if (index == 7) {
                         resultForm.anstrue.setText("7");
                         resultForm.money.setText("$3,200");   

                         
                     }
                     
                     if (index == 8) {
                         resultForm.anstrue.setText("8");
                         resultForm.money.setText("$6,400");

                     }
                     if (index == 9) {
                         resultForm.anstrue.setText("9");
                         resultForm.money.setText("$12,500");

                     }
                     if (index == 10) {
                         resultForm.anstrue.setText("10");
                         resultForm.money.setText("$25,000");

                     }
                     if (index == 11) {
                         resultForm.anstrue.setText("11");
                         resultForm.money.setText("$50,000");      

                     }
                     if (index == 12) {
                         resultForm.anstrue.setText("12");
                         resultForm.money.setText("$1,000,000");

                     }
                     if (index == 13) {
                         resultForm.anstrue.setText("13");
                         resultForm.money.setText("$5,000,000");

                     }

                 }
                 }
                 if(ans==4){
                     ansSelect4 = answerd.getText();
                 
                 if (ansSelect4.equals(ansRight)) {
                                                    ans=0;
                           
                          time.stop();
                            countdown();
                     
                 index++;
                qid++;
                getQuestion(qid);
                     
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));
                 }
                 else{
                     insertPlayGame();
                     new resultForm().setVisible(true);
                     dispose();
                     resultForm.namePlayerResult.setText(namePlayer.getText());
                     resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
                   
                     if (index == 0) {
                         resultForm.anstrue.setText("0");
                           resultForm.money.setText("0");
                       

                     }
                     if (index == 1) {
                         resultForm.anstrue.setText("1");
                         resultForm.money.setText("$50");
                                                 
                     }
                     if (index == 2) {
                         resultForm.anstrue.setText("2");
                         resultForm.money.setText("$100");

                     }
                     if (index == 3) {
                         resultForm.anstrue.setText("3");
                         resultForm.money.setText("$200");

                     }
                     if (index == 4) {
                         resultForm.anstrue.setText("4");
                         resultForm.money.setText("$400");

                     }
                     if (index == 5) {
                         resultForm.anstrue.setText("5");
                         resultForm.money.setText("$800");            

                     }
                     if (index == 6) {
                         resultForm.anstrue.setText("6");
                         resultForm.money.setText("$1,600");

                     }
                     if (index == 7) {
                         resultForm.anstrue.setText("7");
                         resultForm.money.setText("$3,200");   

                         
                     }
                     
                     if (index == 8) {
                         resultForm.anstrue.setText("8");
                         resultForm.money.setText("$6,400");

                     }
                     if (index == 9) {
                         resultForm.anstrue.setText("9");
                         resultForm.money.setText("$12,500");

                     }
                     if (index == 10) {
                         resultForm.anstrue.setText("10");
                         resultForm.money.setText("$25,000");

                     }
                     if (index == 11) {
                         resultForm.anstrue.setText("11");
                         resultForm.money.setText("$50,000");      

                     }
                     if (index == 12) {
                         resultForm.anstrue.setText("12");
                         resultForm.money.setText("$1,000,000");

                     }
                     if (index == 13) {
                         resultForm.anstrue.setText("13");
                         resultForm.money.setText("$5,000,000");

                     }
                 }
                  
                    
                
                    }
              
                }
            }
        
            
        });
        time.start();
       
       
   }
   
           
         
   
                    

             
    public void getQuestion(int setid){
     
        
        try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
         
           String check = "select * from SetQuestion where Setid=" + setid;
           PreparedStatement pst = conn.prepareStatement(check);
           
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
             
                String q = rs.getString(3);
                String a = rs.getString(5);
                String b = rs.getString(6);
                String c = rs.getString(7);
                String d = rs.getString(8);
                ansRight = rs.getString(9);
                questiona.setText("<html>" +  q + "</html>");
                answera.setText(a);
                answerb.setText(b);
                answerc.setText(c);
                answerd.setText(d);
                namePlayer.setText(ChooseQuestion.namep.getText());
                categoryQuestion.setText(ChooseQuestion.chooseCategory.getSelectedItem().toString());
  
            }
           
               if(index==0){
                   no.setText("Question 1:");
                   
                   
               }
               if(index==1){
                    //time.stop();
                   //countdown();
                   p1.setBackground(new Color(204,255,255));
                   
                   no.setText("Question: 2");
               }
               if(index==2){
                   // time.stop();
                   //countdown();
      
                   p1.setBackground(Color.white);
                   p2.setBackground(new Color(204,255,255));

                  
                   no.setText("Question 3:");
                                     


               }
            if (index == 3) {
                //time.stop();
                //countdown();

                p2.setBackground(Color.white);
                p3.setBackground(new Color(204, 255, 255));

                no.setText("Question 4:");

            }
            if (index == 4) {
               // time.stop();
                //countdown();

                p3.setBackground(Color.white);
                p4.setBackground(new Color(204, 255, 255));

                no.setText("Question 5:");
            }
            if (index == 5) {
                //time.stop();
                //countdown();

                p4.setBackground(Color.white);
                p5.setBackground(new Color(204, 255, 255));

                no.setText("Question 6:");
            }
            if (index == 6) {
               // time.stop();
                //countdown();

                p5.setBackground(Color.white);
                p6.setBackground(new Color(204, 255, 255));

                no.setText("Question 7:");
            }
            if (index == 7) {
               // time.stop();
                //countdown();

                p6.setBackground(Color.white);
                p7.setBackground(new Color(204, 255, 255));

                no.setText("Question 8:");
            }
            if (index == 8) {
               // time.stop();
                //countdown();

                p7.setBackground(Color.white);
                p8.setBackground(new Color(204, 255, 255));

                no.setText("Question 9:");
            }
            if (index == 9) {
                //time.stop();
                //countdown();

                p8.setBackground(Color.white);
                p9.setBackground(new Color(204, 255, 255));

                no.setText("Question 10:");
            }
            if (index == 10) {
                //time.stop();
                //countdown();

                p9.setBackground(Color.white);
                p10.setBackground(new Color(204, 255, 255));

                no.setText("Question 11:");
            }
            if (index == 11) {
               // time.stop();
                //countdown();

                p10.setBackground(Color.white);
                p11.setBackground(new Color(204, 255, 255));

                no.setText("Question 12:");

            }
            if (index == 12) {
                //time.stop();
                //countdown();

                p11.setBackground(Color.white);
                p12.setBackground(new Color(204, 255, 255));

                no.setText("Question 13:");
            }
            if (index == 13) {
                //time.stop();
                //countdown();

                p12.setBackground(Color.white);
                p13.setBackground(new Color(204, 255, 255));

                insertPlayGame();
                new resultForm().setVisible(true);
                this.setVisible(false);
                resultForm.namePlayerResult.setText(namePlayer.getText());
                resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
                resultForm.anstrue.setText("13");
                resultForm.money.setText("$5,000,000");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    

           public void insertPlayGame(){
                   try{
                       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                     conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KBCQuizDatabase;integratedSecurity=true;");
                     String insert = "insert into PlayGame(Playername,CategoryQuestion) values(?,?) ";
                      PreparedStatement pst = conn.prepareStatement(insert);
                      pst.setString(1,namePlayer.getText());
                      pst.setString(2,categoryQuestion.getText());
                      int rs = pst.executeUpdate();
                     
                           
                   
                  
        
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

        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        stop = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stopGame = new javax.swing.JButton();
        noq = new javax.swing.JLabel();
        answera = new javax.swing.JButton();
        answerb = new javax.swing.JButton();
        answerc = new javax.swing.JButton();
        answerd = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        questiona = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        q1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        q2 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        q3 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        q4 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        q5 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        q6 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        q7 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        q8 = new javax.swing.JLabel();
        p10 = new javax.swing.JPanel();
        qa10 = new javax.swing.JLabel();
        p11 = new javax.swing.JPanel();
        q11 = new javax.swing.JLabel();
        p12 = new javax.swing.JPanel();
        q12 = new javax.swing.JLabel();
        p13 = new javax.swing.JPanel();
        q13 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namePlayer = new javax.swing.JLabel();
        categoryQuestion = new javax.swing.JLabel();
        help50_50 = new javax.swing.JButton();
        flip = new javax.swing.JButton();
        second = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KBC Quiz");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                closeForm(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeF(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stop.setBackground(new java.awt.Color(226,240,240));
        stop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("A.");
        stop.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 158, -1, 35));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("B.");
        stop.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 202, -1, 35));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("C.");
        stop.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 246, -1, 35));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("D.");
        stop.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 290, -1, 35));

        stopGame.setBackground(new java.awt.Color(153, 255, 153));
        stopGame.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        stopGame.setText("Stop");
        stopGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopGameActionPerformed(evt);
            }
        });
        stop.add(stopGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 334, 103, 30));
        stop.add(noq, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 74, 20, 66));

        answera.setBackground(new java.awt.Color(204, 255, 255));
        answera.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        answera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answeraMouseClicked(evt);
            }
        });
        answera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answeraActionPerformed(evt);
            }
        });
        stop.add(answera, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 158, 672, 35));

        answerb.setBackground(new java.awt.Color(204, 255, 255));
        answerb.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        answerb.setToolTipText("");
        answerb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerbMouseClicked(evt);
            }
        });
        answerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerbActionPerformed(evt);
            }
        });
        stop.add(answerb, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 202, 670, 35));

        answerc.setBackground(new java.awt.Color(204, 255, 255));
        answerc.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        answerc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answercMouseClicked(evt);
            }
        });
        answerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answercActionPerformed(evt);
            }
        });
        stop.add(answerc, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 246, 670, 35));

        answerd.setBackground(new java.awt.Color(204, 255, 255));
        answerd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        answerd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        answerd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerdMouseClicked(evt);
            }
        });
        answerd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerdActionPerformed(evt);
            }
        });
        stop.add(answerd, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 290, 670, 35));

        ok.setBackground(new java.awt.Color(153, 255, 153));
        ok.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        stop.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 334, 103, 30));

        questiona.setBackground(new java.awt.Color(204, 255, 255));
        questiona.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        stop.add(questiona, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 16, 560, 113));

        no.setBackground(new java.awt.Color(204, 255, 255));
        no.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        stop.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 140, 113));

        jPanel3.add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 730, 380));

        jPanel6.setBackground(new java.awt.Color(226,240,240));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(255, 255, 255));

        q1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q1.setText("       1     $50");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 160, 40));

        p2.setBackground(new java.awt.Color(255, 255, 255));

        q2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q2.setText("       2     $100");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 160, 40));

        p3.setBackground(new java.awt.Color(255, 255, 255));

        q3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q3.setText("       3     $200");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, 40));

        p4.setBackground(new java.awt.Color(255, 255, 255));

        q4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q4.setText("       4     $400 ");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 160, 40));

        p5.setBackground(new java.awt.Color(255, 255, 255));

        q5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q5.setText("       5     $800");

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q5, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 160, 40));

        p6.setBackground(new java.awt.Color(255, 255, 255));

        q6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q6.setText("       6     $1,600");

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, 40));

        p7.setBackground(new java.awt.Color(255, 255, 255));

        q7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q7.setText("       7     $3,200");

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, 40));

        p8.setBackground(new java.awt.Color(255, 255, 255));

        q8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q8.setText("       8     $6,400");

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 40));

        p10.setBackground(new java.awt.Color(255, 255, 255));

        qa10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        qa10.setText("     10     $25,000");

        javax.swing.GroupLayout p10Layout = new javax.swing.GroupLayout(p10);
        p10.setLayout(p10Layout);
        p10Layout.setHorizontalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qa10, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p10Layout.setVerticalGroup(
            p10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qa10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        p11.setBackground(new java.awt.Color(255, 255, 255));

        q11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q11.setText("     11     $50,000");

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q11, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 40));

        p12.setBackground(new java.awt.Color(255, 255, 255));

        q12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q12.setText("    12     $1,000,000");

        javax.swing.GroupLayout p12Layout = new javax.swing.GroupLayout(p12);
        p12.setLayout(p12Layout);
        p12Layout.setHorizontalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q12, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p12Layout.setVerticalGroup(
            p12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 40));

        p13.setBackground(new java.awt.Color(255, 255, 255));

        q13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        q13.setText("    13     $5,000,000");

        javax.swing.GroupLayout p13Layout = new javax.swing.GroupLayout(p13);
        p13.setLayout(p13Layout);
        p13Layout.setHorizontalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q13, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p13Layout.setVerticalGroup(
            p13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        p9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setText("       9     $12,000");

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel6.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 159, -1));

        jPanel4.setBackground(new java.awt.Color(226,240,240));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Name:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel12.setText("Time:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 50, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Category of Question:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Quantity of Question:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel20.setText("13");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setText("Help:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        namePlayer.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel4.add(namePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 260, 25));

        categoryQuestion.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jPanel4.add(categoryQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 142, 22));

        help50_50.setBackground(new java.awt.Color(153, 255, 153));
        help50_50.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        help50_50.setText("50-50");
        help50_50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help50_50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help50_50ActionPerformed(evt);
            }
        });
        jPanel4.add(help50_50, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 100, 30));

        flip.setBackground(new java.awt.Color(153, 255, 153));
        flip.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        flip.setText("Flip");
        flip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flipActionPerformed(evt);
            }
        });
        jPanel4.add(flip, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 100, 30));

        second.setBackground(new java.awt.Color(204, 255, 255));
        second.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        second.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 70, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 890, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assset/sky1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 560));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, -1, 40));

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
     
    private void closeForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeForm
          
         
        
    }//GEN-LAST:event_closeForm

    private void closeF(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeF
        
    }//GEN-LAST:event_closeF

    private void help50_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help50_50ActionPerformed
        String ansSelect1 = answera.getText();
        String ansSelect2 = answerb.getText();
        String ansSelect3 = answerc.getText();

        String ansSelect4 = answerd.getText();
        if(ansSelect1.equals(ansRight)){
            answerb.setText("");
            answerc.setText("");
        }
        if(ansSelect2.equals(ansRight)){
            answera.setText("");
            answerd.setText("");
        }
        if(ansSelect3.equals(ansRight)){
            answerb.setText("");
            answerd.setText("");
        }
        if(ansSelect4.equals(ansRight)){
            answera.setText("");
            answerc.setText("");
        }
        help50_50.setEnabled(false);
    }//GEN-LAST:event_help50_50ActionPerformed

    private void flipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flipActionPerformed
        qid++;
        getQuestion(qid);
        flip.setEnabled(false);
    }//GEN-LAST:event_flipActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        time.stop();
        countdown();
        if(index==1){
            time.stop();
        countdown();
     
        }
        
         if (index == 2) {
            time.stop();
            countdown();
        }
        if (index == 3) {
            time.stop();
            countdown();
        }
        if (index == 4) {
            time.stop();
            countdown();
        }
        if (index == 5) {
            time.stop();
            countdown();
        }
        if (index == 6) {
            time.stop();
            countdown();
        }
        if (index == 7) {
            time.stop();
            countdown();
        }
        if (index == 8) {
            time.stop();
            countdown();
        }
        if (index == 9) {
            time.stop();
            countdown();
        }
        if (index == 10) {
            time.stop();
            countdown();
        }
        if (index == 11) {
            time.stop();
            countdown();
        }
        if (index == 12) {
            time.stop();
            countdown();
        }
        if (index == 13) {
            time.stop();
            countdown();
        }
                              
      if(ans==1 || ans==2 || ans==3 || ans==4){                      
        if(ans==1){
            ansSelect1 = answera.getText();
            if(ansSelect1.equals(ansRight)){
              ans=0;
                index++;
                qid++;
                getQuestion(qid);
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));

            }
            else{
                insertPlayGame();
                time.stop();
                new resultForm().setVisible(true);
                this.setVisible(false);
                resultForm.namePlayerResult.setText(namePlayer.getText());
                resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
              
                if(index==0){
                    resultForm.anstrue.setText("0");

                }
                if(index==1){
                    resultForm.anstrue.setText("1");

                    if(index==2){
                        resultForm.anstrue.setText("2");

                    }
                    if(index==3){
                        resultForm.anstrue.setText("3");

                    }
                    if(index==4){
                        resultForm.anstrue.setText("4");

                    }
                    if(index==5){
                        resultForm.anstrue.setText("5");

                    }
                    if(index==6){
                        resultForm.anstrue.setText("6");

                    }
                    if(index==7){
                        resultForm.anstrue.setText("7");

                    }
                    if(index==8){

                    }
                    if(index==9){
                        resultForm.anstrue.setText("9");

                    }
                    if(index==10){
                        resultForm.anstrue.setText("10");

                    }
                    if(index==11){
                        resultForm.anstrue.setText("11");

                    }
                    if(index==12){
                        resultForm.anstrue.setText("12");

                    }
                    if(index==13){
                        resultForm.anstrue.setText("13");

                    }

                }
            }
        }
        if (ans == 2) {
            ansSelect2 = answerb.getText();
            if (ansSelect2.equals(ansRight)) {
                                ans=0;

                index++;
                qid++;

                getQuestion(qid);
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));

            }
            else {
                insertPlayGame();
                time.stop();
                new resultForm().setVisible(true);
                this.setVisible(false);
                resultForm.namePlayerResult.setText(namePlayer.getText());
                resultForm.categoryQuestionResult.setText(categoryQuestion.getText());

                if(index==0){
                    resultForm.anstrue.setText("0");

                }
                if(index==1){
                    resultForm.anstrue.setText("1");

                    if(index==2){
                        resultForm.anstrue.setText("2");

                    }
                    if(index==3){
                        resultForm.anstrue.setText("3");

                    }
                    if(index==4){
                        resultForm.anstrue.setText("4");

                    }
                    if(index==5){
                        resultForm.anstrue.setText("5");

                    }
                    if(index==6){
                        resultForm.anstrue.setText("6");

                    }
                    if(index==7){
                        resultForm.anstrue.setText("7");

                    }
                    if(index==8){

                    }
                    if(index==9){
                        resultForm.anstrue.setText("9");

                    }
                    if(index==10){
                        resultForm.anstrue.setText("10");

                    }
                    if(index==11){
                        resultForm.anstrue.setText("11");

                    }
                    if(index==12){
                        resultForm.anstrue.setText("12");

                    }
                    if(index==13){
                        resultForm.anstrue.setText("13");

                    }
                }
            }
        }
        if (ans == 3) {
           
            ansSelect3 = answerc.getText();
            if (ansSelect3.equals(ansRight)) {
                                ans=0;

                index++;
                qid++;
                getQuestion(qid);
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));

            }
            else {
                insertPlayGame();
                 time.stop();
                new resultForm().setVisible(true);
                this.setVisible(false);
                resultForm.namePlayerResult.setText(namePlayer.getText());
                resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
                
                if(index==0){
                    resultForm.anstrue.setText("0");

                }
                if(index==1){
                    resultForm.anstrue.setText("1");

                    if(index==2){
                        resultForm.anstrue.setText("2");

                    }
                    if(index==3){
                        resultForm.anstrue.setText("3");

                    }
                    if(index==4){
                        resultForm.anstrue.setText("4");

                    }
                    if(index==5){
                        resultForm.anstrue.setText("5");

                    }
                    if(index==6){
                        resultForm.anstrue.setText("6");

                    }
                    if(index==7){
                        resultForm.anstrue.setText("7");

                    }
                    if(index==8){

                    }
                    if(index==9){
                        resultForm.anstrue.setText("9");

                    }
                    if(index==10){
                        resultForm.anstrue.setText("10");

                    }
                    if(index==11){
                        resultForm.anstrue.setText("11");

                    }
                    if(index==12){
                        resultForm.anstrue.setText("12");

                    }
                    if(index==13){
                        resultForm.anstrue.setText("13");

                    }

                }
            }

        }
        if (ans == 4) {
            ansSelect4 = answerd.getText();
            if (ansSelect4.equals(ansRight)) {
                                ans=0;

                index++;
                qid++;
                getQuestion(qid);
                answera.setBackground(new Color(204,255,255));
                answerb.setBackground(new Color(204,255,255));
                answerc.setBackground(new Color(204,255,255));
                answerd.setBackground(new Color(204,255,255));

            }
            else {
                insertPlayGame();
                time.stop();
                new resultForm().setVisible(true);
                this.setVisible(false);
                resultForm.namePlayerResult.setText(namePlayer.getText());
                resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
                
                if(index==0){
                    resultForm.anstrue.setText("0");

                }
                if(index==1){
                    resultForm.anstrue.setText("1");

                    if(index==2){
                        resultForm.anstrue.setText("2");

                    }
                    if(index==3){
                        resultForm.anstrue.setText("3");

                    }
                    if(index==4){
                        resultForm.anstrue.setText("4");

                    }
                    if(index==5){
                        resultForm.anstrue.setText("5");

                    }
                    if(index==6){
                        resultForm.anstrue.setText("6");

                    }
                    if(index==7){
                        resultForm.anstrue.setText("7");

                    }
                    if(index==8){
                     resultForm.anstrue.setText("8");
                    }
                    if(index==9){
                        resultForm.anstrue.setText("9");

                    }
                    if(index==10){
                        resultForm.anstrue.setText("10");

                    }
                    if(index==11){
                        resultForm.anstrue.setText("11");

                    }
                    if(index==12){
                        resultForm.anstrue.setText("12");

                    }
                    if(index==13){
                        resultForm.anstrue.setText("13");

                    }

                }
            
            }
        }
        
           
        
        
            
        
      }
    }//GEN-LAST:event_okActionPerformed

    private void answerdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerdActionPerformed
        ans=4;
    }//GEN-LAST:event_answerdActionPerformed

    private void answerdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerdMouseClicked
        answerd.setBackground(Color.white);
        if(ans==4){
            answera.setBackground(new Color(204,255,255));
            answerb.setBackground(new Color(204,255,255));

            answerc.setBackground(new Color(204,255,255));
            // answerd.setBackground(new Color(204,255,255));

        }

    }//GEN-LAST:event_answerdMouseClicked

    private void answercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answercActionPerformed
        ans=3;

    }//GEN-LAST:event_answercActionPerformed

    private void answercMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answercMouseClicked
        answerc.setBackground(Color.white);
        if(ans==3){
            answera.setBackground(new Color(204,255,255));
            answerb.setBackground(new Color(204,255,255));

            //  answerc.setBackground(new Color(204,255,255));
            answerd.setBackground(new Color(204,255,255));

        }

    }//GEN-LAST:event_answercMouseClicked

    private void answerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerbActionPerformed
        ans =2;
    }//GEN-LAST:event_answerbActionPerformed

    private void answerbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerbMouseClicked
        answerb.setBackground(Color.white);

        if(ans==2){
            answera.setBackground(new Color(204,255,255));
            //answerb.setBackground(new Color(204,255,255));

            answerc.setBackground(new Color(204,255,255));
            answerd.setBackground(new Color(204,255,255));

        }

    }//GEN-LAST:event_answerbMouseClicked

    private void answeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answeraActionPerformed
        ans=1;
    }//GEN-LAST:event_answeraActionPerformed

    private void answeraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answeraMouseClicked
        answera.setBackground(Color.white);
        if(ans==1){
            // answera.setBackground(new Color(204,255,255));
            answerb.setBackground(new Color(204,255,255));

            answerc.setBackground(new Color(204,255,255));
            answerd.setBackground(new Color(204,255,255));

        }

    }//GEN-LAST:event_answeraMouseClicked

    private void stopGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopGameActionPerformed
        if(index==1 ||index==2||index==3||index==4||index==5||index==6||index==7||index==8||index==9||index==10||index==11){
            new resultForm().setVisible(true);
            this.setVisible(false);
            insertPlayGame();
            resultForm.namePlayerResult.setText(namePlayer.getText());
        resultForm.categoryQuestionResult.setText(categoryQuestion.getText());
        
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
        if(index==12){
            JOptionPane.showMessageDialog(this, "You have to answer this question!");
        }
        
    }//GEN-LAST:event_stopGameActionPerformed

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
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questionAnswer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answera;
    private javax.swing.JButton answerb;
    private javax.swing.JButton answerc;
    private javax.swing.JButton answerd;
    private javax.swing.JLabel categoryQuestion;
    private javax.swing.JButton flip;
    private javax.swing.JButton help50_50;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JLabel namePlayer;
    private javax.swing.JButton no;
    private javax.swing.JLabel noq;
    private javax.swing.JButton ok;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q12;
    private javax.swing.JLabel q13;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel qa10;
    private javax.swing.JButton questiona;
    private javax.swing.JButton second;
    private javax.swing.JPanel stop;
    private javax.swing.JButton stopGame;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));
    }

 
   
            
    
    
}
