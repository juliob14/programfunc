/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.io.IOException;
import static tema4.prob29.read;

/**
 *Introducir dos nymeros por teclado y mediante un menu, calcule su suma, su
resta, su multiplicacion o su division.

 * @author juliobitar
 */
public class prob31 {
    public static void main(String[] args) throws IOException {
        int numero1, numero2, op;
do {
System.out.println("Ingrese un numero : ");
	numero1 = Integer.parseInt(read());
System.out.println("Ingrese un segundo numero : ");
numero2 = Integer.parseInt(read());
} while (numero1 < 0 || numero2 < 0);

System.out.println("Elija una opcion : ");
        System.out.println("1) suma ");
        System.out.println("2) resta ");
        System.out.println("3) multiplicar ");
        System.out.println("4) salir ");

        System.out.println("Ingrese una opcion : ");
op = Integer.parseInt(read());
switch(op){
case 1 : suma(numero1, numero2);break;
case 2 : resta(numero1,numero2); break;
case 3 : multi(numero1,numero2); break;
case 4 : close();break;
}

}
static void close(){
	System.out.println("Fin del programa ");
}
static void suma(int numero1,int numero2){

	System.out.println("La suma de " + numero1 + " + " + numero2 + " es = " + (numero1 + numero2));

}

static void multi (int numero1, int numero2){
	System.out.println("El producto de " + numero1 + " * " + numero2 + " es = " + (numero1 * numero2));	
}
	
static void resta(int numero1, int numero2){
	System.out.println("La resta de  " + numero1 + " - " + numero2 + " es = " + (numero1 - numero2));	
    }
    
}
