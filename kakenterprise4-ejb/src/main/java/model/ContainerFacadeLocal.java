/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Container;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yvonneak
 */
@Local
public interface ContainerFacadeLocal {

    void create(Container container);

    void edit(Container container);

    void remove(Container container);

    Container find(Object id);

    List<Container> findAll();

    List<Container> findRange(int[] range);

    int count();
    
}
