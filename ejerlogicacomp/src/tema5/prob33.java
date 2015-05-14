/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *Crear un array unidimensional de 20 elementos con nombres de personas.
Visualizar los elementos de la lista debiendo ir cada uno en una fila
distinta.

 * @author juliobitar
 */
public class prob33 {
    public static void main(String[] args) {
        String [] nombres = {"Claudio" , "Lorena", "Carolina", "Jorge", "Daniela", "Luis", "Pedro", "Roberto",
			             "Maria"	, "Marcela", "Florencia", "Bernarda", "Mauricio", "Felipe", "Margarita", 
			             "Fabiola", "Rodolfo", "Mario", "Camila", "Rafael"};
	
	for(int i = 0; i < nombres.length;i++){
		
		System.out.println(nombres[i]);
		
	}
    }
}
