

package com.mycompany.eva_1_practica_11_formulageneral;

/**
 *
 * @author oviel
 */
import java.util.Scanner;

/**
 *
 * @author Oviel
 */
public class EVA_1_PRACTICA_11_FORMULAGENERAL {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;
        while (repetir){
            System.out.println("Escribe los datos de");
            System.out.println("el valor de a");
            double a=scanner.nextDouble();
            System.out.println("el valor de b");
            double b=scanner.nextDouble();
            System.out.println("el valor de c");
            double c=scanner.nextDouble();
            double raiz = b*b-4*a*c;
            if (raiz > 0){
                double x1 =(-b+Math.sqrt(raiz))/(2*a);
                double x2 =(-b-Math.sqrt(raiz))/(2*a);
                System.out.println("resultado de x1: "+x1+" resultado de x2: "+x2);
            }else if(raiz==0){
                double x = -b/(2*a);
                System.out.println("unica solucion = "+x);
            }else{
                System.out.println("raiz imaginaria");
            }
            System.out.println("¿quieres resolver otra ecuacion? (S/N)");
            String respuesta= scanner.next().toUpperCase();
            if (!respuesta.equals("S")){
                repetir=false;
            }
            
        }
    }
    
}
