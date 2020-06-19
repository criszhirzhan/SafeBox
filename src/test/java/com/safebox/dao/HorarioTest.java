package com.safebox.dao;

import com.safebox.entidades.Caja;
import com.safebox.entidades.Empleado;
import com.safebox.entidades.Horario;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HorarioTest {
    @Test
    public void create() {
        Date horaEntrada = new Date();
        Date horaSalida = new Date();
        Empleado empleado=new Empleado();
        Caja caja=new Caja();
        Horario horario=new Horario();
        horario.setCodigo(1);
        horario.setEmpleado(empleado);
        horario.setCaja(caja);
        horario.setHoraEntrada(horaEntrada);
        horario.setHoraSalida(horaSalida);
        HorarioDAO horarioDAO= DAOFactory.getDAOFactory().getHorarioDAO();
        assertEquals(true,horarioDAO.create(horario));
    }

    @Test
    public void read(){
        HorarioDAO horarioDAO= DAOFactory.getDAOFactory().getHorarioDAO();
        Horario horario=horarioDAO.read(1);
        assertNotNull(horario);
    }

    @Test
    public void  update(){
        HorarioDAO horarioDAO= DAOFactory.getDAOFactory().getHorarioDAO();
        Horario horario=horarioDAO.read(1);
        Date horaSalida = new Date();
        horario.setHoraSalida(horaSalida);
        assertEquals(true,horarioDAO.update(horario));
    }

    @Test
    public void findAll(){
        HorarioDAO horarioDAO= DAOFactory.getDAOFactory().getHorarioDAO();
        List<Horario> horarios=horarioDAO.findAll();
        assertNotNull(horarios);
    }

    @Test
    public void  delete(){
        HorarioDAO horarioDAO= DAOFactory.getDAOFactory().getHorarioDAO();
        Horario horario=horarioDAO.read(1);
        assertEquals(true,horarioDAO.delete(horario));
    }

}