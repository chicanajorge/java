/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.AuditoriaDao;
import pe.edu.cibertec.model.Auditoria;
import pe.edu.cibertec.model.Autor;

/**
 *
 * @author JAVA-ADV-VS
 */
// para que lo vea spring el otro caso se hubiera declarado alli
@Repository("auditoriaDao")
public class AuditoriaDaoImpl implements AuditoriaDao {

    @PersistenceContext
    private EntityManager em;

    public List<Auditoria> list() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Autor getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional 
   public void insert(Auditoria auditoria) {
        em.persist(auditoria);
    }

    public void update(Auditoria auditoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Auditoria auditoria) {
       
    }
}
