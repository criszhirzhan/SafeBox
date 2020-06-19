package com.safebox.dao;

import com.safebox.entidades.TablaAmortizacion;

public interface TablaAmortizacionDAO extends GenericDAO<TablaAmortizacion, Integer> {
public abstract double calcularInteres();
public abstract double calcularMora();
public abstract double calcularCapital();
public abstract double calcularSaldo();
}
