package com.safebox.jpa;

import com.safebox.dao.CreditoOnlineDAO;
import com.safebox.entidades.CreditoOnline;

public class JPACreditoOnlineDAO extends JPAGenericDAO<CreditoOnline, Integer> implements CreditoOnlineDAO {
    public JPACreditoOnlineDAO(Class<CreditoOnline> persistentClass) {
        super(persistentClass);
    }
}
