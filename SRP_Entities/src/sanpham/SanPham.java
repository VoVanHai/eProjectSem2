/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanpham;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author VINH MARK
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private String MotaSP;
    private String MaNCC;
    private String KhoiLuong;
    private String KichThuocSp;
    private String MauSac;
    private String ThanhPhan;
    private String NhaSX;
    private Date NgaySX;
    private Date HanSuDung;
    private int HinhAnh;
    private int TinhTrang;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String MotaSP, String NhaCC, String KhoiLuong, String KichThuocSp, String MauSac, String ThanhPhan, String MaNSX, Date NgaySX, Date HanSuDung, int HinhAnh, int TinhTrang) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.MotaSP = MotaSP;
        this.MaNCC = MaNCC;
        this.KhoiLuong = KhoiLuong;
        this.KichThuocSp = KichThuocSp;
        this.MauSac = MauSac;
        this.ThanhPhan = ThanhPhan;
        this.NhaSX = NhaSX;
        this.NgaySX = NgaySX;
        this.HanSuDung = HanSuDung;
        this.HinhAnh = HinhAnh;
        this.TinhTrang = TinhTrang;
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

    public void setNhaCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getKhoiLuong() {
        return KhoiLuong;
    }

    public void setKhoiLuong(String KhoiLuong) {
        this.KhoiLuong = KhoiLuong;
    }

    public String getKichThuocSp() {
        return KichThuocSp;
    }

    public void setKichThuocSp(String KichThuocSp) {
        this.KichThuocSp = KichThuocSp;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getThanhPhan() {
        return ThanhPhan;
    }

    public void setThanhPhan(String ThanhPhan) {
        this.ThanhPhan = ThanhPhan;
    }

    public String getNhaSX() {
        return NhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.NhaSX = NhaSX;
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

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.MaSP);
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
        return "SanPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", MotaSP=" + MotaSP + ", NhaCC=" + MaNCC + ", KhoiLuong=" + KhoiLuong + ", KichThuocSp=" + KichThuocSp + ", MauSac=" + MauSac + ", ThanhPhan=" + ThanhPhan + ", NhaSX=" + NhaSX + ", NgaySX=" + NgaySX + ", HanSuDung=" + HanSuDung + ", HinhAnh=" + HinhAnh + ", TinhTrang=" + TinhTrang + '}';
    }
    
}