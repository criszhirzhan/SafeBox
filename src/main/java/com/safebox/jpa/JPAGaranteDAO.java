package com.safebox.jpa;


import com.safebox.dao.GaranteDAO;
import com.safebox.entidades.Garante;

public class JPAGaranteDAO  extends JPAGenericDAO<Garante, String> implements GaranteDAO {
    public JPAGaranteDAO() {
        super(Garante.class);
    }
}
