/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.Objects;

/**
 *
 * @author TrungChi
 */
public class CTPhieuYCNhapKho {
    private String  SoPhieuYCNK;
    private String  MaSP;
    private String  TenSP;
    private float   SoLuong;
    private String  GhiChu;
    private int     TrangThai;

    public CTPhieuYCNhapKho() {
    }

    public CTPhieuYCNhapKho(String SoPhieuYCNK, String MaSP, String TenSP, float SoLuong, String GhiChu, int TrangThai) {
        this.SoPhieuYCNK    = SoPhieuYCNK;
        this.MaSP           = MaSP;
        this.TenSP          = TenSP;
        this.SoLuong        = SoLuong;
        this.GhiChu         = GhiChu;
        this.TrangThai      = TrangThai;
    }

    public String getSoPhieuYCNK() {
        return SoPhieuYCNK;
    }

    public void setSoPhieuYCNK(String SoPhieuYCNK) {
        this.SoPhieuYCNK = SoPhieuYCNK;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public float getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
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
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.SoPhieuYCNK);
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
        final CTPhieuYCNhapKho other = (CTPhieuYCNhapKho) obj;
        if (!Objects.equals(this.SoPhieuYCNK, other.SoPhieuYCNK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CTPhieuYCNhapKho{" + "SoPhieuYCNK=" + SoPhieuYCNK + ", MaSP=" + MaSP + ", TenSP=" + TenSP + ", SoLuong=" + SoLuong + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
}
