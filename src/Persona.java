
import java.util.Calendar;

/*
CLASE PERSONA: ÉSTA CLASE ENCAPSULARÁ LOS DATOS 
ESENCIALES QUE SE NECESITARÁ DE LAS PERSONAS 
INVOLUCRADAS EN TODO EL SISTEMA. EJ: EMPLEADO, 
USUARIO, CLIENTE, ETC.
 */
public class Persona {
    protected int id;
    protected String nombre;
    protected String apellidoMaterno;
    protected String apellidoPaterno;
    protected String dni;
    protected Calendar fechaNacimiento;
    protected String email;
    protected String celular;
    protected Usuario usuario;
    
    public Persona() {
    }

    public Persona(int id, String nombre, String apellidoMaterno, String apellidoPaterno, String dni, Calendar fechaNacimiento, String email, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.celular = celular;
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

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidoMaterno=" + apellidoMaterno + ", apellidoPaterno=" + apellidoPaterno + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", celular=" + celular + '}';
    }
    
    /*
CLASE USUARIO: LA CLASE USUARIO SERÁ UTILIZADA 
EXCLUSIVAMENTE PARA LOS USUARIOS EN GENERAL DEL
SISTEMA. SE DESLIGA DE LA CLASE CLIENTE YA QUE 
TODA PERSONA INVOLUCRADA EN EL PROCESO DE COMPRA 
Y ENTREGA DE LOS PRODUCTOS DEBERÁ CONTAR CON UN 
USUARIO DISPONIBLE PARA INGRESAR AL SISTEMA.
 */
public final class Usuario {
    
public String codigo;
public String password;
public Persona persona;
public boolean status;

    public Usuario() {
    }

        public Usuario(String codigo, String password, Persona persona, boolean status) {
            this.codigo = codigo;
            this.password = password;
            this.persona = persona;
            this.status = status;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Persona getPersona() {
            return persona;
        }

        public void setPersona(Persona persona) {
            this.persona = persona;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Usuario{" + "codigo=" + codigo + ", password=" + password + ", persona=" + persona + ", status=" + status + '}';
        }


    
    
}
    
}
