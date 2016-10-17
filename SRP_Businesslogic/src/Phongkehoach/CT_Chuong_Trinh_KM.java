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
    private String MaSP;
    private float  PhanTramKM;
    private String GhiChu;
    private ArrayList<Chuong_Trinh_KM> ctctkm;

    public CT_Chuong_Trinh_KM(String MaSP, float PhanTramKM, String GhiChu) {
        this.MaSP = MaSP;
        this.PhanTramKM = PhanTramKM;
        this.GhiChu = GhiChu;
        ctctkm = new ArrayList<>();
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public float getPhanTramKM() {
        return PhanTramKM;
    }

    public void setPhanTramKM(float PhanTramKM) {
        this.PhanTramKM = PhanTramKM;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.MaSP);
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
        if (!Objects.equals(this.MaSP, other.MaSP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CT_Chuong_Trinh_KM{" + "MaSP=" + MaSP + ", PhanTramKM=" + PhanTramKM + ", GhiChu=" + GhiChu + ", ctctkm=" + ctctkm + '}';
    }
    
    
}
