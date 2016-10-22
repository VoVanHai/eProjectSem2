/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

//import java.sql.Date;
import java.util.Date;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import repository.KhachHang;
import repository.PhieuXuatKho;

/**
 *
 * @author TrungChi
 */
public class Test {

    public static void main(String[] args) throws Exception {

        //Test KHACH_HANG
//        KhachHangDAOImlement dataKH = new KhachHangDAOImlement();
//        KhachHang kh = new KhachHang("KH004", "Chí Nguyễn", "0912 709 445",
//                "Quảng Ngãi", "Học sinh", "123456789", "Nam", "VIP", "Tài khoản vip", 1);
//        dataKH.add(kh);
//        dataKH.remove(1, "KH001");
//        dataKH.update("KH002", "Trần Thị Mén", "113113113", "SG", "Học sinh", "0987656555", "Nữ", "VIP", "Nữ đẹp", 1);
//        ArrayList<KhachHang> dsKH = dataKH.getAll();
//        System.out.println(dsKH);
//        KhachHang khSearch = dataKH.searchByID("KH001");
//        System.out.println(khSearch);
//        ArrayList<KhachHang> dsKH = dataKH.searchByName("Chí Nguyễn");
//        System.out.println(dsKH);
//        ArrayList<KhachHang> dsKH = dataKH.searchAll("KH00");
//        System.out.println(dsKH);
//        dataKH.close();
        //Test PHIEU_XUAT_KHO
//        String pattern = "yyyy-MM-dd";               
//        SimpleDateFormat format = new SimpleDateFormat(pattern);
//        try {
//          Date date = format.parse("2001-10-20");
//          System.out.println(date);
//        } catch (ParseException e) {
//          e.printStackTrace();
//        }
//        System.out.println(format.format(new Date("2001-10-20")));
//        String date_s = " 2011-01-18 00:00:00.0"; 
//        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss"); 
//        Date date = dt.parse(date_s); 
//        SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
//        System.out.println(dt1.format(date));

//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//
//        String input = args.length == 0 ? "1818-11-11" : args[0];
//
//        System.out.print(input + " Duoc parse thanh dang ");
//
//        Date t;
//
//        try {
//            t = ft.parse(input);
//            System.out.println(t);
//        } catch (ParseException e) {
//            System.out.println("Khong the parse duoc boi su dung " + ft);
//        }

        PhieuXuatKhoDAOImplement dataPXK = new PhieuXuatKhoDAOImplement();
//        PhieuXuatKho PXK = new PhieuXuatKho("P002", "NV001", "CH001", "2016-10-19" , "Đã xuất kho", 1);
//        dataPXK.add(PXK);
        
//        dataPXK.remove(0, "P001");

//        dataPXK.update("P002", "NV002", "CH002", "2015-10-10", "Xuất kho ngay và luôn", 1);

//        ArrayList<PhieuXuatKho> dsPXK = dataPXK.getAll();
//        System.out.println(dsPXK);
        
//        PhieuXuatKho PXK = dataPXK.searchByID("P002");
//        System.out.println(PXK);

        ArrayList<PhieuXuatKho> dsPXK = dataPXK.searchByDayToDay(new java.sql.Date(2009, 02 , 02), new java.sql.Date(2016, 10, 20));
        System.out.println(dsPXK);

        System.out.println("Success ");
    }
}
