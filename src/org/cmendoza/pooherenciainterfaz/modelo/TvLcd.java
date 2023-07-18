package org.cmendoza.pooherenciainterfaz.modelo;

public class TvLcd extends Electronico {
    private String pulgadas;
    //////////// CONSTRUCTOR ////////////

    public TvLcd(int precio, String fabricante, String pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

/////////// GETTER ANS SETTER //////
    private String getPulgadas(){
        return this.pulgadas;
    }
////////// MÉTODOS ////////////////

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.80;
    }
}
