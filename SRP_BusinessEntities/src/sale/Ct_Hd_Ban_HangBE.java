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
public class Ct_Hd_Ban_HangBE implements Serializable{
    private Ct_Hd_Ban_Hang cthdbh=new Ct_Hd_Ban_Hang();

        public Ct_Hd_Ban_HangBE() {
        }

        public Ct_Hd_Ban_HangBE(String soHD, String maSP, int soLuong, int dongiaBan, int giaKM) {
            cthdbh.setSoHD(soHD);
            cthdbh.setMaSP(maSP);
            cthdbh.setSoLuong(soLuong);
            cthdbh.setDongiaBan(dongiaBan);
            cthdbh.setGiaKM(giaKM);
        }
        
        public Ct_Hd_Ban_Hang getCt_Hd_Ban_Hang(){
            return cthdbh;
                 
        }
    }
