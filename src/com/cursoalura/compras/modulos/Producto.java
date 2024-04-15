package com.cursoalura.compras.modulos;

public class Producto implements Comparable<Producto>{
    String nombre;
    double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto producto) {
        return this.nombre.compareTo(producto.getNombre());
    }

    @Override
    public String toString(){
        return "Producto: " + this.getNombre() + " - " + "Precio: $" + this.getPrecio() + "\n";
    }

}
