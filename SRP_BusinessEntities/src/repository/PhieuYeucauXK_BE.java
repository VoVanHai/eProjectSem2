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
        if(pyc == null & ctpyc == null)
            throw new Exception("khong the luu mot phieu null");
        new  PhieuYCXuatKhoDAOImpl().persist(pyc);
    }
    
    //Lấy một phiếu yêu cầu
    public PhieuYCXuatKho getPyc() {
        return pyc;
    }
    
    //Một phiếu yêu cầu theo số phiếu
    public PhieuYCXuatKho getPhieuYCXK() throws Exception {
         return new  PhieuYCXuatKhoDAOImpl().getPhieuYCXK(pyc.getSoPhieuYCXK());
    }    
    
    //remove một phiếu yêu cầu
    public boolean remove() throws Exception{
        return new PhieuYCXuatKhoDAOImpl().remove(pyc.getSoPhieuYCXK());
    }
    
    public void update() throws Exception{
        new PhieuYCXuatKhoDAOImpl().update(pyc);
    }
    
    public static void main(String[] args) throws Exception {         
        
        PhieuYCXuatKho yc = new PhieuYCXuatKho("P001", "NV001", "K01", new Date(1), "Ghi chú", 1);
        CTPhieuYCXuatKho ct1 = new CTPhieuYCXuatKho("P001", "sp001", 12, "Sản phẩm 1");
        CTPhieuYCXuatKho ct2 = new CTPhieuYCXuatKho("P001", "sp002", 12, "Sản phẩm 1");
        CTPhieuYCXuatKho ct3 = new CTPhieuYCXuatKho("P001", "sp001", 12, "Sản phẩm 1");        
        
        PhieuYeucauXK_BE pycxk = new PhieuYeucauXK_BE(yc);        
        
//        pycxk.themChitiet(ct1);
//        pycxk.themChitiet(ct2);
//        pycxk.themChitiet(ct3);
              
        pycxk.persist();        
    }
}
