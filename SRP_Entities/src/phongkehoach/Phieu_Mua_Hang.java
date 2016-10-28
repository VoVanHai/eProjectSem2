/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author WIN7
 */
public class Phieu_Mua_Hang implements Serializable{
    private String soPhieu;
    private String maNV;
    private String maNCC;
    private Date ngayLapPhieu;
    private String ghiChu;
    private int trangThai;
    private ArrayList<CT_Phieu_Mua_Hang> chitietpmh;

    public Phieu_Mua_Hang(String SoPhieu, String MaNV, String MaNCC, Date NgayLapPhieu, String GhiChu, int TrangThai) {
        this.soPhieu = SoPhieu;
        this.maNV = MaNV;
        this.maNCC = MaNCC;
        this.ngayLapPhieu = NgayLapPhieu;
        this.ghiChu = GhiChu;
        this.trangThai = TrangThai;
        chitietpmh=new ArrayList<>();
    }

    public String getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(String SoPhieu) {
        this.soPhieu = SoPhieu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String MaNV) {
        this.maNV = MaNV;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.maNCC = MaNCC;
    }

    public Date getNgayLapPhieu() {
        return ngayLapPhieu;
    }

    public void setNgayLapPhieu(Date NgayLapPhieu) {
        this.ngayLapPhieu = NgayLapPhieu;
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

    public ArrayList<CT_Phieu_Mua_Hang> getChitietpmh() {
        return chitietpmh;
    }

    public void setChitietpmh(ArrayList<CT_Phieu_Mua_Hang> chitietpmh) {
        this.chitietpmh = chitietpmh;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.soPhieu);
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
        if (!Objects.equals(this.soPhieu, other.soPhieu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Phieu_Mua_Hang{" + "SoPhieu=" + soPhieu + ", MaNV=" + maNV + ", MaNCC=" + maNCC + ", NgayLapPhieu=" + ngayLapPhieu + chitietpmh + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
    
}
