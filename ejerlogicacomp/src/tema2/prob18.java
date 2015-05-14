/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.io.IOException;
import static tema2.prob17.read;

/**
 *Hacer un pseudocodigo que cuente las veces que aparece una determinada
letra en una frase que introduciremos por teclado.

 * @author juliobitar
 */
public class prob18 {
    public static void main(String[] args) throws IOException {
        String s1;
	char letra;
	int conta = 0;
	System.out.println("Ingrese una frase : ");
	s1 = read();
	System.out.println("Ingrese la letra a buscar : ");
	letra = (char) System.in.read();
	
	for(int i = 0;i < s1.length();i++){
		if(letra == s1.charAt(i)){
			conta++;
		}
	}
System.out.println("La frase '" +s1 +"' tiene " + conta + " letras " + letra);	
    }
    
}
