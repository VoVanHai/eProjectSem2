/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

import sale.Ct_Hd_Ban_HangBE;
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
public class HoaDonBE implements Serializable {

    private HoaDon hd = new HoaDon();

    public HoaDonBE() {
    }

    public HoaDonBE(String soHD, Date ngayHD, String maNV, int money, String maKH, String TinhTrang) {
        hd.setSoHD(soHD);
        hd.setNgayHD(ngayHD);
        hd.setMaNV(maNV);
        hd.setMoney(money);
        hd.setMaKH(maKH);
        hd.setTinhTrang(TinhTrang);

    }
    
    public void addCTHDs(ArrayList<Ct_Hd_Ban_HangBE> cthdbhs){
        ArrayList<Ct_Hd_Ban_Hang> cthds=new ArrayList<>();
        for (int i = 0; i < cthdbhs.size(); i++) {
            Ct_Hd_Ban_HangBE bhbe = cthdbhs.get(i);
            cthds.add(bhbe.getCt_Hd_Ban_Hang());
        }
        hd.setArraylist(cthds);
        
    }
    public HoaDon getHoaDon(){
        return hd;
    }


   

  
}
