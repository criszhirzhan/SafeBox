package com.safebox.jpa;

import com.safebox.dao.SocioDAO;
import com.safebox.entidades.Socio;

import java.util.List;

public class JPASocioDAO extends JPAGenericDAO<Socio, String> implements SocioDAO {
    public JPASocioDAO() {
        super(Socio.class);
    }

    @Override
    public List<Socio> buscarPorIdentificacionOApellidos(String contex) {
        return null;
    }
}
