package com.safebox.jpa;

import com.safebox.dao.*;
import com.safebox.entidades.Garante;
import com.safebox.entidades.Referencia;
import com.safebox.entidades.ReferenciaGarante;
import com.safebox.entidades.Socio;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReferenciaGaranteTest {

    @Test
    public void create() throws ParseException {
        ReferenciaGarante referenciaGarante = new ReferenciaGarante();

        Garante garante = new Garante();
        garante.setCodigo(11);
        garante.setNombre("Martha");
        garante.setApellido("Gomez");
        garante.setCelular("09212346571");
        garante.setCiudad("Azogues");
        garante.setCorreo("mgomez@gmail.com");
        garante.setTelefono("22789012");
        garante.setPathCopiaCedula("N/A");
        garante.setPathServicioBasico("N/A");



        GaranteDAO garanteDAO= DAOFactory.getDAOFactory().getGaranteDAO();
        assertEquals(true,garanteDAO.create(garante));




        referenciaGarante.setCodigo(20);
        referenciaGarante.setPath("N/A");
        referenciaGarante.setGarante(garanteDAO.read(11));


        ReferenciaGaranteDAO referenciaGaranteDAO= DAOFactory.getDAOFactory().getReferenciaGaranteDAO();
        assertEquals(true,referenciaGaranteDAO.create(referenciaGarante));
    }

    @Test
    public void read(){
        ReferenciaGaranteDAO referenciaGaranteDAO= DAOFactory.getDAOFactory().getReferenciaGaranteDAO();
        ReferenciaGarante referenciaGarante = new ReferenciaGarante();
        referenciaGarante=referenciaGaranteDAO.read(20);
        assertNotNull(referenciaGarante);
    }

    @Test
    public void  update(){
        ReferenciaGaranteDAO referenciaGaranteDAO= DAOFactory.getDAOFactory().getReferenciaGaranteDAO();
        ReferenciaGarante referenciaGarante=referenciaGaranteDAO.read(20);
        referenciaGarante.setPath("S/R");
        assertEquals(true,referenciaGaranteDAO.update(referenciaGarante));
    }

    @Test
    public void findAll(){
        ReferenciaGaranteDAO referenciaGaranteDAO= DAOFactory.getDAOFactory().getReferenciaGaranteDAO();
        List<ReferenciaGarante> referenciasGarante=referenciaGaranteDAO.findAll();
        assertNotNull(referenciasGarante);
    }

    @Test
    public void  delete(){
        ReferenciaGaranteDAO referenciaGaranteDAO= DAOFactory.getDAOFactory().getReferenciaGaranteDAO();
        ReferenciaGarante referenciaGarante=referenciaGaranteDAO.read(20);
        assertEquals(true,referenciaGaranteDAO.delete(referenciaGarante));
    }

}
