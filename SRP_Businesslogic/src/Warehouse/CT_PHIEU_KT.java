/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.util.Objects;

/**
 *
 * @author TrungChi
 */
public class CT_PHIEU_KT {
    private String SoPhieu;
    private String MaSP;
    private String TenSP;
    private String MaNCC;
    private float  TongSo;
    private float  HuHong;
    private String NguyenNhan;
    private String GhiChu;
    private int    TrangThai;

    public CT_PHIEU_KT(String SoPhieu, String MaSP, String TenSP, String MaNCC, float TongSo, float HuHong, String NguyenNhan, String GhiChu, int TrangThai) {
        this.SoPhieu = SoPhieu;
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.MaNCC = MaNCC;
        this.TongSo = TongSo;
        this.HuHong = HuHong;
        this.NguyenNhan = NguyenNhan;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public CT_PHIEU_KT() {
    }

    public String getSoPhieu() {
        return SoPhieu;
    }

    public void setSoPhieu(String SoPhieu) {
        this.SoPhieu = SoPhieu;
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

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public float getTongSo() {
        return TongSo;
    }

    public void setTongSo(float TongSo) {
        this.TongSo = TongSo;
    }

    public float getHuHong() {
        return HuHong;
    }

    public void setHuHong(float HuHong) {
        this.HuHong = HuHong;
    }

    public String getNguyenNhan() {
        return NguyenNhan;
    }

    public void setNguyenNhan(String NguyenNhan) {
        this.NguyenNhan = NguyenNhan;
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
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.SoPhieu);
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
        final CT_PHIEU_KT other = (CT_PHIEU_KT) obj;
        if (!Objects.equals(this.SoPhieu, other.SoPhieu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CT_PHIEU_KT{" + "SoPhieu=" + SoPhieu + ", MaSP=" + MaSP + ", TenSP=" + TenSP + ", MaNCC=" + MaNCC + ", TongSo=" + TongSo + ", HuHong=" + HuHong + ", NguyenNhan=" + NguyenNhan + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
    
}
