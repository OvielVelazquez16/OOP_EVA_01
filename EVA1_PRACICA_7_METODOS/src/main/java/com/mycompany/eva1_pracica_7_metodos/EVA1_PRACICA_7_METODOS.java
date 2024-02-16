

package com.mycompany.eva1_pracica_7_metodos;

import java.util.Scanner;

/**
 *
 * @author oviel
 */
public class EVA1_PRACICA_7_METODOS {

    public static void main(String[] args) {
        
        Persona perso = new Persona();
        perso.setNombre("Juan");
        perso.setApellidos("Pérez");
        perso.setEdad(50);
        
        System.out.println("El nombre es " + perso.generarNombreCom());
        System.out.println("Nació en el año: " + perso.calcularAnnioNac());
        //-----
        Persona[] grupo = new Persona[5];
        // HAY QUE CREAR CADA OBJETO
        for (int i = 0; i < grupo.length; i++) {
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            //UNA VEZ CREADO EL OBJETO, HAYQ UE LLENARLO:
            System.out.println("Introduce el nombre");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el appellido");
            String ape = input.nextLine();
            grupo[i].setApellidos(ape);
            
            System.out.println("Introduce la edad");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
            
            
        }
        
        //LEER
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("El nombre es " + grupo[i].generarNombreCom());
        System.out.println("Nació en el año: " + grupo[i].calcularAnnioNac());
            
        }
    }
}
