/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Evan Henderson
 */
public class AddMahasiswa extends javax.swing.JFrame {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    static String hasil = null;
    static int id_kelas = 0;

    /**
     * Creates new form Input
     */
    public AddMahasiswa() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pplbo_quiz2", "root", "");
            System.out.println("Connected to database");
            st = conn.createStatement();
        } catch (Exception e) {
        }
        initComponents();
        kelas.setModel(new DefaultComboBoxModel<>(new String[]{
            "pilih"
        }));
        try {
            rs = st.executeQuery("SELECT nama_kelas FROM kelas");
            while (rs.next()) {
                kelas.addItem(rs.getString("nama_kelas"));
            }
        } catch (Exception e) {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        submitTambahMahasiswa1 = new javax.swing.JButton();
        no_presensi = new javax.swing.JTextField();
        header1 = new javax.swing.JLabel();
        backTambahMahasiswa = new javax.swing.JButton();
        submitUpdateMahasiswa = new javax.swing.JButton();
        submitDeleteMahasiswa = new javax.swing.JButton();
        kelas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Kelas");

        jLabel6.setText("NIM");

        jLabel7.setText("Nama");

        jLabel8.setText("No Presensi");

        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });

        submitTambahMahasiswa1.setText("Submit");
        submitTambahMahasiswa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTambahMahasiswa1ActionPerformed(evt);
            }
        });

        no_presensi.setActionCommand("<Not Set>");
        no_presensi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        header1.setText("Tambah Mahasiswa");

        backTambahMahasiswa.setText("Back");
        backTambahMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTambahMahasiswaActionPerformed(evt);
            }
        });

        submitUpdateMahasiswa.setText("Update");
        submitUpdateMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitUpdateMahasiswaActionPerformed(evt);
            }
        });

        submitDeleteMahasiswa.setText("Delete");
        submitDeleteMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDeleteMahasiswaActionPerformed(evt);
            }
        });

        kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------" }));
        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(backTambahMahasiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitDeleteMahasiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(submitUpdateMahasiswa)
                .addGap(18, 18, 18)
                .addComponent(submitTambahMahasiswa1)
                .addGap(55, 55, 55))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(69, 69, 69)
                            .addComponent(nim))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(56, 56, 56)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(no_presensi))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 54, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backTambahMahasiswa)
                    .addComponent(submitTambahMahasiswa1)
                    .addComponent(submitUpdateMahasiswa)
                    .addComponent(submitDeleteMahasiswa))
                .addGap(60, 60, 60))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(header1)
                    .addGap(24, 24, 24)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(no_presensi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jLabel5)
                    .addGap(0, 135, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimActionPerformed

    private void submitTambahMahasiswa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTambahMahasiswa1ActionPerformed
        // TODO add your handling code here:
        try {
            System.out.println(id_kelas);

            PreparedStatement stmt = conn.prepareStatement("insert into mahasiswa values(?,?,?,?)");
            stmt.setString(1, nim.getText());
            stmt.setString(2, nama.getText());
            stmt.setString(3, no_presensi.getText());
            stmt.setInt(4, id_kelas);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitTambahMahasiswa1ActionPerformed

    private void backTambahMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTambahMahasiswaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backTambahMahasiswaActionPerformed

    private void submitUpdateMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitUpdateMahasiswaActionPerformed
        // TODO add your handling code here:
        try {
            st.executeUpdate(String.format("UPDATE mahasiswa SET nama = '%s', no_presensi = %d, id_kelas = %d WHERE nim = '%s'", this.nama.getText(), Integer.parseInt(this.no_presensi.getText()), id_kelas, this.nim.getText()));
            System.out.println("Data mahasiswa berhasil diubah");
        } catch (SQLException e) {
            System.out.println("Data mahasiswa gagal dibuat, pastikan id kelas telah sesuai");
        }
    }//GEN-LAST:event_submitUpdateMahasiswaActionPerformed

    private void submitDeleteMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDeleteMahasiswaActionPerformed
        // TODO add your handling code here:
        try {
            System.out.println(String.format("DELETE FROM mahasiswa WHERE nim = '%s'", this.nim.getText()));
            st.executeUpdate(String.format("DELETE FROM mahasiswa WHERE nim = '%s'", this.nim.getText()));
            System.out.println("Data mahasiswa telah dihapus");
        } catch (SQLException e) {
            System.out.println("Data mahasiswa gagal dihapus, pastikan nim telah sesuai dan nilai yang dimiliki kosong!");
        }
    }//GEN-LAST:event_submitDeleteMahasiswaActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
        hasil = kelas.getSelectedItem().toString();
        System.out.println(hasil);
        try {
            rs = st.executeQuery("SELECT id_kelas FROM kelas WHERE nama_kelas = '" + hasil + "'");
            rs.next();
            id_kelas = rs.getInt("id_kelas");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_kelasActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backTambahMahasiswa;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField no_presensi;
    private javax.swing.JButton submitDeleteMahasiswa;
    private javax.swing.JButton submitTambahMahasiswa1;
    private javax.swing.JButton submitUpdateMahasiswa;
    // End of variables declaration//GEN-END:variables
}
