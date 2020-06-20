package com.safebox.dao;

import com.safebox.dao.DAOFactory;
import com.safebox.dao.EmpleadoDAO;
import com.safebox.dao.SocioDAO;
import com.safebox.entidades.Empleado;
import com.safebox.entidades.Socio;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EmpleadoTest {

    @Test
    public void create() throws ParseException {
        Empleado empleado = new Empleado();

        empleado.setIdentificacion("0123467894");
        empleado.setNombre("Juan");
        empleado.setApellido("Perez");
        empleado.setDireccion("Luis Cordero");
        empleado.setCelular("0912389767");
        empleado.setCiudad("Cuenca");
        empleado.setCorreo("juan@hotmail.com");
        empleado.setTelefono("2271239");
        empleado.setNick("JuanP");
        empleado.setContrasena("passwd");
        String entrada = "12/03/1995";
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(entrada);


        empleado.setFechaNacimiento(fecha);


        EmpleadoDAO empleadoDAO= DAOFactory.getDAOFactory().getEmpleadoDAO();
        assertEquals(true,empleadoDAO.create(empleado));
    }

    @Test
    public void read(){
        EmpleadoDAO empleadoDAO= DAOFactory.getDAOFactory().getEmpleadoDAO();
        Empleado empleado = new Empleado();
        empleado=empleadoDAO.read("0123467894");
        assertNotNull(empleado);
    }

    @Test
    public void  update(){
        EmpleadoDAO empleadoDAO= DAOFactory.getDAOFactory().getEmpleadoDAO();
        Empleado empleado=empleadoDAO.read("0123467894");
        empleado.setCelular("0989786789");
        assertEquals(true,empleadoDAO.update(empleado));
    }

    @Test
    public void findAll(){
        EmpleadoDAO empleadoDAO= DAOFactory.getDAOFactory().getEmpleadoDAO();
        List<Empleado> empleados=empleadoDAO.findAll();
        assertNotNull(empleados);
    }

    @Test
    public void  delete(){
        EmpleadoDAO empleadoDAO= DAOFactory.getDAOFactory().getEmpleadoDAO();
        Empleado empleado=empleadoDAO.read("0989786789");
        assertEquals(true,empleadoDAO.delete(empleado));
    }
//
//    @Test
//    public String generarNick(String nombre, String apellido) {
//        return null;
//    }
//
//    @Test
//    public String generarContrasena() {
//        return null;
//    }
//
//    @Test
//    public List<Empleado> bucarPorRol() {
//        return null;
//    }

}
