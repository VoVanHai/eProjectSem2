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
public class NhaCungCap implements Serializable {
    private String maNCC;
    private String tenNCC;
    private String diaChi;
    private String SDT;
    private String Email;
    private String tenNguoiDaiDien;
    private String ghiChu;

    public NhaCungCap(String maNCC) {
        this.maNCC = maNCC;
    }
    
    

    public NhaCungCap(String MaNCC, String TenNCC, String DiaChi, String SDT, String Email, String TenNguoiDaiDien, String GhiChu) {
        this.maNCC = MaNCC;
        this.tenNCC = TenNCC;
        this.diaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
        this.tenNguoiDaiDien = TenNguoiDaiDien;
        this.ghiChu = GhiChu;
        
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.maNCC = MaNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String TenNCC) {
        this.tenNCC = TenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.diaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTenNguoiDaiDien() {
        return tenNguoiDaiDien;
    }

    public void setTenNguoiDaiDien(String TenNguoiDaiDien) {
        this.tenNguoiDaiDien = TenNguoiDaiDien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.ghiChu = GhiChu;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.maNCC);
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
        final NhaCungCap other = (NhaCungCap) obj;
        if (!Objects.equals(this.maNCC, other.maNCC)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return maNCC;
    }
    
}
