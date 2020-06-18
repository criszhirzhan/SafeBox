package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Ref;
import java.util.List;

@Entity
@Table(name = "referencia")
public class Referencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "PATH", nullable = false, length = 40)
    private String path;

    public  Referencia(){
    }

    public Referencia(int codigo, String path) {
        this.codigo = codigo;
        this.path = path;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean crear(Referencia referencia){return false;}
    public boolean editar(Referencia referencia){return false;}
    public boolean eliminar(Referencia referencia){return false;}
    public Referencia verInformacion(String identificacion){return null;}
    public List<Referencia> listarReferencias(){return null;}
}
