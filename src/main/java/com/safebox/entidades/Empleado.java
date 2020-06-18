package com.safebox.entidades;

import java.util.List;

public class Empleado extends Persona {

private Rol rol;
private String nick;
private String contrasena;

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
