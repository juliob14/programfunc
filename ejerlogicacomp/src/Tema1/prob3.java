/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

/**
 *Hacer un pseudocodigo que imprima los numeros pares entre 0 y 100.
 * @author juliobitar
 */
public class prob3 {
    public static void main(String[] args) {
        int c = 0;
        int np = 0;
        while(c<100){
            c++;
            if (c%2==0){
                np=c;
                 System.out.println("pares"+np);
            }
           
           
        }
    }
    
}
