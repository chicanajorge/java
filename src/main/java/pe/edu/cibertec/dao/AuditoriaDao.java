/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.dao;

import java.util.List;
import pe.edu.cibertec.model.Auditoria;
import pe.edu.cibertec.model.Autor;

public interface AuditoriaDao {

    public List<Auditoria> list();

    public Autor getById(Integer id);

    public void insert(Auditoria auditoria);

    public void update(Auditoria auditoria);

    public void delete(Auditoria auditoria);
}
