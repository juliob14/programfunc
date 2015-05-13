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
public class prob8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
            if ("n".equals(n) || "s".equals(n) || "N".equals(n) || "S".equals(n)) {
                System.out.println("Correcto");            
        }
            else{
                System.out.println("Incorrecto ingrese solo S o N");
            }
                
    }
    

    
}
