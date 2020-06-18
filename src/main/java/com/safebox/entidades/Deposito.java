import java.util.Date;
import java.util.List;

public class Deposito extends  Transaccion{

    private int codigo;

    public Deposito(){

    }

    public Deposito(int codigo) {
        this.codigo = codigo;
    }

    //------------------------------------

    public void deposito(Deposito deposito){

    }

    public void registrarTransaccion(Transaccion transaccion) {

    }

    public List listar(){

        return null;
    }

    public List listarPorFecha(Date fecha){

        return null;
    }

    public List listarPorintervaloFecha(Date fechaInicial){

        return null;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "codigo=" + codigo +
                '}';
    }
}
