package com.safebox.entidades;

public class Propiedad extends Garantia{
private String tipo;
private double valor;
private String descripcion;
private  boolean escritura;
private  String observacion;

    public Propiedad() {

    }

    public Propiedad(int codigo, Credito credito, String tipo, double valor, String descripcion, boolean escritura, String observacion) {
        super(codigo, credito);
        this.tipo = tipo;
        this.valor = valor;
        this.descripcion = descripcion;
        this.escritura = escritura;
        this.observacion = observacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEscritura() {
        return escritura;
    }

    public void setEscritura(boolean escritura) {
        this.escritura = escritura;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
