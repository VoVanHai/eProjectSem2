/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import dataaccess.repository.PhieuYCXuatKhoDAOImpl;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author TrungChi
 */
public class PhieuYeucauXK_BE {

    private PhieuYCXuatKho pyc;
    private ArrayList<CTPhieuYCXuatKho> ctpyc;

    public PhieuYeucauXK_BE(PhieuYCXuatKho pyc) { 
        this.pyc = pyc;
        ctpyc = pyc.getChitietPhieuYCXK();
    }

    public void themChitiet(CTPhieuYCXuatKho ct) {
        //co  chi tiet roi thi cap nhat so luong
        if (ctpyc.contains(ct)) {
            CTPhieuYCXuatKho x = ctpyc.get(ctpyc.indexOf(ct));
            x.setSoLuong(x.getSoLuong() + ct.getSoLuong());
        } else//chua co thi them moi
        {
            ctpyc.add(ct);
        }
    }

    public boolean xoaChitiet(CTPhieuYCXuatKho ct) {
        return ctpyc.remove(ct);
    }
    /**
     * Luu  xuong csdl
     * @throws Exception 
     */
    public void persist()throws Exception{
        if(pyc==null)
            throw new Exception("khong the luu mot phieu null");
        new  PhieuYCXuatKhoDAOImpl().persist(pyc);
    }

    public PhieuYCXuatKho getPyc() {
        return pyc;
    }
    
     public PhieuYCXuatKho getPhieuYCXK(String sophieu) throws Exception {
          return new  PhieuYCXuatKhoDAOImpl().getPhieuYCXK(sophieu);
     }
    
    
}
