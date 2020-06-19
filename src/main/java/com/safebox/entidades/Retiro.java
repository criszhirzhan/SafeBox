package com.safebox.entidades;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Retiro extends Transaccion implements Serializable {
    public Retiro(){

    }

    public Retiro(int codigo, Caja caja, Date fecha, double monto, CuentaAhorro cuenta, String observacion) {
        super(codigo, caja, fecha, monto, cuenta, observacion);
    }
}
