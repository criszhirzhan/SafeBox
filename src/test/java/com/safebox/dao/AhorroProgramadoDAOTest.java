package com.safebox.dao;

import com.mysql.cj.util.StringUtils;
import com.safebox.entidades.AhorroProgramado;
import com.safebox.entidades.AhorroVista;
import com.safebox.entidades.Rol;
import com.safebox.entidades.Socio;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class AhorroProgramadoDAOTest {

    @Test
    public void calcularFinConrtrato() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        Date fechaFinalizacion = new Date();
        Date fechaInicio = new Date();
        assertEquals(fechaFinalizacion,ahorroProgramadoDAO.calcularFinConrtrato(fechaInicio,12));
    }


    @Test
    public void generarNick() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        assertNotNull(ahorroProgramadoDAO.generarNick(socioDAO.findAll().get(0)));
    }

    @Test
    public void generarContrasena() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        assertNotNull(ahorroProgramadoDAO.generarContrasena());
    }

    @Test
    public void calcularInteresDiario() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroVista=ahorroProgramadoDAO.findAll().get(0);
        assertNotNull(ahorroProgramadoDAO.calcularInteresDiario(ahorroVista));
    }

    @Test
    public void verificarRetiro() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        assertNotNull(ahorroProgramadoDAO.verificarRetiro(ahorroProgramadoDAO.findAll().get(0)));
    }

    @Test
    public void modificarEstado() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroProgramado=ahorroProgramadoDAO.findAll().get(0);
        ahorroProgramado.setEstado("Deshabilitado");
        assertNotNull(ahorroProgramadoDAO.modificarEstado(ahorroProgramado));
    }

    @Test
    public void autentificacionCuenta() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroProgramado=ahorroProgramadoDAO.findAll().get(0);
        assertNotNull(ahorroProgramadoDAO.autentificacionCuenta(ahorroProgramado.getNick(),"asrat4564"));
    }



    @Test
    public void realizarRetiro() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroProgramado=ahorroProgramadoDAO.findAll().get(0);
        assertNotNull(ahorroProgramadoDAO.realizarRetiro(50.00,ahorroProgramado));
    }

    @Test
    public void buscarPorNombresApellidos() {
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();;
        assertNotNull(ahorroProgramadoDAO.buscarPorNombresApellidos("Fernando"));
    }

    @Test
    public void create() {
        Date fechaInicio = new Date();
        Date fechaFinalizacion = new Date();
        Date fechaApertura = new Date();
        Date fechaUltimoIngreso = new Date();
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroProgramado=new AhorroProgramado();
        ahorroProgramado.setCodigo(1);
        ahorroProgramado.setDuracionContrato(12);
        ahorroProgramado.setFechaInicioContrato(fechaInicio);
        ahorroProgramado.setFechaFinalizacionContrato(fechaFinalizacion);
        ahorroProgramado.setFechaApertura(fechaApertura);
        ahorroProgramado.setNick(ahorroProgramadoDAO.generarNick(socioDAO.findAll().get(0)));
        ahorroProgramado.setInteres(2.58);
        ahorroProgramado.setRetiroMaximo(3000);
        ahorroProgramado.setSocio(socioDAO.findAll().get(0));
        ahorroProgramado.setFechaUltimoIngreso(fechaUltimoIngreso);
        ahorroProgramado.setEstado("Activa");
        ahorroProgramado.setSaldo(20.00);
        assertEquals(true,ahorroProgramadoDAO.create(ahorroProgramado));
    }

    @Test
    public void read(){
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroProgramado=ahorroProgramadoDAO.read(1);
        assertNotNull(ahorroProgramado);
    }

    @Test
    public void  update(){
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroProgramado=ahorroProgramadoDAO.read(1);
        ahorroProgramado.setEstado("Deshabilitada");
        assertEquals(true,ahorroProgramadoDAO.update(ahorroProgramado));
    }

    @Test
    public void findAll(){
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        List<AhorroProgramado> ahorroProgramados=ahorroProgramadoDAO.findAll();
        assertNotNull(ahorroProgramados);
    }

    @Test
    public void  delete(){
        AhorroProgramadoDAO ahorroProgramadoDAO= DAOFactory.getDAOFactory().getAhorroProgramadoDAO();
        AhorroProgramado ahorroProgramado=ahorroProgramadoDAO.read(1);
        assertEquals(true,ahorroProgramadoDAO.delete(ahorroProgramado));
    }
}