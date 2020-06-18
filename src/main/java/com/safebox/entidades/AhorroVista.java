import java.util.List;

public class AhorroVista {
    private int codigo;

    public AhorroVista(){

    }

    public AhorroVista(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public boolean crear(AhorroVista ahorroCuenta) {
        return false;
    }

    public boolean editar(AhorroVista ahorroCuenta) {

        return false;
    }

    public boolean eliminar(AhorroVista ahorroCuenta) {
        return false;
    }

    public AhorroProgramado verInfo(String identificacion) {
        return null;
    }

    public List listar(List AhorroProgramado){
    return null;
    }

    public String generarNick(Socio socio){

        return null;
    }

    public void calcularInteresDiario(double interes, double saldo){
    }

    public AhorroVista verEstadoCuenta(AhorroVista cunetaAhorro){

        return null;
    }

    public boolean activar(AhorroVista ahorroCuenta){

        return false;
    }

    @Override
    public String toString() {
        return "AhorroVista{" +
                "codigo=" + codigo +
                '}';
    }
}
