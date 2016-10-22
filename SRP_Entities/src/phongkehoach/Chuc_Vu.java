/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class Chuc_Vu implements Serializable{
    private String maCV;
    private String tenCV;
    private String ghiChu;
    private int trangThai;

    public Chuc_Vu(String MaCV, String TenCV, String GhiChu, int TrangThai) {
        this.maCV = MaCV;
        this.tenCV = TenCV;
        this.ghiChu = GhiChu;
        this.trangThai = TrangThai;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String MaCV) {
        this.maCV = MaCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String TenCV) {
        this.tenCV = TenCV;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.ghiChu = GhiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.trangThai = TrangThai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.maCV);
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
        if (!Objects.equals(this.maCV, other.maCV)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chuc_Vu{" + "MaCV=" + maCV + ", TenCV=" + tenCV + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
    
}
