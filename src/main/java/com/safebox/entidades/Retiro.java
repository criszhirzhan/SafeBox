import java.util.Date;
import java.util.List;

public class Retiro extends Transaccion {

    private int codigo;

    public Retiro(){

    }

    public Retiro(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //---------------------------

    public void retiro(Retiro retiro){

    }

    public void registrarTransaccion(Retiro retiro){

    }

    public List<Retiros> listar(){
        return null;
    }

    public List<Retiros> listarPorFecha(Date fecha){

        return null;
    }

    public List<Retiros> listarPorintervaloFecha(Date fechaInicial,Date fechaFinal){

        return null;
    }

    public List<Retiros> fechaFinal(){

        return null;
    }

    @Override
    public String toString() {
        return "Retiro{" +
                "codigo=" + codigo +
                '}';
    }
}
