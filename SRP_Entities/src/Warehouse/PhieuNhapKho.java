package Warehouse;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TrungChi
 */
public class PhieuNhapKho {
    private String SoPhieuNK;
    private String MaNV;
    private String MaKho;        
    private String NgayNhap;        
    private String GhiChu;        
    private int TrangThai;        

    public PhieuNhapKho(String SoPhieuNK, String MaNV, String MaKho, String NgayNhap, String GhiChu, int TrangThai) {
        this.SoPhieuNK = SoPhieuNK;
        this.MaNV = MaNV;
        this.MaKho = MaKho;
        this.NgayNhap = NgayNhap;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public PhieuNhapKho() {
    }

    public String getSoPhieuNK() {
        return SoPhieuNK;
    }

    public void setSoPhieuNK(String SoPhieuNK) {
        this.SoPhieuNK = SoPhieuNK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.SoPhieuNK);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhieuNhapKho other = (PhieuNhapKho) obj;
        if (!Objects.equals(this.SoPhieuNK, other.SoPhieuNK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhieuNhapKho{" + "SoPhieuNK=" + SoPhieuNK + ", MaNV=" + MaNV + ", MaKho=" + MaKho + ", NgayNhap=" + NgayNhap + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
}