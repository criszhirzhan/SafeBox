package com.safebox.dao;

import com.safebox.entidades.AhorroVista;
import com.safebox.entidades.Socio;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class AhorroVistaDAOTest {

    @Test
    public void buscarPorIdentificacio() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        assertNotNull(ahorroVistaDAO.buscarPorIdentificacio(socioDAO.findAll().get(0).getIdentificacion()));
    }

    @Test
    public void generarNick() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        assertNotNull(ahorroVistaDAO.generarNick(socioDAO.findAll().get(0)));
    }

    @Test
    public void generarContrasena() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        assertNotNull(ahorroVistaDAO.generarContrasena());
    }

    @Test
    public void calcularInteresDiario() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.findAll().get(0);
        assertNotNull(ahorroVistaDAO.calcularInteresDiario(ahorroVista));
    }

    @Test
    public void verEstadoCuentaPorSocioOnumeroCuenta() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        assertNotNull(ahorroVistaDAO.verEstadoCuentaPorSocioOnumeroCuenta("Marquez Fernandez"));
    }

    @Test
    public void modificarEstado() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.findAll().get(0);
        ahorroVista.setEstado("Deshabilitado");
        assertNotNull(ahorroVistaDAO.modificarEstado(ahorroVista));
    }

    @Test
    public void autentificacionCuenta() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.findAll().get(0);
        assertNotNull(ahorroVistaDAO.autentificacionCuenta(ahorroVista.getNick(),"asrat4564"));
    }

    @Test
    public void realizarDeposito() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.findAll().get(0);
        assertNotNull(ahorroVistaDAO.realizarDeposito(50.00,ahorroVista));
    }

    @Test
    public void realizarRetiro() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.findAll().get(0);
        assertNotNull(ahorroVistaDAO.realizarRetiro(50.00,ahorroVista));
    }

    @Test
    public void buscarPorNombresApellidos() {
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        assertNotNull(ahorroVistaDAO.buscarPorNombresApellidos("Fernando"));
    }

    @Test
    public void create() {
        Date fechaApertura = new Date();
        Date fechaUltimoIngreso = new Date();
        SocioDAO socioDAO= DAOFactory.getDAOFactory().getSocioDAO();
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=new AhorroVista();
        ahorroVista.setCodigo(1);
        ahorroVista.setEstado("Activo");
        ahorroVista.setFechaApertura(fechaApertura);
        ahorroVista.setFechaUltimoIngreso(fechaUltimoIngreso);
        ahorroVista.setInteres(2.03);
        ahorroVista.setNick(ahorroVistaDAO.generarNick(socioDAO.findAll().get(0)));
        ahorroVista.setRetiroMaximo(4000);
        ahorroVista.setSaldo(250);
        ahorroVista.setSocio(socioDAO.findAll().get(0));
        assertEquals(true,ahorroVistaDAO.create(ahorroVista));
    }

    @Test
    public void read(){
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.read(1);
        assertNotNull(ahorroVista);
    }

    @Test
    public void  update(){
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.read(1);
        ahorroVista.setEstado("Deshabilitada");
        assertEquals(true,ahorroVistaDAO.update(ahorroVista));
    }

    @Test
    public void findAll(){
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        List<AhorroVista> ahorroVistas=ahorroVistaDAO.findAll();
        assertNotNull(ahorroVistas);
    }

    @Test
    public void  delete(){
        AhorroVistaDAO ahorroVistaDAO= DAOFactory.getDAOFactory().getAhorroVistaDAO();
        AhorroVista ahorroVista=ahorroVistaDAO.read(1);
        assertEquals(true,ahorroVistaDAO.delete(ahorroVista));
    }

}