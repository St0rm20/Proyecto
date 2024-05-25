package co.edu.uniquindio.proyectofinal.modulo.builders;

import co.edu.uniquindio.proyectofinal.modulo.cafeteria.Caja;
import co.edu.uniquindio.proyectofinal.modulo.empleados.Cajero;
import co.edu.uniquindio.proyectofinal.modulo.empleados.Empleado;

import java.time.LocalDate;

public class BuilderCajero {
    private String nombre;
    private String apellido;
    private String celular;
    private String id;
    private LocalDate fechaNacimiento;
    private String direccion;
    private Double sueldo;
    private boolean estado;
    private Caja caja;

    public BuilderCajero(String id, LocalDate fechaNacimiento) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
    }

    public BuilderCajero withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public BuilderCajero withApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public BuilderCajero withCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public BuilderCajero withDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public BuilderCajero withSueldo(Double sueldo) {
        this.sueldo = sueldo;
        return this;
    }

    public BuilderCajero withEstado(boolean estado) {
        this.estado = estado;
        return this;
    }

    public BuilderCajero withCaja(Caja caja) {
        this.caja = caja;
        return this;
    }

    public Empleado build() {
        return new Cajero(nombre, apellido, celular, id, fechaNacimiento, direccion, sueldo, caja);
    }

}
