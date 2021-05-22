/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuUtama;

import Koneksi.GlobalVar;
import MenuObat.MenuObat;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.Timer;

/**
 *
 * @author donih
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        Tampil_Tanggal();
        Tampil_Jam();
        username.setText(GlobalVar.nama.toUpperCase());
        this.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MIN = new javax.swing.JButton();
        MAX = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnObat = new javax.swing.JButton();
        btnJadwalPraktek = new javax.swing.JButton();
        btnPemeriksaan = new javax.swing.JButton();
        btnPoli = new javax.swing.JButton();
        btnDokter = new javax.swing.JButton();
        btnPegawai = new javax.swing.JButton();
        btnPendaftaran = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        tgl = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        txtjam = new javax.swing.JLabel();
        navi = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MIN.setBackground(new Color(0,0,0,0));
        MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/-Off.png"))); // NOI18N
        MIN.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MIN.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Min.png"))); // NOI18N
        MIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINActionPerformed(evt);
            }
        });
        getContentPane().add(MIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 30, 30));

        MAX.setBackground(new Color(0,0,0,0));
        MAX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/maxOff.png"))); // NOI18N
        MAX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MAX.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Max.png"))); // NOI18N
        getContentPane().add(MAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 30, 30));

        CLOSE.setBackground(new Color(0,0,0,0));
        CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/xOff.png"))); // NOI18N
        CLOSE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CLOSE.setBorderPainted(false);
        CLOSE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CLOSE.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Close.png"))); // NOI18N
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });
        getContentPane().add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        btnUser.setBackground(new Color(0,0,0,0));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/user.png"))); // NOI18N
        btnUser.setToolTipText("LogOut");
        btnUser.setBorder(null);
        btnUser.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/akunbig.png"))); // NOI18N
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1148, 47, -1, -1));

        btnPembayaran.setBackground(new Color(0,0,0,0));
        btnPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/pembayaran.png"))); // NOI18N
        btnPembayaran.setBorder(null);
        btnPembayaran.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PembayaranAktif.png"))); // NOI18N
        btnPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 588, -1, -1));

        btnObat.setBackground(new Color(0,0,0,0));
        btnObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Obat.png"))); // NOI18N
        btnObat.setBorder(null);
        btnObat.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/ObatAktif.png"))); // NOI18N
        btnObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObatActionPerformed(evt);
            }
        });
        getContentPane().add(btnObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 514, -1, -1));

        btnJadwalPraktek.setBackground(new Color(0,0,0,0));
        btnJadwalPraktek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/JadwalPraktek.png"))); // NOI18N
        btnJadwalPraktek.setBorder(null);
        btnJadwalPraktek.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/JadwalPraktekAktif.png"))); // NOI18N
        btnJadwalPraktek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalPraktekActionPerformed(evt);
            }
        });
        getContentPane().add(btnJadwalPraktek, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 440, -1, -1));

        btnPemeriksaan.setBackground(new Color(0,0,0,0));
        btnPemeriksaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Pemeriksaan.png"))); // NOI18N
        btnPemeriksaan.setBorder(null);
        btnPemeriksaan.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PemeriksaanAktif.png"))); // NOI18N
        btnPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemeriksaanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPemeriksaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 366, -1, -1));

        btnPoli.setBackground(new Color(0,0,0,0));
        btnPoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Poli.png"))); // NOI18N
        btnPoli.setBorder(null);
        btnPoli.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PoliAktif.png"))); // NOI18N
        btnPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliActionPerformed(evt);
            }
        });
        getContentPane().add(btnPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 292, -1, -1));

        btnDokter.setBackground(new Color(0,0,0,0));
        btnDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Dokter.png"))); // NOI18N
        btnDokter.setBorder(null);
        btnDokter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/DokterAktif.png"))); // NOI18N
        btnDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokterActionPerformed(evt);
            }
        });
        getContentPane().add(btnDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 218, -1, -1));

        btnPegawai.setBackground(new Color(0,0,0,0));
        btnPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Pegawai.png"))); // NOI18N
        btnPegawai.setBorder(null);
        btnPegawai.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PegawaiAktif.png"))); // NOI18N
        btnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 144, -1, -1));

        btnPendaftaran.setBackground(new Color(0,0,0,0));
        btnPendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Pendaftaran.png"))); // NOI18N
        btnPendaftaran.setBorder(null);
        btnPendaftaran.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/PendaftaranAktif.png"))); // NOI18N
        btnPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendaftaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 70, -1, -1));

        btnHome.setBackground(new Color(0,0,0,0));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hospital.png"))); // NOI18N
        btnHome.setToolTipText("Home");
        btnHome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hospitalAktif.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 20, -1, -1));

        tgl.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        tgl.setForeground(new java.awt.Color(51, 51, 51));
        tgl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tgl.setText("19 Mei 2021");
        getContentPane().add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 50, 240, -1));

        username.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("User");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 100, 180, -1));

        txtjam.setFont(new java.awt.Font("Digital-7 Mono", 1, 25)); // NOI18N
        txtjam.setForeground(new java.awt.Color(51, 51, 51));
        txtjam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtjam.setText("17:18:09");
        getContentPane().add(txtjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 572, 110, 40));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/navi.png"))); // NOI18N
        getContentPane().add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/header.png"))); // NOI18N
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/bgMenuHome.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINActionPerformed
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MINActionPerformed
    private void Tampil_Tanggal(){
        int detik, menit, jam, hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        java.util.Date dateTime = new java.util.Date();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String namahariarr[] = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        int harinama = dateTime.getDay();
        String namahari = namahariarr[harinama];
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        int test = date.get(Calendar.DAY_OF_WEEK);
        
        tgl.setText(namahari + ", "+ hari+" "+namabulan[bulan]+" "+tahun);
    }
    
    private void Tampil_Jam(){
        ActionListener taskPerformer = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt) {
               String nol_jam = "", nol_menit = "", nol_detik = "";
               
               java.util.Date dateTime = new java.util.Date();
               int nilai_jam = dateTime.getHours();
               int nilai_menit = dateTime.getMinutes();
               int nilai_detik = dateTime.getSeconds();
                              
               if (nilai_jam <= 9) nol_jam = "0";
               if (nilai_menit <= 9) nol_menit = "0";
               if (nilai_detik <= 9) nol_detik = "0";
               
               String jam = nol_jam + Integer.toString(nilai_jam);
               String menit = nol_menit + Integer.toString(nilai_menit);
               String detik = nol_detik + Integer.toString(nilai_detik);
               txtjam.setText(jam + ":" + menit + ":" + detik + "");
            }
        };
        new Timer (1000, taskPerformer).start();
    }
    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void btnPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaranActionPerformed
        // TODO add your handling code here:
        new Pendaftaran.DataPasien().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPendaftaranActionPerformed

    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        // TODO add your handling code here:
        new MenuPegawai.MenuPegawai().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPegawaiActionPerformed

    private void btnDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionPerformed
        // TODO add your handling code here:
        Dokter.MenuDokter frm = new Dokter.MenuDokter();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDokterActionPerformed

    private void btnPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliActionPerformed
        // TODO add your handling code here:
        new MenuPoli.MenuPoli().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPoliActionPerformed

    private void btnPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemeriksaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPemeriksaanActionPerformed

    private void btnJadwalPraktekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalPraktekActionPerformed
        // TODO add your handling code here:
        new MenuJadwal.MenuJadwal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJadwalPraktekActionPerformed

    private void btnObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatActionPerformed
        // TODO add your handling code here:
        new MenuObat().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnObatActionPerformed

    private void btnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPembayaranActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar?", "Log out!", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION){
            new Login.Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for(double i = 0.0; i <= 1.0; i = i + 0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(20);
            }
           catch(Exception e){
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton MAX;
    private javax.swing.JButton MIN;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnDokter;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnJadwalPraktek;
    private javax.swing.JButton btnObat;
    private javax.swing.JButton btnPegawai;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnPemeriksaan;
    private javax.swing.JButton btnPendaftaran;
    private javax.swing.JButton btnPoli;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel header;
    private javax.swing.JLabel navi;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel txtjam;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
