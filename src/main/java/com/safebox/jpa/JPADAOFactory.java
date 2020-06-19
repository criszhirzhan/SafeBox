package com.safebox.jpa;
import com.safebox.dao.*;

public class JPADAOFactory extends DAOFactory{

    @Override
    public JPACreditoOnlineDAO getCreditoOnlineDAO() {
        return new JPACreditoOnlineDAO();
    }

    @Override
    public EmpleadoDAO getEmpleadoDAO() {
        return new JPAEmpleadoDAO();
    }

    @Override
    public ReferenciaDAO getReferenciaDAO() {
        return new JPAReferenciaDAO();
    }

    @Override
    public RolDAO getRolDAO() {
        return new JPARolDAO();
    }

    @Override
    public SocioDAO getSocioDAO() {
        return new JPASocioDAO();
    }

    @Override
    public LineaCreditoDAO getLineaCreditoDAO() {
        return new JPALineaCreditoDAO();
    }
}
