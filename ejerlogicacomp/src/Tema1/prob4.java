/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

/**
 *Hacer un programa que imprima la suma de los 100 primeros numeros.
 * @author juliobitar
 */
public class prob4 {
    public static void main(String[] args) {
        int c=0;
        int s=0;
        while (c<100) {
            c++;
            s=c+s;
            
        }
        System.out.println("Imprimir:"+s);
    }
}
