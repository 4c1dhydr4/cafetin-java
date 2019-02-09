
import java.util.Calendar;

/*
CLASE LOTE: ESTA CLASE CONTIENE TODOS LOS ATRIBUTOS DE 
CADA LOTE DE PRODUCTOS SELLADOS QUE ADQUIERA UN CAFETIN.
 */
public class Lote {
    
    public int id;
    public int lote;
    public Calendar fechaVencimiento;

    public Lote() {
    }

    public Lote(int id, int lote, Calendar fechaVencimiento) {
        this.id = id;
        this.lote = lote;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Lote{" + "id=" + id + ", lote=" + lote + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    
}
