/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong_ke_hoach;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author WIN7
 */
public class Chuong_Trinh_KM implements Serializable{
    private int MaCT;
    private String TenCT;
    private Date NgayBD;
    private Date NgayKT;
    private String GhiChu;
    private int TinhTrang;

    public Chuong_Trinh_KM(int MaCT, String TenCT, Date NgayBD, Date NgayKT, String GhiChu, int TinhTrang) {
        this.MaCT = MaCT;
        this.TenCT = TenCT;
        this.NgayBD = NgayBD;
        this.NgayKT = NgayKT;
        this.GhiChu = GhiChu;
        this.TinhTrang = TinhTrang;
    }

    public int getMaCT() {
        return MaCT;
    }

    public void setMaCT(int MaCT) {
        this.MaCT = MaCT;
    }

    public String getTenCT() {
        return TenCT;
    }

    public void setTenCT(String TenCT) {
        this.TenCT = TenCT;
    }

    public Date getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.NgayBD = NgayBD;
    }

    public Date getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.NgayKT = NgayKT;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.MaCT;
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
        final Chuong_Trinh_KM other = (Chuong_Trinh_KM) obj;
        if (this.MaCT != other.MaCT) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chuong_Trinh_KM{" + "MaCT=" + MaCT + ", TenCT=" + TenCT + ", NgayBD=" + NgayBD + ", NgayKT=" + NgayKT + ", GhiChu=" + GhiChu + ", TinhTrang=" + TinhTrang + '}';
    }
    
}
