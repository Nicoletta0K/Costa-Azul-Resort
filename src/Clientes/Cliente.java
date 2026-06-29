package Clientes;
import java.time.LocalDate;

public class Persona {
protected String nombre;
protected int identificacion;
protected String fechaNacimiento;
protected int edad;
protected int telefono;
protected String correo;
protected String nacionalidad;

    public Persona(String nombre, int identificacion, int edad, int telefono, String correo, String nacionalidad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getIdentificacion() {
        return identificacion;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
 
}
