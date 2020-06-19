package com.safebox.dao;

import com.safebox.entidades.Aportacion;
import com.safebox.entidades.Rol;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AportacionDAOTest {

    @Test
    public void registrarTransaccion() {
    }

    @Test
    public void listarPorFecha() {
    }

    @Test
    public void listarPorIntervaloDeFechas() {
    }

    @Test
    public void generarResumenDeAportaciones() {
    }

    @Test
    public void realizarAportacion(){

    }

    @Test
    public void fechaFinalDate(){

    }


    @Test
    public void create() throws ParseException {
        Aportacion aportacion=new Aportacion();

        aportacion.setNumeroCuota(45);

        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        aportacion.setFecha(fecha);
        aportacion.setMonto(89.52);
        aportacion.setObservacion("S/C");

        AportacionDAO aportacionDAO= DAOFactory.getDAOFactory().getAportacionDAO();
        assertEquals(true,aportacionDAO.create(aportacion));
    }

    @Test
    public void read(){
        AportacionDAO aportacionDAO= DAOFactory.getDAOFactory().getAportacionDAO();
        Aportacion aportacion=aportacionDAO.read(1);
        assertNotNull(aportacion);
    }

    @Test
    public void  update(){
        AportacionDAO aportacionDAO= DAOFactory.getDAOFactory().getAportacionDAO();
        Aportacion aportacion=aportacionDAO.read(1);
        aportacion.setMonto(74.63);
        assertEquals(true,aportacionDAO.update(aportacion));
    }

    @Test
    public void findAll(){
        AportacionDAO aportacionDAO= DAOFactory.getDAOFactory().getAportacionDAO();
        List<Aportacion> aportaciones=aportacionDAO.findAll();
        assertNotNull(aportaciones);
    }

    @Test
    public void  delete(){
        AportacionDAO aportacionDAO= DAOFactory.getDAOFactory().getAportacionDAO();
        Aportacion aportacion=aportacionDAO.read(1);
        assertEquals(true,aportacionDAO.delete(aportacion));
    }


}