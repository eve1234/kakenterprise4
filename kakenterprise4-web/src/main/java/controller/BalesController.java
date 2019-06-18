/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Bales;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import model.*;
import entities.*;
import model.BalesFacadeLocal;

/**
 *
 * @author yvonneak
 */
@Named(value = "balesController")
@SessionScoped
public class BalesController implements Serializable {

    
    @EJB
    private BalesFacade balesFacade;
    private Bales bales =new Bales();

    public Bales getBales() {
        return bales;
    }

    public void setBales(Bales bales) {
        this.bales = bales;
    }
    /**
     * Creates a new instance of BalesController
     */
    public BalesController() {
    }
    
    public List<Bales> findAll(){
        return this.balesFacade.findAll();
    }
    
}
