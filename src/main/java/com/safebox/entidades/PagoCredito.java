package com.safebox.entidades;

import java.util.Date;

public class PagoCredito {

    protected int codigo;
    protected double monto;
    protected TablaAmortizacion tablaAmortizacion;
    protected Date fechaPago;

    public PagoCredito(int codigo, double monto, TablaAmortizacion tablaAmortizacion, Date fechaPago) {
        this.codigo = codigo;
        this.monto = monto;
        this.tablaAmortizacion = tablaAmortizacion;
        this.fechaPago = fechaPago;
    }

    public TablaAmortizacion getTablaAmortizacion() {
        return tablaAmortizacion;
    }

    public void setTablaAmortizacion(TablaAmortizacion tablaAmortizacion) {
        this.tablaAmortizacion = tablaAmortizacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }


    public boolean realizarPago(PagoCredito pagoCredito){
        return false;
    }

    public List<PagoCredito> listar(){
        return null;
    }

    public List<PagoCredito> listarPagosCredito(){
        return null;
    }

}
