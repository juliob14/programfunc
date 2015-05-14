/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.io.IOException;
import static tema3.prob22.read;

/**
 *Introducir un numero menor de 5000 y pasarlo a numero romano.
 * @author juliobitar
 */
public class prob25 {
    public static void main(String[] args) throws IOException {
        int numero;
	do{
	System.out.print("Ingrese un numero : ");
		numero = Integer.parseInt(read());
	} while (numero < 1 || numero > 5000);
	while (numero >= 1000){
		System.out.print("M");
	numero -= 1000;
	}
	while (numero >= 900){
		System.out.print("CM");
	numero -= 900;
	}
	
	while(numero >= 500){
		System.out.print("D");
numero -= 500;
	}
	while(numero >= 400){
		System.out.print("CD");
		numero -= 400;	
	}
	while (numero >= 100){
		System.out.print("C");
	numero -= 100;
	}
	while (numero >= 90){
		System.out.print("XC");
numero -= 90;
	}
	while (numero >= 50){
		System.out.print("L");
	numero -= 50;
	
	}
	while (numero >= 40){
		System.out.print("XL");
numero -= 40;
	}
	while (numero >= 10){
		System.out.print("X");
numero -= 10;
	}
	while(numero >= 9){
		System.out.print("IX");
numero -= 9;
	}
	while (numero >= 5){
		System.out.print("V");
numero -= 5;
	}
	while (numero >= 4){
		System.out.print("IV");
numero -= 4;
	}
	while (numero >= 1){
		System.out.print("I");
numero -= 1;
		
	}
}
static void romano2() throws IOException {
	int numero;
do{
	System.out.println("Ingrese un numero : ");
	numero = Integer.parseInt(read());
} while(numero < 1 || numero > 5000);
while(numero > 0) {

if(numero >= 10){
	System.out.print("X");
	numero -= 10;
}
if (numero >= 9){
	System.out.print("IX");
	numero -= 9;
}
if(numero >= 5){
	System.out.print("V");
numero -= 5;
}

if(numero >= 4){
	System.out.print("IV");
	numero -= 4;
}

if(numero > 0){
	System.out.print("I");
	numero -= 1;
}
}
    }
    
}
