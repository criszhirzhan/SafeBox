package com.safebox.jpa;

import com.safebox.dao.LibroDiarioDAO;
import com.safebox.entidades.LibroDiario;

import java.util.Date;

public class JPALibroDiarioDAO extends JPAGenericDAO<LibroDiario, Integer> implements LibroDiarioDAO {
    public JPALibroDiarioDAO() {
        super(LibroDiario.class);
    }

    @Override
    public LibroDiario mostrarLibroDiario(Date fecha, int numeroCaja) {
        return null;
    }
}
