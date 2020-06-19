package com.safebox.dao;

import com.safebox.entidades.Caja;

public interface CajaDAO extends GenericDAO<Caja, Integer> {
public abstract boolean anadirSaldo(double monto,int numeroCaja);
public abstract double recalcularSaldo();
}
