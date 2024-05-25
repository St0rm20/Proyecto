package co.edu.uniquindio.proyectofinal.modulo.producto;

public abstract class Producto {
    private String nombre;
    private String descripcion;
    private int precio;

    public Producto(String descripcion, int precio, String nombre) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
    }
}
