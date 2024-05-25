package co.edu.uniquindio.proyectofinal.modulo.empleados;

import java.time.LocalDate;

public class Mesero extends Empleado {
    public Mesero() {
    }

    public Mesero(String nombre, String apellido, String celular, String id, LocalDate fechaNacimiento, String direccion, double sueldo) {
        super(nombre, apellido, celular, id, fechaNacimiento, direccion, sueldo);

    }
}
