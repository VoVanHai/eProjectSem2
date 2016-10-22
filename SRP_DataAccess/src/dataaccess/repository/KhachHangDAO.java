/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import java.util.ArrayList;
import repository.KhachHang;

/**
 *
 * @author TrungChi
 */
public interface KhachHangDAO {
    boolean add(KhachHang KH) throws Exception;
    boolean remove(int trangThai, String maKH) throws Exception;
    boolean update(String MaKH, String TenKH, String SoDT, String DiaChi, String CongViec, String SoCMND, String GioiTinh, String LoaiTK, String GhiChu, int TrangThai) throws Exception;    
    ArrayList<KhachHang> getAll() throws Exception;
    KhachHang searchByID(String MaKH) throws Exception;
    ArrayList<KhachHang> searchByName(String s) throws Exception;
    ArrayList<KhachHang> searchAll(String s) throws Exception;  
    void close() throws Exception;
}
