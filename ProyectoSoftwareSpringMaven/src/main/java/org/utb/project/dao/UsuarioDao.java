/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.utb.project.dao;

import java.util.List;
import org.utb.project.entities.Usuario;

/**
 *
 * @author Juansa
 */
public interface UsuarioDao {
    public void agregar(Usuario usuario);
    public List<Usuario> listar();
}
