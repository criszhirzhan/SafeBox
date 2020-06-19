package com.safebox.dao;

import com.safebox.entidades.Credito;
import com.safebox.entidades.Vehiculo;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VehiculoTest {
    @Test
    public void create() {
        CreditoDAO creditoDAO= DAOFactory.getDAOFactory().getCreditoDAO();
        Credito credito=creditoDAO.read(1);
        Vehiculo vehiculo=new Vehiculo();
        vehiculo.setCodigo(1);
        vehiculo.setModelo("Model O");
        vehiculo.setPlaca("AAA5698");
        vehiculo.setSoat("5646489");
        vehiculo.setTipo("Camioneta");
        vehiculo.setObservaciones("N/A");
        vehiculo.setCredito(credito);
        VehiculoDAO vehiculoDAO= DAOFactory.getDAOFactory().getVehiculoDAO();
        assertEquals(true,vehiculoDAO.create(vehiculo));
    }

    @Test
    public void read(){
        VehiculoDAO vehiculoDAO= DAOFactory.getDAOFactory().getVehiculoDAO();
        Vehiculo vehiculo=vehiculoDAO.read(1);
        assertNotNull(vehiculoDAO);
    }

    @Test
    public void  update(){
        VehiculoDAO vehiculoDAO= DAOFactory.getDAOFactory().getVehiculoDAO();
        Vehiculo vehiculo=vehiculoDAO.read(1);
        vehiculo.setTipo("Camion");
        assertEquals(true,vehiculoDAO.update(vehiculo));
    }

    @Test
    public void findAll(){
        VehiculoDAO vehiculoDAO= DAOFactory.getDAOFactory().getVehiculoDAO();
        List<Vehiculo> vehiculos=vehiculoDAO.findAll();
        assertNotNull(vehiculos);
    }

    @Test
    public void  delete(){
        VehiculoDAO vehiculoDAO= DAOFactory.getDAOFactory().getVehiculoDAO();
        Vehiculo vehiculo=vehiculoDAO.read(1);
        assertEquals(true,vehiculoDAO.delete(vehiculo));
    }

}