/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadesR;
import java.time.LocalTime;
import java.time.LocalDate;
/**
 *
 * @author Student
 */
public class ClasesC {
    private final String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private String cupoMaximo;
    private String clientesInscritos;

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getCupoMaximo() {
        return cupoMaximo;
    }

    public String getClientesInscritos() {
        return clientesInscritos;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public void setCupoMaximo(String cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public void setClientesInscritos(String clientesInscritos) {
        this.clientesInscritos = clientesInscritos;
    }

    public ClasesC(String nombre, LocalDate fecha, LocalTime hora, String cupoMaximo, String clientesInscritos) {
        this.nombre = nombre;
        this.fecha= fecha;
        this.hora = hora;
        this.cupoMaximo = cupoMaximo;
        this.clientesInscritos = clientesInscritos;
    }

    @Override
    public String toString() {
        return """
                Clases de Cocina: 
                \n Nombre: """ + nombre + 
               "\n Fecha:" + fecha + 
               "\n hora: " + hora +
               "\n CupoMaximo:" + cupoMaximo +
               "\n ClientesInscritos: " + clientesInscritos;
    }
}
