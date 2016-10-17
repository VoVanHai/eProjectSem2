/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import java.io.Serializable;

/**
 *
 * @author VINH MARK
 */
public class HinhAnhSP implements Serializable{
    private int msHinh;
    private String tenHinh;
    private String duongdan;
    private String MaSP;

    public HinhAnhSP(int msHinh, String tenHinh, String duongdan, String MaSP) {
        this.msHinh = msHinh;
        this.tenHinh = tenHinh;
        this.duongdan = duongdan;
        this.MaSP = MaSP;
    }

    public int getMsHinh() {
        return msHinh;
    }

    public void setMsHinh(int msHinh) {
        this.msHinh = msHinh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getDuongdan() {
        return duongdan;
    }

    public void setDuongdan(String duongdan) {
        this.duongdan = duongdan;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.msHinh;
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
        final HinhAnhSP other = (HinhAnhSP) obj;
        if (this.msHinh != other.msHinh) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HinhAnhSP{" + "msHinh=" + msHinh + ", tenHinh=" + tenHinh + ", duongdan=" + duongdan + ", MaSP=" + MaSP + '}';
    }

    
}
