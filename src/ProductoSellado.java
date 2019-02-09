/*
CLASE PRODUCTOSELLADO: ESTA CLASE CONTIENE ATRIBUTOS 
SOBRE LOS PRODUCTOS SELLADOS (NO PREPARADOS DENTRO DEL
CAFETIN)QUE ESTARÁN DISPONIBLES A LA VENTA
 */
public class ProductoSellado extends Producto{
    
    public String marca;
    public int stock;

    public ProductoSellado() {
    }

    public ProductoSellado( int id, String nombre, double precioUnitario,String marca, int stock) {
        super(id, nombre, precioUnitario);
        this.marca = marca;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString()+"ProductoSellado{" + "marca=" + marca + ", stock=" + stock + '}';
    }
    
    
    
}
