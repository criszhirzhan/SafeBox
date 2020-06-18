import java.util.Date;

public class Transaccion {
    private int codigo;;
    private Caja caja;
    private Date fecha;
    private CuentaAhorro cuenta;
    private String observaciones;

    public Transaccion(){

    }

    public Transaccion(int codigo, Caja caja, Date fecha, CuentaAhorro cuenta, String observaciones) {
        this.codigo = codigo;
        this.caja = caja;
        this.fecha = fecha;
        this.cuenta = cuenta;
        this.observaciones = observaciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void registrarTransaccionLibro(Transaccion transaccion){

    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "codigo=" + codigo +
                ", caja=" + caja +
                ", fecha=" + fecha +
                ", cuenta=" + cuenta +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
