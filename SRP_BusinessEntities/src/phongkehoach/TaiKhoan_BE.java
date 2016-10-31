/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import dataaccess.phongkehoach.TKDangNhapImp;

/**
 *
 * @author WIN7
 */
public class TaiKhoan_BE {
    private TK_Dang_Nhap tk;
    
    public TaiKhoan_BE(TK_Dang_Nhap tk) { 
        this.tk = tk;
    }
    public void add()throws Exception{        
        if(tk == null)
            throw new Exception("khong the luu mot tai khoan null");
        new  TKDangNhapImp().add(tk);
    }
    public TK_Dang_Nhap getTk() {
        return tk;
    }
    
    public TK_Dang_Nhap getTK_Dang_Nhap() throws Exception {
         return new TKDangNhapImp().find(tk);
    }
    
    public boolean remove() throws Exception{
        return new TKDangNhapImp().remove(tk);
    }
    
    public void update() throws Exception{
        new TKDangNhapImp().update(tk);
    }
    
    
    
}
