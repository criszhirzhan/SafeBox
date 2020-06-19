package com.safebox.jpa;


import com.safebox.dao.AhorroVistaDAO;
import com.safebox.entidades.AhorroVista;
import com.safebox.entidades.Socio;

public class JPAAhorroVistaDAO  extends JPAGenericDAO<AhorroVista, Integer> implements AhorroVistaDAO {
    public JPAAhorroVistaDAO() {
        super(AhorroVista.class);
    }

    @Override
    public AhorroVista buscarPorIdentificacio(String identificacion) {
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
    public Double calcularInteresDiario(AhorroVista ahorroVista) {
        return null;
    }

    @Override
    public AhorroVista verEstadoCuentaPorSocioOnumeroCuenta(String contexto) {
        return null;
    }

    @Override
    public boolean modificarEstado(AhorroVista ahorroVista) {
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
    public AhorroVista buscarPorNombresApellidos(String contex) {
        return null;
    }
}
