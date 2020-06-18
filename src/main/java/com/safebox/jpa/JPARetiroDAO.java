package com.safebox.jpa;

import com.safebox.dao.RetiroDAO;
import com.safebox.entidades.Retiro;

public class JPARetiroDAO extends JPAGenericDAO<Retiro, Integer> implements RetiroDAO {
    public JPARetiroDAO() {
        super(Retiro.class);
    }
}
