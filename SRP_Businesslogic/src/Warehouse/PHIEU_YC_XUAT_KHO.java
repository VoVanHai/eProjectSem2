/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author TrungChi
 */
public class PHIEU_YC_XUAT_KHO {
    private String SoPhieuYCXK;
    private String MaNV;
    private String MaKho;
    private String NgayLap;
    private String GhiChu;
    private int TrangThai;
    
    private ArrayList<CT_PHIEU_YC_XUAT_KHO> ct_Yc_Xk;

    public PHIEU_YC_XUAT_KHO(String SoPhieuYCXK, String MaNV, String MaKho, String NgayLap, String GhiChu, int TrangThai) {
        this.SoPhieuYCXK = SoPhieuYCXK;
        this.MaNV = MaNV;
        this.MaKho = MaKho;
        this.NgayLap = NgayLap;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public PHIEU_YC_XUAT_KHO() {
    }

    public String getSoPhieuYCXK() {
        return SoPhieuYCXK;
    }

    public void setSoPhieuYCXK(String SoPhieuYCXK) {
        this.SoPhieuYCXK = SoPhieuYCXK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.SoPhieuYCXK);
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
        final PHIEU_YC_XUAT_KHO other = (PHIEU_YC_XUAT_KHO) obj;
        if (!Objects.equals(this.SoPhieuYCXK, other.SoPhieuYCXK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PHIEU_YC_XUAT_KHO{" + "SoPhieuYCXK=" + SoPhieuYCXK + ", MaNV=" + MaNV + ", MaKho=" + MaKho + ", NgayLap=" + NgayLap + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
    public void addCTPXK()
    {
        CT_PHIEU_YC_XUAT_KHO chiTiet = new CT_PHIEU_YC_XUAT_KHO();
        ct_Yc_Xk.add(chiTiet);
    }
}
