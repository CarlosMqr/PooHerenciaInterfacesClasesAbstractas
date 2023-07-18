package org.cmendoza.pooherenciainterfaz.modelo;

import java.util.Date;

public class Libro extends Producto {
    private String autor;
    private String titulo;
    private String editorial;
    private Date fechaPublicacion = new Date();
    //////////// CONSTRUCTOR ////////////
    public Libro(String autor, String titulo, String editorial, int precio){
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }
/////////// GETTER ANS SETTER //////
////////// MÉTODOS ////////////////

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.90;
    }
}
