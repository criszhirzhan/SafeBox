package com.safebox.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado extends Persona implements Serializable {


    @Column(name = "NICKNAME", nullable = false, length = 40)
    private String nick;

    @Column(name = "CONTRASENA", nullable = false, length = 40)
    private String contrasena;


    private Rol rol;

    public Empleado(Rol rol, String nick, String contrasena) {
        this.rol = rol;
        this.nick = nick;
        this.contrasena = contrasena;
    }



    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean crear(Empleado empleado){

        return false;
    }

    public boolean editar(Empleado empleado){
        return false;
    }

    public boolean eliminar(Empleado empleado){
        return false;
    }

    public Rol verInformacionEmpleado(String identificacion){
        return null;
    }

    public List<Empleado> listarEmpleados(){
        return null;
    }

    public String generarNick(String nombres, String apellidos){return  null;}

    public String generarContrasena(){return null;}
}
