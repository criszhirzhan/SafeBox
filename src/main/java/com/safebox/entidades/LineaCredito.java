package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class LineaCredito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int codigo;
    @Column(nullable = false, length = 25)
    protected String nombre;
    @Column(nullable = false, length = 250)
    protected String descripcion;
    @Column(nullable = false, scale = 2)
    protected double interes;
    @Column(nullable = false, scale = 3)
    protected double montoMaximo;
    protected int plazoMaximo;
    @Temporal(TemporalType.DATE)
    protected Date fechaModificacion;
    protected boolean estado;

    public LineaCredito() {

    }
    public LineaCredito(int codigo, String nombre, String descripcion, double interes, double montoMaximo,
                        int plazoMaximo, Date fechaModificacion, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.interes = interes;
        this.montoMaximo = montoMaximo;
        this.plazoMaximo = plazoMaximo;
        this.fechaModificacion = fechaModificacion;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineaCredito)) return false;
        LineaCredito that = (LineaCredito) o;
        return codigo == that.codigo &&
                Double.compare(that.interes, interes) == 0 &&
                Double.compare(that.montoMaximo, montoMaximo) == 0 &&
                plazoMaximo == that.plazoMaximo &&
                estado == that.estado &&
                nombre.equals(that.nombre) &&
                descripcion.equals(that.descripcion) &&
                fechaModificacion.equals(that.fechaModificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, descripcion, interes, montoMaximo, plazoMaximo, fechaModificacion, estado);
    }
}
