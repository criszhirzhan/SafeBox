package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity

public class CreditoOnline extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column( nullable = false, length = 2)
    private boolean esSocio;
    @ManyToOne
    @JoinColumn
    private LineaCredito lineaCredito;
    @Column( nullable = false, length = 250)
    private String destinoDeFondos;
    @Column(nullable = false, length = 250)
    private String actividadLaboral;
    @Column(nullable = false, length = 100)
    private String nombreNegocio;
    @Column(nullable = false, length = 100)
    private String direccionNegocio;
    private int tiempoFuncionamientoNegocio;
    @Column(nullable = false, scale = 2)
    private double ingresos;

    public CreditoOnline(){

    }

/*    public CreditoOnline(String identificacion, String nombre, String apellido, Date fechaNacimiento, String telefono,
                         String celular, String direccion, String correo, String ciudad, int codigo, boolean esSocio,
                         LineaCredito lineaCredito, String destinoDeFondos, String actividadLaboral, String nombreNegocio,
                         String direccionNegocio, int tiempoFuncionamientoNegocio, double ingresos) {
        super(identificacion, nombre, apellido, fechaNacimiento, telefono, celular, direccion, correo, ciudad);
        this.codigo = codigo;
        this.esSocio = esSocio;
        this.lineaCredito = lineaCredito;
        this.destinoDeFondos = destinoDeFondos;
        this.actividadLaboral = actividadLaboral;
        this.nombreNegocio = nombreNegocio;
        this.direccionNegocio = direccionNegocio;
        this.tiempoFuncionamientoNegocio = tiempoFuncionamientoNegocio;
        this.ingresos = ingresos;
    }*/



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }

/*    public LineaCredito getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(LineaCredito lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public String getDestinoDeFondos() {
        return destinoDeFondos;
    }*/

    public void setDestinoDeFondos(String destinoDeFondos) {
        this.destinoDeFondos = destinoDeFondos;
    }

   /* public String getActividadLaboral() {
        return actividadLaboral;
    }*/

    public void setActividadLaboral(String actividadLaboral) {
        this.actividadLaboral = actividadLaboral;
    }

 /*   public String getNombreNegocio() {
        return nombreNegocio;
    }*/

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

 /*   public String getDireccionNegocio() {
        return direccionNegocio;
    }*/

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }

/*    public int getTiempoFuncionamientoNegocio() {
        return tiempoFuncionamientoNegocio;
    }*/

    public void setTiempoFuncionamientoNegocio(int tiempoFuncionamientoNegocio) {
        this.tiempoFuncionamientoNegocio = tiempoFuncionamientoNegocio;
    }

    /*public double getIngresos() { return ingresos; }*/

    public void setIngresos(double ingresos) { this.ingresos = ingresos; }
}
