package com.safebox.entidades;

import com.safebox.dao.DAOFactory;
import com.safebox.dao.RolDAO;

public class Principal {
    public static void main(String[] args) {
        Rol rol=new Rol(1,"Admin","NA");
        RolDAO rolDAO = DAOFactory.getDAOFactory().getRolDAO();
        rolDAO.create(rol);
    }
}
