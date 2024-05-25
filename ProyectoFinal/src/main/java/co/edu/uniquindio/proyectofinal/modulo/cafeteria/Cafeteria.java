package co.edu.uniquindio.proyectofinal.modulo.cafeteria;
import co.edu.uniquindio.proyectofinal.modulo.empleados.Empleado;
import co.edu.uniquindio.proyectofinal.modulo.producto.Pedido;

import java.util.List;

public class Cafeteria {
    private static Cafeteria instance; // Declare 'instance' here

    private String nombre;
    private Menu menu;
    private List<Empleado> listaEmpleados;
    private List<Pedido> listaFacturas;
    //terminar de agreagar relaciones

    private Cafeteria() {
        this.nombre = "Nombre de la cafeteria";
        menu = new Menu();
    }

    public static Cafeteria getInstance() {
        if (instance == null) {
            instance = new Cafeteria();
        }
        return instance;
    }
}


