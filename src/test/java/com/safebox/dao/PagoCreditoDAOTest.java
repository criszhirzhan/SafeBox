package com.safebox.dao;

import com.safebox.entidades.PagoCredito;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PagoCreditoDAOTest {

    @Test
    public void findAll(){
        PagoCreditoDAO pagoCreditoDAO = DAOFactory.getDAOFactory().getPagoCreditoDAO();
        List<PagoCredito> pagoCreditos = pagoCreditoDAO.findAll();
        assertNotNull(pagoCreditos);
    }


    @Test
    public void realizarPago() {
    }
}