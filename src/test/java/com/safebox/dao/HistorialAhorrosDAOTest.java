package com.safebox.dao;

import com.safebox.entidades.HistorialAhorros;
import com.safebox.entidades.Rol;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class HistorialAhorrosDAOTest {

    @Test
    public void create() throws ParseException {

        HistorialAhorros historialAhorros = new HistorialAhorros();
        historialAhorros.setCodigo(13);

        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        historialAhorros.setFecha(fecha);
        historialAhorros.setDetalle("S/D");
        historialAhorros.setDeposito(45.63);
        historialAhorros.setRetiro(89.23);
        historialAhorros.setSaldo(1000.63);

        HistorialAhorrosDAO historialAhorrosDAO= DAOFactory.getDAOFactory().getHistorialAhorrosDAO();
        assertEquals(true,historialAhorrosDAO.create(historialAhorros));
    }

    @Test
    public void read(){
        HistorialAhorrosDAO historialAhorrosDAO= DAOFactory.getDAOFactory().getHistorialAhorrosDAO();
        HistorialAhorros historialAhorros = historialAhorrosDAO.read(1);
        assertNotNull(historialAhorros);
    }

    @Test
    public void  update(){
        HistorialAhorrosDAO historialAhorrosDAO= DAOFactory.getDAOFactory().getHistorialAhorrosDAO();
        HistorialAhorros historialAhorros = historialAhorrosDAO.read(1);

        historialAhorros.setRetiro(120.96);
        assertEquals(true,historialAhorrosDAO.update(historialAhorros));
    }

    @Test
    public void findAll(){
        HistorialAhorrosDAO historialAhorrosDAO= DAOFactory.getDAOFactory().getHistorialAhorrosDAO();
        List<HistorialAhorros> historialAhorros=historialAhorrosDAO.findAll();
        assertNotNull(historialAhorros);
    }

    @Test
    public void  delete(){
        HistorialAhorrosDAO historialAhorrosDAO= DAOFactory.getDAOFactory().getHistorialAhorrosDAO();
        HistorialAhorros historialAhorros = historialAhorrosDAO.read(1);

        assertEquals(true,historialAhorrosDAO.delete(historialAhorros));
    }

//    @Test
//    public void calcularInteres(){
//
//    }


}