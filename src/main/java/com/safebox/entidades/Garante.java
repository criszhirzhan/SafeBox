package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Garante extends Garantia implements Serializable {
    @Column( nullable = false, length = 10)
    private String cedula;
    @Column( nullable = false, length = 250)
    private String nombre;
    @Column( nullable = false, length = 250)
    private String apellido;
    @Column( nullable = false, length = 9)
    private String telefono;
    @Column( nullable = false, length = 10)
    private String celular;
    @Column( nullable = false, length = 250)
    private String correo;
    @Column(nullable = false, length = 250)
    private String pathCopiaCedula;
    @Column( nullable = false, length = 250)
    private String pathServicioBasico;
    @Column( nullable = false, length = 100)
    private String Ciudad;


    @OneToMany( mappedBy="garante",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<ReferenciaGarante> referencias;

    public Garante() {

    }

    public Garante(int codigo, Credito credito, String cedula, String nombre, String apellido, String telefono, String celular, String correo, String pathCopiaCedula, String pathServicioBasico, String ciudad) {
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
    }

    public List<ReferenciaGarante> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<ReferenciaGarante> referencias) {
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


}
