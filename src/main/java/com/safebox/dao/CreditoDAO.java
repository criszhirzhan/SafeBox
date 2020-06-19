package com.safebox.dao;

import com.safebox.entidades.AhorroProgramado;
import com.safebox.entidades.Credito;

import javax.swing.*;
import java.util.List;

public interface CreditoDAO extends GenericDAO<Credito, Integer> {
public abstract boolean evaluar(Credito credito);
public abstract boolean generarContrato(Credito credito);
public abstract boolean entregarCredito(Credito credito);
public abstract void simularCredito(Credito credito);
public abstract boolean agregarNuevoParametro(String nombre);
public abstract boolean eliminarParametro(String nombre);
public abstract List<Credito> listarCreditoPorEstado(String estado);

}
