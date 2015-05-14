/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

/**
 *Hacer un pseudocodigo que imprima los numeros del 1 al 100. Que calcule la
suma de todos los numeros pares por un lado, y por otro, la de todos los
impares.

 * @author juliobitar
 */
public class prob12 {
     public static void main(String[] args) {
        int SumaPares = 0, SumaImpares = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i%2==0) {
                SumaPares += i;                
            }
            else{
                SumaImpares += i;
            }
            
        }
        System.out.println("Suma de numeros pares calculados por un lado = jaja"
                    + " "+SumaPares+" Suma de impares calculados por el otro "
                    + "lado = "+SumaImpares);
    }
    
    
}
