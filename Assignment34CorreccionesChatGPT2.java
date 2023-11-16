package org.diego.api.stream.ejemplos;

import org.diego.api.stream.ejemplos.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class Assignment34CorreccionesChatGPT2 {

    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(300, 3));
        listaProductos.add(new Producto(200, 2));
        listaProductos.add(new Producto(500, 1));
        listaProductos.add(new Producto(400, 5));
        listaProductos.add(new Producto(100, 6));

        System.out.println("Lista de productos: ");
        System.out.println(listaProductos);

        double granTotal = calcularGranTotal(listaProductos);
        System.out.println("Importe total: " + granTotal);
    }

    private static double calcularGranTotal(List<Producto> productos) {
        return productos.stream()
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                .sum();
    }
}
