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
public class PHIEU_KIEM_TRA {
    private String SoPhieu;
    private String MaKho;
    private String MaNV;
    private String NgayKT;
    private String GhiChu;
    private int    TrangThai;
    
    private ArrayList<CT_PHIEU_KT> ct_Kt;

    public PHIEU_KIEM_TRA(String SoPhieu, String MaKho, String MaNV, String NgayKT, String GhiChu, int TrangThai) {
        this.SoPhieu = SoPhieu;
        this.MaKho = MaKho;
        this.MaNV = MaNV;
        this.NgayKT = NgayKT;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public PHIEU_KIEM_TRA() {
    }

    public String getSoPhieu() {
        return SoPhieu;
    }

    public void setSoPhieu(String SoPhieu) {
        this.SoPhieu = SoPhieu;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String NgayKT) {
        this.NgayKT = NgayKT;
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
        hash = 31 * hash + Objects.hashCode(this.SoPhieu);
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
        final PHIEU_KIEM_TRA other = (PHIEU_KIEM_TRA) obj;
        if (!Objects.equals(this.SoPhieu, other.SoPhieu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PHIEU_KIEM_TRA{" + "SoPhieu=" + SoPhieu + ", MaKho=" + MaKho + ", MaNV=" + MaNV + ", NgayKT=" + NgayKT + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
    public void add()
    {
        CT_PHIEU_KT chiTiet = new CT_PHIEU_KT();
        ct_Kt.add(chiTiet);
    }
}
