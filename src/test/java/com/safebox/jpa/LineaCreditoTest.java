package com.safebox.jpa;

import com.safebox.dao.CreditoDAO;
import com.safebox.dao.DAOFactory;
import com.safebox.dao.LineaCreditoDAO;
import com.safebox.dao.RolDAO;
import com.safebox.entidades.LineaCredito;
import com.safebox.entidades.Rol;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LineaCreditoTest {

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
