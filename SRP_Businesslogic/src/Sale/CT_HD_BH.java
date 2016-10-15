/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sale;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Tien-Dung
 */
public class CT_HD_BH implements Serializable{
    private String soHD;
    private String maSP;
    private int soLuong;
    private int dongiaBan;
    private int giaKM;

    public CT_HD_BH() {
    }

    public CT_HD_BH(String soHD, String maSP, int soLuong, int dongiaBan, int giaKM) {
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
    
    public void newCT(){
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap so HD: ");
        soHD=s.nextLine();
        
        System.out.println("Nhap ma san pham: ");
        maSP=s.nextLine();
        
   }
    @Override
    public String toString() {
        return "CT_HD_BH{" + "soHD=" + soHD + ", maSP=" + maSP + ", soLuong=" + soLuong + ", dongiaBan=" + dongiaBan + ", giaKM=" + giaKM + '}';
    }
    
}
