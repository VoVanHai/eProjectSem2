/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Kho implements Serializable{
    private String maKho;
    private String tenKho;
    private String diaChi;
    private String soDT;
    private String ghiChu;
    private int trangThai;

    public Kho(String maKho, String tenKho, String diaChi, String soDT, String ghiChu, int trangThai) {
        setMaKho(maKho);
        setTenKho(tenKho);
        setDiaChi(diaChi);
        setSoDT(soDT);
        setGhiChu(ghiChu);
        setTrangThai(trangThai);
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String MaKho) {
        this.maKho = MaKho;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String TenKho) {
        this.tenKho = TenKho;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.diaChi = DiaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String SoDT) {
        this.soDT = SoDT;
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
        hash = 83 * hash + Objects.hashCode(this.maKho);
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
        final Kho other = (Kho) obj;
        if (!Objects.equals(this.maKho, other.maKho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kho{" + "MaKho=" + maKho + ", TenKho=" + tenKho + ", DiaChi=" + diaChi + ", SoDT=" + soDT + ", GhiChu=" + ghiChu + ", TrangThai=" + trangThai + '}';
    }
    
}
