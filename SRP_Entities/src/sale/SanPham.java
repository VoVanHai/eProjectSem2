/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import java.io.Serializable;
import java.util.*;
import java.util.Objects;

/**
 *
 * @author VINH MARK
 */
public class SanPham implements Serializable {

    private String maSP;
    private String tenSP;
    private int giaSP;
    private int soluong;
    private String motaSP;
    private String maNCC;
    private String nhaSX;
    private String hinhAnh;
    private Date ngaySX;
    private Date hanSuDung;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int giaSP, int soluong, String motaSP, String maNCC, String nhaSX, String hinhAnh, Date ngaySX, Date hanSuDung) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.soluong = soluong;
        this.motaSP = motaSP;
        this.maNCC = maNCC;
        this.nhaSX = nhaSX;
        this.hinhAnh = hinhAnh;
        this.ngaySX = ngaySX;
        this.hanSuDung = hanSuDung;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMotaSP() {
        return motaSP;
    }

    public void setMotaSP(String motaSP) {
        this.motaSP = motaSP;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.maSP);
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
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", giaSP=" + giaSP + ", soluong=" + soluong + ", motaSP=" + motaSP + ", maNCC=" + maNCC + ", nhaSX=" + nhaSX + ", hinhAnh=" + hinhAnh + ", ngaySX=" + ngaySX + ", hanSuDung=" + hanSuDung + '}';
    }
    

    
}
