/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import dataaccess.repository.KhachHangDAOImpl;
import java.util.ArrayList;

/**
 *
 * @author TrungChi
 */
public class KhachHang_BE {
    private KhachHang kh;

    public KhachHang_BE(KhachHang kh) {
        this.kh = kh;
    }

    //Lưu một khách hàng mới vào cơ sở dữ liệu
    public void persist() throws Exception {
        if(kh == null)
            throw  new Exception("Không thể lưu phiếu rỗng");
        new KhachHangDAOImpl().persist(kh);
    }
    
    //Xóa một khách hàng bằng cách set trang thai
    public void remove() throws Exception {
        new KhachHangDAOImpl().remove(kh.getMaKH());
    }
    
    //update cho một khách hàng
    public void update(String maKH, String tenKH, String soDT, String diaChi, String congViec, String soCMND, String gioiTinh, String loaiTK, String ghiChu, int trangThai) throws Exception {
        new KhachHangDAOImpl().update(kh);
    }
    
    //Lấy danh sách khách hàng
    public ArrayList<KhachHang> getAll() throws Exception {
        return new KhachHangDAOImpl().getAll();
    }
    
    //Lấy 1 khách hàng
    public KhachHang getKh() throws Exception {
        return kh;
    }
    
    //Tìm kiếm khách hàng theo MaKH
    public KhachHang searchByID() throws Exception {
        return new KhachHangDAOImpl().searchByID(kh.getMaKH());
    }
    
    //Tìm kiếm theo tên khách hàng
    public ArrayList<KhachHang> searchByName() throws Exception {
        return new KhachHangDAOImpl().searchByName(kh.getTenKH());
    
    }
    
    //Tìm kiếm khách hàng có chứa chuỗi nhập vào
    public ArrayList<KhachHang> searchAll(String s) throws Exception {
        return new KhachHangDAOImpl().searchAll(s);
    }
}
