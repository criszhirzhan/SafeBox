package com.safebox.entidades;

import java.util.List;

public class Socio extends Persona {

    private String pathCopiaCedula;
    private String pathServicioBasico;
    private String ciudad;
    private List<Referencia> referencias;


    public Socio(String pathCopiaCedula, String pathServicioBasico, String ciudad, List<Referencia> referencias) {
        this.pathCopiaCedula = pathCopiaCedula;
        this.pathServicioBasico = pathServicioBasico;
        this.ciudad = ciudad;
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

    @Override
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
