package com.safebox.entidades;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class AhorroProgramado extends CuentaAhorro implements Serializable {
    private static final long serialVersionUID = 1L;

    private int duracionContrato;
    @Temporal(TemporalType.DATE)
    private Date fechaInicioContrato;
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizacionContrato;

    public AhorroProgramado(){


    }



    public AhorroProgramado(int codigo, Socio socio, Date fechaApertura, double interes, String estado, double saldo,
                            String nick, double retiroMaximo, Date fechaUltimoIngreso, int duracionContrato,
                            Date fechaInicioContrato, Date fechaFinalizacionContrato) {
        super(codigo, socio, fechaApertura, interes, estado, saldo, nick, retiroMaximo, fechaUltimoIngreso);
        this.duracionContrato = duracionContrato;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }

    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Date getFechaFinalizacionContrato() {
        return fechaFinalizacionContrato;
    }

    public void setFechaFinalizacionContrato(Date fechaFinalizacionContrato) {
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AhorroProgramado)) return false;
        if (!super.equals(o)) return false;
        AhorroProgramado that = (AhorroProgramado) o;
        return duracionContrato == that.duracionContrato &&
                fechaInicioContrato.equals(that.fechaInicioContrato) &&
                fechaFinalizacionContrato.equals(that.fechaFinalizacionContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duracionContrato, fechaInicioContrato, fechaFinalizacionContrato);
    }
}
