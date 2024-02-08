

package com.my.company.eva_1_practica_3_modificadores_acceso;

import otro_paquete.nuevaclase;

/**
 *
 * @author Oviel
 */
public class EVA_1_PRACTICA_3_MODIFICADORES_ACCESO {
    public int x;
    protected int y;
    private int z;
    int w;

    public static void main(String[] args) {
        PruebaA objA = new PruebaA();
        //objA. --> puedo ver x (public)
        //puedo ver a y (protected)
        //puedo ver a w (default)
        nuevaclase otroObj = new nuevaclase();
        //otroObj. x --> se ve x porque es public
        // los demas no son visibles
        //Esta clase no es visible en este paquete;
        //PruebaB objB = new PruebaB();
    }
}

//CLASE CON ACCESO DEFAULT
class PruebaA{
    public int x;
    protected int y;
    private int z;
    int w;
}