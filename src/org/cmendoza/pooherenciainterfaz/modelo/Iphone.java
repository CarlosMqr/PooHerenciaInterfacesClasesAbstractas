package org.cmendoza.pooherenciainterfaz.modelo;

import org.cmendoza.pooherenciainterfaz.interfaz.IProducto;

public class Iphone extends Electronico implements IProducto {
    private String modelo;
    private String color;
    //////////// CONSTRUCTOR ////////////

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

/////////// GETTER ANS SETTER //////

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

////////// MÉTODOS ////////////////

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.85;
    }
}
