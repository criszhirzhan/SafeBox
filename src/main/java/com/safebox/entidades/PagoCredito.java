package com.safebox.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class PagoCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int codigo;
    @Column(name = "MONTO", nullable = false, scale = 2)
    protected double monto;
    @ManyToOne
    @JoinColumn
    protected TablaAmortizacion tablaAmortizacion;
    @Temporal(TemporalType.DATE)
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
