/*
CLASE UBICACIÓNENTREGA: ÉSTA CLASE CONTIENE ENCAPSULADA
LOS DATOS SOBRE LA UBICACIÓN DE ENTREGA DENTRO DEL CAMPUS
DEL PEDIDO REALIZADO.
 */
public class UbicacionEntrega {
    
    public int id;
    public String pabellon;
    public int sector;

    public UbicacionEntrega() {
    }

    public UbicacionEntrega(int id, String pabellon, int sector) {
        this.id = id;
        this.pabellon = pabellon;
        this.sector = sector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "UbicacionEntrega{" + "id=" + id + ", pabellon=" + pabellon + ", sector=" + sector + '}';
    }
    
    
    
}
