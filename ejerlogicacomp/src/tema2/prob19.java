/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import java.io.IOException;
import static tema2.prob17.read;

/**
 *
 * @author juliobitar
 */
public class prob19 {
    public static void main(String[] args) throws IOException {
        int hora = 0, min = 0, sec = 0;



System.out.println("Ingrese hora : ");
hora = Integer.parseInt(read()); 

System.out.println("Ingrese minutos : ");
min = Integer.parseInt(read()); 

System.out.println("Ingrese segundos : ");
sec = Integer.parseInt(read());
while(hora < 24){
	while(min < 60){
		while (sec < 60){	
			System.out.println("Hora actual " +hora + " :: " +min + " :: " + sec + " Hrs");
	sec++;

		}
		min++;
		sec = 0;
	}
	hora++;
	min = 0;
}
    }
    
}
