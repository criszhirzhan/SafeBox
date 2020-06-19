package com.safebox.jpa;

import com.safebox.dao.TablaAmortizacionDAO;
import com.safebox.entidades.TablaAmortizacion;

public class JPATablaAmortizacionDAO extends JPAGenericDAO<TablaAmortizacion, Integer> implements TablaAmortizacionDAO {
    public JPATablaAmortizacionDAO() {
        super(TablaAmortizacion.class);
    }

    @Override
    public double calcularInteres() {
        return 0;
    }

    @Override
    public double calcularMora() {
        return 0;
    }

    @Override
    public double calcularCapital() {
        return 0;
    }

    @Override
    public double calcularSaldo() {
        return 0;
    }
}
