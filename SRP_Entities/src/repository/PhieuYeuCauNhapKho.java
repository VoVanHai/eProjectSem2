/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class PhieuYeuCauNhapKho {
    private String soPhieuYCNK;
    private String soPhieuMH;
    private String maNV;
    private String maKho;
    private Date ngayLap;
    private String ghiChu;
    private int trangThai;

    public PhieuYeuCauNhapKho(String soPhieuYCNK, String soPhieuMH, String maNV, String maKho, Date ngayLap, String ghiChu, int trangThai) {
        setSoPhieuYCNK(soPhieuYCNK);
        setSoPhieuMH(soPhieuMH);
        setMaNV(maNV);
        setMaKho(maKho);
        setNgayLap(ngayLap);
        setGhiChu(ghiChu);
        setTrangThai(trangThai);
    }

    public String getSoPhieuYCNK() {
        return soPhieuYCNK;
    }

    public void setSoPhieuYCNK(String soPhieuYCNK) {
        this.soPhieuYCNK = soPhieuYCNK;
    }

    public String getSoPhieuMH() {
        return soPhieuMH;
    }

    public void setSoPhieuMH(String soPhieuMH) {
        this.soPhieuMH = soPhieuMH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.soPhieuYCNK);
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
        final PhieuYeuCauNhapKho other = (PhieuYeuCauNhapKho) obj;
        if (!Objects.equals(this.soPhieuYCNK, other.soPhieuYCNK)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Phieu_Yeu_Cau_Nhap_Kho{" + "soPhieuYCNK=" + soPhieuYCNK + ", soPhieuMH=" + soPhieuMH + ", maNV=" + maNV + ", maKho=" + maKho + ", ngayLap=" + ngayLap + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + '}';
    }
}
