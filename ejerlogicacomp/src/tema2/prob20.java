/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.io.IOException;
import static tema2.prob17.read;

/**
 *
 * @author juliobitar
 */
public class prob20 {
    public static void main(String[] args) throws IOException {
        int numero;

		System.out.println("Ingrese un numero para calcular su factorial : ");
numero = Integer.parseInt(read());	
if(numero > 0) {
cuerPrimo(numero);
}
else {
			System.out.println("No tiene factorial");
}	
}
static void cuerPrimo(int numero)	{
	
	int temp, factorial = 1;
	temp = numero; 
while(temp > 0) {
	factorial *= temp--;
}
System.out.println(numero +"! = " + factorial);
    }
    
}
