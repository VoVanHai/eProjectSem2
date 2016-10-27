/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class ChiTietPhieuYCNK {
    private String soPhieuYCNK;
    private String maSP;
    private String tenSP;
    private Float soLuong;
    private String ghiChu;
    private int trangThai;

    public ChiTietPhieuYCNK(String soPhieuYCNK, String maSP, String tenSP, Float soLuong, String ghiChu, int trangThai) {
        setSoPhieuYCNK(soPhieuYCNK);
        setMaSP(maSP);
        setTenSP(tenSP);
        setSoLuong(soLuong);
        setGhiChu(ghiChu);
        setTrangThai(trangThai);
    }

    public String getSoPhieuYCNK() {
        return soPhieuYCNK;
    }

    public void setSoPhieuYCNK(String soPhieuYCNK) {
        this.soPhieuYCNK = soPhieuYCNK;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Float soLuong) {
        this.soLuong = soLuong;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.soPhieuYCNK);
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
        final ChiTietPhieuYCNK other = (ChiTietPhieuYCNK) obj;
        if (!Objects.equals(this.soPhieuYCNK, other.soPhieuYCNK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuYCNK{" + "soPhieuYCNK=" + soPhieuYCNK + ", maSP=" + maSP + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + '}';
    }
    
    
}
