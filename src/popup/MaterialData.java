/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popup;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rekapanggaran.Administrasi;
import rekapanggaran.Koneksi;
import rekapanggaran.Material;
import rekapanggaran.Operasional;

/**
 *
 * @author BadikIrwan
 */
public class MaterialData extends javax.swing.JDialog {
    
    private Material aThis;
    private String tgl;
    private Object pekerjaan;
    private Object minggu;
    private String pengguna;
    private String uraian;
    private String volume;
    private String satuan;
    private String harga;
    private String jumlah;
    private String penerima;
    private Object jenis;
    private String toko;

    /**
     * Creates new form Administrasi
     * @param parent
     * @param modal
     * @param aThis
     */
    public MaterialData(java.awt.Frame parent, boolean modal, Material aThis) {
        super(parent, modal);
        this.aThis = aThis;
        initComponents();
        LoadPekerjaan();
    }

    private MaterialData(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbPekerjaan = new javax.swing.JComboBox<>();
        cbMinggu = new javax.swing.JComboBox<>();
        tanggal = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtVolume = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPenerima = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUraian = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtToko = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Material Data");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Peket Pekerjaan ");

        jLabel3.setText("Minggu Ke");

        jLabel5.setText("Tanggal");

        cbPekerjaan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH" }));
        cbPekerjaan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPekerjaanItemStateChanged(evt);
            }
        });

        cbMinggu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH" }));

        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });

        jLabel6.setText("Volume");

        txtVolume.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVolumeKeyReleased(evt);
            }
        });

        jLabel8.setText("Satuan");

        jLabel10.setText("Harga");

        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHargaKeyReleased(evt);
            }
        });

        jLabel7.setText("Jumlah");

        txtJumlah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtJumlah.setText("0");
        txtJumlah.setEnabled(false);

        jLabel9.setText("Penerima");

        jLabel11.setText("Uraian");

        txtUraian.setColumns(20);
        txtUraian.setRows(3);
        jScrollPane3.setViewportView(txtUraian);

        jLabel2.setText("Jenis");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "SEMEN", "BESI POLOS", "BESI ULIR", "BATU BATA", "BATU KORAL", "BATU BELAH", "PASIR PASANG", "PASIR COR", "PASIR URUG", "GENTENG", "KAYU", "KERAMIK", "LAIN - LAIN" }));

        jLabel4.setText("Toko");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbPekerjaan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPenerima)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(123, 123, 123)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVolume)
                            .addComponent(cbJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtToko)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJumlah)
                            .addComponent(txtHarga))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMinggu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        id.setText("0");
        id.setMaximumSize(new java.awt.Dimension(0, 0));
        id.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(505, Short.MAX_VALUE)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(351, 351, 351)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(128, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        pekerjaan = cbPekerjaan.getSelectedItem();
        minggu = cbMinggu.getSelectedItem();
        penerima = txtPenerima.getText();
        uraian = txtUraian.getText();
        jenis = cbJenis.getSelectedItem();
        toko = txtToko.getText();
        volume = txtVolume.getText();
        satuan = txtSatuan.getText();
        harga = txtHarga.getText();
        jumlah = txtJumlah.getText();
        try {
            Connection con = Koneksi.connect();
            Statement st = con.createStatement();
            
            if(btnSimpan.getText().equals("Simpan")) {
                String query = "INSERT INTO tbl_material(id,pekerjaan,minggu_ke,tanggal,penerima,uraian,jenis,toko,volume,satuan,harga,jumlah)"
                        + "VALUES(null,'"+pekerjaan+"','"+minggu+"','"+tgl+"','"+penerima+"','"+uraian+"','"+jenis+"','"+toko+"','"+volume+"','"+satuan+"','"+harga+"','"+jumlah+"')";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            } else {
                String query ="UPDATE tbl_material SET pekerjaan='"+pekerjaan+"',minggu_ke='"+minggu+"',tanggal='"+tgl+"',penerima='"+penerima+"',"
                        + "uraian='"+uraian+"',jenis='"+jenis+"',toko='"+toko+"',volume='"+volume+"',satuan='"+satuan+"',harga='"+harga+"',jumlah='"+jumlah+"' WHERE id='"+id.getText()+"'";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Berhasil dirubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }
        Clear();
        aThis.LoadData();
        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cbPekerjaanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPekerjaanItemStateChanged
        try {
            Connection con = Koneksi.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT minggu FROM tbl_kegiatan WHERE pekerjaan='"+cbPekerjaan.getSelectedItem()+"'");
            while(rs.next()) {
                int ok = Integer.parseInt(rs.getString("minggu"));
                for(int i= 1; i <= ok; i++) {
                 cbMinggu.addItem(Integer.toString(i));
                }  
            }
        } catch (SQLException | NumberFormatException e) {
        }
    }//GEN-LAST:event_cbPekerjaanItemStateChanged

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
        if(tanggal.getDate()!=null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            tgl = format.format(tanggal.getDate());
        }
    }//GEN-LAST:event_tanggalPropertyChange

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        Clear();
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtVolumeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVolumeKeyReleased
        int a, b;
        if(txtVolume.getText().isEmpty()){
            a = 0;
        } else {
            a = Integer.parseInt(txtVolume.getText());
        }
        if(txtHarga.getText().isEmpty()){
            b = 0;
        } else {
            b = Integer.parseInt(txtHarga.getText());
        }
        int result = a*b;
        txtJumlah.setText(String.valueOf(result));
    }//GEN-LAST:event_txtVolumeKeyReleased

    private void txtHargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyReleased
        int a, b;
        if(txtVolume.getText().isEmpty()){
            a = 0;
        } else {
            a = Integer.parseInt(txtVolume.getText());
        }
        if(txtHarga.getText().isEmpty()){
            b = 0;
        } else {
            b = Integer.parseInt(txtHarga.getText());
        }
        int result = a*b;
        txtJumlah.setText(String.valueOf(result));
    }//GEN-LAST:event_txtHargaKeyReleased

    private void LoadPekerjaan() {
        try {
            Connection con = Koneksi.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT pekerjaan FROM tbl_kegiatan");
            while(rs.next()) {
                cbPekerjaan.addItem(rs.getString("pekerjaan"));
            }
        } catch (Exception e) {
        }
    }
    
    public void Clear() {
        cbPekerjaan.setSelectedIndex(0);
        cbMinggu.setSelectedIndex(0);
        tanggal.setDate(null);
        txtPenerima.setText("");
        txtUraian.setText("");
        txtVolume.setText("");
        txtSatuan.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
    }
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
            java.util.logging.Logger.getLogger(MaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaterialData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MaterialData dialog = new MaterialData(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    public javax.swing.JButton btnSimpan;
    public javax.swing.JComboBox<String> cbJenis;
    public javax.swing.JComboBox<String> cbMinggu;
    public javax.swing.JComboBox<String> cbPekerjaan;
    public javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    public com.toedter.calendar.JDateChooser tanggal;
    public javax.swing.JTextField txtHarga;
    public javax.swing.JTextField txtJumlah;
    public javax.swing.JTextField txtPenerima;
    public javax.swing.JTextField txtSatuan;
    public javax.swing.JTextField txtToko;
    public javax.swing.JTextArea txtUraian;
    public javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables
}
