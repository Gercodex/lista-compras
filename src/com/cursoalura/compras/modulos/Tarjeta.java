package com.cursoalura.compras.modulos;

public class Tarjeta {

    private double saldo;

    public Tarjeta(double saldo) {
        this.saldo = saldo;
    }

    public boolean retirarSaldo(double retiro){
        if (this.saldo < retiro){
            System.out.println("Saldo Insuficiente");
            return false;
        }else {
            System.out.printf("Aprobado $%.2f%n", retiro);
            this.saldo -= retiro;
            System.out.println(consultaSaldo());
            return true;
        }
    }

    public String  consultaSaldo(){
        return "Su saldo es de: " + saldo;
    }

}
