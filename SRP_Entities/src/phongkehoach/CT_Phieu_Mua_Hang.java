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
public class CT_Phieu_Mua_Hang implements Serializable{
    private String soPhieu;
    private String maSP;
    private int soLuong;
    private float giaNhap;
    private String ghiChu;

    public CT_Phieu_Mua_Hang(String soPhieu, String maSP, int soLuong, float giaNhap, String ghiChu) {
        this.soPhieu = soPhieu;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.ghiChu = ghiChu;
    }

    public String getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(String soPhieu) {
        this.soPhieu = soPhieu;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.soPhieu);
        hash = 79 * hash + Objects.hashCode(this.maSP);
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
        final CT_Phieu_Mua_Hang other = (CT_Phieu_Mua_Hang) obj;
        if (!Objects.equals(this.soPhieu, other.soPhieu)) {
            return false;
        }
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CT_Phieu_Mua_Hang{" + "soPhieu=" + soPhieu + ", maSP=" + maSP + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", ghiChu=" + ghiChu + '}';
    }
    

   

    
    
    
}
