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
public class prob24 {
    public static void main(String[] args) throws IOException {
        	int numero,contador = 2;
	boolean primo = true;
	System.out.println("Ingrese un numero : ");
	numero = Integer.parseInt(read());
while((primo) && contador < numero){
	
	if(numero % contador == 0)
		primo = false;
	contador++;
}
System.out.println((primo) ? "El numero " + numero + " es primo !" : "El numero " + numero + " no es primo !");

    }
    
}
