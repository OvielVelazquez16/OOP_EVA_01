
package com.mycompany.eva1_pracica_7_metodos;

/**
 *
 * @author oviel
 */
public class Persona {
    //NOMBRE APELLIDOS Y EDAD
    private String nombre;
    private String apellidos;
    private int edad;
    
    //métodos get y set
    //INTERMEDIARIOS DE ATRIBUTOS
   public String getNombre(){
       return nombre;
   }
   public void setNombre (String valor){
       nombre = valor;
   }
    public String getApellidos(){
       return nombre;
   }
   public void setApellidos (String valor){
       apellidos = valor;
   }
    
   public int getEdad(){
       return edad;
   }
   public void setEdad (int valor){
       edad = valor;
   }
    
   public String generarNombreCom(){
       return nombre + " " + apellidos;
   }
   
   
   //calcular año de nacimiento
   public int calcularAnnioNac(){
       return 2024 - edad;
   }
    
}
