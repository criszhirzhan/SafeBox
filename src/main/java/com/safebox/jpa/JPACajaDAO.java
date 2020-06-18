package com.safebox.jpa;


import com.safebox.dao.CajaDAO;
import com.safebox.entidades.Caja;

public class JPACajaDAO  extends JPAGenericDAO<Caja, Integer> implements CajaDAO {
    public JPACajaDAO() {
        super(Caja.class);
    }
}
