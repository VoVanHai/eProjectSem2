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
    private String MaSP;
    private String TenSP;
    private String MotaSP;
    private String MaNCC;
    private String NhaSX;
    private String HinhAnh;
    private Date NgaySX;
    private Date HanSuDung;
    private int TrangThai;

    public SanPham(String MaSP, String TenSP, String MotaSP, String MaNCC, String NhaSX, String HinhAnh, Date NgaySX, Date HanSuDung, int TrangThai) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.MotaSP = MotaSP;
        this.MaNCC = MaNCC;
        this.NhaSX = NhaSX;
        this.HinhAnh = HinhAnh;
        this.NgaySX = NgaySX;
        this.HanSuDung = HanSuDung;
        this.TrangThai = TrangThai;
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

    public String getMotaSP() {
        return MotaSP;
    }

    public void setMotaSP(String MotaSP) {
        this.MotaSP = MotaSP;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getNhaSX() {
        return NhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.NhaSX = NhaSX;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public Date getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(Date NgaySX) {
        this.NgaySX = NgaySX;
    }

    public Date getHanSuDung() {
        return HanSuDung;
    }

    public void setHanSuDung(Date HanSuDung) {
        this.HanSuDung = HanSuDung;
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
        hash = 37 * hash + Objects.hashCode(this.MaSP);
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
        if (!Objects.equals(this.MaSP, other.MaSP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", MotaSP=" + MotaSP + ", MaNCC=" + MaNCC + ", NhaSX=" + NhaSX + ", HinhAnh=" + HinhAnh + ", NgaySX=" + NgaySX + ", HanSuDung=" + HanSuDung + ", TrangThai=" + TrangThai + '}';
    }

    
}