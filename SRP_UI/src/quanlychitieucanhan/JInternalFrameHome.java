/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlychitieucanhan;

import entities.*;
import java.util.*;
import Data.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;
import java.text.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.*;

public class JInternalFrameHome extends javax.swing.JInternalFrame {
    
    JFrameLogin lg = new JFrameLogin();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Userdao userdao = new Userdao();
    
    Statisticaldao stadao = new Statisticaldao();
    
    public JInternalFrameHome(String findusername) {
        initComponents();
        this.setLocation(5, 98);
        this.setSize(1570, 720);
        
        this.jTextField1moneyspent.setEditable(false);
        
        this.jTextField2moneyshopping.setEditable(false);
        
        this.jTextField3totalincome.setEditable(false);
        
        this.jTextField4balanceof.setEditable(false);
        
        Users us = userdao.findusername(findusername);
        this.jLabel5usercode.setText(String.valueOf(us.getUsersid()));
        this.jLabel5name.setText(us.getName());
        this.jLabel5username.setText(us.getUsername());
        this.jLabel6dateofbrith.setText(sdf.format(us.getDataofbrith()));
        findtable(stadao.findll(Integer.parseInt(this.jLabel5usercode.getText())));
        
    }
    
    public void findtable(List<Statistical> liststa) {
        try {
            
            DefaultTableModel dft = new DefaultTableModel();
            dft.addColumn("Id");
            dft.addColumn("Total Money Spent");
            dft.addColumn("Total Money Shopping");
            dft.addColumn("Total Income");
            dft.addColumn("The Balance Of The Month");
            dft.addColumn("Date");
            dft.addColumn("Userid");
            for (Statistical sta : liststa) {
                dft.addRow(new Object[]{sta.getId(), sta.getDailyMoney(), sta.getMoneyShopping(), sta.getIncomemoney(), sta.getCashbalance(), sta.getDate(), sta.getUsersid().getUsersid()});
            }
            
            this.jTable1sta.setModel(dft);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void findusername(String username) {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1xoa = new javax.swing.JPopupMenu();
        jMenuItem1xoa = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5usercode = new javax.swing.JLabel();
        jLabel5name = new javax.swing.JLabel();
        jLabel5username = new javax.swing.JLabel();
        jLabel6dateofbrith = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1month = new javax.swing.JComboBox();
        jComboBox2year = new javax.swing.JComboBox();
        jButton1save = new javax.swing.JButton();
        jTextField1moneyspent = new javax.swing.JTextField();
        jTextField2moneyshopping = new javax.swing.JTextField();
        jTextField3totalincome = new javax.swing.JTextField();
        jTextField4balanceof = new javax.swing.JTextField();
        jButton2clearn = new javax.swing.JButton();
        jButton3show = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1sta = new javax.swing.JTable();

        jMenuItem1xoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgaes/btn_delete.png"))); // NOI18N
        jMenuItem1xoa.setText("Delete");
        jMenuItem1xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1xoaActionPerformed(evt);
            }
        });
        jPopupMenu1xoa.add(jMenuItem1xoa);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "information of you", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 51, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Data of Brith");

