/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *Generar una matriz de 4 filas y 5 columnas con numeros aleatorios entre 1
y 100, e imprimirla.

 * @author juliobitar
 */
public class prob36 {
     public static void main(String[] args) {
         int[][] numeros = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = (int) Math.floor(Math.random()*101+1);        
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5; j++) {
                System.out.println(numeros[i][j]);
                
            }
        }
        
    }
    
}
