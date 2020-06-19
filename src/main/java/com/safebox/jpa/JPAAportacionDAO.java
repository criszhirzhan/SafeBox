package com.safebox.jpa;


import com.safebox.dao.AportacionDAO;
import com.safebox.entidades.AhorroProgramado;
import com.safebox.entidades.Aportacion;

import java.util.Date;
import java.util.List;

public class JPAAportacionDAO  extends JPAGenericDAO<Aportacion, Integer> implements AportacionDAO {

    public JPAAportacionDAO() {
        super(Aportacion.class);
    }

    @Override
    public boolean registrarTransaccion(Aportacion aportacion) {
        return false;
    }

    @Override
    public List<Aportacion> listarPorFecha(Date fecha) {
        return null;
    }

    @Override
    public List<Aportacion> listarPorIntervaloDeFechas(Date fechaInicio, Date fechaFinal) {
        return null;
    }

    @Override
    public boolean generarResumenDeAportaciones(AhorroProgramado ahorroProgramado) {
        return false;
    }
}
