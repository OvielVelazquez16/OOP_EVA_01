
package com.mycompany.eva1_practica_9_constructores;

/**
 *
 * @author oviel
 */
public class CuentaBancaria {
    private int noCuenta;
    private double saldo;
    private String cliente;
    
    //CONSTRUCTOR DEFAULT
    public CuentaBancaria(){
        noCuenta = 0;
        cliente = "SIN CLIENTE";
        saldo = 1000000;
    }
    
    //get y set
    public int getNoCuenta(){
        return noCuenta;
    }
    public void setNoCuenta (String nomCliente){
        cliente = nomCliente;
    }
    
    public String getCliente(){
        return cliente;
    }
    public void setCliente (String nomCliente){
        cliente = nomCliente;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void retirar(double monto){
        if(saldo >= monto)
           saldo = saldo - monto;
            }
    
    public void depositar (double deposito){
        saldo = saldo + deposito;
    }
}
