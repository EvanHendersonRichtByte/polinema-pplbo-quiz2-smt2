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
public class AddMatkul extends javax.swing.JFrame {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    static String hasil;
    static int id_dosen;

    /**
     * Creates new form Input
     */
    public AddMatkul() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pplbo_quiz2", "root", "");
            System.out.println("Connected to database");
            st = conn.createStatement();
        } catch (Exception e) {
        }
        initComponents();
        dosen.setModel(new DefaultComboBoxModel<>(new String[]{
            "pilih"
        }));
        try {
            rs = st.executeQuery("SELECT nama_dosen FROM dosen");
            while (rs.next()) {
                dosen.addItem(rs.getString("nama_dosen"));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_matkul = new javax.swing.JTextField();
        nama_matkul = new javax.swing.JTextField();
        submitTambahMatkul = new javax.swing.JButton();
        header1 = new javax.swing.JLabel();
        backTambahMahasiswa = new javax.swing.JButton();
        submitUpdateMatkul = new javax.swing.JButton();
        submitDeleteMatkul = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dosen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("ID Matkul");

        jLabel7.setText("Nama Matkul");

        id_matkul.setText("NULL");
        id_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_matkulActionPerformed(evt);
            }
        });

        submitTambahMatkul.setText("Submit");
        submitTambahMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTambahMatkulActionPerformed(evt);
            }
        });

        header1.setText("Matkul");

        backTambahMahasiswa.setText("Back");
        backTambahMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTambahMahasiswaActionPerformed(evt);
            }
        });

        submitUpdateMatkul.setText("Update");
        submitUpdateMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitUpdateMatkulActionPerformed(evt);
            }
        });

        submitDeleteMatkul.setText("Delete");
        submitDeleteMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDeleteMatkulActionPerformed(evt);
            }
        });

        jLabel8.setText("Dosen");

        dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id_matkul)
                                    .addComponent(nama_matkul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(backTambahMahasiswa)
                                .addGap(29, 29, 29)
                                .addComponent(submitDeleteMatkul)
                                .addGap(18, 18, 18)
                                .addComponent(submitUpdateMatkul)
                                .addGap(18, 18, 18)
                                .addComponent(submitTambahMatkul)))
                        .addGap(54, 54, 54))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1)
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backTambahMahasiswa)
                    .addComponent(submitTambahMatkul)
                    .addComponent(submitUpdateMatkul)
                    .addComponent(submitDeleteMatkul))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void id_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_matkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_matkulActionPerformed

    private void submitTambahMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTambahMatkulActionPerformed
        // TODO add your handling code here:
        try {
            st.executeUpdate(String.format("INSERT INTO matkul VALUES(null,'%s', %d)", this.nama_matkul.getText(), id_dosen));
            System.out.println("Data matkul berhasil dibuat");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitTambahMatkulActionPerformed

    private void backTambahMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTambahMahasiswaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backTambahMahasiswaActionPerformed

    private void submitUpdateMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitUpdateMatkulActionPerformed
        // TODO add your handling code here:
        try {
            st.executeUpdate(String.format("UPDATE matkul SET nama_matkul = '%s', id_dosen = %d WHERE id_matkul = %d", this.nama_matkul.getText(), id_dosen, Integer.parseInt(this.id_matkul.getText())));
            System.out.println("Data matkul telah diubah");
        } catch (SQLException e) {
            System.out.println("Data matkul gagal diubah, pastikan mahasiswa di matkul tersebut kosong");
        }
    }//GEN-LAST:event_submitUpdateMatkulActionPerformed

    private void submitDeleteMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDeleteMatkulActionPerformed
        // TODO add your handling code here:
        try {
            st.executeUpdate(String.format("DELETE FROM matkul WHERE id_matkul = %d", Integer.parseInt(this.id_matkul.getText())));
            System.out.println("Data matkul telah dihapus");
        } catch (SQLException e) {
            System.out.println("Data matkul gagal dihapus, pastikan data pada tabel mahasiswa dan nilai di matkul tersebut kosong");
        }
    }//GEN-LAST:event_submitDeleteMatkulActionPerformed

    private void dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosenActionPerformed
        // TODO add your handling code here:
        hasil = dosen.getSelectedItem().toString();
        System.out.println(hasil);
        try {
            rs = st.executeQuery("SELECT id_dosen FROM dosen WHERE nama_dosen = '" + hasil + "'");
            rs.next();
            id_dosen = rs.getInt("id_dosen");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_dosenActionPerformed

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
            java.util.logging.Logger.getLogger(AddMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMatkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMatkul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backTambahMahasiswa;
    private javax.swing.JComboBox<String> dosen;
    private javax.swing.JLabel header1;
    private javax.swing.JTextField id_matkul;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nama_matkul;
    private javax.swing.JButton submitDeleteMatkul;
    private javax.swing.JButton submitTambahMatkul;
    private javax.swing.JButton submitUpdateMatkul;
    // End of variables declaration//GEN-END:variables
}
