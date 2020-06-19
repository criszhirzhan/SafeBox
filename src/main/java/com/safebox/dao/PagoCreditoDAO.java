package com.safebox.dao;

import com.safebox.entidades.PagoCredito;

public interface PagoCreditoDAO extends GenericDAO<PagoCredito, Integer> {
public abstract boolean realizarPago(PagoCredito pagoCredito);
}
