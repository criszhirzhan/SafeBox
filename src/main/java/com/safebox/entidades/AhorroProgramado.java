import java.util.Date;
import java.util.List;

public class AhorroProgramado extends CuentaAhorro {
    private int codigo;
    private int duracionCorreo;
    private Date fechaInicioContrato;
    private Date fechaFinalizacionContrato;

    public AhorroProgramado(){

    }

    public AhorroProgramado(int codigo, int duracionCorreo, Date fechaInicioContrato, Date fechaFinalizacionContrato) {
        this.codigo = codigo;
        this.duracionCorreo = duracionCorreo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracionCorreo() {
        return duracionCorreo;
    }

    public void setDuracionCorreo(int duracionCorreo) {
        this.duracionCorreo = duracionCorreo;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Date getFechaFinalizacionContrato() {
        return fechaFinalizacionContrato;
    }

    public void setFechaFinalizacionContrato(Date fechaFinalizacionContrato) {
        this.fechaFinalizacionContrato = fechaFinalizacionContrato;
    }

    //-----------------------------------------------------------------
    public Date calcularFinContrato(Date fechaInicio, int duracion){

        return null;
    }

    public boolean crear(AhorroProgramado ahorroCuneta){

        return false;
    }


    public boolean editar(AhorroProgramado ahorroCuneta){

        return false;
    }


    public boolean eliminar(AhorroProgramado ahorroCuneta){

        return false;
    }

    public AhorroProgramado verInfo(String identificacion){

        return null;
    }

    public List<AhorroProgramado> listar(){

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

    public void VerificarRetiro(){

    }

    public void activar(AhorroProgramado ahorroCuenta){

    }

    public AhorroProgramado verEstadoCuenta(AhorroProgramado ahorroCuenta){

        return null;
    }

    @Override
    public String toString() {
        return "AhorroProgramado{" +
                "codigo=" + codigo +
                ", duracionCorreo=" + duracionCorreo +
                ", fechaInicioContrato=" + fechaInicioContrato +
                ", fechaFinalizacionContrato=" + fechaFinalizacionContrato +
                '}';
    }
}
