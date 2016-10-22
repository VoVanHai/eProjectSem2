/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import java.util.ArrayList;
import repository.KhachHang;
import repository.PhieuYCXuatKho;

/**
 *
 * @author TrungChi
 */
public interface PhieuYCXuatKhoDAO {
    boolean add(PhieuYCXuatKho PYCXK) throws Exception;
    boolean removePYCXK(int trangThai, String SoPPhieuYCXK) throws Exception;
    boolean removeCTPYCXK(String SoPhieuYCXK, String MaSP) throws Exception;
    boolean updatePYCXK(String SoPhieuYCXK, String MaNV, String MaKho, String NgayLap, String GhiChu, int TrangThai) throws Exception;    
    boolean updateCTPYCXK(String SoPhieuYCXK, String MaSP, float SoLuong, String GhiChu) throws Exception;
    ArrayList<PhieuYCXuatKho> getAllPYCXK() throws Exception;
    //ArrayList<CTPhieuYCNhapKho> getCTPYCXKBySoPhieuYCXK() throws Exception;
    KhachHang searchPYCXKByID(String SoPhieuYCXK) throws Exception;
    ArrayList<KhachHang> searchByName(String s) throws Exception;
    ArrayList<KhachHang> searchAll(String s) throws Exception;  
    void close() throws Exception;
}
