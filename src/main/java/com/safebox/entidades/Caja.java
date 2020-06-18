package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Caja implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroCaja;
    @Column(name = "MONTODINERO", nullable = false, scale = 2)
    private double montoDinero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="caja")
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
