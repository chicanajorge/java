/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.dao.AutorDao;
import pe.edu.cibertec.model.Autor;
import pe.edu.cibertec.service.AutorService;

@Service("autorService")
@Qualifier("impl1")
public class AutorServiceImpl implements AutorService {

    @Autowired
    AutorDao autorDao;

    public List<Autor> list() {
        return autorDao.list();
    }

    public Autor getById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional
    public void insert(Autor autor) {
        autorDao.insert(autor);
    }

    public void update(Autor autor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional
    public void delete(Autor autor) {
       autor= autorDao.getById(autor.getIdAutor());
       autorDao.delete(autor);
    }
}
