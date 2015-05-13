/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

/**
 *
 * @author juliobitar
 */
public class prob13 {
       public static void main(String[] args) {
        int contador2=0,contador3=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0) {
                System.out.println("Multiplo de dos = "+i);
                contador2++;
            }
            else{
                System.out.println("Multiplo de tres = "+i);
                contador3++;
            }            
        }
        System.out.println("Cantidad multiplos de 2 = "+contador2);
        System.out.println("Cantidad multplos de 3 = "+contador3);
    }
    
}
