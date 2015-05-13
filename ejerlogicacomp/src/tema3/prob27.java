/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.io.IOException;
import static tema3.prob22.read;

/**
 *
 * @author juliobitar
 */
public class prob27 {
     public static void main(String[] args) throws IOException {
     int tabla;	
	        System.out.println("Ingrese la tabla que desea calcular : ");
	tabla = Integer.parseInt(read());
	
for(int multi = 0,resul = 0;multi <= 10;multi++,resul = tabla * multi){
	
	System.out.println(tabla + " * " + multi + " = " + resul );
}
}
    
}
