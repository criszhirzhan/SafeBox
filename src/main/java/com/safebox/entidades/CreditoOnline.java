package com.safebox.entidades;

import java.util.List;

public class CreditoOnline extends Persona {
    private int codigo;
    private String esSocio;
    private String tipoCredito;
    private String destinodeFondos;
    private String fechaNacimiento;
    private String actividadLaboral;
    private String nombreNegocio;
    private String direccionNegocio;
    private int tiempoFuncionamientoNegocio;
    private double ingresos;


    public CreditoOnline(int codigo, String esSocio, String tipoCredito, String destinodeFondos, String fechaNacimiento, String actividadLaboral, String nombreNegocio, String direccionNegocio, int tiempoFuncionamientoNegocio, double ingresos) {
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
