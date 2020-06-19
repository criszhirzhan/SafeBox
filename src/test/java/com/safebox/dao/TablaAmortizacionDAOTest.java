package com.safebox.dao;

import com.safebox.entidades.LineaCredito;
import com.safebox.entidades.TablaAmortizacion;
import org.junit.Test;

import static org.junit.Assert.*;

public class TablaAmortizacionDAOTest {

    @Test
    public void create() {
        TablaAmortizacion tablaAmortizacion = new TablaAmortizacion();
        tablaAmortizacion.setCodigo(1);
        //tablaAmortizacion.setCredito(new CreditoTest(getClass()))

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
    public void  update(){
        LineaCreditoDAO lineaCreditoDAO = DAOFactory.getDAOFactory().getLineaCreditoDAO();
        LineaCredito lineaCredito = lineaCreditoDAO.read(1);
        lineaCredito.setDescripcion("Descripscion");
        assertEquals(true,lineaCreditoDAO.update(lineaCredito));

    }
    
    @Test
    public void calcularInteres() {
    }

    @Test
    public void calcularMora() {
    }

    @Test
    public void calcularCapital() {
    }

    @Test
    public void calcularSaldo() {
    }
}