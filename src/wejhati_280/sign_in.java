/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wejhati_280;

import java.awt.Color;
import java.io.File;import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
/**
 *
 * @author manar
 */
public class sign_in extends javax.swing.JFrame {

    /**
     * Creates new form sign_in
     */
    public sign_in() {
        initComponents();
             username.setBackground(new Color(255,255,255,0));
         password.setBackground(new Color(255,255,255,0));       
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        password = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 630));
        getContentPane().setLayout(null);

        username.setBorder(null);
        getContentPane().add(username);
        username.setBounds(30, 240, 270, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 330, 270, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(230, 360, 80, 20);

        password.setBorder(null);
        getContentPane().add(password);
        password.setBounds(30, 310, 270, 20);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SF Movie Poster", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sign In");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(80, 430, 170, 50);

        jLabel6.setFont(new java.awt.Font("SF Movie Poster", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("forgot password?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 340, 300, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(30, 260, 270, 10);

        jLabel5.setFont(new java.awt.Font("SF Movie Poster", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 280, 300, 20);

        jLabel4.setFont(new java.awt.Font("SF Movie Poster", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 210, 300, 30);

        jLabel2.setFont(new java.awt.Font("SF Movie Poster", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Wejhati");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 100, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wejhati_280/gradient.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 330, 590);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(230, 360, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        reset_password rs = new reset_password();
        rs.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        File file = new File("login.txt");
        Scanner read;
        int usernameCheck=0;
        int passCheck=0;
        try {
            read = new Scanner (file);
            while(read.hasNext()){
                String line [] = read.next().split(",");
                if(line[1].equals(username.getText())){
                    usernameCheck=1;
                }else{
                    usernameCheck=0;
                }
                if(line[3].equals(password.getText())){
                    passCheck=1;
                }else{
                    passCheck=0;
                }}
                if(usernameCheck==1 && passCheck==1){

                    menu1 men = new menu1 ();
                    men.setVisible(true);

                }
                if(usernameCheck==0){
                    UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                        "SF Movie Poster", Font.BOLD, 20)));
            final JOptionPane pane = new JOptionPane("the username is wrong, please try again");
            final JDialog d = pane.createDialog((JFrame)null, "");
            d.setLocation(50,300);
            d.setVisible(true);
        }
        if(usernameCheck==1 && passCheck==0){
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "SF Movie Poster", Font.BOLD, 20)));
    final JOptionPane pane = new JOptionPane("the password is wrong, please try again");
    final JDialog d = pane.createDialog((JFrame)null, "");
    d.setLocation(50,300);
    d.setVisible(true);
    }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(sign_in.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(sign_in.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
