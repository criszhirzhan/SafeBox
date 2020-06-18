package com.safebox.entidades;

import java.util.List;

public class Crédito {
    protected int icodigo;
    protected Socio socio;
    protected int plazoMeses;
    protected String frecuenciaPago;
    protected LineaCredito lineacredito;
    protected String estado;
    protected String sistemaAmortizacion;
    protected String parametroEvaluacion;
    public List<Garantia> requisitoList;

    public Crédito(int icodigo, Socio socio, int plazoMeses, String frecuenciaPago, LineaCredito lineacredito, String estado, String sistemaAmortizacion, String parametroEvaluacion, List<Garantia> requisitoList) {
        this.icodigo = icodigo;
        this.socio = socio;
        this.plazoMeses = plazoMeses;
        this.frecuenciaPago = frecuenciaPago;
        this.lineacredito = lineacredito;
        this.estado = estado;
        this.sistemaAmortizacion = sistemaAmortizacion;
        this.parametroEvaluacion = parametroEvaluacion;
        this.requisitoList = requisitoList;
    }

    public int getIcodigo() {
        return icodigo;
    }

    public Socio getSocio() {
        return socio;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public String getFrecuenciaPago() {
        return frecuenciaPago;
    }

    public LineaCredito getLineacredito() {
        return lineacredito;
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

    public List<Garantia> getRequisitoList() {
        return requisitoList;
    }

    public void setIcodigo(int icodigo) {
        this.icodigo = icodigo;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public void setFrecuenciaPago(String frecuenciaPago) {
        this.frecuenciaPago = frecuenciaPago;
    }

    public void setLineacredito(LineaCredito lineacredito) {
        this.lineacredito = lineacredito;
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

    public void setRequisitoList(List<Garantia> requisitoList) {
        this.requisitoList = requisitoList;
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
