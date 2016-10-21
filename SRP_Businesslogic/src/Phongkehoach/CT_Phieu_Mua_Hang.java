/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phongkehoach;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class CT_Phieu_Mua_Hang implements Serializable{
    private String maSP;
    private String tenSP;
    private int soLuong;
    private ArrayList<Phieu_Mua_Hang> ctpmh;

    public CT_Phieu_Mua_Hang(String MaSP, String TenSP, int SoLuong) {
        this.maSP = MaSP;
        this.tenSP = TenSP;
        this.soLuong = SoLuong;
        ctpmh= new ArrayList<>();
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String MaSP) {
        this.maSP = MaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String TenSP) {
        this.tenSP = TenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.soLuong = SoLuong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maSP);
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
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CT_Phieu_Mua_Hang{" + "MaSP=" + maSP + ", TenSP=" + tenSP + ", SoLuong=" + soLuong + ", ctpmh=" + ctpmh + '}';
    }
    
    
}
