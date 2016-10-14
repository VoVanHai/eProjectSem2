/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author TrungChi
 */
public class CT_PHIEU_YC_XUAT_KHO implements Serializable{
    private String  SoPhieuYCXK;
    private String  MaSP;
    private float   SoLuong;
    private String  GhiChu;

    public CT_PHIEU_YC_XUAT_KHO(String SoPhieuYCXK, String MaSP, float SoLuong, String GhiChu) {
        this.SoPhieuYCXK    = SoPhieuYCXK;
        this.MaSP           = MaSP;
        this.SoLuong        = SoLuong;
        this.GhiChu         = GhiChu;
    }

    public CT_PHIEU_YC_XUAT_KHO() {
    }

    public String getSoPhieuYCXK() {
        return SoPhieuYCXK;
    }

    public void setSoPhieuYCXK(String SoPhieuYCXK) {
        this.SoPhieuYCXK = SoPhieuYCXK;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public float getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(float SoLuong) {
        this.SoLuong = SoLuong;
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
        hash = 67 * hash + Objects.hashCode(this.SoPhieuYCXK);
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
        final CT_PHIEU_YC_XUAT_KHO other = (CT_PHIEU_YC_XUAT_KHO) obj;
        if (!Objects.equals(this.SoPhieuYCXK, other.SoPhieuYCXK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CT_PHIEU_YC_XUAT_KHO{" + "SoPhieuYCXK=" + SoPhieuYCXK + ", MaSP=" + MaSP + ", SoLuong=" + SoLuong + ", GhiChu=" + GhiChu + '}';
    }
}
