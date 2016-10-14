/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong_ke_hoach;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class Nhan_Vien implements Serializable{
    private String MaNV;
    private String TenNV;
    private String SDT;
    private String DiaChi;
    private String SoCMND;
    private String QueQuan;
    private String Email;
    private String MaCV;
    private String MaPB;
    private String GhiChu;
    private int TrangThai;

    public Nhan_Vien(String MaNV, String TenNV, String SDT, String DiaChi, String SoCMND, String QueQuan, String Email, String MaCV, String MaPB, String GhiChu, int TrangThai) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.SoCMND = SoCMND;
        this.QueQuan = QueQuan;
        this.Email = Email;
        this.MaCV = MaCV;
        this.MaPB = MaPB;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMaCV() {
        return MaCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
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
        hash = 53 * hash + Objects.hashCode(this.MaNV);
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
        final Nhan_Vien other = (Nhan_Vien) obj;
        if (!Objects.equals(this.MaNV, other.MaNV)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nhan_Vien{" + "MaNV=" + MaNV + ", TenNV=" + TenNV + ", SDT=" + SDT + ", DiaChi=" + DiaChi + ", SoCMND=" + SoCMND + ", QueQuan=" + QueQuan + ", Email=" + Email + ", MaCV=" + MaCV + ", MaPB=" + MaPB + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
