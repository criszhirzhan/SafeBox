package com.safebox.dao;
import com.safebox.entidades.Deposito;

import java.util.Date;
import java.util.List;

public interface DepositoDAO extends GenericDAO<Deposito, Integer> {
public abstract boolean registrarTransaccion(Deposito deposito);
public abstract List<Deposito> listarPorFecha(Date fecha);
public abstract List<Deposito> listarPorIntervaloDeFechas(Date fechaInicio, Date fechaFinal);

}
