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
public class CT_Chuong_Trinh_KM implements Serializable{
    private String maSP;
    private float  phanTramKM;
    private String ghiChu;
    private ArrayList<Chuong_Trinh_KM> ctctkm;

    public CT_Chuong_Trinh_KM(String MaSP, float PhanTramKM, String GhiChu) {
        this.maSP = MaSP;
        this.phanTramKM = PhanTramKM;
        this.ghiChu = GhiChu;
        ctctkm = new ArrayList<>();
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String MaSP) {
        this.maSP = MaSP;
    }

    public float getPhanTramKM() {
        return phanTramKM;
    }

    public void setPhanTramKM(float PhanTramKM) {
        this.phanTramKM = PhanTramKM;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.ghiChu = GhiChu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.maSP);
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
        final CT_Chuong_Trinh_KM other = (CT_Chuong_Trinh_KM) obj;
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CT_Chuong_Trinh_KM{" + "MaSP=" + maSP + ", PhanTramKM=" + phanTramKM + ", GhiChu=" + ghiChu + ", ctctkm=" + ctctkm + '}';
    }
    
    
}
