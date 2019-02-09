
import java.util.Calendar;

/*
CLASE PEDIDO: ÉSTA CLASE ABARCA TODOS LOS DATOS NECESARIOS
PARA REALIZAR EL REGISTRO DE LOS PEDIDOS POR LOS CLIENTES.
 */
public class Pedido {
   public int id;
   public Cliente cliente;
   public Calendar fechaPedido;
   public double montoFinal;
   public Cafetin cafetin;
   public Empleados repartidor;
   public boolean status;
   public String observaciones;

    public Pedido() {
    }

    public Pedido(int id, Cliente cliente, Calendar fechaPedido, double montoFinal, Cafetin cafetin, Empleados repartidor, boolean status, String observaciones) {
        this.id = id;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.montoFinal = montoFinal;
        this.cafetin = cafetin;
        this.repartidor = repartidor;
        this.status = status;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Calendar getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Calendar fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public Cafetin getCafetin() {
        return cafetin;
    }

    public void setCafetin(Cafetin cafetin) {
        this.cafetin = cafetin;
    }

    public Empleados getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Empleados repartidor) {
        this.repartidor = repartidor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", cliente=" + cliente + ", fechaPedido=" + fechaPedido + ", montoFinal=" + montoFinal + ", cafetin=" + cafetin + ", repartidor=" + repartidor + ", status=" + status + ", observaciones=" + observaciones + '}';
    }

    
}
