
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import mx.datos.Producto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliobitar
 */
public class ProductLis {
    public void lista(){
     List<Producto> alumnos = new ArrayList <>();
    
    
     //   for(Integer i = 0;  i< alumnos.size(); i++) {
      //  System.out.println(alumnos.get(i));
            
     //   }
    
    
   //     for (Alumno alumno : alumnos) {
    //        System.out.println(alumno);
     //   }
        productos.stream().forEach(a -> {System.out.println(a);});
        
        //alumnos con edad > 25
        
        System.out.println("Alumnos con edad > 25");
        for(Alumno alumno : alumnos){
            if(alumno.edad >25)
                System.out.println(alumno);
        }
     List<Alumno> alumnosMayores =
        alumnos.stream()
                .filter(a ->{return a.edad > 25;})
             .collect(Collectors.toList());
     Long total = alumnos.stream()
                .filter(a ->{return a.edad > 25;})
                .count();
        System.out.println("El total es:" + total);
        double promedio = alumnos.stream()
                .filter(a ->{return a.edad > 25;})
                .mapToLong(a ->{return a.edad;})
                .average()
                .getAsDouble();
        System.out.println(""+ promedio);
    
    
    }
    
}
