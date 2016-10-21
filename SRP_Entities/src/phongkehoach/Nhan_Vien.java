/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class Nhan_Vien implements Serializable{
    private String maNV;
    private String tenNV;
    private String sDT;
    private String diaChi;
    private String soCMND;
    private String queQuan;
    private String email;
    private String maCV;
    private String maPB;
    private String ghiChu;
    private int trangThai;
    private Date ngaySinh;
    private Date ngayBDLamViec;

    public Nhan_Vien(String MaNV, String TenNV, String SDT, String DiaChi, String SoCMND, String QueQuan, String Email, String MaCV, String MaPB, String GhiChu, int TrangThai, Date NgaySinh, Date NgayBDLamViec) {
        this.maNV = MaNV;
        this.tenNV = TenNV;
        this.sDT = SDT;
        this.diaChi = DiaChi;
        this.soCMND = SoCMND;
        this.queQuan = QueQuan;
        this.email = Email;
        this.maCV = MaCV;
        this.maPB = MaPB;
        this.ghiChu = GhiChu;
        this.trangThai = TrangThai;
        this.ngaySinh = NgaySinh;
        this.ngayBDLamViec = NgayBDLamViec;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String MaNV) {
        this.maNV = MaNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String TenNV) {
        this.tenNV = TenNV;
    }

    public String getSDT() {
        return sDT;
    }

    public void setSDT(String SDT) {
        this.sDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.diaChi = DiaChi;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.soCMND = SoCMND;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.queQuan = QueQuan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String MaCV) {
        this.maCV = MaCV;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String MaPB) {
        this.maPB = MaPB;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.ngaySinh = NgaySinh;
    }

    public Date getNgayBDLamViec() {
        return ngayBDLamViec;
    }

    public void setNgayBDLamViec(Date NgayBDLamViec) {
        this.ngayBDLamViec = NgayBDLamViec;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.maNV);
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
        if (!Objects.equals(this.maNV, other.maNV)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nhan_Vien{" + "MaNV=" + maNV + ", TenNV=" + tenNV + ", SDT=" + sDT + ", DiaChi=" + diaChi + ", SoCMND=" + soCMND + ", QueQuan=" + queQuan + ", Email=" + email + ", MaCV=" + maCV + ", MaPB=" + maPB + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + ", NgaySinh=" + ngaySinh + ", NgayBDLamViec=" + ngayBDLamViec + '}';
    }

    
    
}
