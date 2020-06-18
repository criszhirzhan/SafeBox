package com.safebox.jpa;

import com.safebox.dao.LibroDiarioDAO;
import com.safebox.entidades.LibroDiario;

public class JPALibroDiarioDAO extends JPAGenericDAO<LibroDiario, Integer> implements LibroDiarioDAO {
    public JPALibroDiarioDAO() {
        super(LibroDiario.class);
    }
}
