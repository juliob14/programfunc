/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *Hacer un pseudocodigo que imprima todos los numeros naturales que hay
desde la unidad hasta un numero que introducimos por teclado.


 * @author juliobitar
 */
public class prob6 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        String linea = null;
        StringTokenizer str;
        int n=0;
        System.out.println("Ingrese un valor numerico");
        linea= in.readLine();
        n=Integer.parseInt(linea);
        
        while (c<n) {
            c++;
            
        }
        
    }
}
