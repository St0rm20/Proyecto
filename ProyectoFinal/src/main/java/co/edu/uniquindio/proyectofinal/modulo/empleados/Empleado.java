package co.edu.uniquindio.proyectofinal.modulo.empleados;

import java.time.LocalDate;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String celular;
    protected  String id;
    protected LocalDate fechaNacimiento;
    protected String direccion;
    protected double sueldo;
    protected boolean estado;
    public Empleado() {
    }
    public Empleado(String nombre, String apellido, String celular, String id, LocalDate fechaNacimiento, String direccion, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public String getCelular() {
        return celular;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isEstado() {
        return estado;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
