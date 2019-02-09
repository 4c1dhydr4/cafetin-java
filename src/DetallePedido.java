/*
CLASE DETALLEPEDIDO: ÉSTA CLASE SE ENCARGA DE ALMACENAR
LOS ATRIBUTOS Y MÉTODOS CON RESPECTO AL DETALLE DE CADA 
PEDIDO REALIZADO, YA QUE EN UN PEDIDO PUEDE HABER UNO O 
MÁS PRODUCTOS Y/O ALIMENTOS, SE NECESITA ALMACENAR DE
MANERA ADECUADA LOS DETALLES DE DICHO PEDIDO.
 */
public class DetallePedido {
    public int idDetalle;
    public Pedido pedido;
    public Producto[] producto;
    public double subTotal;
    public double descuento;
    static final int MAX = 15;//requerimiento 15 productos maximo por pedido

    public DetallePedido() {
    }


    public DetallePedido(int idDetalle) {
        this.idDetalle = idDetalle;
        this.producto = new Producto[MAX];
        
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
    
}