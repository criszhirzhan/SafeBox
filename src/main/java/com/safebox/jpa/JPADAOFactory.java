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

    @Override
    public AhorroProgramadoDAO getAhorroProgramadoDAO() {
        return new JPAAhorroProgramadoDAO();
    }

    @Override
    public AhorroVistaDAO getAhorroVistaDAO() {
        return new JPAAhorroVistaDAO();
    }

    @Override
    public AportacionDAO getAportacionDAO() {
        return new JPAAportacionDAO();
    }

    @Override
    public CajaDAO getCajaDAO() {
        return new JPACajaDAO();
    }

    @Override
    public DepositoDAO getDepositoDAO() {
        return new JPADepositoDAO();
    }

    @Override
    public HistorialAhorrosDAO getHistorialAhorrosDAO() {
        return new JPAHistorialAhorrosDAO();
    }

    @Override
    public RetiroDAO getRetiroDAO() {
        return new JPARetiroDAO();
    }





    @Override
    public CreditoDAO getCreditoDAO() {
        return new JPACreditoDAO();
    }

    @Override
    public TablaAmortizacionDAO getTablaAmortizacionDAO() {
        return new JPATablaAmortizacionDAO();
    }

    @Override
    public PagoCreditoDAO getPagoCreditoDAO() {
        return new JPAPagoCreditoDAO();
    }

    @Override
    public PropiedadDAO getPropiedadDAO() {
        return new JPAPropiedadDAO();
    }

    @Override
    public VehiculoDAO getVehiculoDAO() {
        return new JPAVehiculoDAO();

    }

    @Override
    public GaranteDAO getGaranteDAO() {
        return new JPAGaranteDAO();
    }

    @Override
    public ReferenciaGaranteDAO getReferenciaGaranteDAO() {
        return new JPAReferenciaGaranteDAO();
    }

    @Override
    public HorarioDAO getHorarioDAO() {
        return new JPAHorarioDAO();
    }

    @Override
    public LibroDiarioDAO getLibroDiarioDAO() {
        return new JPALibroDiarioDAO();
    }
}
