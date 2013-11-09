/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao.impl;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dao.UserDao;

/**
 *
 * @author francisco
 */
@Repository("francisco")
public class UserDaoImpl implements UserDao{
    public void list() {
        System.out.println("Obteniendo la lista de usuarios");
    }
}
