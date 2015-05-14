/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

import java.util.Scanner;

/**
 *.-Hacer un pseudocodigo que imprima el mayor y el menor de una serie de
cinco numeros que vamos introduciendo por teclado.

 * @author juliobitar
 */
public class prob14 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);  
        int X,Y;  
        System.out.println("Ingresa un numero ");  
        int A = sc.nextInt();  
        System.out.println("Ingresa un numero ");  
        int B = sc.nextInt();  
        System.out.println("Ingresa un numero ");  
        int C = sc.nextInt();  
        System.out.println("Ingresa un numero ");  
        int D = sc.nextInt();  
        if(A > B && A > C && A > D){  
            X=A;  
        }else{  
            if(B > A && B > C && B > D){  
                X=B;  
            }else{  
                if(C > A && C > B && C > D){  
                    X=C;  
                }else  
                    X=D;  
            }  
        }  
        if(A < B && A < C && A < D){  
            Y=A;  
        }else{  
            if(B < A && B < C && B < D){  
                Y=B;  
            }else{  
                if(C < A && C < B && C < D){  
                    Y=C;  
                }else  
                    Y=D;  
            }  
        }  
        System.out.println("el mayor es "+X+" y el menor es "+Y);  
     }  
    
}
