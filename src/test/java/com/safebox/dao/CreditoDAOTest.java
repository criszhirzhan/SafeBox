package com.safebox.dao;

import com.safebox.entidades.Credito;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CreditoDAOTest {

    @Test
    public void evaluar() {
    }

    @Test
    public void generarContrato() {
    }

    @Test
    public void entregarCredito() {
    }

    @Test
    public void simularCredito() {
    }

    @Test
    public void agregarNuevoParametro() {
    }

    @Test
    public void eliminarParametro() {
    }

    @Test
    public void listarCreditoPorEstado() {
    }
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