package com.safebox.dao;

import com.safebox.entidades.Empleado;

import java.util.List;

public interface EmpleadoDAO extends GenericDAO<Empleado, String>{
    public abstract String generarNick(String nombre,String apellido);
    public abstract String generarContrasena();
    public abstract List<Empleado> bucarPorRol();
}
