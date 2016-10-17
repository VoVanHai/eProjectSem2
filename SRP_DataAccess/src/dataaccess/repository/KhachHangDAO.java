/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import repository.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author TrungChi
 */
public interface KhachHangDAO {
    boolean add(KhachHang KH) throws Exception;
    boolean remove(String MaKH) throws Exception;
    boolean update(KhachHang newKH) throws Exception;    
    ArrayList<KhachHang> getAll() throws Exception;
    KhachHang searchByID(String MaKH) throws Exception;
    ArrayList<KhachHang> searchAll() throws Exception;    
}
