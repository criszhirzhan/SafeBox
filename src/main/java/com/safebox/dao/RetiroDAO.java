package com.safebox.dao;


import com.safebox.entidades.Deposito;
import com.safebox.entidades.Retiro;

import java.util.Date;
import java.util.List;

public interface RetiroDAO extends GenericDAO<Retiro, Integer> {
    public abstract boolean registrarTransaccion(Retiro retiro);
    public abstract List<Retiro> listarPorFecha(Date fecha);
    public abstract List<Retiro> listarPorIntervaloDeFechas(Date fechaInicio, Date fechaFinal);

}
