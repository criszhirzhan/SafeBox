package com.safebox.entidades;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Deposito extends Transaccion implements Serializable {

    public Deposito(){

    }

    public Deposito(int codigo, Caja caja, Date fecha, double monto, CuentaAhorro cuenta, String observacion) {
        super(codigo, caja, fecha, monto, cuenta, observacion);
    }
}
