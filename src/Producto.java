/*
CLASE PRODUCTO: ESTA CLASE CONTIENE TODOS LOS ATRIBUTOS
QUE CONTENGAN LOS PRODUCTOS DE MANERA GLOBAL, PARA LUEGO 
HEREDARLOSA LAS CLASES PRODUCTOSELLADO Y PRODCTO ELABORADO.
 */
public class Producto {
    protected int id;
    protected String nombre;
    protected double precioUnitario;

    public Producto() {
    }

    public Producto(int id, String nombre, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + '}';
    }
    
    
}
