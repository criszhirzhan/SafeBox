import java.util.Date;
import java.util.List;

public class CuentaAhorro {
    private int codigoCuneta;
    private Socio socio;
    private Date fechaApertura;
    private double interes;
    private boolean estado;
    private double saldo;
    private String estado2;
    private String nick;
    private double retiroMaximo;
    private Date FechaUltimoIngreso;

    private CuentaAhorro(){

    }

    public CuentaAhorro(int codigoCuneta, Socio socio, Date fechaApertura, double interes, boolean estado, double saldo, String estado2, String nick, double retiroMaximo, Date fechaUltimoIngreso) {
        this.codigoCuneta = codigoCuneta;
        this.socio = socio;
        this.fechaApertura = fechaApertura;
        this.interes = interes;
        this.estado = estado;
        this.saldo = saldo;
        this.estado2 = estado2;
        this.nick = nick;
        this.retiroMaximo = retiroMaximo;
        FechaUltimoIngreso = fechaUltimoIngreso;
    }

    public int getCodigoCuneta() {
        return codigoCuneta;
    }

    public void setCodigoCuneta(int codigoCuneta) {
        this.codigoCuneta = codigoCuneta;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEstado2() {
        return estado2;
    }

    public void setEstado2(String estado2) {
        this.estado2 = estado2;
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
        return FechaUltimoIngreso;
    }

    public void setFechaUltimoIngreso(Date fechaUltimoIngreso) {
        FechaUltimoIngreso = fechaUltimoIngreso;
    }

    //------------------------------------------

    public boolean crear(CuentaAhorro ahorroCuneta){

        return false;
    }


    public boolean editar(CuentaAhorro ahorroCuneta){

        return false;
    }


    public boolean eliminar(CuentaAhorro ahorroCuneta){

        return false;
    }

    public boolean activar(CuentaAhorro ahorroCuneta){

        return false;
    }


    public CuentaAhorro verInfo(String identificacion){

        return null;
    }

    public List<CuentaAhorro> listar(){

        return null;
    }

    public String generarNick(Socio socio){

        return null;
    }

    public String generarContrasena(){

        return null;
    }

    public void calcularInteresDiario(double intereces,double saldo){


    }

    public CuentaAhorro verEstadoCuenta(CuentaAhorro  cuentaAhorro){

        return cuentaAhorro;
    }

    public boolean autenticacionCuenta(String nick,String contrasenia){
        return false;
    }

    public boolean depositar(double monto,CuentaAhorro cuentaAhorro ){

        return false;
    }

    public boolean retiro(double monto,CuentaAhorro cuentaAhorro){

        return false;
    }

    public void buscarPorNombre(String apellidos,String nombres){


    }



    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "codigoCuneta=" + codigoCuneta +
                ", socio=" + socio +
                ", fechaApertura=" + fechaApertura +
                ", interes=" + interes +
                ", estado=" + estado +
                ", saldo=" + saldo +
                ", estado2='" + estado2 + '\'' +
                ", nick='" + nick + '\'' +
                ", retiroMaximo=" + retiroMaximo +
                ", FechaUltimoIngreso=" + FechaUltimoIngreso +
                '}';
    }

}
