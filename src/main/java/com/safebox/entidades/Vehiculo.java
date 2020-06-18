package com.safebox.entidades;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Vehiculo extends Garantia implements Serializable {
    private static final long serialVersionUID = 1L;

    private String placa;
    private String tipo;
    private String modelo;
    private String soat;
    private String observacion;

    public Vehiculo() {

    }

    public Vehiculo(int codigo, Credito credito, String placa, String tipo, String modelo, String soat, String observaciones) {
        super(codigo, credito);
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.soat = soat;
        this.observacion = observaciones;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public String getObservaciones() {
        return observacion;
    }

    public void setObservaciones(String observaciones) {
        this.observacion = observaciones;
    }
}
