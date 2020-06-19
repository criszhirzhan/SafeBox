package com.safebox.jpa;


import com.safebox.dao.HistorialAhorrosDAO;
import com.safebox.entidades.HistorialAhorros;

public class JPAHistorialAhorrosDAO  extends JPAGenericDAO<HistorialAhorros, Integer> implements HistorialAhorrosDAO {
    public JPAHistorialAhorrosDAO() {
        super(HistorialAhorros.class);
    }
}
