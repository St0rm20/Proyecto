package co.edu.uniquindio.proyectofinal.modulo.cafeteria;
import co.edu.uniquindio.proyectofinal.modulo.producto.AdministradorProducto;
import co.edu.uniquindio.proyectofinal.modulo.producto.Producto;

import java.util.ArrayList;
import java.util.List;
public class Menu implements AdministradorProducto {
    private List<Producto> listaProductos;

    public Menu() {
        this.listaProductos = new ArrayList<>();
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
