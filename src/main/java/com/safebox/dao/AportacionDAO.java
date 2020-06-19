package com.safebox.dao;

import com.safebox.entidades.AhorroProgramado;
import com.safebox.entidades.Aportacion;
import com.safebox.entidades.Deposito;

import java.util.Date;
import java.util.List;

public interface AportacionDAO extends GenericDAO<Aportacion, Integer> {
    public abstract boolean registrarTransaccion(Aportacion aportacion);
    public abstract List<Aportacion> listarPorFecha(Date fecha);
    public abstract List<Aportacion> listarPorIntervaloDeFechas(Date fechaInicio, Date fechaFinal);
    public abstract boolean generarResumenDeAportaciones(AhorroProgramado ahorroProgramado);
}
