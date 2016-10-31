/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import dataaccess.phongkehoach.ChucVuImp;
import java.util.ArrayList;

/**
 *
 * @author WIN7
 */
public class ChucVu_BE {
    private Chuc_Vu cv;
    
    public ChucVu_BE(Chuc_Vu cv) { 
        this.cv = cv;
    }
    public void add()throws Exception{        
        if(cv == null)
            throw new Exception("khong the luu mot chuc vu null");
        new  ChucVuImp().add(cv);
    }
    public Chuc_Vu getCv() {
        return cv;
    }
    
    public Chuc_Vu getChuc_Vu() throws Exception {
         return new ChucVuImp().find(cv);
    }
    
    public boolean remove() throws Exception{
        return new ChucVuImp().remove(cv);
    }
    
    public void update() throws Exception{
        new ChucVuImp().update(cv);
    }
    
}
