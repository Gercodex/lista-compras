package com.cursoalura.compras.principal;

import com.cursoalura.compras.modulos.ListaCompra;
import com.cursoalura.compras.modulos.Tarjeta;

import java.util.Scanner;

public class ListaPrincipal {
    public static void main(String[] args) {
        String nombreProducto;
        double precio;
        double valor;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Escribe el límite de la tarjeta");
            valor = scanner.nextDouble();
            if (valor > 0) {
                break;
            }else {
                System.out.println("Cantidad no válida");
            }
        }

        Tarjeta tarjeta = new Tarjeta(valor);
        ListaCompra listaCompra = new ListaCompra(tarjeta);

        do {
            System.out.println("Escribe la descripción de la compra: ");
            nombreProducto = scanner.next();
            while (true){
                System.out.println("Escribe el valor de la compra: ");
                precio = scanner.nextDouble();
                if (precio > 0) {
                    break;
                }else {
                    System.out.println("Cantidad no válida");
                }
            }

            listaCompra.add(nombreProducto, precio);
            System.out.println("++Compra realizada++");
            System.out.println("""
                    Escriba la opción para:
                    1 - Agregar producto.
                    0 - Salir.""");
            if (!(scanner.nextInt() != 0)) {
                break;
            }
        }
        while (true);

        listaCompra.validarCompra();

    }

}
