package com.safebox.jpa;

import com.safebox.dao.SocioDAO;
import com.safebox.entidades.Socio;

public class JPASocioDAO extends JPAGenericDAO<Socio, String> implements SocioDAO {
    public JPASocioDAO(Class<Socio> persistentClass) {
        super(persistentClass);
    }
}
