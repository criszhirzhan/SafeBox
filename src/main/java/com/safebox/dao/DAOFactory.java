package com.safebox.dao;

import com.safebox.entidades.Socio;
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
    public abstract CreditoDAO getCreditoDAO();
    public abstract TablaAmortizacionDAO getTablaAmortizacionDAO();
    public abstract PagoCreditoDAO getpagoCreditoDAO();
    public abstract LineaCreditoDAO getLineaCreditoDAO();
}
