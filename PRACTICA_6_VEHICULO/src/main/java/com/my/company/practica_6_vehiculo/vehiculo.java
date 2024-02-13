
package com.my.company.practica_6_vehiculo;

/**
 *
 * @author Oviel
 */
public class vehiculo {
    /*
    Marca
    Modelo
    año
    color
    valor
    */
    private String marca;
    private String modelo;
    private int annio;
    private String color;
    private double precio;
    
    
    
   
    public String getMarca(){
        return marca;
    }
   
    public void setMarca(String valor){
       marca = valor; 
    
       
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public int getAnnio(){
        return annio;
    }
    public void setAnnio(int valor){
        annio = valor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String valor){
        color = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }

    void setAnnio(String f150) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
