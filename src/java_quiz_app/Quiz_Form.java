/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_quiz_app;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pasic
 */
public class Quiz_Form extends javax.swing.JFrame {
    
    String[] questions = {"How is an object created in Java ?", "How is inheritance indicated in Java?", "What command is used to receive keyboard input in Java ?", "How is an array declared in Java ?", "What is the main purpose of the \"break\" statement in Java ?"};
    String[] [] options = {{"Object obj = new Object();","Object obj = Object.newObject();","Object obj = create Object();","Object obj = create.new Object();","Object obj = new Object();",},{"class ChildClass extends ParentClass","class ChildClass: ParentClass","class ChildClass inherits ParentClass","class ChildClass implements ParentClass","class ChildClass extends ParentClass",},{"System.in.read();","Scanner sc = new Scanner(System.in); sc.input();","Scanner sc = new Scanner(System.in); sc.nextLine();","input = readLine();","Scanner sc = new Scanner(System.in); sc.nextLine();",},{"int arr[];","int arr() = new int[];","int[] arr = new int();","array int[];","int arr[];",},{"Start a new loop iteration","Print a line to the console","Exit the loop or switch statement","Declare a variable","Exit the loop or switch statement",}};
    int index = 0, correct = 0;
    ButtonGroup bg = new ButtonGroup();
    /**
     * Creates new form Quiz_Form
     */
    
   
    public Quiz_Form() {
        initComponents();
        
        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);
        
        
        jButton_Next_QActionPerformed(null);
        
    }
    
    public void getSelectedOption(JRadioButton rbtn)
    {
        System.out.println(rbtn.getText());
        System.out.println(options[index][4]);
        if(rbtn.getText().equals(options[index][4]))
        {
            correct++;
        }
        index++;
        enableRbuttons(false);
    }
    
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton1_.setEnabled(yes_or_no);
        jRadioButton2_.setEnabled(yes_or_no);
        jRadioButton3_.setEnabled(yes_or_no);
        jRadioButton4_.setEnabled(yes_or_no);
    }
    
    public void checkTimeExpired() {
    if (i < 0) {
        JOptionPane.showMessageDialog(this, "Time has expired. Restart the quiz", "Time has run out", JOptionPane.INFORMATION_MESSAGE);
        index = 0;
        correct = 0;
        jButton_Next_Q.setText("Next");
        jPanel_Q_Container.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Next_QActionPerformed(null);
        i = 21;
        jLabel1.setText("" + i);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    int i=100;
    Timer T=new Timer(1000, new ActionListener()
    {public void actionPerformed(ActionEvent e)
    {
        i--;
        if(i>=0)
            jLabel1.setText(""+i);
        checkTimeExpired();
        
    }
            });
    
    boolean quizFinished = false;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Q_Container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();
        jButton_Next_Q = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Q_Container.setBackground(new java.awt.Color(204, 204, 204));

        Lbl_Question.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Question Here??");

        javax.swing.GroupLayout jPanel_Q_ContainerLayout = new javax.swing.GroupLayout(jPanel_Q_Container);
        jPanel_Q_Container.setLayout(jPanel_Q_ContainerLayout);
        jPanel_Q_ContainerLayout.setHorizontalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Q_ContainerLayout.setVerticalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        jRadioButton1_.setText("jRadioButton1");
        jRadioButton1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ActionPerformed(evt);
            }
        });

        jRadioButton2_.setText("jRadioButton2");
        jRadioButton2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_ActionPerformed(evt);
            }
        });

        jRadioButton3_.setText("jRadioButton3");
        jRadioButton3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_ActionPerformed(evt);
            }
        });

        jRadioButton4_.setText("jRadioButton4");
        jRadioButton4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_ActionPerformed(evt);
            }
        });

        jButton_Next_Q.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Next_Q.setText("Next");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton1_, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jRadioButton3_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton2_, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(jRadioButton4_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 347, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_)
                    .addComponent(jRadioButton2_))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3_)
                    .addComponent(jRadioButton4_))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed
        // TODO add your handling code here:
        if(jButton_Next_Q.getText().equals("Restart The Quiz"))
        {
            jButton_Next_Q.setText("Next");
            jPanel_Q_Container.setBackground(new java.awt.Color(204, 204, 204));
            index = 0;
            correct = 0;
        }
        if(index == questions.length)
        {
            Lbl_Question.setText("Your Score: " + correct + " / " + questions.length);
            if(correct >= (float) questions.length/2)
            {
                jPanel_Q_Container.setBackground(Color.green);
            }else{
                jPanel_Q_Container.setBackground(Color.red);
            }
            
            jButton_Next_Q.setText("Restart The Quiz");
            
        }
        
        else{
                        enableRbuttons(true);

            Lbl_Question.setText(questions[index]);
            jRadioButton1_.setText(options[index] [0]);
            jRadioButton2_.setText(options[index] [1]);
            jRadioButton3_.setText(options[index] [2]);
            jRadioButton4_.setText(options[index] [3]);
            
            if(index == questions.length-1){
                jButton_Next_Q.setText("Finish and See The Result");
            }
            
        }
        bg.clearSelection();
        
        if (index == questions.length) {
        Lbl_Question.setText("Your Score: " + correct + " / " + questions.length);
        if (correct >= (float) questions.length / 2) {
            jPanel_Q_Container.setBackground(Color.green);
        } else {
            jPanel_Q_Container.setBackground(Color.red);
        }
        jButton_Next_Q.setText("Restart The Quiz");
        quizFinished = true;
        T.stop();
    }
        quizFinished = true;
    T.stop();

    i = 20;
    jLabel1.setText("" + i);
    T.start();
    }//GEN-LAST:event_jButton_Next_QActionPerformed

    private void jRadioButton1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ActionPerformed
        getSelectedOption(jRadioButton1_);
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1_ActionPerformed

    private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton2_);
    }//GEN-LAST:event_jRadioButton2_ActionPerformed

    private void jRadioButton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton3_);
    }//GEN-LAST:event_jRadioButton3_ActionPerformed

    private void jRadioButton4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton4_);
    }//GEN-LAST:event_jRadioButton4_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
T.start();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the Intro_Form first */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Quiz_Form().setVisible(true);
    }
});
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Q_Container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}
