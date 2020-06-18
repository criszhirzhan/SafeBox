package com.safebox.dao;

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
}
