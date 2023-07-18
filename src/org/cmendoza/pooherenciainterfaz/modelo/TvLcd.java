package org.cmendoza.pooherenciainterfaz.modelo;

public class TvLcd extends Electronico {
    private int pulgadas;
    //////////// CONSTRUCTOR ////////////

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

/////////// GETTER ANS SETTER //////

    public int getPulgadas(){
        return this.pulgadas;
    }

////////// MÉTODOS ////////////////

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.80;
    }
}
