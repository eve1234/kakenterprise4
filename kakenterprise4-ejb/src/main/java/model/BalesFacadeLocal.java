/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Bales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yvonneak
 */
@Local
public interface BalesFacadeLocal {

    void create(Bales bales);

    void edit(Bales bales);

    void remove(Bales bales);

    Bales find(Object id);

    List<Bales> findAll();

    List<Bales> findRange(int[] range);

    int count();
    
}
