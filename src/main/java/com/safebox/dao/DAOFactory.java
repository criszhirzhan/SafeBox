package com.safebox.dao;

import com.safebox.entidades.LineaCredito;
import com.safebox.jpa.JPADAOFactory;

public abstract class DAOFactory {
    protected static DAOFactory factory = new JPADAOFactory();

    public static DAOFactory getDAOFactory() {
        return factory;
    }

    public abstract CreditoOnlineDAO getCreditoOnlineDAO();
    public abstract EmpleadoDAO getEmpleadoDAO();
    public abstract ReferenciaDAO getReferenciaDAO();
    public abstract RolDAO getRolDAO();
    public abstract SocioDAO getSocioDAO();
    public abstract LineaCreditoDAO getLineaCreditoDAO();

    public abstract AhorroProgramadoDAO getAhorroProgramadoDAO();
    public abstract AhorroVistaDAO getAhorroVistaDAO();
    public abstract AportacionDAO getAportacionDAO();
    public abstract CajaDAO getCajaDAO();
    public abstract DepositoDAO getDepositoDAO();
    public abstract HistorialAhorrosDAO getHistorialAhorrosDAO();
    public abstract RetiroDAO getRetiroDAO();

    public abstract CreditoDAO getCreditoDAO();
    public abstract TablaAmortizacionDAO getTablaAmortizacionDAO();
    public abstract PagoCreditoDAO getPagoCreditoDAO();
    public abstract PropiedadDAO getPropiedadDAO();
    public abstract VehiculoDAO getVehiculoDAO();
    public abstract GaranteDAO getGaranteDAO();
    public abstract ReferenciaGaranteDAO getReferenciaGaranteDAO();

    public abstract HorarioDAO getHorarioDAO();
    public abstract LibroDiarioDAO getLibroDiarioDAO();


}
