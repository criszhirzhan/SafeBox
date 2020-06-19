package com.safebox.jpa;

import com.safebox.dao.AhorroProgramadoDAO;
import com.safebox.entidades.AhorroProgramado;
import com.safebox.entidades.AhorroVista;
import com.safebox.entidades.Socio;

import java.util.Date;

public class JPAAhorroProgramadoDAO extends JPAGenericDAO<AhorroProgramado, Integer> implements AhorroProgramadoDAO {

    public JPAAhorroProgramadoDAO() {
        super(AhorroProgramado.class);
    }

    @Override
    public Date calcularFinConrtrato(Date fechaInicio, int duracion) {
        return null;
    }

    @Override
    public String generarNick(Socio socio) {
        return null;
    }

    @Override
    public String generarContrasena() {
        return null;
    }

    @Override
    public Double calcularInteresDiario(AhorroProgramado ahorroProgramado) {
        return null;
    }

    @Override
    public boolean verificarRetiro(AhorroProgramado ahorroProgramado) {
        return false;
    }

    @Override
    public boolean modificarEstado(AhorroProgramado ahorroProgramado) {
        return false;
    }

    @Override
    public boolean autentificacionCuenta(String nick, String contrasena) {
        return false;
    }

    @Override
    public boolean realizarDeposito(Double monto, AhorroVista ahorroVista) {
        return false;
    }

    @Override
    public boolean realizarRetiro(Double monto, AhorroVista ahorroVista) {
        return false;
    }

    @Override
    public AhorroProgramado buscarPorNombresApellidos(String contex) {
        return null;
    }
}
