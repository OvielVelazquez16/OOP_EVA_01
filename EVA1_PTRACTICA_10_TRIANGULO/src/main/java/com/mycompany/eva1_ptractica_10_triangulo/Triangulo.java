
package com.mycompany.eva1_ptractica_10_triangulo;

/**
 *
 * @author oviel
 */
public class Triangulo {
    private double base;
    private double altura;
    private double peri;
    
    public Triangulo(){
        base = -1;
        altura = -1;
        
    }
    
    public double getBase(){
        return base;
        
    }
    public void setBase(double valor){
        base = valor;
    }
    public double getAltura(){
        return altura;
        
    }
    public void setAltura(double valor){
        altura = valor;
    }
    
    private double calcularArea(){
        return (base * altura) / 2;
    }
    private double calcularPeri(){
        double peri;
        //suma de los tres lados, falta el lado mayor (hipotenusa)
        peri = base + altura + (Math.sqrt(Math.pow(base,2) + Math.pow(altura,2)));
       return peri;
        
    }
    
    public void imprimirDatos(){
        System.out.println("Base" + getBase());
        System.out.println("Altura" + getAltura());
        System.out.println("El área del tráingulo es: " + calcularArea());
        System.out.println("El perimetro del triángulo es: " + calcularPeri());
        
    }
    
}
