package com.safebox.entidades;

import java.sql.Ref;
import java.util.List;

public class Referencia {
    private int codigo;
    private Socio socio;
    private String path;

    public Referencia(int codigo, Socio socio, String path) {
        this.codigo = codigo;
        this.socio = socio;
        this.path = path;
    }

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
