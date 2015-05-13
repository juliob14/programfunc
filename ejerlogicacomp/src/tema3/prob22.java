/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juliobitar
 */
public class prob22 {
    public static void main(String[] args) throws IOException {
        String s1;
	
	System.out.println("Ingrese una frase : ");
	s1 = read();
	StringBuffer s2 = new StringBuffer(s1);
int veces = 0;
while (veces < 5){
	
	System.out.println(s2.insert(0, "     "));
	System.out.println();
	veces++;
}
    }

    static String read() throws IOException {
	String s1;	
		BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	s1 = S.readLine();	
		return s1;
	}
    
}
