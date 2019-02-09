/*
CLASE PRODUCTOELABORADO: ESTA CLASE CONTIENE TODOS LOS 
ATRIBUTOS CON RELACIÓN A LOS ALIMENTOS PREPARADOS DENTRO
DEL CAFETÍN PARA SU VENTA Y ENTREGA.
 */
public class ProductoElaborado extends Producto{
    
    public Producto [] ingredientes;
    static final int MAX=15;

    public ProductoElaborado() {
    }

    public ProductoElaborado(int id, String nombre, double precioUnitario) {
        super(id, nombre, precioUnitario);
        this.ingredientes = new Producto[MAX];
    }

    public Producto[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Producto[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    
    
    
}
