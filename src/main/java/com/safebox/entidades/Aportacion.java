package com.safebox.entidades;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Aportacion  extends Transaccion implements Serializable {
    private int numeroCuota;

    public Aportacion(){

    }

    public Aportacion(int codigo, Caja caja, Date fecha, double monto, CuentaAhorro cuenta, String observacion,
                      int numeroCuota) {
        super(codigo, caja, fecha, monto, cuenta, observacion);
        this.numeroCuota = numeroCuota;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aportacion)) return false;
        if (!super.equals(o)) return false;
        Aportacion that = (Aportacion) o;
        return numeroCuota == that.numeroCuota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroCuota);
    }
}
