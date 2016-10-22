/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.Objects;

/**
 *
 * @author TrungChi
 */
public class CTPhieuYCXuatKho {

    private String soPhieuYCXK;
    private String maSP;
    private float soLuong;
    private String ghiChu;

    public CTPhieuYCXuatKho(String SoPhieuYCXK, String MaSP, float SoLuong, String GhiChu) {
        setSoPhieuYCXK(SoPhieuYCXK);
        setMaSP(MaSP);
        setSoLuong(SoLuong);
        setGhiChu(GhiChu);
    }

    public CTPhieuYCXuatKho() {
    }

    public String getSoPhieuYCXK() {
        return soPhieuYCXK;
    }

    public void setSoPhieuYCXK(String SoPhieuYCXK) {
        this.soPhieuYCXK = SoPhieuYCXK;
    }

    public String getMaSP() {
        return maSP;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.soPhieuYCXK);
        hash = 71 * hash + Objects.hashCode(this.maSP);
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
        final CTPhieuYCXuatKho other = (CTPhieuYCXuatKho) obj;
        if (!Objects.equals(this.soPhieuYCXK, other.soPhieuYCXK)) {
            return false;
        }
        if (!Objects.equals(this.maSP, other.maSP)) {
            return false;
        }
        return true;
    }

   

    public void setMaSP(String MaSP) {
        this.maSP = MaSP;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        if(soLuong<=0)throw new RuntimeException("invalid soluong");
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.ghiChu = GhiChu;
    }

    @Override
    public String toString() {
        return "CT_PHIEU_YC_XUAT_KHO{" + "SoPhieuYCXK=" + soPhieuYCXK + ", MaSP=" + maSP + ", SoLuong=" + soLuong + ", GhiChu=" + ghiChu + '}';
    }
}
