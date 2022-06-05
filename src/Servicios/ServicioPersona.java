package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //crea el objeto persona y carga los datos
    public Persona crearPersona() {
        Persona np = new Persona();
        System.out.println("Ingrese su nombre: ");
        np.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        np.setEdad(leer.nextInt());
        System.out.println("Ingrese su género: ");
        boolean veri = false;
        do {
            String genero = leer.next();
            genero = genero.toLowerCase();
            if (genero.equals("h")) {
                veri = false;
                np.setSexo("Hombre");
            } else if (genero.equals("m")) {
                np.setSexo("Mujer");
            } else if (genero.equals("o")) {
                np.setSexo("Otro");
            } else {
                System.out.println("Error");
                veri = true;

            }
        } while (veri != false);
        System.out.println("Ingrese su peso (kg)");
        np.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura (m)");
        np.setAltura(leer.nextDouble());
        return np;

    }
    // calcula IMC
    public int calcularIMC(Persona [] np, int i){
        double imc = np[i].getPeso()/(Math.pow(np[i].getAltura(),2));
        int num = 0;
        if (imc < 20){
            System.out.println("Está por debajo del peso ideal");
            num = -1;
            System.out.println(num);
        } else if (imc>= 20 && imc<=25){
            System.out.println("Está en el peso ideal");
            num = 0;
            System.out.println(num);
        } else if (imc> 25){
            System.out.println("Esta por encima del peso ideal");
            num = 1;
            System.out.println(num);
        }
        return num;
        

        
    }
    // verifica que sea mayor de edad
    public boolean mayorEdad(Persona [] np, int i){
       boolean veri = false;
        if(np[i].getEdad()>= 18){
            
            veri = true;
        }
        return veri;
    }

   
}
