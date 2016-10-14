/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongtin;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Trương Hồng Đoàn
 */
public class CuaHang implements Serializable {
    private String MaCuaHang;
    private String TenCuaHang;
    private String DiaChi;
    private String SoDT;
    private String GhiChu;
    private int TrangThai;

    public CuaHang(String MaCuaHang, String TenCuaHang, String DiaChi, String SoDT, String GhiChu, int TrangThai) {
        this.MaCuaHang = MaCuaHang;
        this.TenCuaHang = TenCuaHang;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaCuaHang() {
        return MaCuaHang;
    }

    public void setMaCuaHang(String MaCuaHang) {
        this.MaCuaHang = MaCuaHang;
    }

    public String getTenCuaHang() {
        return TenCuaHang;
    }

    public void setTenCuaHang(String TenCuaHang) {
        this.TenCuaHang = TenCuaHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
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
        hash = 97 * hash + Objects.hashCode(this.MaCuaHang);
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
        final CuaHang other = (CuaHang) obj;
        if (!Objects.equals(this.MaCuaHang, other.MaCuaHang)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CuaHang{" + "MaCuaHang=" + MaCuaHang + ", TenCuaHang=" + TenCuaHang + ", DiaChi=" + DiaChi + ", SoDT=" + SoDT + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
