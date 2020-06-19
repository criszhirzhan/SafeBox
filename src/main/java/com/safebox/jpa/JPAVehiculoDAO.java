package com.safebox.jpa;


import com.safebox.dao.VehiculoDAO;
import com.safebox.entidades.Vehiculo;

public class JPAVehiculoDAO extends JPAGenericDAO<Vehiculo, Integer> implements VehiculoDAO {
    public JPAVehiculoDAO() {
        super(Vehiculo.class);
    }
}
