package com.safebox.entidades;

import java.util.Date;

public class Horario {
    private int codigo;
    private Empleado empleado;
    private Caja caja;
    private Date horaEntrada;
    private Date horaSalida;

    public Horario() {
    }

    public Horario(int codigo, Empleado empleado, Caja caja, Date horaEntrada, Date horaSalida) {
        this.codigo = codigo;
        this.empleado = empleado;
        this.caja = caja;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
}
