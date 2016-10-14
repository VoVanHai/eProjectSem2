/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class THU_KHO implements Serializable{
    private String MaNV;
    private String MaKho;
    private Date startDate;
    private Date endDate;
    private String GhiChu;
    private String MaCV;

    public THU_KHO(String MaNV, String MaKho, Date startDate, Date endDate, String GhiChu, String MaCV) {
        this.MaNV       = MaNV;
        this.MaKho      = MaKho;
        this.startDate  = startDate;
        this.endDate    = endDate;
        this.GhiChu     = GhiChu;
        this.MaCV       = MaCV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKho() {
        return MaKho;
    }

    public void setMaKho(String MaKho) {
        this.MaKho = MaKho;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaCV() {
        return MaCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.MaNV);
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
        final THU_KHO other = (THU_KHO) obj;
        if (!Objects.equals(this.MaNV, other.MaNV)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ThuKho{" + "MaNV=" + MaNV + ", MaKho=" + MaKho + ", startDate=" + startDate + ", endDate=" + endDate + ", GhiChu=" + GhiChu + ", MaCV=" + MaCV + '}';
    }
    
}
