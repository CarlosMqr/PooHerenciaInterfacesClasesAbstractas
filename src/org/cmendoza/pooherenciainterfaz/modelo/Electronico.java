package org.cmendoza.pooherenciainterfaz.modelo;

abstract public class Electronico extends Producto {
    private String Fabricante;
    //////////// CONSTRUCTOR ////////////

    public Electronico(int precio, String fabricante) {
        super(precio);
        Fabricante = fabricante;
    }

/////////// GETTER ANS SETTER //////
////////// MÉTODOS ////////////////
}
