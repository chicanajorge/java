/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dao.UserDao;
import pe.edu.cibertec.service.UserService;

/**
 *
 * @author francisco
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    public void list() {
        System.out.println("Listing in service");
        userDao.list();
        
    }
}
