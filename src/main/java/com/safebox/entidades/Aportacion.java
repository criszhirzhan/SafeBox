import java.util.Date;
import java.util.List;

public class Aportacion  extends  Transaccion{
    private int codigo;
    private int numeroCuota;

    public Aportacion(){

    }

    public Aportacion(int codigo, int numeroCuota) {
        this.codigo = codigo;
        this.numeroCuota = numeroCuota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    //---------------------------------------------------------
    public void realizarAportacion(Aportacion aportacion){

    }

    public void registrarTransaccionLibre(Aportacion aportacion){

    }

    public List<Aportacion> listar(){

        return null;
    }

    public List<Aportacion> listarPorFecha(Date fecha){

        return null;
    }

    public List<Aportacion> listarPorintervaloFecha(Date fechaInicial,Date fechaFinal){

        return null;
    }

    public CuentaAhorro generarResumendeAportaciones(CuentaAhorro cuenta){

        return null;
    }

    @Override
    public String toString() {
        return "Aportacion{" +
                "codigo=" + codigo +
                ", numeroCuota=" + numeroCuota +
                '}';
    }
}
