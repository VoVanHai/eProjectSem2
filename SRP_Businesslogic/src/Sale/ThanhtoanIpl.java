/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sale;

import dataaccess.sale.CT_HDImp;
import dataaccess.sale.HDImp;
import dataaccess.sale.NhomBanHangDAO;
import java.util.ArrayList;
import java.util.List;
import sale.HoaDon;
import sale.Ct_Hd_Ban_Hang;
import sale.HoaDonBE;




/**
 *
 * @author Tien-Dung
 */
public class ThanhtoanIpl implements ThanhToanService{
    
    
    private NhomBanHangDAO<HoaDon> hdi ;
    private NhomBanHangDAO<Ct_Hd_Ban_Hang> cthdi;

    public ThanhtoanIpl() throws Exception {
        this.hdi = new HDImp();
        this.cthdi = new CT_HDImp();
    }
    

    @Override
    public void lapphieu(HoaDonBE hdbe) {
        try{
        hdi.add(hdbe.getHoaDon());
        List<Ct_Hd_Ban_Hang> listct = hdbe.getHoaDon().getCt_Hd_Ban_Hang();
        for (Ct_Hd_Ban_Hang listct1 : listct) {
             cthdi.add(listct1);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }

    @Override
    public void inhd(HoaDonBE hdbe) {
        
    }
    
}
