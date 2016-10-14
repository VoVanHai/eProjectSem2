/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong_ke_hoach;

import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class Chuc_Vu {
    private String MaCV;
    private String TenCV;
    private String GhiChu;
    private int TrangThai;

    public Chuc_Vu(String MaCV, String TenCV, String GhiChu, int TrangThai) {
        this.MaCV = MaCV;
        this.TenCV = TenCV;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaCV() {
        return MaCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public String getTenCV() {
        return TenCV;
    }

    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
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
        hash = 97 * hash + Objects.hashCode(this.MaCV);
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
        final Chuc_Vu other = (Chuc_Vu) obj;
        if (!Objects.equals(this.MaCV, other.MaCV)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chuc_Vu{" + "MaCV=" + MaCV + ", TenCV=" + TenCV + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
