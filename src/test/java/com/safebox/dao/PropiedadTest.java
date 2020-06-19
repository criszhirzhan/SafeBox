package com.safebox.dao;

import com.safebox.entidades.Credito;
import com.safebox.entidades.Propiedad;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PropiedadTest {
    @Test
    public void create() {
        CreditoDAO creditoDAO= DAOFactory.getDAOFactory().getCreditoDAO();
        Credito credito=creditoDAO.read(1);
        PropiedadDAO propiedadDAO= DAOFactory.getDAOFactory().getPropiedadDAO();
        Propiedad propiedad=new Propiedad();
        propiedad.setCodigo(1);
        propiedad.setValor(50.000);
        propiedad.setTipo("Finca");
        propiedad.setDescripcion("Propiedad de 50 hectareas");
        propiedad.setObservacion("Se encuentra ubicada en Cuenca");
        propiedad.setEscritura(true);
        propiedad.setCredito(credito);

        assertEquals(true,propiedadDAO.create(propiedad));
    }

    @Test
    public void read(){
        PropiedadDAO propiedadDAO= DAOFactory.getDAOFactory().getPropiedadDAO();
        Propiedad propiedad=propiedadDAO.read(1);
        assertNotNull(propiedad);
    }

    @Test
    public void  update(){
        PropiedadDAO propiedadDAO= DAOFactory.getDAOFactory().getPropiedadDAO();
        Propiedad propiedad=propiedadDAO.read(1);
        propiedad.setTipo("Departamento");
        assertEquals(true,propiedadDAO.update(propiedad));
    }

    @Test
    public void findAll(){
        PropiedadDAO propiedadDAO= DAOFactory.getDAOFactory().getPropiedadDAO();
        List<Propiedad> propiedads=propiedadDAO.findAll();
        assertNotNull(propiedads);
    }

    @Test
    public void  delete(){
        PropiedadDAO propiedadDAO= DAOFactory.getDAOFactory().getPropiedadDAO();
        Propiedad propiedad=propiedadDAO.read(1);
        assertEquals(true,propiedadDAO.delete(propiedad));
    }

}