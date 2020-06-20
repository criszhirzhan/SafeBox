package com.safebox.jpa;

import com.safebox.dao.DAOFactory;
import com.safebox.dao.RolDAO;
import com.safebox.entidades.Rol;
import com.safebox.entidades.Socio;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RolTest {
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



}
