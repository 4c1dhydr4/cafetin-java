
import java.util.Calendar;

/*
CLASE CLIENTE: ÉSTA CLASE ESTÁ ABSTRAÍDA A PARTIR 
DE LOS REQUERIMIENTOS PROPUESTOS ANTERIORMENTE PARA
ABARCAR LOS DATOS COMPLETOS DEL CLIENTE QUE USE EL 
SISTEMA DE PEDIDOS Y ENTREGA, OBJETO DEL PRESENTE INFORME.
 */
public class Cliente extends Persona implements Actividad{
    
    public String codigoUPN;

    public Cliente() {
    }

    public Cliente( String nombre, String apellidoMaterno, String apellidoPaterno, String dni, Calendar fechaNacimiento, String email, String celular,String codigoUPN, int id) {
        super(id, nombre, apellidoMaterno, apellidoPaterno, dni, fechaNacimiento, email, celular);
        this.codigoUPN = codigoUPN;
    }

    public String getCodigoUPN() {
        return codigoUPN;
    }

    public void setCodigoUPN(String codigoUPN) {
        this.codigoUPN = codigoUPN;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cliente{" + "codigoUPN=" + codigoUPN + '}';
    }

    @Override
    public void comprar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void solicitarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarQueja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarObservacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verComidas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void culminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
