package com.safebox.entidades;

import java.util.List;

public class Garante extends Garantia{
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String celular;
    private String correo;
    private String pathCopiaCedula;
    private String pathServicioBasico;
    private String Ciudad;
    private List<Referencia> referencias;

    public Garante() {

    }

    public Garante(int codigo, Credito credito, String cedula, String nombre, String apellido, String telefono, String celular,
                   String correo, String pathCopiaCedula, String pathServicioBasico, String ciudad, List<Referencia> referencias) {
        super(codigo, credito);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.pathCopiaCedula = pathCopiaCedula;
        this.pathServicioBasico = pathServicioBasico;
        Ciudad = ciudad;
        this.referencias = referencias;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPathCopiaCedula() {
        return pathCopiaCedula;
    }

    public void setPathCopiaCedula(String pathCopiaCedula) {
        this.pathCopiaCedula = pathCopiaCedula;
    }

    public String getPathServicioBasico() {
        return pathServicioBasico;
    }

    public void setPathServicioBasico(String pathServicioBasico) {
        this.pathServicioBasico = pathServicioBasico;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public List<Referencia> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Referencia> referencias) {
        this.referencias = referencias;
    }
}
