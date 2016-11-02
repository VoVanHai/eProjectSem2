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
    private String maTK;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public int getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(int matKhau) {
        this.matKhau = matKhau;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.maNV);
        hash = 79 * hash + Objects.hashCode(this.maTK);
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
        if (!Objects.equals(this.maTK, other.maTK)) {
            return false;
        }
        return true;
    }

    public TK_Dang_Nhap(String maNV, String tenTK, int matKhau, String ghiChu, int trangThai, String maTK) {
        this.maNV = maNV;
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.maTK = maTK;
    }

    @Override
    public String toString() {
        return "TK_Dang_Nhap{" + "maNV=" + maNV + ", tenTK=" + tenTK + ", matKhau=" + matKhau + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + ", maTK=" + maTK + '}';
    }

    
    
}
