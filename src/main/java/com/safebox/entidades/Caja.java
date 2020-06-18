package com.safebox.entidades;

import java.util.List;

public class Caja {
    private int numeroCaja;
    private double montoDinero;
    private List<Transaccion> transacciones;

    public Caja() {

    }

    public Caja(int numeroCaja, double montoDinero, List<Transaccion> transacciones) {
        this.numeroCaja = numeroCaja;
        this.montoDinero = montoDinero;
        this.transacciones = transacciones;
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
