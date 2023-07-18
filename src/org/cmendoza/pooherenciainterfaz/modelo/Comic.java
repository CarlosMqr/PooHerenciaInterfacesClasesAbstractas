package org.cmendoza.pooherenciainterfaz.modelo;

public class Comic extends Libro{
    private String personaje;
    //////////// CONSTRUCTOR ////////////

    public Comic(String autor, String titulo, String editorial, int precio, String personaje) {
        super(autor, titulo, editorial, precio);
        this.personaje = personaje;
    }

/////////// GETTER ANS SETTER //////
////////// MÉTODOS ////////////////
}
