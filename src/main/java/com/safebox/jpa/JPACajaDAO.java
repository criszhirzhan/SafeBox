package com.safebox.jpa;


import com.safebox.dao.CajaDAO;
import com.safebox.entidades.Caja;

public class JPACajaDAO  extends JPAGenericDAO<Caja, Integer> implements CajaDAO {
    public JPACajaDAO() {
        super(Caja.class);
    }

    @Override
    public boolean anadirSaldo(double monto, int numeroCaja) {
        return false;
    }

    @Override
    public double recalcularSaldo() {
        return 0;
    }
}
