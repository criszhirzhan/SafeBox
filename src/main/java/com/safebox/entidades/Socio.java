package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Socio extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column( nullable = false, length = 100)
    private String pathCopiaCedula;
    @Column(nullable = false, length = 100)
    private String pathServicioBasico;
    @OneToMany( mappedBy="socio",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Referencia> referencias;

    public Socio(){

    }

    public Socio(String identificacion, String nombre, String apellido, Date fechaNacimiento, String telefono, String celular,
                 String direccion, String correo, String ciudad, String pathCopiaCedula, String pathServicioBasico) {
        super(identificacion, nombre, apellido, fechaNacimiento, telefono, celular, direccion, correo, ciudad);
        this.pathCopiaCedula = pathCopiaCedula;
        this.pathServicioBasico = pathServicioBasico;
    }

 /*   public String getPathCopiaCedula() {
        return pathCopiaCedula;
    }*/

    public void setPathCopiaCedula(String pathCopiaCedula) {
        this.pathCopiaCedula = pathCopiaCedula;
    }
/*
    public String getPathServicioBasico() {
        return pathServicioBasico;
    }*/

    public void setPathServicioBasico(String pathServicioBasico) {
        this.pathServicioBasico = pathServicioBasico;
    }

/*    public List<Referencia> getReferencias() {
        return referencias;
    }*/

/*    public void setReferencias(List<Referencia> referencias) {
        this.referencias = referencias;
    }*/
}
