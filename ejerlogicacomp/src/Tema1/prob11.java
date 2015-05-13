/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

import java.util.Scanner;

/**
 *
 * @author juliobitar
 */
public class prob11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        int conteo = 0;
        for (int i = 0; i <= numero; i++) {
            if (i%3 == 0 ) {
                System.out.println(i);
                conteo += 1;
                
            }
            
        }
        System.out.println("Existen "+conteo+" numeros primos");
    }
    
    
}
