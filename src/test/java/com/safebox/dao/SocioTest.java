package com.safebox.dao;

import com.safebox.dao.DAOFactory;
import com.safebox.dao.RolDAO;
import com.safebox.dao.SocioDAO;
import com.safebox.entidades.Rol;
import com.safebox.entidades.Socio;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SocioTest {
    @Test
    public void create() throws ParseException {
        Socio socio = new Socio();

        socio.setIdentificacion("0123467894");
        socio.setNombre("Juan");
        socio.setApellido("Perez");
        socio.setDireccion("Luis Cordero");
        socio.setCelular("0912389767");
        socio.setCiudad("Cuenca");
        socio.setCorreo("juan@hotmail.com");
        socio.setTelefono("2271239");

        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);


        socio.setFechaNacimiento(fecha);


        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        assertEquals(true,socioDAO.create(socio));
    }

    @Test
    public void read(){
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        Socio socio = new Socio();
        socio=socioDAO.read("0123467894");
        assertNotNull(socio);
    }

    @Test
    public void  update(){
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        Socio socio=socioDAO.read("0123467894");
        socio.setCelular("0989786789");
        assertEquals(true,socioDAO.update(socio));
    }

    @Test
    public void findAll(){
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        List<Socio> socios=socioDAO.findAll();
        assertNotNull(socios);
    }

    @Test
    public void  delete(){
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        Socio socio=socioDAO.read("0989786789");
        assertEquals(true,socioDAO.delete(socio));
    }

    @Test
    public List<Socio> buscarPorIdentificacionOApellidos(String contex) {
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();

        assertNotNull(socioDAO.buscarPorIdentificacionOApellidos("cedula"));

        return null;
    }




}
