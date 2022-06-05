
package ejercicio7;

import Entidades.Persona;
import Servicios.ServicioPersona;


public class Ejercicio7 {


    public static void main(String[] args) {
        

        int ideal = 0;
        int bajo = 0;
        int sobre = 0;
        int mayor = 0;
        int menor = 0;
        
        ServicioPersona sp = new ServicioPersona();
        Persona [] np = new Persona[4];
        boolean [] veri = new boolean[4];
        int [] imc = new int [4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona " + (i+1));
            np[i] = sp.crearPersona();
            imc[i] = sp.calcularIMC(np, i);
            veri[i] = sp.mayorEdad(np, i);
            if (imc[i] == -1){
                bajo += 25;
             
            } else if (imc[i] == 0){
                ideal += 25;
            } else {
                sobre += 25;
            }
            if (veri[i] == true){
                mayor += 25;
            } else{
                menor += 25;
                
            }
            
        }
        System.out.println("El " + bajo + "% de los sujetos de encuentra por debajo del peso ideal");
        System.out.println("El " + ideal + "% de los sujetos de encuentra en el peso ideal");
        System.out.println("El " + sobre + "% de los sujetos de encuentra por sobre el peso ideal");
        System.out.println("El " + mayor + "% de los sujetos en mayor de edad");
        System.out.println("El " + menor + "% de los sujetos en menor de edad");
        
        

    }
    
}
