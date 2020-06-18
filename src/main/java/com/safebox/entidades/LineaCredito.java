package com.safebox.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class LineaCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int codigo;
    @Column(name = "NOMBRE", nullable = false, length = 25)
    protected String nombre;
    @Column(name = "DESCRIPCION", nullable = false, length = 250)
    protected String descripcion;
    @Column(name = "INTERES", nullable = false, scale = 2)
    protected double interes;
    @Column(name = "MONTOMAXIMO", nullable = false, scale = 2)
    protected double montoMaximo;
    @Column(name = "PLAZOMAXIMO", nullable = false, length = 25)
    protected int plazoMaximo;
    @Temporal(TemporalType.DATE)
    protected Date fechaModificacion;
    @Column(name = "ESTADO", nullable = false, length = 25)
    protected String estado;

    public LineaCredito(int codigo, String nombre, String descripcion, double interes, double montoMaximo, int plazoMaximo, Date fechaModificacion, String estado) {
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

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getInteres() {
        return interes;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean crear(LineaCredito lineaCredito){
        return false;
    }

    public boolean editar(LineaCredito lineaCredito){
        return false;
    }

    public boolean eliminar(LineaCredito lineaCredito){
        return false;
    }

    public LineaCredito verInfo(String nombre){
        return null;
    }

    public List<LineaCredito> listar(){
        return null;
    }
}
