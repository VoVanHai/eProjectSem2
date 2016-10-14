/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong_ke_hoach;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class Phieu_Mua_Hang {
    private String SoPhieu;
    private String MaNV;
    private String MaNCC;
    private Date NgayLapPhieu;
    private String GhiChu;
    private int TrangThai;

    public Phieu_Mua_Hang(String SoPhieu, String MaNV, String MaNCC, Date NgayLapPhieu, String GhiChu, int TrangThai) {
        this.SoPhieu = SoPhieu;
        this.MaNV = MaNV;
        this.MaNCC = MaNCC;
        this.NgayLapPhieu = NgayLapPhieu;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getSoPhieu() {
        return SoPhieu;
    }

    public void setSoPhieu(String SoPhieu) {
        this.SoPhieu = SoPhieu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public Date getNgayLapPhieu() {
        return NgayLapPhieu;
    }

    public void setNgayLapPhieu(Date NgayLapPhieu) {
        this.NgayLapPhieu = NgayLapPhieu;
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
        hash = 67 * hash + Objects.hashCode(this.SoPhieu);
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
        final Phieu_Mua_Hang other = (Phieu_Mua_Hang) obj;
        if (!Objects.equals(this.SoPhieu, other.SoPhieu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Phieu_Mua_Hang{" + "SoPhieu=" + SoPhieu + ", MaNV=" + MaNV + ", MaNCC=" + MaNCC + ", NgayLapPhieu=" + NgayLapPhieu + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
