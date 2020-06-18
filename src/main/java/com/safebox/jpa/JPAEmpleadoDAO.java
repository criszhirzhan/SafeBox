package com.safebox.jpa;

import com.safebox.dao.EmpleadoDAO;
import com.safebox.entidades.Empleado;

public class JPAEmpleadoDAO extends JPAGenericDAO<Empleado, String> implements EmpleadoDAO {

    public JPAEmpleadoDAO(Class<Empleado> persistentClass) {
        super(persistentClass);
    }
}
