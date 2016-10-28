/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author WIN7
 */
public class Chuong_Trinh_KM implements Serializable{
    private int maCT;
    private String tenCT;
    private Date ngayBD;
    private Date ngayKT;
    private String ghiChu;
    private int trangThai;
    ArrayList<CT_Chuong_Trinh_KM> ctctkm;

    public Chuong_Trinh_KM(int MaCT, String TenCT, Date NgayBD, Date NgayKT, String GhiChu, int TrangThai) {
        this.maCT = MaCT;
        this.tenCT = TenCT;
        this.ngayBD = NgayBD;
        this.ngayKT = NgayKT;
        this.ghiChu = GhiChu;
        this.trangThai = TrangThai;
        ctctkm=new ArrayList<>();
    }

    public ArrayList<CT_Chuong_Trinh_KM> getCtctkm() {
        return ctctkm;
    }

    public void setCtctkm(ArrayList<CT_Chuong_Trinh_KM> ctctkm) {
        this.ctctkm = ctctkm;
    }

    public int getMaCT() {
        return maCT;
    }

    public void setMaCT(int MaCT) {
        this.maCT = MaCT;
    }

    public String getTenCT() {
        return tenCT;
    }

    public void setTenCT(String TenCT) {
        this.tenCT = TenCT;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date NgayBD) {
        this.ngayBD = NgayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date NgayKT) {
        this.ngayKT = NgayKT;
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
        hash = 83 * hash + this.maCT;
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
        final Chuong_Trinh_KM other = (Chuong_Trinh_KM) obj;
        if (this.maCT != other.maCT) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chuong_Trinh_KM{" + "MaCT=" + maCT + ", TenCT=" + tenCT + ", NgayBD=" + ngayBD + ", NgayKT=" + ngayKT + ctctkm + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
    
}
