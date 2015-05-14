/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author juliobitar
 */
public class prob37 {
     public static void main( String args[ ]){
        int [ ][ ]A = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = (int) Math.floor(Math.random()*101+1);        
            }
        }

        System.out.println("La matriz dada es: ");
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz transpuesta es: ");
        for(int j = 0; j < A[0].length; j++){
            for(int i = 0; i < A.length; i++){
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
