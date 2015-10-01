/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utb.project.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.utb.project.dao.ArticuloDao;
import org.utb.project.entities.Articulo;

/**
 *
 * @author Juansa
 */
@Controller
public class ArticulosController {
    @Autowired
    ArticuloDao articuloDao;
    
    @RequestMapping(value = "/articulos/listado", method = RequestMethod.GET)
    public String listado(){
        return "articulos/listado";
    }
    
    @RequestMapping(path = "/api/articulos", method = RequestMethod.POST)
    @ResponseBody
    public void guardar(@ModelAttribute Articulo articulo) {
        articuloDao.agregar(articulo);
    }
    
    @RequestMapping(path = "/api/articulos/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void editar(@PathVariable Long id, @ModelAttribute Articulo articulo) {
        articulo.setId(id);
        articuloDao.editar(articulo);
    }
    
    @RequestMapping(path = "/api/articulos/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void borrar(@PathVariable Long id) {
        articuloDao.borrar(id);
    }
    
    @RequestMapping(path = "/api/articulos", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Articulo> listar() {
        return articuloDao.listar();
    }
    
    @RequestMapping(path = "/api/articulos/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Articulo obtener(@PathVariable("id") Long id) {
        return articuloDao.obtener(id);
    }
}
