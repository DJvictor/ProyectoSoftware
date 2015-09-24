/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utb.project.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.utb.project.entities.Articulo;

/**
 *
 * @author Juansa
 */
@Component
public class ArticuloDao {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void agregar(Articulo articulo) {
        entityManager.persist(articulo);
        entityManager.flush();
    }

    @Transactional
    public List<Articulo> listar() {
        List<Articulo> articulos = entityManager.createQuery("SELECT a FROM Articulo a").getResultList();
        return articulos;
    }
}
