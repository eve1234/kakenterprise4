/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Bales;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yvonneak
 */
@Stateless
public class BalesFacade extends AbstractFacade<Bales> implements BalesFacadeLocal {

    @PersistenceContext(unitName = "com.kakenterprise4_kakenterprise4-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BalesFacade() {
        super(Bales.class);
    }
    
}
