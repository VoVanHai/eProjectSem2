/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import dataaccess.phongkehoach.NhanVienImp;

/**
 *
 * @author WIN7
 */
public class NhanVien_BE {
    private Nhan_Vien nv;
    
    public NhanVien_BE(Nhan_Vien nv) { 
        this.nv = nv;
    }
    public void add()throws Exception{        
        if(nv == null)
            throw new Exception("khong the luu mot nhan vien null");
        new  NhanVienImp().add(nv);
    }
    public Nhan_Vien getNv() {
        return nv;
    }
    
    public Nhan_Vien getNhan_Vien() throws Exception {
         return new NhanVienImp().find(nv);
    }
    
    public boolean remove() throws Exception{
        return new NhanVienImp().remove(nv);
    }
    
    public void update() throws Exception{
        new NhanVienImp().update(nv);
    }
    
}
