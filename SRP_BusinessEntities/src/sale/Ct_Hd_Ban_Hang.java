/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Tien-Dung
 */
public class Ct_Hd_Ban_Hang implements Serializable{

        private String soHD;
        private String maSP;
        private int soLuong;
        private int dongiaBan;
        private int giaKM;
        private ArrayList<Ct_Hd_Ban_Hang> cthdbh;

        public Ct_Hd_Ban_Hang() {
        }

        public Ct_Hd_Ban_Hang(String soHD, String maSP, int soLuong, int dongiaBan, int giaKM) {
            this.soHD = soHD;
            this.maSP = maSP;
            this.soLuong = soLuong;
            this.dongiaBan = dongiaBan;
            this.giaKM = giaKM;
            cthdbh=new ArrayList<>();
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


        @Override
        public String toString() {
            return "CT_HD_BH{" + "soHD=" + soHD + ", maSP=" + maSP + ", soLuong=" + soLuong + ", dongiaBan=" + dongiaBan + ", giaKM=" + giaKM + '}';
        }
    }
