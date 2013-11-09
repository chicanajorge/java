/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AutorService;

/**
 *
 * @author francisco
 */
@Aspect
@Component("applicationInterceptor")   // ESTA BAJO EL CONTEXTO DE SPRING POR LO QUE ESTA MARCADO COMO COMPONENTE
public class ApplicationInterceptor {
    
    // PARA QUE HAYA IoC  = @Autowired
    // @Qualifier("impl2")  COMO HAY 2 IMPLEMENTACIONES LE DEBEMOS DECIR CUAL
    @Autowired
    @Qualifier("impl2")         
    AutorService service;
    
    public void beforeInsertAutorInterceptor(JoinPoint joinPoint) {
        System.out.println("Intercepting " + joinPoint.getSignature().getName() + " method");
        System.out.println("Before inserting: " + joinPoint.getArgs()[0]);
    }
    
    @After("execution(* pe.edu.cibertec.service.impl.AutorServiceImpl.insert(pe.edu.cibertec.model.Autor)) && args(autor)")
    public void afterInsertAutorInterceptor(Autor autor) {
        System.out.println("After inserting: " + autor);
        service.insert(autor);
    }
    
}
