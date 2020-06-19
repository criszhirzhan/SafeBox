package com.safebox.entidades;


import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected String identificacion;

    protected  String nombres;
    protected String apellidos;
    protected String telefono;
    protected String celular;
    protected String direccion;
    protected String correo;
    protected String ciudad;

    public Persona(String identificacion, String nombres, String apellidos, String telefono, String celular, String direccion, String correo, String ciudad) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
        this.ciudad = ciudad;
    }

    public Persona() {

    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public boolean crear(Persona persona){

        return false;
    }

    public boolean editar(Persona persona){

        return false;
    }

    public boolean eliminar(Persona persona){

        return false;
    }

    public Persona verInformacion(String identificacion){

        return null;
    }

    public List<Persona> listar(){

        return null;
    }

}


