
package com.my.company.practica_6_vehiculo;

/**
 *
 * @author Oviel
 */
public class PRACTICA_6_VEHICULO {

    public static void main(String[] args) {
        vehiculo miCarrito = new vehiculo ();
        miCarrito.setMarca("Ford");
        miCarrito.setAnnio(2002);
        miCarrito.setColor("verde");
        miCarrito.setPrecio(22000);
        miCarrito.setModelo("F150");
       
        
        System.out.println("El año del carro es " + miCarrito.getAnnio());
        System.out.println("La marca del carro es " + miCarrito.getMarca());
        System.out.println("El modelo es " + miCarrito.getModelo());
        System.out.println("El color es " +miCarrito.getColor());
        System.out.println("El precio en pesos es de " +miCarrito.getPrecio());
        
    }   
        
    }

