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
public class TK_Dang_Nhap implements Serializable{
    private String MaNV;
    private String TenTK;
    private int MatKhau;
    private String GhiChu;
    private int TrangThai;

    public TK_Dang_Nhap(String MaNV, String TenTK, int MatKhau, String GhiChu, int TrangThai) {
        this.MaNV = MaNV;
        this.TenTK = TenTK;
        this.MatKhau = MatKhau;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public int getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(int MatKhau) {
        this.MatKhau = MatKhau;
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
        hash = 89 * hash + Objects.hashCode(this.MaNV);
        hash = 89 * hash + Objects.hashCode(this.TenTK);
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
        final TK_Dang_Nhap other = (TK_Dang_Nhap) obj;
        if (!Objects.equals(this.MaNV, other.MaNV)) {
            return false;
        }
        if (!Objects.equals(this.TenTK, other.TenTK)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "TK_Dang_Nhap{" + "MaNV=" + MaNV + ", TenTK=" + TenTK + ", MatKhau=" + MatKhau + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
