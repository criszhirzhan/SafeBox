package com.safebox.jpa;

import com.safebox.dao.ReferenciaDAO;
import com.safebox.entidades.Referencia;

public class JPAReferenciaDAO extends JPAGenericDAO<Referencia, Integer> implements ReferenciaDAO {
    public JPAReferenciaDAO() {
        super(Referencia.class);
    }
}
