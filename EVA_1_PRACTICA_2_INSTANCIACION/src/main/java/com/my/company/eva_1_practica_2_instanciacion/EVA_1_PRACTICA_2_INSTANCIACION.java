

package com.my.company.eva_1_practica_2_instanciacion;

/**
 *
 * @author Oviel
 */
public class EVA_1_PRACTICA_2_INSTANCIACION {

    public static void main(String[] args) {
      int valor =100;
      //INSTANCIACION: Crear el objeto --> darle memoria
      //CLASE IDENTIFICADOR = new Constructor ();
      //Constructor --> Método con el mismo nombre que la clase.
      Persona perso1 = new Persona () ; //instanciación
        System.out.println(perso1);
        //perso1 --> referencia --> dirección de memoria
        Vehiculo mamalona = new Vehiculo();
        System.out.println(mamalona);
        mamalona.marca = "italika";
        mamalona.annio = 2023;
        mamalona.modelo = "Ft150";
        System.out.println("Marca: " + mamalona.marca);
        System.out.println("Annio: " + mamalona.annio);
        System.out.println("Modelo: " + mamalona.modelo);
    }
}


//TIPO DE DATO ABSTRACTO
class Persona{

}

class Vehiculo{
    //ATRIBUTOS
    String marca;
    int annio;
    String modelo;
    
}