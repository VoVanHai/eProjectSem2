/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phongkehoach;

import dataaccess.phongkehoach.CTKMImp;
import java.util.ArrayList;

/**
 *
 * @author WIN7
 */
public class ChuongTrinhKM_BE {
    private Chuong_Trinh_KM ctkm;
    private ArrayList<CT_Chuong_Trinh_KM> ctctkm;
    
     public ChuongTrinhKM_BE(Chuong_Trinh_KM ctkm) { 
        this.ctkm = ctkm;
        ctctkm = ctkm.getCtctkm();
    }

    public void themChitiet(CT_Chuong_Trinh_KM ct) {
        
        //co  chi tiet roi thi cap nhat phan tram
        if (ctctkm.contains(ct)) {
            CT_Chuong_Trinh_KM x = ctctkm.get(ctctkm.indexOf(ct));
            x.setPhanTramKM(x.getPhanTramKM()+ ct.getPhanTramKM());
        } else//chua co thi them moi
        {
            ctctkm.add(ct);
        }
    }

    public boolean xoaChitiet(CT_Chuong_Trinh_KM ct) {
        return ctctkm.remove(ct);
    }
    /**
     * 
     * @throws Exception 
     */
    public void add()throws Exception{        
        if(ctkm == null & ctctkm == null)
            throw new Exception("khong the luu mot chuong trinh null");
        new  CTKMImp().add(ctkm);
    }
    
    //Lấy một chương trình 
    public Chuong_Trinh_KM getCtkm() {
        return ctkm;
    }
    
    //Một chương trình theo mã chương trình
    public Chuong_Trinh_KM getChuong_Trinh_KM() throws Exception {
         return new  CTKMImp().getChuong_Trinh_KM(ctkm.getMaCT());
    }    
    
    //remove một chương trình
    public boolean remove() throws Exception{
        return new CTKMImp().remove(ctkm.getMaCT());
    }
    
    public void update() throws Exception{
        new CTKMImp().update(ctkm);
    }
    
}
