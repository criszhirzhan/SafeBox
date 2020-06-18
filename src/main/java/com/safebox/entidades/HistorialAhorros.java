import java.util.Date;
import java.util.List;

public class HistorialAhorros {
    private int codigo;
    private Date fecha;
    private CuentaAhorro cuenta;
    private String detalle;
    private double retiro;
    private double deposito;
    private double saldo;
    private List<Transacciones> transacciones;

    public HistorialAhorros(){

    }

    public HistorialAhorros(int codigo, Date fecha, CuentaAhorro cuenta, String detalle, double retiro, double deposito, double saldo, List<Transacciones> transacciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cuenta = cuenta;
        this.detalle = detalle;
        this.retiro = retiro;
        this.deposito = deposito;
        this.saldo = saldo;
        this.transacciones = transacciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public CuentaAhorro getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaAhorro cuenta) {
        this.cuenta = cuenta;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacciones> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transacciones> transacciones) {
        this.transacciones = transacciones;
    }


    //-------------------------------
    public boolean crear(HistorialAhorros historial){
        return false;
    }

    public List<HistorialAhorros> listar(CuentaAhorro cuenta){
        return null;
    }

    public double calcularInteres(Cuenta cuenta){

        return 0.00;
    }

    @Override
    public String toString() {
        return "HistorialAhorros{" +
                "codigo=" + codigo +
                ", fecha=" + fecha +
                ", cuenta=" + cuenta +
                ", detalle='" + detalle + '\'' +
                ", retiro=" + retiro +
                ", deposito=" + deposito +
                ", saldo=" + saldo +
                ", transacciones=" + transacciones +
                '}';
    }
}
