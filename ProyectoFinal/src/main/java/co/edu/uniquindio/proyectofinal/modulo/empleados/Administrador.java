package co.edu.uniquindio.proyectofinal.modulo.empleados;

import co.edu.uniquindio.proyectofinal.modulo.cafeteria.Cafeteria;

import java.time.LocalDate;

public class Administrador extends Empleado implements AdministradorEmpleados {
    private Cafeteria cafeteria;

    public Administrador(String nombre, String apellido, String celular, String id, LocalDate fechaNacimiento, String direccion, double sueldo) {
        super(nombre, apellido, celular, id, fechaNacimiento, direccion, sueldo);
        cafeteria = Cafeteria.getInstance();
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    @Override
    public void registrarEmpleado(Empleado empleado) {

    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {

    }

    @Override
    public void agregarBonificacio(Double porcentaje) {

    }
}
