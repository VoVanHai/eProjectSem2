/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.util.Objects;

/**
 *
 * @author TrungChi
 */
public class PhieuYCNhapKho {
    private String SoPhieuYCNK;
    private String SoPhieuMH;
    private String MaNV;
    private String MaKho;
    private String NgayLap;
    private String GhiChu;
    private int    TrangThai;

    public PhieuYCNhapKho() {
    }

    public PhieuYCNhapKho(String SoPhieuYCNK, String SoPhieuMH, String MaNV, String MaKho, String NgayLap, String GhiChu, int TrangThai) {
        this.SoPhieuYCNK    = SoPhieuYCNK;
        this.SoPhieuMH      = SoPhieuMH;
        this.MaNV           = MaNV;
        this.MaKho          = MaKho;
        this.NgayLap        = NgayLap;
        this.GhiChu         = GhiChu;
        this.TrangThai      = TrangThai;
    }

    public String getSoPhieuYCNK() {
        return SoPhieuYCNK;
    }

    public void setSoPhieuYCNK(String SoPhieuYCNK) {
        this.SoPhieuYCNK = SoPhieuYCNK;
    }

    public String getSoPhieuMH() {
        return SoPhieuMH;
    }

    public void setSoPhieuMH(String SoPhieuMH) {
        this.SoPhieuMH = SoPhieuMH;
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

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
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
        hash = 47 * hash + Objects.hashCode(this.SoPhieuYCNK);
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
        final PhieuYCNhapKho other = (PhieuYCNhapKho) obj;
        if (!Objects.equals(this.SoPhieuYCNK, other.SoPhieuYCNK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhieuYCNhapKho{" + "SoPhieuYCNK=" + SoPhieuYCNK + ", SoPhieuMH=" + SoPhieuMH + ", MaNV=" + MaNV + ", MaKho=" + MaKho + ", NgayLap=" + NgayLap + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
}
