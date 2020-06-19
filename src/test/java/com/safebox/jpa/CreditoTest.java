package com.safebox.jpa;

import com.safebox.dao.CreditoDAO;
import com.safebox.dao.DAOFactory;
import com.safebox.dao.RolDAO;
import com.safebox.entidades.Credito;
import com.safebox.entidades.Rol;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreditoTest {

    @Test
    public void create() {
        Credito credito =  new Credito();
        credito.setIcodigo(1);
        //credito.setSocio("s1");
        credito.setPlazoMeses(5);
        credito.setFrecuenciaPago("Trimestral");
        //credito.setLineacredito(lineacredito);
        credito.setEstado("Activo");
        credito.setSistemaAmortizacion("Frances");
        credito.setParametroEvaluacion("N/A");
        //credito.setRequisitoList();

        CreditoDAO creditoDAO = DAOFactory.getDAOFactory().getCreditoDAO();
        assertEquals(true,creditoDAO.create(credito));

    }

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
