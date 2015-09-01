/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.datos;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juliobitar
 */
public class Producto {
    public static final String TABLA ="productos";
    public static final String[] FIELDS = {"id"};
   
    private Integer clave;
    private String descripcion;
    private Float precio;
    private String clasificacion;
    private Integer cantidad;
    private Integer min;
    private Integer max;
    
    
    
    public String fieldsToString(){
    String fieldStr = "";
    List<String> fieldsToConvert = Arrays.asList(FIELDS);
    for (String field: fieldsToConvert){
        fieldStr = String.format("%s","%s",fieldStr,field);
    }
    return fieldStr;
    }
}
