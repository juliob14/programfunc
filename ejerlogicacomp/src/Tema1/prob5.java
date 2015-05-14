/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

/**
 *Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y que
imprima cuantos impares hay.

 * @author juliobitar
 */
public class prob5 {
    public static void main(String[] args) {
        int c=0;
        int ni=0;
        int ci=0;
        while (c<100) {
            c++;
            if (c%2==1) {
                ci++;
                ni=c;
                System.out.println("imprime"+ni);
                
            }
            
        }
        System.out.println("Cantidad impares son"+ci);
    }
}
