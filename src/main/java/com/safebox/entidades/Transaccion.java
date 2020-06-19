package com.safebox.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @ManyToOne
    @JoinColumn
    private Caja caja;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column( nullable = false, scale = 2)
    private double monto;
    @ManyToOne
    @JoinColumn
    private CuentaAhorro cuenta;
    @Column( nullable = false, length = 250)
    private String observacion;

    public Transaccion(){

    }

    public Transaccion(int codigo, Caja caja, Date fecha, double monto, CuentaAhorro cuenta, String observacion) {
        this.codigo = codigo;
        this.caja = caja;
        this.fecha = fecha;
        this.monto = monto;
        this.cuenta = cuenta;
        this.observacion = observacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public CuentaAhorro getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaAhorro cuenta) {
        this.cuenta = cuenta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaccion)) return false;
        Transaccion that = (Transaccion) o;
        return codigo == that.codigo &&
                Double.compare(that.monto, monto) == 0 &&
                caja.equals(that.caja) &&
                fecha.equals(that.fecha) &&
                cuenta.equals(that.cuenta) &&
                observacion.equals(that.observacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, caja, fecha, monto, cuenta, observacion);
    }
}
