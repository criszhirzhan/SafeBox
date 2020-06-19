package com.safebox.jpa;

import com.safebox.dao.AhorroProgramadoDAO;
import com.safebox.entidades.AhorroProgramado;

public class JPAAhorroProgramadoDAO extends JPAGenericDAO<AhorroProgramado, Integer> implements AhorroProgramadoDAO {

    public JPAAhorroProgramadoDAO() {
        super(AhorroProgramado.class);
    }
}
