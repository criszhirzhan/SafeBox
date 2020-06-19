package com.safebox.dao;

import com.safebox.entidades.LibroDiario;

import java.util.Date;

public interface LibroDiarioDAO extends GenericDAO<LibroDiario, Integer> {
    public abstract LibroDiario mostrarLibroDiario(Date fecha,int numeroCaja);

}
