package com.safebox.jpa;


import com.safebox.dao.DepositoDAO;
import com.safebox.entidades.Deposito;

import java.util.Date;
import java.util.List;

public class JPADepositoDAO  extends JPAGenericDAO<Deposito, Integer> implements DepositoDAO {
    public JPADepositoDAO() {
        super(Deposito.class);
    }

    @Override
    public boolean registrarTransaccion(Deposito deposito) {
        return false;
    }

    @Override
    public List<Deposito> listarPorFecha(Date fecha) {
        return null;
    }

    @Override
    public List<Deposito> listarPorIntervaloDeFechas(Date fechaInicio, Date fechaFinal) {
        return null;
    }
}
