package com.safebox.jpa;

import com.safebox.dao.RolDAO;
import com.safebox.entidades.Rol;

public class JPARolDAO extends JPAGenericDAO<Rol, Integer> implements RolDAO {
    public JPARolDAO(Class<Rol> persistentClass) {
        super(persistentClass);
    }
}
