package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class HistorialAhorros implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn
    @ManyToOne
    private CuentaAhorro cuenta;
    @Column(nullable = false, length = 250)
    private String detalle;
    @Column( nullable = false, scale = 2)
    private double retiro;
    @Column( nullable = false, scale = 2)
    private double deposito;
    @Column( nullable = false, scale = 2)
    private double saldo;



    public HistorialAhorros(){

    }

    public HistorialAhorros(int codigo, Date fecha, CuentaAhorro cuenta, String detalle, double retiro, double deposito, double saldo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cuenta = cuenta;
        this.detalle = detalle;
        this.retiro = retiro;
        this.deposito = deposito;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public CuentaAhorro getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaAhorro cuenta) {
        this.cuenta = cuenta;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistorialAhorros)) return false;
        HistorialAhorros that = (HistorialAhorros) o;
        return codigo == that.codigo &&
                Double.compare(that.retiro, retiro) == 0 &&
                Double.compare(that.deposito, deposito) == 0 &&
                Double.compare(that.saldo, saldo) == 0 &&
                fecha.equals(that.fecha) &&
                cuenta.equals(that.cuenta) &&
                detalle.equals(that.detalle) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, fecha, cuenta, detalle, retiro, deposito, saldo);
    }
}
