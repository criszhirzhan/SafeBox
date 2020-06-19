package com.safebox.jpa;


import com.safebox.dao.PropiedadDAO;
import com.safebox.entidades.Propiedad;

public class JPAPropiedadDAO extends JPAGenericDAO<Propiedad, Integer> implements PropiedadDAO {

    public JPAPropiedadDAO() {
        super(Propiedad.class);
    }
}
