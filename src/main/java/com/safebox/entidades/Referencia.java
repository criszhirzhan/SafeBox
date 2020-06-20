package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Ref;
import java.util.Date;
import java.util.List;

@Entity
public class Referencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;


    @ManyToOne
    @JoinColumn
    private Socio socio;
    @Column(nullable = false, length = 100)
    private String path;

    public  Referencia(){
    }

/*    public Referencia(int codigo, Socio socio, String path) {
        this.codigo = codigo;
        this.socio = socio;
        this.path = path;
    }*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

/*    public String getPath() {
        return path;
    }*/

    public void setPath(String path) {
        this.path = path;
    }
}
