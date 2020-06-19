package com.safebox.jpa;


import com.safebox.dao.GaranteDAO;
import com.safebox.entidades.Garante;

public class JPAGaranteDAO  extends JPAGenericDAO<Garante, Integer> implements GaranteDAO {
    public JPAGaranteDAO() {
        super(Garante.class);
    }

    @Override
    public Garante verInformacion(String identificacion) {
        return null;
    }
}
