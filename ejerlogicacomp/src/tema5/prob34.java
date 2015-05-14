/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

/**
 *Hacer un programa que lea las calificaciones de un alumno en 10
asignaturas, las almacene en un vector y calcule e imprima su media.

 * @author juliobitar
 */
public class prob34 {
    public static void main(String[] args) throws IOException {
        String [] asignaturas = {"Matematica", "Biologia", "Quimica", "Lenguaje", "Fisica", "Ingles", "Historia", "E. Fisica", "E. musical",
			     "Computacion"};
	double suma = 0;
	double notas [] = new double [10]; 
	for(int i = 0; i < asignaturas.length;i++){
		System.out.println("Ingrese una nota para " + asignaturas[i]  + " : ");	
		notas[i] = Double.parseDouble(read());
	suma += notas[i];
	}
NumberFormat nf = NumberFormat.getNumberInstance();
nf.setMaximumFractionDigits(2);

System.out.println("El promedio final es = " + nf.format((suma/asignaturas.length)));
    }

  static String read() throws IOException {
			BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
		return S.readLine()	;
		}
    
}
