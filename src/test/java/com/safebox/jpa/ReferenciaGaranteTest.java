package com.safebox.jpa;

import com.safebox.dao.DAOFactory;
import com.safebox.dao.ReferenciaDAO;
import com.safebox.dao.SocioDAO;
import com.safebox.entidades.Referencia;
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
        Referencia referencia = new Referencia();

        Socio socio = new Socio();
        socio.setIdentificacion("0123467990");
        socio.setNombre("Maria");
        socio.setApellido("Velez");
        socio.setDireccion("Av. Las Americas");
        socio.setCelular("0990212786");
        socio.setCiudad("Cuenca");
        socio.setCorreo("mariavelez@gmail.com");
        socio.setTelefono("2271239");

        String entrada = "09/08/1999";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);

        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        assertEquals(true,socioDAO.create(socio));
        socio.setFechaNacimiento(fecha);



        referencia.setCodigo(1);
        referencia.setPath("N/A");
        referencia.setSocio(socioDAO.read("0123467990"));


        ReferenciaDAO referenciaDAO= DAOFactory.getDAOFactory().getReferenciaDAO();
        assertEquals(true,referenciaDAO.create(referencia));
    }

    @Test
    public void read(){
        ReferenciaDAO referenciaDAO= DAOFactory.getDAOFactory().getReferenciaDAO();
        Referencia referencia = new Referencia();
        referencia=referenciaDAO.read(1);
        assertNotNull(referencia);
    }

    @Test
    public void  update(){
        ReferenciaDAO referenciaDAO= DAOFactory.getDAOFactory().getReferenciaDAO();
        Referencia referencia=referenciaDAO.read(1);
        referencia.setPath("S/P");
        assertEquals(true,referenciaDAO.update(referencia));
    }

    @Test
    public void findAll(){
        ReferenciaDAO referenciaDAO= DAOFactory.getDAOFactory().getReferenciaDAO();
        List<Referencia> referencias=referenciaDAO.findAll();
        assertNotNull(referencias);
    }

    @Test
    public void  delete(){
        ReferenciaDAO referenciaDAO= DAOFactory.getDAOFactory().getReferenciaDAO();
        Referencia referencia=referenciaDAO.read(1);
        assertEquals(true,referenciaDAO.delete(referencia));
    }

}
