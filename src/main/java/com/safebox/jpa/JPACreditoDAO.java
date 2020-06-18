package com.safebox.jpa;

import com.safebox.dao.CreditoDAO;
import com.safebox.entidades.Credito;

public class JPACreditoDAO extends JPAGenericDAO<Credito, Integer> implements CreditoDAO{

    public JPACreditoDAO(){
        super(Credito.class);
    }

}
