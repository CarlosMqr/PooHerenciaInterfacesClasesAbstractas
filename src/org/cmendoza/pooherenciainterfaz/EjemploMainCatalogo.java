package org.cmendoza.pooherenciainterfaz;

import org.cmendoza.pooherenciainterfaz.interfaz.ILibro;
import org.cmendoza.pooherenciainterfaz.interfaz.IProducto;
import org.cmendoza.pooherenciainterfaz.modelo.*;

public class EjemploMainCatalogo {
    public static void main(String[] args) {

        IProducto[] productos = new Producto[4];
        productos[0] = new Libro("Julio Verne", "Viaje al centro de la tierra,","Esfinje",250);
        productos[1] = new Comic("Dc comic","Hombre Araña","Planeta Comic",100,"Hombre araña");
        productos[2] = new Iphone(15000,"Iphone","version 20","gris oxford");
        productos[3] = new TvLcd(13000,"LG",50);

        for (IProducto pro: productos) {
            System.out.println("Tipo de " + pro.getClass().getSimpleName());
            System.out.println("Precio: " + pro.getPrecio() + " $");
            System.out.println("precio de venta: " + pro.getPrecioVenta() + " $");

            if (pro instanceof ILibro){
                System.out.println("Autor: " + ((Libro) pro).getAutor());
                System.out.println("Titulo: " + ((Libro) pro).getTitulo());
                System.out.println("Editorial: " + ((Libro) pro).getEditorial());
                System.out.println("Fecha de publicacion: " + ((Libro) pro).fechaPublicacion());
            }
            if (pro instanceof Comic) {
                System.out.println("Autor: " + ((Comic) pro).getPersonaje());
                System.out.println("Titulo: " + ((Comic) pro).getTitulo());
            }
            if (pro instanceof  Iphone){
                System.out.println("Modelo: " + ((Iphone) pro).getModelo());
                System.out.println("Color: " + ((Iphone) pro).getColor());
            }
            if (pro instanceof TvLcd){
                System.out.println("Fabricante: " + ((TvLcd) pro).getFabricante());
                System.out.println("Pulgadas: " + ((TvLcd) pro).getPulgadas());
            }

            System.out.println("============ Siguiente producto ====================");

        }



    }
}
