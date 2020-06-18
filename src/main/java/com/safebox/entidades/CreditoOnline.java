package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

public class CreditoOnline extends Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "ESSOCIO", nullable = false, length = 20)
    private String esSocio;

    @Column(name = "TIPOCREDITO", nullable = false, length = 20)
    private String tipoCredito;

    @Column(name = "DEST_FONDOS", nullable = false, length = 20)
    private String destinodeFondos;

    @Column(name = "FECHA_NAC", nullable = false, length = 10)
    private String fechaNacimiento;

    @Column(name = "ACTV_LABORAL", nullable = false, length = 30)
    private String actividadLaboral;

    @Column(name = "NOMBRE_NEGOCIO", nullable = false, length = 30)
    private String nombreNegocio;

    @Column(name = "DIRECC_NEGOCIO", nullable = false, length = 30)
    private String direccionNegocio;

    @Column(name = "TIEM_FUNC_NEGOCIO", nullable = false, length = 10)
    private int tiempoFuncionamientoNegocio;

    @Column(name = "INGRESOS", nullable = false, length = 10)
    private double ingresos;

    public CreditoOnline(){

    }

    public CreditoOnline(String identificacion, String nombres, String apellidos, String telefono, String celular, String direccion, String correo, String ciudad, int codigo, String esSocio, String tipoCredito, String destinodeFondos, String fechaNacimiento, String actividadLaboral, String nombreNegocio, String direccionNegocio, int tiempoFuncionamientoNegocio, double ingresos) {
        super(identificacion, nombres, apellidos, telefono, celular, direccion, correo, ciudad);
        this.codigo = codigo;
        this.esSocio = esSocio;
        this.tipoCredito = tipoCredito;
        this.destinodeFondos = destinodeFondos;
        this.fechaNacimiento = fechaNacimiento;
        this.actividadLaboral = actividadLaboral;
        this.nombreNegocio = nombreNegocio;
        this.direccionNegocio = direccionNegocio;
        this.tiempoFuncionamientoNegocio = tiempoFuncionamientoNegocio;
        this.ingresos = ingresos;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEsSocio() {
        return esSocio;
    }

    public void setEsSocio(String esSocio) {
        this.esSocio = esSocio;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public String getDestinodeFondos() {
        return destinodeFondos;
    }

    public void setDestinodeFondos(String destinodeFondos) {
        this.destinodeFondos = destinodeFondos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getActividadLaboral() {
        return actividadLaboral;
    }

    public void setActividadLaboral(String actividadLaboral) {
        this.actividadLaboral = actividadLaboral;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

    public int getTiempoFuncionamientoNegocio() {
        return tiempoFuncionamientoNegocio;
    }

    public void setTiempoFuncionamientoNegocio(int tiempoFuncionamientoNegocio) {
        this.tiempoFuncionamientoNegocio = tiempoFuncionamientoNegocio;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    ///////////////

    public boolean crear(CreditoOnline creditoOnline){
        return false;
    }

    public List<CreditoOnline> listarCreditosOnline(){

        return null;
    }

    public boolean modificarEstado(String estado){

        return false;
    }
}
