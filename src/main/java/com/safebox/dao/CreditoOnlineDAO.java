package com.safebox.dao;

import com.safebox.entidades.CreditoOnline;

public interface CreditoOnlineDAO extends GenericDAO<CreditoOnline, Integer>{
    public abstract boolean modificarEstado(String estado);

}
