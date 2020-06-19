package com.safebox.entidades;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {
    @Id
    protected String identificacion;
    @Column(nullable = false, length = 250)
    protected String nombre;
    @Column(nullable = false, length = 50)
    protected String apellido;
    @Temporal(TemporalType.DATE)
    protected Date fechaNacimiento;
    @Column( nullable = false, length = 50)
    protected String telefono;
    @Column(nullable = false, length = 50)
    protected String celular;
    @Column(nullable = false, length = 100)
    protected String direccion;
    @Column(nullable = false, length = 50)
    protected String correo;
    @Column(nullable = false, length = 30)
    protected String ciudad;

    public Persona() {

    }

    public Persona(String identificacion, String nombre, String apellido, Date fechaNacimiento, String telefono, String celular,
                   String direccion, String correo, String ciudad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
        this.ciudad = ciudad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

}


