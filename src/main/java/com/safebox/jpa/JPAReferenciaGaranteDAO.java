package com.safebox.jpa;

import com.safebox.dao.ReferenciaGaranteDAO;
import com.safebox.entidades.ReferenciaGarante;

public class JPAReferenciaGaranteDAO extends JPAGenericDAO<ReferenciaGarante, Integer> implements ReferenciaGaranteDAO {
    public JPAReferenciaGaranteDAO() {
        super(ReferenciaGarante.class);
    }
}
