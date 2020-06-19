package com.safebox.entidades;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;

    @Column(name = "DESCRIPCION", nullable = false, length = 60)
    private String descripcion;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean crear(Rol rol){return false;}
    public boolean editar(Rol rol){return false;}
    public boolean eliminar(Rol rol){return false;}
    public Rol verInformacion(int codigo){return null;}
    public List<Rol> listarRoles(){return null;}

}
