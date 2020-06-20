package com.safebox.entidades;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Rol {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(nullable = false, length = 25)
    private String nombre;
    @Column(nullable = false, length = 250)
    private String descripcion;

    public Rol() {

    }

    public Rol(int codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*public String getDescripcion() {
        return descripcion;
    }*/

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rol)) return false;
        Rol rol = (Rol) o;
        return codigo == rol.codigo &&
                nombre.equals(rol.nombre) &&
                descripcion.equals(rol.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, descripcion);
    }*/
}
