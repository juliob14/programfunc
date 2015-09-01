/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.Dao;

import java.util.List;
import mx.datos.Producto;

/**
 *
 * @author juliobitar
 */
public interface Crud {
    public List<Producto> list();
    
    public void create(Producto producto);
    
    public void update(Producto producto);
    
    public void eliminar(Integer id);
    
}
