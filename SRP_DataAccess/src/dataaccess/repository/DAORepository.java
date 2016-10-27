/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess.repository;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface DAORepository<T> {
    boolean add(T dao) throws Exception;
    boolean remove(T dao) throws Exception;
    T find(T dao) throws Exception;
    boolean update(T dao) throws Exception;
    ArrayList<T> getAll() throws Exception;
}
