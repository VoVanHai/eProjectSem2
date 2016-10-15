/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sale;

import java.io.Serializable;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Tien-Dung
 */
public class HD implements Serializable{
    private String soHD;
    private Date ngayHD;
    private String maNV;
    private int money;
    private String maKH;
    private String tinhTrang;

    public HD() {
    }

    public HD(String soHD, Date ngayHD, String maNV, int money, String maKH, String tinhTrang) {
        this.soHD = soHD;
        this.ngayHD = ngayHD;
        this.maNV = maNV;
        this.money = money;
        this.maKH = maKH;
        this.tinhTrang = tinhTrang;
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
    public String toString() {
        return "HoaDon{" + "soHD=" + soHD + ", ngayHD=" + ngayHD +
                ", maNV=" + maNV + ", money=" + money + ", maKH=" + maKH + ", tinhTrang=" + tinhTrang + '}';
    }
    
}
