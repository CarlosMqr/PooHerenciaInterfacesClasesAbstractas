package org.cmendoza.pooherenciainterfaz.modelo;

import org.cmendoza.pooherenciainterfaz.interfaz.IProducto;

abstract public class Producto implements IProducto {
  private int precio;

//////////// CONSTRUCTOR ////////////
  public Producto(int precio){
   this.precio = precio;
  }
/////////// GETTER ANS SETTER //////

 @Override
 public int getPrecio() {
  return this.precio;
 }


////////// MÉTODOS ////////////////
}
