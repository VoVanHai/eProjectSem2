/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class ThuKho implements Serializable{
    private String maNV;
    private String maKho;
    private Date startDate;
    private Date endDate;
    private String ghiChu;
    private String maCV;

    public ThuKho(String maNV, String maKho, Date startDate, Date endDate, String ghiChu, String maCV) {
        setMaNV(maNV);
        setMaKho(maKho);
        setStartDate(startDate);
        setEndDate(endDate);
        setGhiChu(ghiChu);
        setMaCV(maCV);
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
        return ghiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.ghiChu = GhiChu;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String MaCV) {
        this.maCV = MaCV;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.maNV);
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
        final ThuKho other = (ThuKho) obj;
        if (!Objects.equals(this.maNV, other.maNV)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ThuKho{" + "MaNV=" + maNV + ", MaKho=" + maKho + ", startDate=" + startDate + ", endDate=" + endDate + ", GhiChu=" + ghiChu + ", MaCV=" + maCV + '}';
    }   
}
