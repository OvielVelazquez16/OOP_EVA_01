

package com.mycompany.eva1_practica_9_constructores;

/**
 *
 * @author oviel
 */
public class EVA1_PRACTICA_9_CONSTRUCTORES {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Cliente: " + cuenta.getCliente());
        System.out.println("Cuenta: " + cuenta.getNoCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
}
