package org.cmendoza.pooherenciainterfaz.modelo;

public class Iphone extends Electronico{
    private String modelo;
    private String color;
    //////////// CONSTRUCTOR ////////////

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

/////////// GETTER ANS SETTER //////
////////// MÉTODOS ////////////////

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.85;
    }
}
