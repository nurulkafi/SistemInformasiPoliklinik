/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login;
import Koneksi.Koneksi;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
/**
 *
 * @author Nurul Kafi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CLOSE = new javax.swing.JButton();
        MIN = new javax.swing.JButton();
        MAX = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CLOSE.setBackground(new Color(0,0,0,0));
        CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/xOff.png"))); // NOI18N
        CLOSE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE.setBorderPainted(false);
        CLOSE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLOSE.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/Close.png"))); // NOI18N
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        MIN.setBackground(new Color(0,0,0,0));
        MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/-Off.png"))); // NOI18N
        MIN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MIN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/Min.png"))); // NOI18N
        getContentPane().add(MIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 30, 30));

        MAX.setBackground(new Color(0,0,0,0));
        MAX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/maxOff.png"))); // NOI18N
        MAX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MAX.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/Max.png"))); // NOI18N
        getContentPane().add(MAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 30, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 174, 152));
        jLabel2.setText("L O G I N");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/Header (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/fluent_password-24-filled.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/bx_bxs-user.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        Username.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Username.setToolTipText("Username");
        Username.setAlignmentX(1.0F);
        Username.setAlignmentY(1.0F);
        Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 174, 152), 2));
        Username.setCaretColor(new java.awt.Color(30, 174, 152));
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 330, 40));

        Password.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Password.setToolTipText("Password");
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 174, 152), 2));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 330, 40));

        jButton1.setBackground(new java.awt.Color(30, 174, 152));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 330, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Asset/LOGIN.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void login(){
       
        try{
            Connection connect = Koneksi.getKoneksi();
            Statement sttmnt = connect.createStatement();
            String query = "SELECT * FROM `login` WHERE `UserName` = '"+Username.getText()+"' && `Password`= '"+Password.getText()+"' ";
            
            ResultSet go = sttmnt.executeQuery(query);
           
            if(go.next()){
                if("admin".equals(go.getString("TypeUser"))){
                    GlobalVar.nama = go.getString("username");
                    GlobalVar.id_user = go.getString("id_user");
                    GlobalVar.hak_akses = go.getString("TypeUser");
                    JOptionPane.showMessageDialog(null, "Selamat Datang " + GlobalVar.nama );
                }else if("gudang".equals(go.getString("TypeUser"))){
                    GlobalVar.nama = go.getString("username");
                    GlobalVar.id_user = go.getString("id_user");
                    GlobalVar.hak_akses = go.getString("TypeUser");
                    JOptionPane.showMessageDialog(null, "Selamat Datang " + GlobalVar.nama );
                }else{
                    GlobalVar.nama = go.getString("username");
                    GlobalVar.id_user = go.getString("id_user");
                    GlobalVar.hak_akses = go.getString("TypeUser");
                    JOptionPane.showMessageDialog(null, "Selamat Datang " + GlobalVar.nama );

                }
            }else{
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                Username.setText(null);
                Password.setText(null);
            }
            
        }catch(SQLException | HeadlessException e ){
            System.out.println(e);
        }
    }
    
    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(Username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap Isi Username");
        }else{
            login();
        }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton MAX;
    private javax.swing.JButton MIN;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
