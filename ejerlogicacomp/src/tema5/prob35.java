/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.io.IOException;
import static tema5.prob34.read;

/**
 *
 * @author juliobitar
 */
public class prob35 {
    public static void main(String[] args) throws IOException {
        try {	
	double notas [] = {4.5 , 6.2, 3.9, 5.6, 4.9, 5.6, 5.6, 5.8, 4.5, 6.5}, notaID;

	System.out.println("Ingrese una nota  a buscar : ");
notaID = Double.parseDouble(read());


boolean found = false;
for(int i = 0; i < notas.length;i++){
	if(notas[i] == notaID){
		found = true;
		break;
	}
}
	
System.out.println((found) ? "El alumno tiene " + notaID + " entre sus calificaciones" : "No tiene " + notaID + " entre sus calificaciones");	
}
catch (NumberFormatException ioe){
	System.err.println("Usted solo puede ingresar numeros");
}
    }
    
}
