/*
CLASE PUESTO: CON RESPECTO A LOS EMPLEADOS, UN GRUPO 
SERÁ RESPONSABLE DE COCINA, OTRO DE ENTREGA Y OTRO DE
ADMINISTRAR EL SISTEMA, ES POR ELLO QUE SE PROPONE LA 
CLASE PUESTO, VINCULADA A LA CLASE EMPLEADO.
 */
public class Puesto {
    
    public int Id;
    public String nombre;
    public double salario;

    public Puesto() {
    }

    public Puesto(int Id, String nombre, double salario) {
        this.Id = Id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Puesto{" + "Id=" + Id + ", nombre=" + nombre + ", salario=" + salario + '}';
    }
    
    
    
}
