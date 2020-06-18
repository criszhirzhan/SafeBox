package com.safebox.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "socio")
public class Socio extends Persona implements Serializable {

    @Column(name = "PATCH_CEDULA", nullable = false, length = 40)
    private String pathCopiaCedula;

    @Column(name = "PATCH_SERV_BASICO", nullable = false, length = 40)
    private String pathServicioBasico;

    @Column(name = "CIUDAD", nullable = false, length = 15)
    private String ciudad;



    private List<Referencia> referencias;

    public Socio(){

    }

    public Socio(String identificacion, String nombres, String apellidos, String telefono, String celular, String direccion, String correo, String ciudad, String pathCopiaCedula, String pathServicioBasico, String ciudad1, List<Referencia> referencias) {
        super(identificacion, nombres, apellidos, telefono, celular, direccion, correo, ciudad);
        this.pathCopiaCedula = pathCopiaCedula;
        this.pathServicioBasico = pathServicioBasico;
        this.ciudad = ciudad1;
        this.referencias = referencias;
    }

    public String getPathCopiaCedula() {
        return pathCopiaCedula;
    }

    public void setPathCopiaCedula(String pathCopiaCedula) {
        this.pathCopiaCedula = pathCopiaCedula;
    }

    public String getPathServicioBasico() {
        return pathServicioBasico;
    }

    public void setPathServicioBasico(String pathServicioBasico) {
        this.pathServicioBasico = pathServicioBasico;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Referencia> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Referencia> referencias) {
        this.referencias = referencias;
    }

    //////////////

    public boolean crear(Socio socio){

        return false;
    }

    public boolean editar(Socio socio){
        return false;
    }

    public boolean eliminar(Socio socio){
        return false;
    }

    public Socio verInformacion(String identificacion){
        return null;
    }

    public List<Socio> listarSocios(){
        return null;
    }
}
