package Warehouse;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TrungChi
 */
public class Frm_KHACH_HANG extends JFrame{
    private JLabel title;
    private JLabel maKH;
    private JLabel tenKH;
    private JLabel soDT;
    private JLabel diaChi;
    private JLabel congViec;
    private JLabel soCMND;
    private JLabel gioiTinh;
    private JLabel loaiTK;
    private JLabel ghiChu;
    private JLabel trangThai;
    
    private JTextField tfMaKH       = new JTextField();
    private JTextField tfTenKH      = new JTextField();
    private JTextField tfSoDT       = new JTextField();
    private JTextField tfDiaChi     = new JTextField();
    private JTextField tfCongViec   = new JTextField();
    private JTextField tfSoCMND     = new JTextField();
    private JComboBox  cbGioiTinh   = new JComboBox();
    private JComboBox  cbLoaiTK     = new JComboBox();
    private JTextArea  taGhiChu     = new JTextArea();
    private JTextField tfTrangThai  = new JTextField();
    
    private JButton btnAdd      = new JButton("Thêm");
    private JButton btnReset    = new JButton("Reset");
    private JButton btnCancel   = new JButton("Hủy");
    
    public Frm_KHACH_HANG()
    {
        setTitle("Thông tin khách hàng");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        Box bMain = Box.createVerticalBox();
        
        Box bTitle = Box.createHorizontalBox();
        bTitle.add(new JLabel("THÔNG TIN KHÁCH HÀNG"));
        
        Box bMaKH = Box.createHorizontalBox();
        bMaKH.add(new JLabel("Mã KH"));
        bMaKH.add(tfMaKH);
        
        Box bTenKH = Box.createHorizontalBox();
        bTenKH.add(new JLabel("Tên KH"));
        bTenKH.add(tfTenKH);
        
        Box bSoDT = Box.createHorizontalBox();
        bSoDT.add(new JLabel("Số ĐT"));
        bSoDT.add(tfSoDT);
        
        Box bDiaChi = Box.createHorizontalBox();
        bDiaChi.add(new JLabel("Địa chỉ"));
        bDiaChi.add(tfDiaChi);
        
        Box bCongViec = Box.createHorizontalBox();
        bCongViec.add(new JLabel("Công việc"));
        bCongViec.add(tfCongViec);
        
        Box bSoCMND = Box.createHorizontalBox();
        bSoCMND.add(new JLabel("Số CMND"));
        bSoCMND.add(tfSoCMND);
        
        Box bGioiTinh = Box.createHorizontalBox();
        bGioiTinh.add(new JLabel("Giới tính"));
        bGioiTinh.add(cbGioiTinh);
        
        Box bLoaiTK = Box.createHorizontalBox();
        bLoaiTK.add(new JLabel("Loại TK"));
        bLoaiTK.add(cbLoaiTK);
        
        Box bGhiChu = Box.createHorizontalBox();
        bGhiChu.add(new JLabel("Tên KH"));
        bGhiChu.add(taGhiChu);
        
        Box bTrangThai = Box.createHorizontalBox();
        bTrangThai.add(new JLabel("Trạng thái"));
        bTrangThai.add(tfTrangThai);
        
        Box bButton = Box.createHorizontalBox();
        bButton.add(btnAdd);
        bButton.add(btnReset);
        bButton.add(btnCancel);
        
        bMain.add(Box.createRigidArea(new Dimension(30, 20)));//Khoảng cách với các biên
        bMain.add(bTitle);        
        
        bMaKH.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bMaKH);
        
        bTenKH.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bTenKH);
        
        bSoDT.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bSoDT);
        
        bDiaChi.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bDiaChi);
        
        bCongViec.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bCongViec);
        
        bSoCMND.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bSoCMND);
        
        bGioiTinh.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bGioiTinh);
        
        bLoaiTK.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bLoaiTK);
        
        bGhiChu.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bGhiChu);
        
        bTrangThai.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bTrangThai);
        
        bButton.add(Box.createRigidArea(new Dimension(10, 20)));
        bMain.add(bButton);
        
        this.add(bMain, BorderLayout.NORTH);
    }
    
    public static void main(String[] args) {
        Frm_KHACH_HANG frmKhachHang= new Frm_KHACH_HANG();   
        frmKhachHang.setVisible(true);        
    }
}
