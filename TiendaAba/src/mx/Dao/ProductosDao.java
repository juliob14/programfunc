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
public class ProductosDao implements Crud{

    @Override
    public List<Producto> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(Producto producto) {
         public boolean insert(Integer clave,String descripcion ,Float precio,String clasificacion,Integer cantidad, Integer min, Integer max){
        try {
            String query = "INSERT INTO productos VALUES();
            st.executeUpdate(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void update(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