        jLabel5usercode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5usercode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6dateofbrith.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6dateofbrith.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5usercode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6dateofbrith, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5usercode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6dateofbrith, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Total Money Spent");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total Money Shopping");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Total Income");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("The Balance Of The Month");

        jComboBox1month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox2year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034" }));

        jButton1save.setBackground(new java.awt.Color(204, 153, 255));
        jButton1save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1save.setText("Save");
        jButton1save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1saveActionPerformed(evt);
            }
        });

        jTextField1moneyspent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1moneyspent.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2moneyshopping.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2moneyshopping.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3totalincome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3totalincome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4balanceof.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4balanceof.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2clearn.setBackground(new java.awt.Color(204, 153, 255));
        jButton2clearn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2clearn.setText("Clearn");
        jButton2clearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2clearnActionPerformed(evt);
            }
        });

        jButton3show.setBackground(new java.awt.Color(204, 153, 255));
        jButton3show.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3show.setText("Show");
        jButton3show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1month, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox2year, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2moneyshopping, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jTextField1moneyspent))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3totalincome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4balanceof, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton3show, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1save, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2clearn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1moneyspent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3totalincome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2moneyshopping, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4balanceof, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2year, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2clearn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3show, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jTable1sta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1sta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1sta.setComponentPopupMenu(jPopupMenu1xoa);
        jScrollPane2.setViewportView(jTable1sta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3showActionPerformed
        try {
            
            String month = String.valueOf(this.jComboBox1month.getSelectedItem());
            String year = String.valueOf(this.jComboBox2year.getSelectedItem());
            
            int months = Integer.parseInt(month);
            int years = Integer.parseInt(year);
            
            List<DailyMoney> listdai = stadao.findlldaily(Integer.parseInt(this.jLabel5usercode.getText()), months, years);
            List<MoneyShopping> listms = stadao.findllshop(Integer.parseInt(this.jLabel5usercode.getText()), months, years);
            List<Incomemoney> listin = stadao.findllimco(Integer.parseInt(this.jLabel5usercode.getText()), months, years);
            long s1 = 0;
            long s2 = 0;
            long s3 = 0;
            long s4 = 0;
            for (DailyMoney dai : listdai) {
                s1 += dai.getMoney();
                
            }
            for (MoneyShopping ms : listms) {
                s2 += ms.getMoney();
            }
            
            for (Incomemoney im : listin) {
                s3 += im.getMoney();
            }
            
            this.jTextField1moneyspent.setText(String.valueOf(s1));
            this.jTextField2moneyshopping.setText(String.valueOf(s2));
            this.jTextField3totalincome.setText(String.valueOf(s3));
            
            s4 = s3 - (s1 + s2);
            this.jTextField4balanceof.setText(String.valueOf(s4));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton3showActionPerformed

    private void jButton2clearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2clearnActionPerformed
        this.jTextField1moneyspent.setText("");
        
        this.jTextField2moneyshopping.setText("");
        
        this.jTextField3totalincome.setText("");
        
        this.jTextField4balanceof.setText("");
    }//GEN-LAST:event_jButton2clearnActionPerformed

    private void jButton1saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1saveActionPerformed
        try {
            Statistical sta = new Statistical();
            sta.setDailyMoney(Long.parseLong(this.jTextField1moneyspent.getText()));
            sta.setMoneyShopping(Long.parseLong(this.jTextField2moneyshopping.getText()));
            sta.setIncomemoney(Long.parseLong(this.jTextField3totalincome.getText()));
            sta.setCashbalance(Long.parseLong(this.jTextField4balanceof.getText()));
            sta.setDate(String.valueOf(this.jComboBox1month.getSelectedItem()) + "/" + String.valueOf(this.jComboBox2year.getSelectedItem()));
            sta.getUsersid().setUsersid(Integer.parseInt(this.jLabel5usercode.getText()));
            if (stadao.create(sta)) {
                JOptionPane.showMessageDialog(null, "Save successfully");
                findtable(stadao.findll(Integer.parseInt(this.jLabel5usercode.getText())));
            } else {
                JOptionPane.showMessageDialog(null, "Save No");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1saveActionPerformed

    private void jMenuItem1xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1xoaActionPerformed
        try {
            int index = this.jTable1sta.getSelectedRow();
          
            if(index ==-1){
                
            }else{
                  String id = this.jTable1sta.getValueAt(index, 0).toString();
                  int result =  JOptionPane.showConfirmDialog(null, "delete Statistical ", "Delete", JOptionPane.YES_NO_OPTION);
                  if(result==JOptionPane.YES_NO_OPTION){
                      if(stadao.delete(Integer.parseInt(id))){
                          JOptionPane.showMessageDialog(null,"delete successfully");
                            findtable(stadao.findll(Integer.parseInt(this.jLabel5usercode.getText())));
                      }else{
                             JOptionPane.showMessageDialog(null,"delete No");
                      }
                      
                  }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1save;
    private javax.swing.JButton jButton2clearn;
    private javax.swing.JButton jButton3show;
    private javax.swing.JComboBox jComboBox1month;
    private javax.swing.JComboBox jComboBox2year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5name;
    private javax.swing.JLabel jLabel5usercode;
    private javax.swing.JLabel jLabel5username;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6dateofbrith;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1xoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1xoa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1sta;
    private javax.swing.JTextField jTextField1moneyspent;
    private javax.swing.JTextField jTextField2moneyshopping;
    private javax.swing.JTextField jTextField3totalincome;
    private javax.swing.JTextField jTextField4balanceof;
    // End of variables declaration//GEN-END:variables
}
