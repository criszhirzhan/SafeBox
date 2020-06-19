package com.safebox.jpa;

import com.safebox.dao.TablaAmortizacionDAO;
import com.safebox.entidades.TablaAmortizacion;

public class JPATablaAmortizacionDAO extends JPAGenericDAO<TablaAmortizacion, Integer> implements TablaAmortizacionDAO {
    public JPATablaAmortizacionDAO() {
        super(TablaAmortizacion.class);
    }
}
