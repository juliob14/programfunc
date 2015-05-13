/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author juliobitar
 */
public class prob32 {
    static int op;	
	
	// Reader - Metodo lector	
	static String read() throws IOException {
		String s1;
	BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();
	return s1;
	}

//Hacer un programa que nos permita introducir un numero por teclado y sobre el se realicen las siguientes 
//operaciones: comprobar si es primo, hallar su factorial o imprimir su tabla de multiplicar.
static void calculo() throws IOException {
int numero, op;
	System.out.println("Ingrese un numero : ");
	numero = Integer.parseInt(read());
System.out.println("Usted desea : ");
    System.out.println("1) Si es primo");
System.out.println("2) Su factorial");
System.out.println("3) Tabla de multiplicar");
System.out.println("4) Salir");
System.out.println("Ingrese una opcion : ");
op = Integer.parseInt(read());
switch (op){

case 1 : primo(numero) ; break;
case 2 : factorial(numero); break;
case 3 : tabla(numero); break;
case 4 : close(); break ;
}


	}
static void primo(int numero) throws IOException {
	boolean primo = true;
	for(int conta = 2;conta < numero && (primo);conta++){
		if(numero % conta == 0){
			primo = false;
		}
	}
System.out.println((primo) ? "El numero es primo !" : " El numero no es primo ! ");	
System.out.println("Desea realizar otra operacion Y o n : ");
prob32.op = (char) System.in.read();
switch (op){
	case 'y' : calculo();
	case 'n' : close();break;
}
}

static void factorial(int numero) throws IOException {
int temp = numero,factorial = 1;
while(temp > 0){
	
	factorial *= temp--;
}
System.out.println(numero + "! = " +factorial);	
System.out.println("Desea realizar otra operacion y o n : ");
prob32.op = (char) System.in.read();
}
static void tabla(int numero) throws IOException {
	int conta = 1;
	while(conta <= 10){
		
		System.out.println(numero + " * " + conta + " = " + (numero * conta++));

	}
	System.out.println("Desea realizar otra operacion : ");
	prob32.op = (char) System.in.read();
}
static void close(){
	System.out.println("Fin del programa !");
}
}
