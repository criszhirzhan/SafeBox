package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ReferenciaGarante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private Garante garante;
    @Column(nullable = false, length = 100)
    private String path;


    public ReferenciaGarante(){}

 /*   public ReferenciaGarante(int codigo, Garante garante, String path) {
        this.codigo = codigo;
        this.garante = garante;
        this.path = path;
    }*/

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

 /*   public Garante getGarante() {
        return garante;
    }*/

    public void setGarante(Garante garante) {
        this.garante = garante;
    }

    /*public String getPath() {
        return path;
    }*/

    public void setPath(String path) {
        this.path = path;
    }
}
