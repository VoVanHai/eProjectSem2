/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychitieucanhan;

import Cryptography.Valition;
import dataaccess.phongkehoach.NhanVienImp;
import dataaccess.sale.NhaCungCapImp;
import dataaccess.sale.SanPhamImp;
import javax.swing.table.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import sale.NhaCungCap;
import sale.SanPham;

public class SanPhamUI extends javax.swing.JInternalFrame {

    //êdeeeeeeeeeee
    DefaultComboBoxModel cb = new DefaultComboBoxModel();
    Valition va = new Valition();
    Calendar C = Calendar.getInstance();
    SanPhamImp simp = new SanPhamImp();
    private int selRow = 0;

    public SanPhamUI(String username) throws Exception {
        initComponents();

        cbNcc.setModel(cb);

        this.setLocation(5, 98);
        this.setSize(1350, 600);

        C.setTime(new Date());
        findtable(simp.getAll());
        load2ComboBox();
        // cb.addElement(new NhaCungCap("1","uuu"));

    }
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    public void findtable(List<SanPham> listdm) {
        try {

            DefaultTableModel dfm = new DefaultTableModel();
            dfm.addColumn("Mã SP");
            dfm.addColumn("Tên SP");
            dfm.addColumn("Giá");
            dfm.addColumn("Số Lượng");
            dfm.addColumn("Nhà CC");
            dfm.addColumn("Mô tả");
            dfm.addColumn("Nha SX");
            dfm.addColumn("Hinh Ảnh");
            dfm.addColumn("Ngày SX");
            dfm.addColumn("Hạn sử dụng");

            for (SanPham dm : listdm) {
                dfm.addRow(new Object[]{
                    dm.getMaSP(),
                    dm.getTenSP(),
                    dm.getGiaSP(),
                    dm.getSoluong(),
                    dm.getMaNCC(),
                    dm.getMotaSP(),
                    dm.getNhaSX(),
                    dm.getHinhAnh(),
                    sdf.format(dm.getNgaySX()),
                    sdf.format(dm.getHanSuDung())});
            }
            this.tblSanPham.setModel(dfm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        ccbHSD = new org.freixas.jcalendar.JCalendarCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMoTa = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbNcc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ccbNgaySX = new org.freixas.jcalendar.JCalendarCombo();
        txtGia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        txtNhaSX = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtBrowser = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3search = new javax.swing.JTextField();
        jButton4search = new javax.swing.JButton();
        jLabel6finduseid = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tên Sản Phẩm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nhà Cung Cấp");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ngày sản Xuất");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mô Tả");

        txtTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        taMoTa.setColumns(20);
        taMoTa.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        taMoTa.setLineWrap(true);
        taMoTa.setRows(5);
        taMoTa.setWrapStyleWord(true);
        taMoTa.setDoubleBuffered(true);
        taMoTa.setDragEnabled(true);
        jScrollPane1.setViewportView(taMoTa);

        btnAdd.setBackground(new java.awt.Color(204, 153, 255));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/Creat.png"))); // NOI18N
        btnAdd.setText("Create");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/edit.png"))); // NOI18N
        btnUpdate.setText("Updates");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClean.setBackground(new java.awt.Color(204, 153, 255));
        btnClean.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/edit-clear.png"))); // NOI18N
        btnClean.setText("Clearn");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nhà Sản Xuất");

        cbNcc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNccItemStateChanged(evt);
            }
        });
        cbNcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNccActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Hạn Sử Dụng");

        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Giá");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Hình ảnh");

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 153, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/btn_delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Số Lượng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel10)
                                .addComponent(jLabel5)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addGap(6, 6, 6)))
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbNcc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccbNgaySX, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(txtTenSP)
                    .addComponent(jScrollPane1)
                    .addComponent(ccbHSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNhaSX)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBrowser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpen))
                    .addComponent(txtGia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSL))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhaSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOpen)
                            .addComponent(txtBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ccbNgaySX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ccbHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTextField3search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3searchKeyPressed(evt);
            }
        });

        jButton4search.setBackground(new java.awt.Color(204, 153, 255));
        jButton4search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/search.png"))); // NOI18N
        jButton4search.setText("Search");
        jButton4search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4searchActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3search, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel6finduseid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4search, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6finduseid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {

            SanPhamImp spip = new SanPhamImp();
            String ten = this.txtTenSP.getText();
            String gia = this.txtGia.getText();
            String sl = txtSL.getText();
            String mota = taMoTa.getText();
            NhaCungCap nhacctam = (NhaCungCap) cbNcc.getSelectedItem();
            String nhacc = nhacctam.getMaNCC().toString();
            //String nhacc=cbNcc.getSelectedItem().toString();
            String nhasx = txtNhaSX.getText();
            String ha = txtBrowser.getText();

            if (gia.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mã không được rỗng");
            } else if (ten.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tên không được rỗng");
            } else if (!va.checmoney(gia)) {
                JOptionPane.showMessageDialog(null, "Định dạng không hợp lệ");
            } else if (!ten.isEmpty() && !gia.isEmpty()) {

                SanPham sp = new SanPham();
                sp.setTenSP(ten);
                sp.setGiaSP(Integer.parseInt(gia));
                sp.setSoluong(Integer.parseInt(sl));
                sp.setMotaSP(mota);
                sp.setMaNCC(nhacc);
                sp.setNhaSX(nhasx);
                sp.setHinhAnh(ha);
                sp.setNgaySX(ccbNgaySX.getDate());
                sp.setHanSuDung(ccbHSD.getDate());

                if (spip.add(sp)) {
                    JOptionPane.showMessageDialog(null, "successfully created");
                    btnCleanActionPerformed(evt);
                    findtable(simp.getAll());
                } else {
                    JOptionPane.showMessageDialog(null, "create failure");
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        this.cbNcc.setSelectedItem("");
        this.txtTenSP.setText("");
        this.taMoTa.setText("");
        this.txtGia.setText("");
        this.txtNhaSX.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            SanPhamImp smip = new SanPhamImp();
            int index = this.tblSanPham.getSelectedRow();

            if (index == -1) {
                JOptionPane.showMessageDialog(null, "Không cập nhật các dòng trên bảng");
            } else {
                String id = this.tblSanPham.getValueAt(index, 0).toString();
                //  DailyMoney dai = dmdao.find(Integer.parseInt(id));
                String ten = this.txtTenSP.getText();
                String gia = this.txtGia.getText();
                String sl = txtSL.getText();
                String mota = taMoTa.getText();
                NhaCungCap nhacctam = (NhaCungCap) cbNcc.getSelectedItem();
                String nhacc = nhacctam.getMaNCC().toString();
                String nhasx = txtNhaSX.getText();
                String hinhanh = txtBrowser.getText();

                if (gia.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Mã trống");
                } else if (ten.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Tên trống");
                } else if (!va.checmoney(gia)) {
                    JOptionPane.showMessageDialog(null, "Không hợp lệ");
                } else if (!ten.isEmpty() && !gia.isEmpty()) {

                    SanPham sanpham = new SanPham();
                    sanpham.setMaSP(id);
                    sanpham.setTenSP(ten);
                    sanpham.setGiaSP(Integer.parseInt(gia));
                    sanpham.setSoluong(Integer.parseInt(sl));
                    sanpham.setMotaSP(mota);
                    sanpham.setMaNCC(nhacc);
                    sanpham.setNhaSX(nhasx);
                    sanpham.setHinhAnh(hinhanh);
                    sanpham.setNgaySX(this.ccbNgaySX.getDate());
                    sanpham.setHanSuDung(this.ccbHSD.getDate());

                    if (smip.update(sanpham)) {
                        JOptionPane.showMessageDialog(null, "Cập nhập thành công");
                        findtable(simp.getAll());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cập nhập thất bại");
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = this.tblSanPham.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Không thể delete dòng trên bảng");
        } else {

            int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc không", "Xóa Sản Phẩm", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                try {
                    String masp = this.tblSanPham.getValueAt(index, 0).toString();
                    SanPham sp = new SanPham();
                    sp.setMaSP(masp);
                    if (simp.remove(sp)) {
                        JOptionPane.showMessageDialog(null, "Xóa thành công");
                        findtable(simp.getAll());
                    } else {
                        JOptionPane.showMessageDialog(null, "Xóa thất bại");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(SanPhamUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    public void load2ComboBox() throws Exception {
        NhaCungCapImp ncci = new NhaCungCapImp();
        ArrayList<NhaCungCap> lst = ncci.getAll();
        for (NhaCungCap s : lst) {
            cb.addElement(new NhaCungCap(s.getMaNCC().toString(), s.getTenNCC().toString()));
        }
    }

    private void jButton4searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4searchActionPerformed
        search();
    }//GEN-LAST:event_jButton4searchActionPerformed

    private void jTextField3searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3searchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search();
        }
    }//GEN-LAST:event_jTextField3searchKeyPressed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        JFileChooser s = new JFileChooser();
        FileFilter file = new FileNameExtensionFilter("Image file", "gif", "png", "jpg");
        s.setFileFilter(file);
        int returnValue = s.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = s.getSelectedFile();
            String st = selectedFile.getPath();
            txtBrowser.setText(st);
        }

    }//GEN-LAST:event_btnOpenActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        try {
            SanPham sp = new SanPham();
            int index = this.tblSanPham.getSelectedRow();
            String id = this.tblSanPham.getValueAt(index, 0).toString();
            sp.setMaSP(id);
            sp = simp.find(sp);
            txtTenSP.setText(sp.getTenSP());
            txtGia.setText(String.valueOf(sp.getGiaSP()));
            txtSL.setText(String.valueOf(sp.getSoluong()));
            taMoTa.setText(sp.getMotaSP());
            cbNcc.setSelectedItem(sp.getMaNCC());
            txtNhaSX.setText(sp.getNhaSX());
            txtBrowser.setText(sp.getHinhAnh());
            ccbNgaySX.setDate(sp.getNgaySX());
            ccbHSD.setDate(sp.getHanSuDung());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void cbNccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNccActionPerformed

    }//GEN-LAST:event_cbNccActionPerformed

    private void cbNccItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNccItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNccItemStateChanged

    public void search() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPham.getModel();
        dtm.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(dtm);
        this.tblSanPham.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(this.jTextField3search.getText()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbNcc;
    private org.freixas.jcalendar.JCalendarCombo ccbHSD;
    private org.freixas.jcalendar.JCalendarCombo ccbNgaySX;
    private javax.swing.JButton jButton4search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6finduseid;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3search;
    private javax.swing.JTextArea taMoTa;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtBrowser;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtNhaSX;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
