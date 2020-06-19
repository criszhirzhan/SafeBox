package com.safebox.dao;


import com.safebox.entidades.AhorroProgramado;
import com.safebox.entidades.AhorroVista;
import com.safebox.entidades.Socio;

import java.util.Date;

public interface AhorroProgramadoDAO extends GenericDAO<AhorroProgramado, Integer> {
    public abstract Date calcularFinConrtrato(Date fechaInicio, int duracion);
    public abstract String generarNick(Socio socio);
    public abstract String generarContrasena();
    public abstract Double calcularInteresDiario(AhorroProgramado ahorroProgramado);
    public abstract boolean verificarRetiro(AhorroProgramado ahorroProgramado);
    public abstract boolean modificarEstado(AhorroProgramado ahorroProgramado);
    public abstract boolean autentificacionCuenta(String nick,String contrasena);
    public abstract boolean realizarDeposito(Double monto,AhorroProgramado ahorroProgramado);
    public abstract boolean realizarRetiro(Double monto,AhorroProgramado ahorroProgramado);
    public abstract AhorroProgramado buscarPorNombresApellidos(String contex);

}
