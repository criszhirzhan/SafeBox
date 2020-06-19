package com.safebox.dao;

import com.safebox.entidades.Socio;

import java.util.List;

public interface SocioDAO extends GenericDAO<Socio, String>{
    public abstract List<Socio> buscarPorIdentificacionOApellidos(String contex);
}
