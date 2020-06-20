package com.safebox.dao;

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

public class DepositoDAOTest {

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
    public void create() throws ParseException {
        Deposito deposito=new Deposito();


        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        deposito.setFecha(fecha);
        deposito.setMonto(892.36);
        deposito.setObservacion("S/O");

        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        assertEquals(true,depositoDAO.create(deposito));
    }

    @Test
    public void read(){
        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        Deposito deposito=new Deposito();
        deposito=depositoDAO.read(1);
        assertNotNull(deposito);
    }

    @Test
    public void  update(){
        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        Deposito deposito=new Deposito();
        deposito=depositoDAO.read(1);
        deposito.setMonto(45.63);
        assertEquals(true,depositoDAO.update(deposito));
    }

    @Test
    public void findAll(){
        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        List<Deposito> depositos=depositoDAO.findAll();
        assertNotNull(depositos);
    }

    @Test
    public void  delete(){
        DepositoDAO depositoDAO= DAOFactory.getDAOFactory().getDepositoDAO();
        Deposito deposito=new Deposito();
        deposito=depositoDAO.read(1);
        assertEquals(true,depositoDAO.delete(deposito));
    }


}