/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author VINH MARK
 */
public class SanPham implements Serializable{
    private String maSP;
    private String tenSP;
    private String motaSP;
    private String maNCC;
    private String nhaSX;
    private String hinhAnh;
    private Date ngaySX;
    private Date hanSuDung;
    private int trangThai;

    public SanPham(String MaSP, String TenSP, String MotaSP, String MaNCC, String NhaSX, String HinhAnh, Date NgaySX, Date HanSuDung, int TrangThai) {
        this.maSP = MaSP;
        this.tenSP = TenSP;
        this.motaSP = MotaSP;
        this.maNCC = MaNCC;
        this.nhaSX = NhaSX;
        this.hinhAnh = HinhAnh;
        this.ngaySX = NgaySX;
        this.hanSuDung = HanSuDung;
        this.trangThai = TrangThai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String MaSP) {
        this.maSP = MaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String TenSP) {
        this.tenSP = TenSP;
    }

    public String getMotaSP() {
        return motaSP;
    }

    public void setMotaSP(String MotaSP) {
        this.motaSP = MotaSP;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.maNCC = MaNCC;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.nhaSX = NhaSX;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.hinhAnh = HinhAnh;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date NgaySX) {
        this.ngaySX = NgaySX;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date HanSuDung) {
        this.hanSuDung = HanSuDung;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.trangThai = TrangThai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.maSP);
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
        final SanPham other = (SanPham) obj;
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + maSP + ", TenSP=" + tenSP + ", MotaSP=" + motaSP + ", MaNCC=" + maNCC + ", NhaSX=" + nhaSX + ", HinhAnh=" + hinhAnh + ", NgaySX=" + ngaySX + ", HanSuDung=" + hanSuDung + ", TrangThai=" + trangThai + '}';
    }

    
    
}