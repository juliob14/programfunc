/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juliobitar
 */
public class prob17 {
    public static void main(String[] args) throws IOException {
        int numero1, numero2, conta = 0, suma = 0,temp1, temp2;
System.out.println("Ingrese un numero : ");
numero1 = Integer.parseInt(read());
do {
System.out.println("Ingrese un numero mayor al anterior : ");
numero2 = Integer.parseInt(read());
}
while(numero1 >= numero2);

temp1 = numero1; temp2 = numero2;

while(temp1 <= temp2){
		if(temp1 % 2 == 0){
			System.out.print(temp1 + " ,");
			suma += temp1;
			conta++;		
			}
		
temp1++;		
	}
System.out.println("Entre " +numero1 + " y " + numero2 + " existen " +conta + " numeros pares");
System.out.println("La suma de numeros pares entre " +numero1 + " y " + numero2 + " es " +suma);

    }

   static String read() throws IOException {
		String s1;	
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		s1 = S.readLine();	
			return s1;
		}
    
}
