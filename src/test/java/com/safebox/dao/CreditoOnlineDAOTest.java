package com.safebox.dao;

import com.safebox.entidades.CreditoOnline;
import com.safebox.entidades.Empleado;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class CreditoOnlineDAOTest extends Empleado {

    @Test
    public void modificarEstado() {
        CreditoOnlineDAO creditoOnlineDAO= DAOFactory.getDAOFactory().getCreditoOnlineDAO();
        assertEquals(true,creditoOnlineDAO.modificarEstado("credito"));

    }

    @Test
    public void create() throws ParseException {
        CreditoOnline creditoOnline = new CreditoOnline();
        creditoOnline.setActividadLaboral("S/L");
        creditoOnline.setCodigo(12);
        creditoOnline.setDireccionNegocio("S/SD");
        creditoOnline.setDestinoDeFondos("S/D");
        creditoOnline.setNombreNegocio("San Juan");
        creditoOnline.setIdentificacion("0123789076");
        creditoOnline.setTiempoFuncionamientoNegocio(23);
        creditoOnline.setEsSocio(true);
        creditoOnline.setIngresos(12000.63);
        creditoOnline.setDireccion("S/D");

        CreditoOnlineDAO creditoOnlineDAO= DAOFactory.getDAOFactory().getCreditoOnlineDAO();
        assertEquals(true,creditoOnlineDAO.create(creditoOnline));
    }

    @Test
    public void read(){
        CreditoOnlineDAO creditoOnlineDAO= DAOFactory.getDAOFactory().getCreditoOnlineDAO();
        CreditoOnline creditoOnline = new CreditoOnline();
        creditoOnline=creditoOnlineDAO.read(1);
        assertNotNull(creditoOnline);
    }

    @Test
    public void  update(){
        CreditoOnlineDAO creditoOnlineDAO= DAOFactory.getDAOFactory().getCreditoOnlineDAO();
        CreditoOnline creditoOnline = new CreditoOnline();
        creditoOnline=creditoOnlineDAO.read(1);
        creditoOnline.setActividadLaboral("Agr");
        assertEquals(true,creditoOnlineDAO.update(creditoOnline));
    }

    @Test
    public void findAll(){
        CreditoOnlineDAO creditoOnlineDAO= DAOFactory.getDAOFactory().getCreditoOnlineDAO();
        List<CreditoOnline> creditoOnlines=creditoOnlineDAO.findAll();
        assertNotNull(creditoOnlines);
    }

    @Test
    public void  delete(){
        CreditoOnlineDAO creditoOnlineDAO= DAOFactory.getDAOFactory().getCreditoOnlineDAO();
        CreditoOnline creditoOnline = new CreditoOnline();
        creditoOnline=creditoOnlineDAO.read(1);
        assertEquals(true,creditoOnlineDAO.delete(creditoOnline));
    }

}