package com.safebox.entidades;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity
public class AhorroVista extends CuentaAhorro implements Serializable {
    private static final long serialVersionUID = 1L;

    public AhorroVista(){


    }

    public AhorroVista(int codigo, Socio socio, Date fechaApertura, double interes, String estado, double saldo,
                       String nick, double retiroMaximo, Date fechaUltimoIngreso) {
        super(codigo, socio, fechaApertura, interes, estado, saldo, nick, retiroMaximo, fechaUltimoIngreso);
    }


}
