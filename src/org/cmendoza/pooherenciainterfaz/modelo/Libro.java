package org.cmendoza.pooherenciainterfaz.modelo;

import org.cmendoza.pooherenciainterfaz.interfaz.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
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

    @Override
    public Date fechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

////////// MÉTODOS ////////////////

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.90;
    }
}
