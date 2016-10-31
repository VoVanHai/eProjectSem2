/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import sale.Ct_Hd_Ban_Hang;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Tien-Dung
 */
public class HoaDon implements Serializable {

    private String soHD;
    private Date ngayHD;
    private String maNV;
    private int money;
    private String maKH;
    private String tinhTrang;
    private ArrayList<Ct_Hd_Ban_Hang> cthdbh=new ArrayList<Ct_Hd_Ban_Hang>();

    public HoaDon() {
    }

    public HoaDon(String soHD, Date ngayHD, String maNV, int money, String maKH, String TinhTrang) {
        this.soHD = soHD;
        this.ngayHD = ngayHD;
        this.maNV = maNV;
        this.money = money;
        this.maKH = maKH;
        this.tinhTrang = TinhTrang;
        cthdbh=new ArrayList<>();

    }

    public String getSoHD() {
        return soHD;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public int getMoney() {
        return money;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.soHD);
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
        final HoaDon other = (HoaDon) obj;
        if (!Objects.equals(this.soHD, other.soHD)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "HoaDon{" + "soHD=" + soHD + ", ngayHD=" + ngayHD
                + ", maNV=" + maNV + ", money=" + money + ", maKH=" + maKH + ", tinhTrang=" + tinhTrang + '}';
    }
    
    public void setArraylist(ArrayList<Ct_Hd_Ban_Hang> cthdbh){
        this.cthdbh=cthdbh;
    }
    
    public ArrayList<Ct_Hd_Ban_Hang> getCt_Hd_Ban_Hang(){
        return cthdbh;
    }
    
}
