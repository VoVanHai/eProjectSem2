/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Trương Hồng Đoàn
 */
public class CuaHang implements Serializable {
    private String maCuaHang;
    private String tenCuaHang;
    private String diaChi;
    private String soDT;
    private String ghiChu;
    private int trangThai;

    public CuaHang(String MaCuaHang, String TenCuaHang, String DiaChi, String SoDT, String GhiChu, int TrangThai) {
        setMaCuaHang(MaCuaHang);
        setTenCuaHang(TenCuaHang);
        setDiaChi(DiaChi);
        setSoDT(SoDT);
        setGhiChu(GhiChu);
        setTrangThai(TrangThai);
    }

    public String getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(String MaCuaHang) {
        this.maCuaHang = MaCuaHang;
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String TenCuaHang) {
        this.tenCuaHang = TenCuaHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.diaChi = DiaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String SoDT) {
        this.soDT = SoDT;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.ghiChu = GhiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.trangThai = TrangThai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maCuaHang);
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
        if (!Objects.equals(this.maCuaHang, other.maCuaHang)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CuaHang{" + "MaCuaHang=" + maCuaHang + ", TenCuaHang=" + tenCuaHang + ", DiaChi=" + diaChi + ", SoDT=" + soDT + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
    
}
