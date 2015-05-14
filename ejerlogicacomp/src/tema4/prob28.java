/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.io.IOException;

/**
 *Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara
o cruz.

 * @author juliobitar
 */
public class prob28 {
    public static void main(String[] args) throws IOException {
        char op;
	       System.out.println("Desea tirar la moneda (s/n) : ");
	op = (char) System.in.read();
double moneda;	
if (op == 's' || op == 'S'){
moneda = Math.random();		
System.out.println(moneda);
		if(moneda < 0.5){
			System.out.println("La moneda da cara !");
		}
		else {
                    System.out.println("La moneda da Cruz !");
		}
	}
else {
	   System.out.println("La moneda no ha sido lanzada");
}
    }
    
}
