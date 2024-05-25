package co.edu.uniquindio.proyectofinal.modulo.producto;
import co.edu.uniquindio.proyectofinal.cafeteria.Cliente;

import java.util.ArrayList;
import java.util.List;
public class Pedido implements AdministradorProducto {
    private List<Producto> listaProductos;
    private Cliente cliente;
    private String numeroSerie;

    public Pedido(Cliente cliente, String numeroSerie) {
        this.listaProductos = new ArrayList<>();
        this.cliente = cliente;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
    }
}
