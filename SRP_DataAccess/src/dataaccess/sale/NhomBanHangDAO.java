/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.sale;

import java.util.ArrayList;

/**
 *
 * @author VINH MARK
 */
public interface NhomBanHangDAO<T> {
    boolean add(T dao) throws Exception;
    boolean remove(T dao) throws Exception;
    T find(T dao) throws Exception;
    boolean update(T dao) throws Exception;
    ArrayList<T> getAll() throws Exception;
    void close() throws Exception;
}
