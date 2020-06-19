package com.safebox.jpa;

import com.safebox.dao.CreditoDAO;
import com.safebox.entidades.Credito;

import java.util.List;

public class JPACreditoDAO extends JPAGenericDAO<Credito, Integer> implements CreditoDAO {

    public JPACreditoDAO(){
        super(Credito.class);
    }

    @Override
    public boolean evaluar(Credito credito) {
        return false;
    }

    @Override
    public boolean generarContrato(Credito credito) {
        return false;
    }

    @Override
    public boolean entregarCredito(Credito credito) {
        return false;
    }

    @Override
    public void simularCredito(Credito credito) {

    }

    @Override
    public boolean agregarNuevoParametro(String nombre) {
        return false;
    }

    @Override
    public boolean eliminarParametro(String nombre) {
        return false;
    }

    @Override
    public List<Credito> listarCreditoPorEstado(String estado) {
        return null;
    }
}
