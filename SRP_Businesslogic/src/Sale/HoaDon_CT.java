/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sale;


import dataaccess.sale.HDImp;
import java.util.ArrayList;
import repository.CTPhieuYCXuatKho;
import repository.PhieuYCXuatKho;
import sale.HoaDon;

/**
 *
 * @author VINH MARK
 */
public class HoaDon_CT {
    private sale.HoaDon hd;
    private ArrayList<HoaDon_CT> cthd;

    public HoaDon_CT(HoaDon hd) {
        this.hd = hd;
    }

    

    

    public void themChitiet(HoaDon_CT ct) {
        //co  chi tiet roi thi cap nhat so luong
        if (cthd.contains(ct)) {
            HoaDon_CT x = cthd.get(cthd.indexOf(ct));
            x.setSoLuong(x.getSoLuong() + ct.getSoLuong());
        } else//chua co thi them moi
        {
            cthd.add(ct);
        }
    }

    public boolean xoaChitiet(CTPhieuYCXuatKho ct) {
        return cthd.remove(ct);
    }
    /**
     * Luu  xuong csdl
     * @throws Exception 
     */
    public void persist()throws Exception{
        if(hd==null)
            throw new Exception("khong the luu mot phieu null");
        new  HDImp().persist(hd);
    }

    public PhieuYCXuatKho getPyc() {
        return hd;
    }
    
     public HoaDon getHoaDon(String sohd) throws Exception {
          return new  HDImp().getHoaDon (sohd);
     }
    
}
