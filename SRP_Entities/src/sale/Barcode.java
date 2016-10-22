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
 * @author VINH MARK
 */
public class Barcode implements Serializable{
    private String barcode;
    private String maSP;
    private String maNV;
    private String ghiChu;
    private int trangThai;

    public Barcode(String barcode, String MaSP, String MaNV, String GhiChu, int TrangThai) {
        this.barcode = barcode;
        this.maSP = MaSP;
        this.maNV = MaNV;
        this.ghiChu = GhiChu;
        this.trangThai = TrangThai;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String MaSP) {
        this.maSP = MaSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String MaNV) {
        this.maNV = MaNV;
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
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.barcode);
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
        final Barcode other = (Barcode) obj;
        if (!Objects.equals(this.barcode, other.barcode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barcode{" + "barcode=" + barcode + ", MaSP=" + maSP + ", MaNV=" + maNV + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
    
}
