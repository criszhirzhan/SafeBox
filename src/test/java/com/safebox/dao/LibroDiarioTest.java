package com.safebox.dao;

import com.safebox.entidades.Caja;
import com.safebox.entidades.Credito;
import com.safebox.entidades.LibroDiario;
import com.safebox.entidades.Propiedad;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibroDiarioTest {
    @Test
    public void create() {
        Date fecha = new Date();
        CajaDAO cajaDAO= DAOFactory.getDAOFactory().getCajaDAO();
        Caja caja=cajaDAO.read(1);
        LibroDiarioDAO libroDiarioDAO= DAOFactory.getDAOFactory().getLibroDiarioDAO();
        LibroDiario libroDiario = new LibroDiario();
        libroDiario.setCaja(caja);
        libroDiario.setCodigo(1);
        libroDiario.setDetalle("Retiro");
        libroDiario.setFecaha(fecha);
        libroDiario.setDebe(100.50);
        libroDiario.setHaber(200.50);
        libroDiario.setParcial(250.00);
        assertEquals(true,libroDiarioDAO.create(libroDiario));
    }

    @Test
    public void read(){
        LibroDiarioDAO libroDiarioDAO= DAOFactory.getDAOFactory().getLibroDiarioDAO();
        LibroDiario libroDiario = libroDiarioDAO.read(1);
        assertNotNull(libroDiario);
    }

    @Test
    public void  update(){
        LibroDiarioDAO libroDiarioDAO= DAOFactory.getDAOFactory().getLibroDiarioDAO();
        LibroDiario libroDiario = libroDiarioDAO.read(1);
        libroDiario.setDebe(350.00);
        assertEquals(true,libroDiarioDAO.update(libroDiario));
    }

    @Test
    public void findAll(){
        LibroDiarioDAO libroDiarioDAO= DAOFactory.getDAOFactory().getLibroDiarioDAO();
        List <LibroDiario> libroDiarios = libroDiarioDAO.findAll();
        assertNotNull(libroDiarios);
    }

    @Test
    public void  delete(){
        LibroDiarioDAO libroDiarioDAO= DAOFactory.getDAOFactory().getLibroDiarioDAO();
        LibroDiario libroDiario = libroDiarioDAO.read(1);
        assertEquals(true,libroDiarioDAO.delete(libroDiario));
    }


}