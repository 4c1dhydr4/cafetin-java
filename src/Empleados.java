
import java.util.Calendar;

/*
Clase Empleado: Clase que contiene los atributos y métodos 
correspondientes a los empleados presentes en el servicio.
 */
public class Empleados extends Persona{
    
    public Puesto puesto;
    public Cafetin cafetin;

    public Empleados() {
    }

    public Empleados(int id, String nombre, String apellidoMaterno, String apellidoPaterno, String dni, Calendar fechaNacimiento, String email, String celular,Puesto puesto, Cafetin cafetin) {
        super(id, nombre, apellidoMaterno, apellidoPaterno, dni, fechaNacimiento, email, celular);
        this.puesto = puesto;
        this.cafetin = cafetin;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Cafetin getCafetin() {
        return cafetin;
    }

    public void setCafetin(Cafetin cafetin) {
        this.cafetin = cafetin;
    }

    @Override
    public String toString() {
        return super.toString()+ "Empleados{" + "puesto=" + puesto + ", cafetin=" + cafetin + '}';
    }
    
    
   
    
    
}
