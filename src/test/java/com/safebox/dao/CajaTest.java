package com.safebox.dao;

import com.safebox.entidades.Caja;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CajaTest {

    @Test
    public void create() {
        Caja caja=new Caja();
        caja.setNumeroCaja(1);
        caja.setMontoDinero(5000);
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        assertEquals(true,cajaDAO.create(caja));
    }

    @Test
    public void read(){
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        Caja caja=cajaDAO.read(1);
        assertNotNull(caja);
    }

    @Test
    public void  update(){
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        Caja caja=cajaDAO.read(1);
        caja.setMontoDinero(2500);
        assertEquals(true,cajaDAO.update(caja));
    }

    @Test
    public void findAll(){
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        List<Caja> cajas=cajaDAO.findAll();
        assertNotNull(cajas);
    }

    @Test
    public void  delete(){
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        Caja caja=cajaDAO.read(1);
        assertEquals(true,cajaDAO.delete(caja));
    }

    @Test
    public void anadirSaldo() {
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        Caja caja=cajaDAO.read(1);
        caja.setMontoDinero(caja.getMontoDinero()+1000);
        assertEquals(true,cajaDAO.update(caja));
    }

    @Test
    public void recalcularSaldo() {
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        Caja caja=cajaDAO.read(1);
        assertEquals (3500,caja.getMontoDinero(),0.00);
    }

}