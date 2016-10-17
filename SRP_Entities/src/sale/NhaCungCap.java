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
public class NhaCungCap implements Serializable {
    private String MaNCC;
    private String TenNCC;
    private String DiaChi;
    private String SDT;
    private String Email;
    private String TenNguoiDaiDien;
    private String GhiChu;
    private int TrangThai;

    public NhaCungCap(String MaNCC, String TenNCC, String DiaChi, String SDT, String Email, String TenNguoiDaiDien, String GhiChu, int TrangThai) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
        this.TenNguoiDaiDien = TenNguoiDaiDien;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.TenNCC = TenNCC;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTenNguoiDaiDien() {
        return TenNguoiDaiDien;
    }

    public void setTenNguoiDaiDien(String TenNguoiDaiDien) {
        this.TenNguoiDaiDien = TenNguoiDaiDien;
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
        hash = 23 * hash + Objects.hashCode(this.MaNCC);
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
        final NhaCungCap other = (NhaCungCap) obj;
        if (!Objects.equals(this.MaNCC, other.MaNCC)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NHA_CUNG_CAP{" + "MaNCC=" + MaNCC + ", TenNCC=" + TenNCC + ", DiaChi=" + DiaChi + ", SDT=" + SDT + ", Email=" + Email + ", TenNguoiDaiDien=" + TenNguoiDaiDien + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
