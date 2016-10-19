/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sale;

import java.io.Serializable;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    private String TinhTrang;

    public HoaDon() {
    }

    public HoaDon(String soHD, Date ngayHD, String maNV, int money, String maKH, String TinhTrang) {
        this.soHD = soHD;
        this.ngayHD = ngayHD;
        this.maNV = maNV;
        this.money = money;
        this.maKH = maKH;
        this.TinhTrang = TinhTrang;
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
        return TinhTrang;
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
        this.TinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "soHD=" + soHD + ", ngayHD=" + ngayHD
                + ", maNV=" + maNV + ", money=" + money + ", maKH=" + maKH + ", tinhTrang=" + TinhTrang + '}';
    }
    ArrayList<Ct_Hd_Ban_Hang> cthd=new ArrayList<>();
    private class Ct_Hd_Ban_Hang {

        private String soHD;
        private String maSP;
        private int soLuong;
        private int dongiaBan;
        private int giaKM;

        public Ct_Hd_Ban_Hang() {
        }

        public Ct_Hd_Ban_Hang(String soHD, String maSP, int soLuong, int dongiaBan, int giaKM) {
            this.soHD = soHD;
            this.maSP = maSP;
            this.soLuong = soLuong;
            this.dongiaBan = dongiaBan;
            this.giaKM = giaKM;
        }

        public String getSoHD() {
            return soHD;
        }

        public String getMaSP() {
            return maSP;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public int getDongiaBan() {
            return dongiaBan;
        }

        public int getGiaKM() {
            return giaKM;
        }

        public void setSoHD(String soHD) {
            this.soHD = soHD;
        }

        public void setMaSP(String maSP) {
            this.maSP = maSP;
        }

        public void setSoLuong(int soLuong) {
            this.soLuong = soLuong;
        }

        public void setDongiaBan(int dongiaBan) {
            this.dongiaBan = dongiaBan;
        }

        public void setGiaKM(int giaKM) {
            this.giaKM = giaKM;
        }

        public void newCT() {
            Scanner s = new Scanner(System.in);
            System.out.println("Nhap so HD: ");
            soHD = s.nextLine();

            System.out.println("Nhap ma san pham: ");
            maSP = s.nextLine();

        }

        @Override
        public String toString() {
            return "CT_HD_BH{" + "soHD=" + soHD + ", maSP=" + maSP + ", soLuong=" + soLuong + ", dongiaBan=" + dongiaBan + ", giaKM=" + giaKM + '}';
        }

        private void display() {
            Scanner s=new Scanner(System.in);
            System.out.println("Nhap tien: ");
            money=s.nextInt();
        }

    }

}
