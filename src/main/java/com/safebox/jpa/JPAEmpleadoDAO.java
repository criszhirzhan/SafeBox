package com.safebox.jpa;

import com.safebox.dao.EmpleadoDAO;
import com.safebox.entidades.Empleado;

import java.util.List;

public class JPAEmpleadoDAO extends JPAGenericDAO<Empleado, String> implements EmpleadoDAO {

    public JPAEmpleadoDAO() {
        super(Empleado.class);
    }


    @Override
    public String generarNick(String nombre, String apellido) {
        return null;
    }

    @Override
    public String generarContrasena() {
        return null;
    }

    @Override
    public List<Empleado> bucarPorRol() {
        return null;
    }
}
