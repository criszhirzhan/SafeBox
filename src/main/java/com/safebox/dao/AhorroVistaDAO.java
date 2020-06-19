package com.safebox.dao;

import com.safebox.entidades.AhorroVista;
import com.safebox.entidades.CuentaAhorro;
import com.safebox.entidades.Socio;

public interface AhorroVistaDAO extends GenericDAO<AhorroVista, Integer> {
    public abstract AhorroVista buscarPorIdentificacio(String identificacion);
    public abstract String generarNick(Socio socio);
    public abstract String generarContrasena();
    public abstract Double calcularInteresDiario(AhorroVista ahorroVista);
    public abstract AhorroVista verEstadoCuentaPorSocioOnumeroCuenta(String contexto);
    public abstract boolean modificarEstado(AhorroVista ahorroVista);
    public abstract boolean autentificacionCuenta(String nick,String contrasena);
    public abstract boolean realizarDeposito(Double monto,AhorroVista ahorroVista);
    public abstract boolean realizarRetiro(Double monto,AhorroVista ahorroVista);
    public abstract AhorroVista buscarPorNombresApellidos(String contex);
}
