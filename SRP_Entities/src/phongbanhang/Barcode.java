/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongbanhang;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author VINH MARK
 */
public class Barcode implements Serializable{
    private String barcode;
    private String MaSP;
    private String MaNV;
    private String GhiChu;
    private int TrangThai;

    public Barcode(String barcode, String MaSP, String MaNV, String GhiChu, int TrangThai) {
        this.barcode = barcode;
        this.MaSP = MaSP;
        this.MaNV = MaNV;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
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
        return "Barcode{" + "barcode=" + barcode + ", MaSP=" + MaSP + ", MaNV=" + MaNV + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
