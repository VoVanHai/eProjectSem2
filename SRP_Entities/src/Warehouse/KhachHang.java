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
public class KhachHang implements Serializable{
    private String MaKH;
    private String TenKH;
    private String SoDT;
    private String DiaChi;
    private String CongViec;
    private String SoCMND;
    private String GioiTinh;
    private String LoaiTK;
    private String GhiChu;
    private int TrangThai;

    public KhachHang(String MaKH, String TenKH, String SoDT, String DiaChi, String CongViec, String SoCMND, String GioiTinh, String LoaiTK, String GhiChu, int TrangThai) {
        this.MaKH       = MaKH;
        this.TenKH      = TenKH;
        this.SoDT        = SoDT;
        this.DiaChi     = DiaChi;
        this.CongViec   = CongViec;
        this.SoCMND     = SoCMND;
        this.GioiTinh   = GioiTinh;
        this.LoaiTK     = LoaiTK;
        this.GhiChu     = GhiChu;
        this.TrangThai  = TrangThai;
    }

    public KhachHang() {
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSDT() {
        return SoDT;
    }

    public void setSDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getLoaiTK() {
        return LoaiTK;
    }

    public void setLoaiTK(String LoaiTK) {
        this.LoaiTK = LoaiTK;
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
        hash = 83 * hash + Objects.hashCode(this.MaKH);
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
        final KhachHang other = (KhachHang) obj;
        if (!Objects.equals(this.MaKH, other.MaKH)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "KHACH_HANG{" + "MaKH=" + MaKH + ", TenKH=" + TenKH + ", SDT=" + SoDT + ", DiaChi=" + DiaChi + ", CongViec=" + CongViec + ", SoCMND=" + SoCMND + ", GioiTinh=" + GioiTinh + ", LoaiTK=" + LoaiTK + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
    
}
