package com.safebox.jpa;


import com.safebox.dao.HorarioDAO;
import com.safebox.entidades.Horario;

public class JPAHorarioDAO  extends JPAGenericDAO<Horario, Integer> implements HorarioDAO {
    public JPAHorarioDAO() {
        super(Horario.class);
    }
}
