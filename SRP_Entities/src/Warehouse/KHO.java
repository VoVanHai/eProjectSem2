/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class KHO {
    private String MaKho;
    private String TenKho;
    private String DiaChi;
    private String SoDT;
    private String GhiChu;
    private int TrangThai;

    public KHO(String MaKho, String TenKho, String DiaChi, String SoDT, String GhiChu, int TrangThai) {
        this.MaKho = MaKho;
        this.TenKho = TenKho;
        this.DiaChi = DiaChi;
        this.SoDT = SoDT;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public String getTenKho() {
        return TenKho;
    }

    public void setTenKho(String TenKho) {
        this.TenKho = TenKho;
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
        hash = 83 * hash + Objects.hashCode(this.MaKho);
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
        final KHO other = (KHO) obj;
        if (!Objects.equals(this.MaKho, other.MaKho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kho{" + "MaKho=" + MaKho + ", TenKho=" + TenKho + ", DiaChi=" + DiaChi + ", SoDT=" + SoDT + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
