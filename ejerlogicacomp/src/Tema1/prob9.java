/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

import java.util.Scanner;

/**
 *Introducir un numero por teclado. Que nos diga si es positivo o negativo.
 * @author juliobitar
 */
public class prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("El numero ingresado es negativo");
        }
        else{
            System.out.println("El numero ingresado es positivo");
        }
        
    }
    
    
}
