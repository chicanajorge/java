/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.interceptor;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.model.Auditoria;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AuditoriaService;

@Aspect  // para que tenga significado debe estar declarado 
@Component("auditoriaInterceptor")   // ESTA BAJO EL CONTEXTO DE SPRING POR LO QUE ESTA MARCADO COMO COMPONENTE
public class AppInterceptorAuditoria {
    // PARA QUE HAYA IoC  = @Autowired
    // @Qualifier("impl2")  COMO HAY 2 IMPLEMENTACIONES LE DEBEMOS DECIR CUAL

    @Autowired
    @Qualifier("impAuditoria01")
    AuditoriaService service;

    public void beforeInsertAutorInterceptor(JoinPoint joinPoint) {
        System.out.println("Intercepting " + joinPoint.getSignature().getName() + " method");
        System.out.println("Before inserting: " + joinPoint.getArgs()[0]);
    }

    public void beforeDeleteAutorInterceptor(JoinPoint joinPoint) {
        System.out.println("Intercepting " + joinPoint.getSignature().getName() + " method");
        System.out.println("Before inserting: " + joinPoint.getArgs()[0]);

        Autor autor = (Autor) joinPoint.getArgs()[0];
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setInforme(autor.getApeMaterno() + " " + autor.getApePaterno() + " " + autor.getNombres());
        service.insert(auditoria);
    }

    @After("execution(* pe.edu.cibertec.service.impl.AutorServiceImpl.insert(pe.edu.cibertec.model.Autor)) && args(autor)")
    public void afterInsertAutorInterceptor(Autor autor) {
        System.out.println("After inserting: " + autor);
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setInforme(autor.getApeMaterno() + " " + autor.getApePaterno() + " " + autor.getNombres());
        service.insert(auditoria);
    }
    
    
    @After("execution(* pe.edu.cibertec.dao.impl.AutorDaoImpl.delete(pe.edu.cibertec.model.Autor)) && args(autor)")
    public void afterDeleteAutorInterceptor(Autor autor) {
        System.out.println("After delete: " + autor);
        Auditoria auditoria = new Auditoria();
        auditoria.setFecha(new Date());
        auditoria.setInforme(autor.getApeMaterno() + " " + autor.getApePaterno() + " " + autor.getNombres());
        service.insert(auditoria);
    }
}
