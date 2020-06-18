package com.safebox.entidades;

import java.util.Date;

public class LibroDiario {
    private int codigo;
    private Caja caja;
    private Date fecaha;
    private String detalle;
    private double parcial;
    private double debe;
    private double haber;

    public LibroDiario() {
    }

    public LibroDiario(int codigo, Caja caja, Date fecaha, String detalle, double parcial, double debe, double haber) {
        this.codigo = codigo;
        this.caja = caja;
        this.fecaha = fecaha;
        this.detalle = detalle;
        this.parcial = parcial;
        this.debe = debe;
        this.haber = haber;
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

    public Date getFecaha() {
        return fecaha;
    }

    public void setFecaha(Date fecaha) {
        this.fecaha = fecaha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getParcial() {
        return parcial;
    }

    public void setParcial(double parcial) {
        this.parcial = parcial;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
    }
}
