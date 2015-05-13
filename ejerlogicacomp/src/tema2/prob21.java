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
public class prob21 {
    public static void main(String[] args) throws IOException {
        int op;
	do {
	System.out.println("Desea la suma de numeros 1) pares o 2) impares, desde 1 a 1000 : ");
op = Integer.parseInt(read()); 
	}
	while(op != 1 && op != 2);
switch(op){
case 1 : sumaPares();break;
case 2 : sumaImpares();break;
}
}
static void sumaPares(){
int suma = 0;
for(int conta = 2;conta <= 1000; conta++){
	if(conta % 2 == 0)
		suma++;
}
System.out.println("La suma de numeros pares de 1 a 1000 es : " +suma);
}
static void sumaImpares(){
int suma = 0;
for(int conta = 1;conta <= 1000; conta++){
	if(conta % 2 != 0)
		suma++;
}
System.out.println("La suma de numeros impares de 1 a 1000 es : " +suma);

    }
    
}
