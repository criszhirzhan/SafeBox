package com.safebox.entidades;

import java.util.Date;

public class AhorroVista extends CuentaAhorro {

    public AhorroVista(){


    }
    public AhorroVista(int codigo, Socio socio, Date fechaApertura, double interes, String estado, double saldo,
                       String nick, double retiroMaximo, Date fechaUltimoIngreso) {
        super(codigo, socio, fechaApertura, interes, estado, saldo, nick, retiroMaximo, fechaUltimoIngreso);
    }


}
