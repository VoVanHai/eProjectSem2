/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author TrungChi
 */
public class PHIEU_XUAT_KHO implements Serializable{
    private String SoPhieuXK;
    private String MaNV;
    private String MaCuaHanf;
    private String NgayLap;
    private String GhiChu;
    private int    TrangThai;

    public PHIEU_XUAT_KHO(String SoPhieuXK, String MaNV, String MaCuaHanf, String NgayLap, String GhiChu, int TrangThai) {
        this.SoPhieuXK  = SoPhieuXK;
        this.MaNV       = MaNV;
        this.MaCuaHanf  = MaCuaHanf;
        this.NgayLap    = NgayLap;
        this.GhiChu     = GhiChu;
        this.TrangThai  = TrangThai;
    }

    public PHIEU_XUAT_KHO() {
    }

    public String getSoPhieuXK() {
        return SoPhieuXK;
    }

    public void setSoPhieuXK(String SoPhieuXK) {
        this.SoPhieuXK = SoPhieuXK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaCuaHanf() {
        return MaCuaHanf;
    }

    public void setMaCuaHanf(String MaCuaHanf) {
        this.MaCuaHanf = MaCuaHanf;
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
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.SoPhieuXK);
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
        final PHIEU_XUAT_KHO other = (PHIEU_XUAT_KHO) obj;
        if (!Objects.equals(this.SoPhieuXK, other.SoPhieuXK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PHIEU_XUAT_KHO{" + "SoPhieuXK=" + SoPhieuXK + ", MaNV=" + MaNV + ", MaCuaHanf=" + MaCuaHanf + ", NgayLap=" + NgayLap + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
    
}
