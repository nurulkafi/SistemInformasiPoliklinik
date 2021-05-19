/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPegawai;

import MenuUtama.*;
import Koneksi.GlobalVar;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author donih
 */
public class inputData extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public inputData() {
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

        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnInput = new javax.swing.JButton();
        MIN = new javax.swing.JButton();
        MAX = new javax.swing.JButton();
        CLOSE = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnObat = new javax.swing.JButton();
        btnJadwalPraktek = new javax.swing.JButton();
        btnPemeriksaan = new javax.swing.JButton();
        btnPoli = new javax.swing.JButton();
        btnDokter = new javax.swing.JButton();
        btnPegawai = new javax.swing.JButton();
        btnPendaftaran = new javax.swing.JButton();
        Poli1 = new javax.swing.JComboBox<>();
        Tgllahir = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();
        Telepon = new javax.swing.JLabel();
        Poli = new javax.swing.JComboBox<>();
        jnsKelamin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        alamat = new javax.swing.JLabel();
        txtNIP1 = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        txtNIP = new javax.swing.JTextField();
        NIP = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        txtTglLahir = new javax.swing.JLabel();
        navi = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setBackground(new Color(0,0,0,0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/delete.png"))); // NOI18N
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/deleteaktif.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 290, 90, 80));

        btnEdit.setBackground(new Color(0,0,0,0));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/edit.png"))); // NOI18N
        btnEdit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEdit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/editaktif.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 210, 90, 80));

        btnInput.setBackground(new Color(0,0,0,0));
        btnInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/input.png"))); // NOI18N
        btnInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInput.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/inputaktif.png"))); // NOI18N
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });
        getContentPane().add(btnInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 130, 90, 80));

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

        btnLogout.setBackground(new Color(0,0,0,0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/Logout.png"))); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/LogoutAktif.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 664, -1, -1));

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
        btnPegawai.setSelected(true);
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

        Poli1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Poli1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Poli1.setBorder(null);
        Poli1.setPreferredSize(new java.awt.Dimension(5, 28));
        Poli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Poli1ActionPerformed(evt);
            }
        });
        getContentPane().add(Poli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 330, 30));

        Tgllahir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Tgllahir.setForeground(new java.awt.Color(30, 174, 152));
        Tgllahir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/Group.png"))); // NOI18N
        Tgllahir.setText("Tanggal Lahir");
        getContentPane().add(Tgllahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 140, -1));

        txtTelepon.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtTelepon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelepon.setToolTipText("Username");
        txtTelepon.setAlignmentX(1.0F);
        txtTelepon.setAlignmentY(1.0F);
        txtTelepon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 174, 152), 2));
        txtTelepon.setCaretColor(new java.awt.Color(30, 174, 152));
        txtTelepon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleponActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 330, 30));

        Telepon.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Telepon.setForeground(new java.awt.Color(30, 174, 152));
        Telepon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/bi_telephone-fill.png"))); // NOI18N
        Telepon.setText("Telepon");
        getContentPane().add(Telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 140, -1));

        Poli.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Poli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Poli.setBorder(null);
        Poli.setPreferredSize(new java.awt.Dimension(5, 28));
        Poli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliActionPerformed(evt);
            }
        });
        getContentPane().add(Poli, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 330, 30));

        jnsKelamin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jnsKelamin.setForeground(new java.awt.Color(30, 174, 152));
        jnsKelamin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/fa-solid_transgender.png"))); // NOI18N
        jnsKelamin.setText("Jenis Kelamin");
        getContentPane().add(jnsKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 140, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 174, 152), 2));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 330, 100));

        alamat.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        alamat.setForeground(new java.awt.Color(30, 174, 152));
        alamat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/entypo_address.png"))); // NOI18N
        alamat.setText("Alamat");
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 140, -1));

        txtNIP1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNIP1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNIP1.setToolTipText("Username");
        txtNIP1.setAlignmentX(1.0F);
        txtNIP1.setAlignmentY(1.0F);
        txtNIP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 174, 152), 2));
        txtNIP1.setCaretColor(new java.awt.Color(30, 174, 152));
        txtNIP1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNIP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIP1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNIP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 330, 30));

        nama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(30, 174, 152));
        nama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/mdi_account.png"))); // NOI18N
        nama.setText("Nama Pegawai");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 140, -1));

        txtNIP.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNIP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNIP.setToolTipText("Username");
        txtNIP.setAlignmentX(1.0F);
        txtNIP.setAlignmentY(1.0F);
        txtNIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 174, 152), 2));
        txtNIP.setCaretColor(new java.awt.Color(30, 174, 152));
        txtNIP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIPActionPerformed(evt);
            }
        });
        getContentPane().add(txtNIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 330, 30));

        NIP.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NIP.setForeground(new java.awt.Color(30, 174, 152));
        NIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/entypo_v-card.png"))); // NOI18N
        NIP.setText("Nomor Induk Pegawai");
        getContentPane().add(NIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 180, -1));

        btnBatal.setBackground(new java.awt.Color(204, 0, 0));
        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBatal.setBorderPainted(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 160, 40));

        btnSimpan.setBackground(new java.awt.Color(30, 174, 152));
        btnSimpan.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSimpan.setBorderPainted(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 160, 40));

        Title.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/Tambah Data.png"))); // NOI18N
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 80, -1, -1));

        txtTglLahir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTglLahir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/bgpanel.png"))); // NOI18N
        getContentPane().add(txtTglLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 980, -1));

        navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/navi.png"))); // NOI18N
        getContentPane().add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuUtama/Asset/header.png"))); // NOI18N
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPegawai/Asset/bgmenupegawai.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINActionPerformed
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MINActionPerformed

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void btnPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendaftaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPendaftaranActionPerformed

    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPegawaiActionPerformed

    private void btnDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionPerformed
        // TODO add your handling code here:
        new Dokter.MenuDokter().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDokterActionPerformed

    private void btnPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPoliActionPerformed

    private void btnPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemeriksaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPemeriksaanActionPerformed

    private void btnJadwalPraktekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalPraktekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJadwalPraktekActionPerformed

    private void btnObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObatActionPerformed

    private void btnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPembayaranActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar?", "Log out!", JOptionPane.YES_NO_OPTION);
        if (opsi == JOptionPane.YES_OPTION){
            new Login.Login().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        new editData().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIPActionPerformed

    private void txtNIP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIP1ActionPerformed

    private void PoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliActionPerformed

    private void txtTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleponActionPerformed

    private void Poli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Poli1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Poli1ActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(inputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton MAX;
    private javax.swing.JButton MIN;
    private javax.swing.JLabel NIP;
    private javax.swing.JComboBox<String> Poli;
    private javax.swing.JComboBox<String> Poli1;
    private javax.swing.JLabel Telepon;
    private javax.swing.JLabel Tgllahir;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDokter;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnJadwalPraktek;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnObat;
    private javax.swing.JButton btnPegawai;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnPemeriksaan;
    private javax.swing.JButton btnPendaftaran;
    private javax.swing.JButton btnPoli;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jnsKelamin;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel navi;
    private javax.swing.JTextField txtNIP;
    private javax.swing.JTextField txtNIP1;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JLabel txtTglLahir;
    // End of variables declaration//GEN-END:variables
}
