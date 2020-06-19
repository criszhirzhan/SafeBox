package com.safebox.jpa;


import com.safebox.dao.DepositoDAO;
import com.safebox.entidades.Deposito;

public class JPADepositoDAO  extends JPAGenericDAO<Deposito, Integer> implements DepositoDAO {
    public JPADepositoDAO() {
        super(Deposito.class);
    }
}
