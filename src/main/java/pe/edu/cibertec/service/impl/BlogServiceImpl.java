/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.service.BlogService;

/**
 *
 * @author Francisco
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService{

    public void listarBlogs() {
        System.out.println("Listando blogs");
    }
    
}
