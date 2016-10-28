/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import dataaccess.phongkehoach.PhieuMuaHangImp;
import java.util.ArrayList;
/**
 *
 * @author WIN7
 */
public class PhieuMuaHang_BE {
    private Phieu_Mua_Hang pmh;
    private ArrayList<CT_Phieu_Mua_Hang> ctpmh;

    public PhieuMuaHang_BE(Phieu_Mua_Hang pmh) { 
        this.pmh = pmh;
        ctpmh = pmh.getChitietpmh();
    }

    public void themChitiet(CT_Phieu_Mua_Hang ct) {
        
        //co  chi tiet roi thi cap nhat so luong
        if (ctpmh.contains(ct)) {
            CT_Phieu_Mua_Hang x = ctpmh.get(ctpmh.indexOf(ct));
            x.setSoLuong(x.getSoLuong() + ct.getSoLuong());
        } else//chua co thi them moi
        {
            ctpmh.add(ct);
        }
    }

    public boolean xoaChitiet(CT_Phieu_Mua_Hang ct) {
        return ctpmh.remove(ct);
    }
    /**
     * 
     * @throws Exception 
     */
    public void add()throws Exception{        
        if(pmh == null & ctpmh == null)
            throw new Exception("khong the luu mot phieu null");
        new  PhieuMuaHangImp().add(pmh);
    }
    
    //Lấy một phiếu yêu cầu
    public Phieu_Mua_Hang getPmh() {
        return pmh;
    }
    
    //Một phiếu yêu cầu theo số phiếu
    public Phieu_Mua_Hang getPhieu_Mua_Hang() throws Exception {
         return new  PhieuMuaHangImp().getPhieu_Mua_Hang(pmh.getSoPhieu());
    }    
    
    //remove một phiếu yêu cầu
    public boolean remove() throws Exception{
        return new PhieuMuaHangImp().remove(pmh.getSoPhieu());
    }
    
    public void update() throws Exception{
        new PhieuMuaHangImp().update(pmh);
    }
}
