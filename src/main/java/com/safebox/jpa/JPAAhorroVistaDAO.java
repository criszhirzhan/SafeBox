package com.safebox.jpa;


import com.safebox.dao.AhorroVistaDAO;
import com.safebox.entidades.AhorroVista;

public class JPAAhorroVistaDAO  extends JPAGenericDAO<AhorroVista, Integer> implements AhorroVistaDAO {
    public JPAAhorroVistaDAO() {
        super(AhorroVista.class);
    }
}
