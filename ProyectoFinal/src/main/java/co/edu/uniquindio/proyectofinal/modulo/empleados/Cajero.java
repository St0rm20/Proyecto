package co.edu.uniquindio.proyectofinal.modulo.empleados;

import co.edu.uniquindio.proyectofinal.modulo.cafeteria.Caja;
import co.edu.uniquindio.proyectofinal.modulo.producto.Pedido;

import java.time.LocalDate;
import java.util.List;
public class Cajero extends Empleado {
    private Caja caja;
    private List<Pedido> listaFacturas;
    public Cajero(String nombre, String apellido, String celular, String id, LocalDate fechaNacimiento, String direccion, double sueldo, Caja caja) {
        super(nombre, apellido, celular, id, fechaNacimiento, direccion, sueldo);
        this.caja = caja;
    }
    public void generarFactura(Pedido pedido){

    }
}
