package org.cmendoza.pooherenciainterfaz.modelo;

import org.cmendoza.pooherenciainterfaz.interfaz.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {
    private String Fabricante;
    //////////// CONSTRUCTOR ////////////

    public Electronico(int precio, String fabricante) {
        super(precio);
        Fabricante = fabricante;
    }

/////////// GETTER ANS SETTER //////

    @Override
    public String getFabricante() {
        return this.Fabricante;
    }

////////// MÉTODOS ////////////////
}
