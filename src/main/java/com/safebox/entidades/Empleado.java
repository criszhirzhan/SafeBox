package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Empleado extends  Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column( nullable = false, length = 32)
    private String nick;
    @Column( nullable = false, length = 64)
    private String contrasena;
    @JoinColumn(nullable=false)
    @ManyToOne
    private Rol rol;

    public Empleado() {

    }

    public Empleado(String identificacion, String nombre, String apellido, Date fechaNacimiento, String telefono,
                    String celular, String direccion, String correo, String ciudad, String nick, String contrasena, Rol rol) {
        super(identificacion, nombre, apellido, fechaNacimiento, telefono, celular, direccion, correo, ciudad);
        this.nick = nick;
        this.contrasena = contrasena;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
