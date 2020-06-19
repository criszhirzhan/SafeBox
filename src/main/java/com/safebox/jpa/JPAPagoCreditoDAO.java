package com.safebox.jpa;

import com.safebox.dao.PagoCreditoDAO;
import com.safebox.entidades.PagoCredito;

public class JPAPagoCreditoDAO extends JPAGenericDAO<PagoCredito, Integer> implements PagoCreditoDAO {
    public JPAPagoCreditoDAO() {
        super(PagoCredito.class);
    }

    @Override
    public boolean realizarPago(PagoCredito pagoCredito) {
        return false;
    }
}
