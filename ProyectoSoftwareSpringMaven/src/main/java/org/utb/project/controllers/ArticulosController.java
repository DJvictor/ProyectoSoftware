/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utb.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sala403e15
 */
@Controller
public class ArticulosController {
    @RequestMapping(value = "/articulos/listado", method = RequestMethod.GET)
    public String listado(){
       return "articulos/listado";
    }
}
