/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongtin;

/**
 *
 * @author VINH MARK
 */
public class HinhAnhSP {
    private int msHinh;
    private String tenHinh;
    private String duongdan;

    public HinhAnhSP() {
    }

    public HinhAnhSP(int msHinh, String tenHinh, String duongdan) {
        this.msHinh = msHinh;
        this.tenHinh = tenHinh;
        this.duongdan = duongdan;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.msHinh;
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
        return "HinhAnhSP{" + "msHinh=" + msHinh + ", tenHinh=" + tenHinh + ", duongdan=" + duongdan + '}';
    }
    
}
