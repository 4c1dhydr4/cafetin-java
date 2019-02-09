/*
CLASE CAFETIN: ÉSTA CLASE ENCAPSULA LOS DATOS SOBRE LOS 
CAFETINES DISPONIBLES EN EL CAMPUS DE LA UNIVERSIDAD.
 */
public class Cafetin {
    
    public int id;
    public String nombre;
    public String pabellon;
    public int sector;
    public String sede;

    public Cafetin() {
    }

    public Cafetin(int id, String nombre, String pabellon, int sector,String sede) {
        this.id = id;
        this.nombre = nombre;
        this.pabellon = pabellon;
        this.sector = sector;
        this.sede = sede;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre + ", pabellon: " + pabellon + ", sector: " + sector + ", sede: " + sede + '.';
    }


    
}
