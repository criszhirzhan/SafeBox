package com.safebox.jpa;

import com.safebox.dao.CreditoDAO;
import com.safebox.dao.DAOFactory;
import com.safebox.entidades.Credito;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JPADepositoDAOTest {

    @Test
    public void read(){
        CreditoDAO creditoDAO = DAOFactory.getDAOFactory().getCreditoDAO();
        Credito credito = creditoDAO.read(1);
        assertNotNull(credito);
    }

    @Test
    public void  update(){
        CreditoDAO creditoDAO = DAOFactory.getDAOFactory().getCreditoDAO();
        Credito credito = creditoDAO.read(1);
        credito.setParametroEvaluacion("Nuevos Parametros");
        assertEquals(true,creditoDAO.update(credito));

    }

    @Test
    public void findAll(){
        CreditoDAO creditoDAO = DAOFactory.getDAOFactory().getCreditoDAO();
        List<Credito> creditos = creditoDAO.findAll();
        assertNotNull(creditos);
    }

    @Test
    public void  delete(){
        CreditoDAO creditoDAO = DAOFactory.getDAOFactory().getCreditoDAO();
        Credito credito = creditoDAO.read(1);
        assertEquals(true, creditoDAO.delete(credito));

    }

}