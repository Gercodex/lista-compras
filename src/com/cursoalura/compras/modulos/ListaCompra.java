package com.cursoalura.compras.modulos;

import java.util.*;

public class ListaCompra extends ArrayList<Producto>{

    private Tarjeta tarjeta;

    public ListaCompra(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public boolean add(String producto, double precio) {
        Producto productox = new Producto();
        productox.setNombre(producto);
        productox.setPrecio(precio);
        return super.add(productox);
    }

    public void ordenarPorNombre(){
        Collections.sort(this);
    }

    public void ordenarPorPrecio(){
        this.sort(Comparator.comparing(Producto::getPrecio));
    }

    public void validarCompra(){
        double suma = 0;
        for (int i = 0; i < this.size(); i++){
            suma += this.get(i).getPrecio();
        }
        if (tarjeta.retirarSaldo(suma)) {
            imprimeRecibo();
        } else {
            this.removeLast();
            validarCompra();
        }
    }

    public void imprimeRecibo(){
        this.ordenarPorPrecio();
        System.out.println("""
                ****************************
                COMPRAS REALIZADAS:
                
                %s
                ****************************
                """.formatted(this));
    }

     @Override
    public String toString(){
         String recibo = "";
         for (int i = 0; i < this.size(); i++) {
             recibo += this.get(i).toString();
         }
         return recibo;
     }

}
