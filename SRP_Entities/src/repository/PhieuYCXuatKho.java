/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author TrungChi
 */
public class PhieuYCXuatKho {
    private String soPhieuYCXK;
    private String maNV;
    private String maKho;
    private Date ngayLap;
    private String ghiChu;
    private int    trangThai;
    private ArrayList<CTPhieuYCXuatKho> chitietPhieuYCXK;

    public PhieuYCXuatKho(String soPhieuYCXK, String maNV, String maKho, Date ngayLap, String ghiChu, int trangThai) {
        this.soPhieuYCXK = soPhieuYCXK;
        this.maNV = maNV;
        this.maKho = maKho;
        this.ngayLap = ngayLap;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        chitietPhieuYCXK=new ArrayList<>();
    }

    public String getSoPhieuYCXK() {
        return soPhieuYCXK;
    }

    public void setSoPhieuYCXK(String soPhieuYCXK) {
        this.soPhieuYCXK = soPhieuYCXK;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public ArrayList<CTPhieuYCXuatKho> getChitietPhieuYCXK() {
        return chitietPhieuYCXK;
    }

    public void setChitietPhieuYCXK(ArrayList<CTPhieuYCXuatKho> chitietPhieuYCXK) {
        this.chitietPhieuYCXK = chitietPhieuYCXK;
    }
    
    
    
    
}
