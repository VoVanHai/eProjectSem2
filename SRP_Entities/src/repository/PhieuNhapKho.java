package Repository;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TrungChi
 */
public class PhieuNhapKho implements Serializable{
    private String soPhieuNK;
    private String maNV;
    private String maKho;        
    private Date ngayNhap;        
    private String ghiChu;        
    private int trangThai;        

    public PhieuNhapKho(String soPhieuNK, String maNV, String maKho, Date ngayNhap, String ghiChu, int trangThai) {
        setSoPhieuNK(soPhieuNK);
        setMaNV(maNV);
        setMaKho(maKho);
        setNgayNhap(ngayNhap);
        setGhiChu(ghiChu);
        setTrangThai(trangThai);
    }

    public PhieuNhapKho() {
    }

    public String getSoPhieuNK() {
        return soPhieuNK;
    }

    public void setSoPhieuNK(String SoPhieuNK) {
        this.soPhieuNK = SoPhieuNK;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String MaNV) {
        this.maNV = MaNV;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String MaKho) {
        this.maKho = MaKho;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.ngayNhap = NgayNhap;
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
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.soPhieuNK);
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
        final PhieuNhapKho other = (PhieuNhapKho) obj;
        if (!Objects.equals(this.soPhieuNK, other.soPhieuNK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhieuNhapKho{" + "SoPhieuNK=" + soPhieuNK + ", MaNV=" + maNV + ", MaKho=" + maKho + ", NgayNhap=" + ngayNhap + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
}