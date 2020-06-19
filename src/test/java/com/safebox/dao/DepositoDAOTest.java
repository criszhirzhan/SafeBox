package com.safebox.dao;

import com.safebox.entidades.Rol;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DepositoDAOTest {

    @Test
    public void registrarTransaccion() {
    }

    @Test
    public void listarPorFecha() {
    }

    @Test
    public void listarPorIntervaloDeFechas() {
    }

    @Test
    public void create() {
        Rol rol=new Rol();
        rol.setCodigo(1);
        rol.setNombre("Administrador");
        rol.setDescripcion("NA");
        RolDAO rolDAO= DAOFactory.getDAOFactory().getRolDAO();
        assertEquals(true,rolDAO.create(rol));
    }

    @Test
    public void read(){
        RolDAO rolDAO= DAOFactory.getDAOFactory().getRolDAO();
        Rol rol=rolDAO.read(1);
        assertNotNull(rol);
    }

    @Test
    public void  update(){
        RolDAO rolDAO= DAOFactory.getDAOFactory().getRolDAO();
        Rol rol=rolDAO.read(1);
        rol.setDescripcion("NuevaDescripcion");
        assertEquals(true,rolDAO.update(rol));
    }

    @Test
    public void findAll(){
        RolDAO rolDAO= DAOFactory.getDAOFactory().getRolDAO();
        List<Rol> roles=rolDAO.findAll();
        assertNotNull(roles);
    }

    @Test
    public void  delete(){
        RolDAO rolDAO= DAOFactory.getDAOFactory().getRolDAO();
        Rol rol=rolDAO.read(1);
        assertEquals(true,rolDAO.delete(rol));
    }

    @Test
    public void deposito(){

    }

    @Test
    public void listar(){

    }

    @Test
    public void fechaFinalDate(){

    }

}