package com.safebox.dao;

import com.safebox.entidades.LineaCredito;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LineaCreditoDAOTest {

    @Test
    public void create() {
        LineaCredito lineaCredito = new LineaCredito();
        lineaCredito.setCodigo(1);
        lineaCredito.setNombre("Credito Estudiantil");
        lineaCredito.setDescripcion("N/A");
        lineaCredito.setInteres(0.15);
        lineaCredito.setMontoMaximo(50.000);
        lineaCredito.setPlazoMaximo(42);
        // 42 semanas
        //lineaCredito.setFechaModificacion();
        //lineaCredito.setEstado("Activo");
        LineaCreditoDAO lineaCreditoDAO = DAOFactory.getDAOFactory().getLineaCreditoDAO();
        assertEquals(true, lineaCreditoDAO.create(lineaCredito));

    }

    @Test
    public void read(){
        LineaCreditoDAO lineaCreditoDAO = DAOFactory.getDAOFactory().getLineaCreditoDAO();
        LineaCredito lineaCredito = lineaCreditoDAO.read(1);
        assertNotNull(lineaCredito);
    }

    @Test
    public void  update(){
        LineaCreditoDAO lineaCreditoDAO = DAOFactory.getDAOFactory().getLineaCreditoDAO();
        LineaCredito lineaCredito = lineaCreditoDAO.read(1);
        lineaCredito.setDescripcion("Descripscion");
        assertEquals(true,lineaCreditoDAO.update(lineaCredito));

    }

    @Test
    public void findAll(){
        LineaCreditoDAO lineaCreditoDAO = DAOFactory.getDAOFactory().getLineaCreditoDAO();
        List<LineaCredito> lineaCreditos = lineaCreditoDAO.findAll();
        assertNotNull(lineaCreditos);
    }

    @Test
    public void  delete(){

        LineaCreditoDAO lineaCreditoDAO = DAOFactory.getDAOFactory().getLineaCreditoDAO();
        LineaCredito lineaCredito = lineaCreditoDAO.read(1);
        assertEquals(true,lineaCreditoDAO.delete(lineaCredito));
    }


}