/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Trương Hồng Đoàn
 */
public class PhongBan implements Serializable{
    private String MaPB;
    private String TenPB;
    private String GhiChu;
    private int TrangThai;

    public PhongBan(String MaPB, String TenPB, String GhiChu, int TrangThai) {
        this.MaPB = MaPB;
        this.TenPB = TenPB;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
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
        hash = 59 * hash + Objects.hashCode(this.MaPB);
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
        final PhongBan other = (PhongBan) obj;
        if (!Objects.equals(this.MaPB, other.MaPB)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhongBan{" + "MaPB=" + MaPB + ", TenPB=" + TenPB + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
