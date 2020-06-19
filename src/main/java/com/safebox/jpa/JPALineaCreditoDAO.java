package com.safebox.jpa;

import com.safebox.dao.LineaCreditoDAO;
import com.safebox.entidades.LineaCredito;

public class JPALineaCreditoDAO extends JPAGenericDAO<LineaCredito, Integer> implements LineaCreditoDAO {
    public JPALineaCreditoDAO() {
        super(LineaCredito.class);
    }

    @Override
    public LineaCredito verInformacion(String nombre) {
        return null;
    }
}
