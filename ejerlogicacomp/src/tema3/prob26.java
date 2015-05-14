/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *Introducir una frase por teclado. Imprimirla en el centro de la pantalla.

 * @author juliobitar
 */
public class prob26 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase =sc.next();
        System.out.println("\t\t\t\t"+frase);
                
    }
    
}
