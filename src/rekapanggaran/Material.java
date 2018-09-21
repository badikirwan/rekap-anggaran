/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekapanggaran;

import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import popup.MaterialData;
import popup.OperasionalData;

/**
 *
 * @author BadikIrwan
 */
public class Material extends javax.swing.JPanel {

    private Component rootPane;

    /**
     * Creates new form Material
     */
    public Material() {
        initComponents();
        Pekerjaan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbKegiatan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MATERIAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pilih Kegiatan"));

        jLabel2.setText("Kegiatan");

        cbKegiatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH" }));
        cbKegiatan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKegiatanItemStateChanged(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_sync-01_186384.png"))); // NOI18N
        jButton1.setToolTipText("Refresh kegiatan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PEKERJAAN", "MINGGU KE", "TANGGAL", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setToolTipText("Hapus Data");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/show.png"))); // NOI18N
        btnShow.setText("Detail");
        btnShow.setToolTipText("Detail Data");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setToolTipText("Tambah Data");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbKegiatanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKegiatanItemStateChanged
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("PEKERJAAN");
        model.addColumn("MINGGU KE");
        model.addColumn("TANGGAL");
        model.addColumn("TOTAL");
        try {
            Connection con = Koneksi.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_material WHERE pekerjaan='"+cbKegiatan.getSelectedItem().toString()+"'");
            if(rs.next() == true) {
                do {
                    model.addRow(new Object[]{
                    rs.getString("id"),rs.getString("pekerjaan"),"Minggu Ke- "+rs.getString("minggu_ke"),rs.getString("tanggal"),rs.getString("jumlah")});
                    tabel.setModel(model);
                } while(rs.next());
            } else {
                tabel.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbKegiatanItemStateChanged

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = tabel.getSelectedRow();
        try {
            if(row == -1) {
                JOptionPane.showMessageDialog(rootPane, "Anda belum memilih tabel");
            } else {
                Connection con = Koneksi.connect();
                Statement st = con.createStatement();
                st.executeUpdate("DELETE FROM tbl_material WHERE id='"+tabel.getModel().getValueAt(row, 0)+"'");
                JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus");
                LoadData();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        MaterialData admin = new MaterialData(null, true, this);
        admin.show();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        int row = tabel.getSelectedRow();
        try {
            if(row == -1) {
                JOptionPane.showMessageDialog(rootPane, "Anda belum memilih tabel");
            } else {
                Connection con = Koneksi.connect();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM tbl_material WHERE id='"+tabel.getModel().getValueAt(row, 0)+"'");
                if(rs.next()) {
                    MaterialData admin = new MaterialData(null, true, this);
                    admin.id.setText(rs.getString("id"));
                    admin.cbPekerjaan.setSelectedItem(rs.getString("pekerjaan"));
                    admin.cbMinggu.setSelectedItem(rs.getString("minggu_ke"));
                    String tgl = rs.getString("tanggal");
                    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = format.parse(tgl);
                    admin.tanggal.setDate(date);
                    admin.txtPenerima.setText(rs.getString("penerima"));
                    admin.txtUraian.setText(rs.getString("uraian"));
                    admin.cbJenis.setSelectedItem(rs.getString("jenis"));
                    admin.txtToko.setText(rs.getString("toko"));
                    admin.txtVolume.setText(rs.getString("volume"));
                    admin.txtSatuan.setText(rs.getString("satuan"));
                    admin.txtHarga.setText(rs.getString("harga"));
                    admin.txtJumlah.setText(rs.getString("jumlah"));
                    admin.btnSimpan.setText("Rubah");
                    admin.show();
                }
            }
        } catch (HeadlessException | SQLException | ParseException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cbKegiatan.removeAllItems();
        cbKegiatan.addItem("PILIH");
        Pekerjaan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Pekerjaan() {
        try {
            Connection con = Koneksi.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT pekerjaan FROM tbl_kegiatan");
            while(rs.next()) {
                cbKegiatan.addItem(rs.getString("pekerjaan"));
            }
        } catch (Exception e) {
        }
    }
    
    private void kosongkanTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("PEKERJAAN");
        model.addColumn("MINGGU KE");
        model.addColumn("TANGGAL");
        model.addColumn("TOTAL");
    }
    
    public void LoadData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("PEKERJAAN");
        model.addColumn("MINGGU KE");
        model.addColumn("TANGGAL");
        model.addColumn("TOTAL");
        try {
            Connection con = Koneksi.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tbl_material WHERE pekerjaan='"+cbKegiatan.getSelectedItem()+"'");
            while(rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id"),rs.getString("pekerjaan"),"Minggu Ke- "+rs.getString("minggu_ke"),rs.getString("tanggal"),rs.getString("jumlah")});
            tabel.setModel(model);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbKegiatan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
