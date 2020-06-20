package com.safebox.dao;

import com.safebox.entidades.AhorroProgramado;
import com.safebox.entidades.Aportacion;
import com.safebox.entidades.Deposito;
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
    public void registrarTransaccion() throws ParseException {
        Deposito deposito=new Deposito();


        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        deposito.setFecha(fecha);
        deposito.setMonto(892.36);
        deposito.setObservacion("S/O");

        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        assertNotNull(depositoDAO.registrarTransaccion(deposito));

    }

    @Test
    public void listarPorFecha() throws ParseException {
        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        assertNotNull(depositoDAO.listarPorFecha(fecha));
    }

    @Test
    public void listarPorIntervaloDeFechas() throws ParseException {
        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        assertNotNull(depositoDAO.listarPorIntervaloDeFechas(fecha, fecha));
    }

    @Test
    public void generarResumenDeAportaciones() {
        AportacionDAO aportacionDAO  = DAOFactory.getDAOFactory().getAportacionDAO();
        AhorroProgramadoDAO ahorroProgramadoDAO = DAOFactory.getDAOFactory().getAhorroProgramadoDAO();

        assertEquals(true,aportacionDAO.generarResumenDeAportaciones(ahorroProgramadoDAO.read(1)));

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