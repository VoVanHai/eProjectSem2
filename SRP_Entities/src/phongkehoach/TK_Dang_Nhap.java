/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class TK_Dang_Nhap implements Serializable{
    private String maNV;
    private String tenTK;
    private int matKhau;
    private String ghiChu;
    private int trangThai;

    public TK_Dang_Nhap(String MaNV, String TenTK, int MatKhau, String GhiChu, int TrangThai) {
        this.maNV = MaNV;
        this.tenTK = TenTK;
        this.matKhau = MatKhau;
        this.ghiChu = GhiChu;
        this.trangThai = TrangThai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String MaNV) {
        this.maNV = MaNV;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String TenTK) {
        this.tenTK = TenTK;
    }

    public int getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(int MatKhau) {
        this.matKhau = MatKhau;
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
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.maNV);
        hash = 89 * hash + Objects.hashCode(this.tenTK);
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
        if (!Objects.equals(this.maNV, other.maNV)) {
            return false;
        }
        if (!Objects.equals(this.tenTK, other.tenTK)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "TK_Dang_Nhap{" + "MaNV=" + maNV + ", TenTK=" + tenTK + ", MatKhau=" + matKhau + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
    
}
