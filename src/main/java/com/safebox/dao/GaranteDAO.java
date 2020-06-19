package com.safebox.dao;

import com.safebox.entidades.Garante;

public interface GaranteDAO extends GenericDAO<Garante, Integer> {
public abstract Garante verInformacion(String identificacion);

}
