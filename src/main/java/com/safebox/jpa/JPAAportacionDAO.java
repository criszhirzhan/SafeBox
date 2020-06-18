package com.safebox.jpa;


import com.safebox.dao.AportacionDAO;
import com.safebox.entidades.Aportacion;

public class JPAAportacionDAO  extends JPAGenericDAO<Aportacion, Integer> implements AportacionDAO {

    public JPAAportacionDAO() {
        super(Aportacion.class);
    }
}
