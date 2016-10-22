/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import java.sql.Date;
import java.util.ArrayList;
import repository.PhieuXuatKho;

/**
 *
 * @author TrungChi
 */
public interface PhieuXuatKhoDAO {
    boolean add(PhieuXuatKho PXK) throws Exception;
    boolean remove(int trangThai, String SoPhieuXK) throws Exception;
    boolean update(String SoPhieuXK, String MaNV, String MaCuaHang, String NgayLap, String GhiChu, int TrangThai) throws Exception;    
    ArrayList<PhieuXuatKho> getAll() throws Exception;
    PhieuXuatKho searchByID(String soPXK) throws Exception;
    ArrayList<PhieuXuatKho> searchByDayToDay(Date dSart, Date dEnd) throws Exception;
    ArrayList<PhieuXuatKho> searchAll(String s) throws Exception;  
    void close() throws Exception;
}
