package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class PagoCredito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column( nullable = false, scale = 2)
    private double monto;

    @OneToOne
    @JoinColumn
    private TablaAmortizacion tablaAmortizacion;

    @Temporal(TemporalType.DATE)
    private Date fechaPago;

    @ManyToOne
    @JoinColumn
    private Caja caja;

/*    public PagoCredito(int codigo, double monto, TablaAmortizacion tablaAmortizacion, Date fechaPago, Caja caja) {
        this.codigo = codigo;
        this.monto = monto;
        this.tablaAmortizacion = tablaAmortizacion;
        this.fechaPago = fechaPago;
        this.caja = caja;
    }*/

    public PagoCredito (){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

/*    public TablaAmortizacion getTablaAmortizacion() {
        return tablaAmortizacion;
    }

    public void setTablaAmortizacion(TablaAmortizacion tablaAmortizacion) {
        this.tablaAmortizacion = tablaAmortizacion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }*/

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }
}
