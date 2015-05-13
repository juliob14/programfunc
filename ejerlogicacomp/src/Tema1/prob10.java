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
public class prob10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        
        if (numero%2==0) {
            System.out.println("Numero par");
            
        }
        else
        {
            System.out.println("numero impar");
        }
    }
    
}
