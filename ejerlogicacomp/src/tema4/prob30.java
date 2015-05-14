/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *Simular una carrera de dos caballos si cada uno tiene igual probabilidad
de ganar.

 * @author juliobitar
 */
public class prob30 {
    public static void main(String[] args) {
        int caballo = (int) Math.floor(Math.random()*2);
        System.out.println("Empieza la carrera");
        if (caballo == 1) {
            System.out.println("Gano caballo 1");
        }
        else{
            System.out.println("Gano caballo 2");
        }
        
    }
}
