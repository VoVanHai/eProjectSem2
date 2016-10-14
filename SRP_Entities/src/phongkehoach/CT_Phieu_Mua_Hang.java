/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong_ke_hoach;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class CT_Phieu_Mua_Hang {
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private ArrayList<Phieu_Mua_Hang> ctpmh;

    public CT_Phieu_Mua_Hang(String MaSP, String TenSP, int SoLuong) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.SoLuong = SoLuong;
        ctpmh= new ArrayList<>();
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

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.MaSP);
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
        if (!Objects.equals(this.MaSP, other.MaSP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CT_Phieu_Mua_Hang{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", SoLuong=" + SoLuong + ", ctpmh=" + ctpmh + '}';
    }
    
    
}
