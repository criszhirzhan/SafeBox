package com.safebox.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class CuentaAhorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @OneToOne
    private Socio socio;
    @Temporal(TemporalType.DATE)
    private Date fechaApertura;
    @Column(name = "INTERES", nullable = false, scale = 2)
    private double interes;
    @Column(name = "ESTADO", nullable = false, length = 11)
    private String estado;
    @Column(name = "SALDO", nullable = false, scale = 2)
    private double saldo;
    @Column(name = "NICK", nullable = false, length = 25)
    private String nick;
    @Column(name = "RETIROMAXIMO", nullable = false, scale = 2)
    private double retiroMaximo;
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoIngreso;

    private CuentaAhorro(){
        super();
    }

    public CuentaAhorro(int codigo, Socio socio, Date fechaApertura, double interes, String estado, double saldo,
                        String nick, double retiroMaximo, Date fechaUltimoIngreso) {
        this.codigo = codigo;
        this.socio = socio;
        this.fechaApertura = fechaApertura;
        this.interes = interes;
        this.estado = estado;
        this.saldo = saldo;
        this.nick = nick;
        this.retiroMaximo = retiroMaximo;
        this.fechaUltimoIngreso = fechaUltimoIngreso;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public double getRetiroMaximo() {
        return retiroMaximo;
    }

    public void setRetiroMaximo(double retiroMaximo) {
        this.retiroMaximo = retiroMaximo;
    }

    public Date getFechaUltimoIngreso() {
        return fechaUltimoIngreso;
    }

    public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
        this.fechaUltimoIngreso = fechaUltimoIngreso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuentaAhorro)) return false;
        CuentaAhorro that = (CuentaAhorro) o;
        return codigo == that.codigo &&
                Double.compare(that.interes, interes) == 0 &&
                Double.compare(that.saldo, saldo) == 0 &&
                Double.compare(that.retiroMaximo, retiroMaximo) == 0 &&
                Objects.equals(socio, that.socio) &&
                Objects.equals(fechaApertura, that.fechaApertura) &&
                Objects.equals(estado, that.estado) &&
                Objects.equals(nick, that.nick) &&
                Objects.equals(fechaUltimoIngreso, that.fechaUltimoIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, socio, fechaApertura, interes, estado, saldo, nick, retiroMaximo, fechaUltimoIngreso);
    }
}
