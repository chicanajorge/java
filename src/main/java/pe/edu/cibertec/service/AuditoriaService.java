/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.model.Auditoria;
import pe.edu.cibertec.model.Autor;

/**
 *
 * @author JAVA-ADV-VS
 */
@Service("auditoriaService")
public interface AuditoriaService {

    public List<Auditoria> list();

    public Autor getById(Integer id);

    public void insert(Auditoria auditoria);

    public void update(Auditoria auditoria);

    public void delete(Auditoria auditoria);
}
