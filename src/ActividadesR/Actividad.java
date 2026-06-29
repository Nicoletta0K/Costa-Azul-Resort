/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadesR;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Student
 */
public class Actividad {
    private final String nombre;
    private final LocalDate fecha;
    private final LocalTime hora;
    private final int cupoMaximo;
    private final List<String> clientesInscritos; 
    
    public Actividad(String nombre, LocalDate fecha, LocalTime hora, int cupoMaximo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.cupoMaximo = cupoMaximo;
        this.clientesInscritos = new ArrayList<>();
    }
    public int getCuposDisponibles() {
        return this.cupoMaximo - this.clientesInscritos.size();
    }
    public boolean tieneCupo() {
        return this.getCuposDisponibles() > 0;
    }
    public boolean inscribirCliente(String nombreCliente) {
        if (this.tieneCupo()) {
            this.clientesInscritos.add(nombreCliente);
            System.out.println("Bien" + nombreCliente + "ha sido inscrito en la actividad" + this.nombre);
            return true;
        } else {
            System.out.println("No hay cupos disponibles para la actividad" + this.nombre);
            return false;
        }
    }
    
    public double calcularPorcentajeOcupacion() {
        if (this.cupoMaximo == 0) {
            return 0.0;
        }
        double porcentaje = ((double) this.clientesInscritos.size() / this.cupoMaximo) * 100;
        return Math.round(porcentaje * 100.0) / 100.0;
    }

    public Actividad(String nombre, LocalDate fecha, LocalTime hora, int cupoMaximo, List<String> clientesInscritos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.cupoMaximo = cupoMaximo;
        this.clientesInscritos = clientesInscritos;
    }
    
    public void ClasesC(){
        ClasesC();
    }
     
    @Override
    public String toString() {
        System.out.println("\n Resumen de Actividad: " + this.nombre);
        System.out.println("\n Fecha y Hora: " + this.fecha + " a las " + this.hora);
        System.out.println("\n Cupo: " + this.clientesInscritos.size() + " / " + this.cupoMaximo);
        System.out.println("\n Cupos disponibles: " + this.getCuposDisponibles());
        System.out.println("\n Porcentaje de Ocupación: " + this.calcularPorcentajeOcupacion() + "%");
        System.out.println("\n Inscritos: " + (this.clientesInscritos.isEmpty() ? "Ninguno" : this.clientesInscritos));
        return null;
    }
}

