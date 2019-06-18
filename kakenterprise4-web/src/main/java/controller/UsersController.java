/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Users;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import model.UsersFacade;

/**
 *
 * @author yvonneak
 */
@Named(value = "usersController")
@SessionScoped
public class UsersController implements Serializable {
    
    @EJB
    private UsersFacade usersFacade;

    /**
     * Creates a new instance of UsersController
     */
    public UsersController() {
    }
    
    public List<Users> findAll(){
        return usersFacade.findAll();
    }
    
}
