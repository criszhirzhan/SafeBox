package com.safebox.entidades;

public class Crédito {
    protected int icodigo;
    protected int plazoMeses;
    protected String frecuenciaPago;
    protected String estado;
    protected String sistemaAmortizacion;
    protected String parametroEvaluacion;

    public Crédito(int icodigo, int plazoMeses, String frecuenciaPago, String estado, String sistemaAmortizacion, String parametroEvaluacion) {
        this.icodigo = icodigo;
        this.plazoMeses = plazoMeses;
        this.frecuenciaPago = frecuenciaPago;
        this.estado = estado;
        this.sistemaAmortizacion = sistemaAmortizacion;
        this.parametroEvaluacion = parametroEvaluacion;
    }

    public int getIcodigo() {
        return icodigo;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public String getFrecuenciaPago() {
        return frecuenciaPago;
    }

    public String getEstado() {
        return estado;
    }

    public String getSistemaAmortizacion() {
        return sistemaAmortizacion;
    }

    public String getParametroEvaluacion() {
        return parametroEvaluacion;
    }

    public void setIcodigo(int icodigo) {
        this.icodigo = icodigo;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public void setFrecuenciaPago(String frecuenciaPago) {
        this.frecuenciaPago = frecuenciaPago;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSistemaAmortizacion(String sistemaAmortizacion) {
        this.sistemaAmortizacion = sistemaAmortizacion;
    }

    public void setParametroEvaluacion(String parametroEvaluacion) {
        this.parametroEvaluacion = parametroEvaluacion;
    }

    public boolean crear(Credito Credito){
        return false;
    }

    public List<Credito> listar(){
        return null;
    }

    public boolean evaluarCredito(Credito Credito){
        return false;
    }

    public boolean generarContrato(Credito Credito){
        return false;
    }

    public boolean entregaCredito(Credito Credito){
        return false;
    }

    public boolean simularCredito(Credito Credito){
        return false;
    }

    public void simularCredito(String credito) {
    }

    public boolean registarNuevoParametro(String nombre){
        return false;
    }

    public boolean eliminarParametro(String nombre){
        return false;
    }

    public List<Credito> listarCreditoPorEstado(String estado){
        return null;
    }
}
