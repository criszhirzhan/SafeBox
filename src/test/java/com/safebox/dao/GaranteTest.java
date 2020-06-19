package com.safebox.dao;

import com.safebox.entidades.Credito;
import com.safebox.entidades.Garante;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GaranteTest {

    @Test
    public void create() {
        CreditoDAO creditoDAO= DAOFactory.getDAOFactory().getCreditoDAO();
        Credito credito=creditoDAO.read(1);
        Garante garante=new Garante();
        garante.setCodigo(1);
        garante.setNombre("Edwin");
        garante.setApellido("Marquez");
        garante.setCelular("0987646531");
        garante.setTelefono("072256898");
        garante.setCorreo("edwin@gmail.com");
        garante.setPathCopiaCedula("/serviciobasico/cedula1.pdf");
        garante.setPathServicioBasico("/serviciobasico/servicio1.pdf");
        garante.setCedula("14063217");
        garante.setCiudad("Cuenca");
        garante.setCredito(credito);
        GaranteDAO garanteDAO= DAOFactory.getDAOFactory().getGaranteDAO();
        assertEquals(true,garanteDAO.create(garante));
    }

    @Test
    public void read(){
        GaranteDAO garanteDAO= DAOFactory.getDAOFactory().getGaranteDAO();
        Garante garante=garanteDAO.read(1);
        assertNotNull(garante);
    }

    @Test
    public void  update(){
        GaranteDAO garanteDAO= DAOFactory.getDAOFactory().getGaranteDAO();
        Garante garante=garanteDAO.read(1);
        garante.setCiudad("Quito");
        assertEquals(true,garanteDAO.update(garante));
    }

    @Test
    public void findAll(){
        GaranteDAO garanteDAO= DAOFactory.getDAOFactory().getGaranteDAO();
        List<Garante> garantes=garanteDAO.findAll();
        assertNotNull(garantes);
    }

    @Test
    public void  delete(){
        GaranteDAO garanteDAO= DAOFactory.getDAOFactory().getGaranteDAO();
        Garante garante=garanteDAO.read(1);
        assertEquals(true,garanteDAO.delete(garante));
    }
}