package com.safebox.jpa;

import com.safebox.dao.RetiroDAO;
import com.safebox.entidades.Retiro;

import java.util.Date;
import java.util.List;

public class JPARetiroDAO extends JPAGenericDAO<Retiro, Integer> implements RetiroDAO {
    public JPARetiroDAO() {
        super(Retiro.class);
    }

    @Override
    public boolean registrarTransaccion(Retiro retiro) {
        return false;
    }

    @Override
    public List<Retiro> listarPorFecha(Date fecha) {
        return null;
    }

    @Override
    public List<Retiro> listarPorIntervaloDeFechas(Date fechaInicio, Date fechaFinal) {
        return null;
    }
}
