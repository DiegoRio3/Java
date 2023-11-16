package org.diego.api.stream.ejemplos;

import org.diego.api.stream.ejemplos.models.Producto2;

import java.util.ArrayList;

public class Assignment34CorreccionChatGPT {

    public static void main(String[] args) {
        var listaProductos = new ArrayList<Producto2>();
        listaProductos.add(new Producto2(300, 3));
        listaProductos.add(new Producto2(200, 2));
        listaProductos.add(new Producto2(500, 1));
        listaProductos.add(new Producto2(400, 5));
        listaProductos.add(new Producto2(100, 6));

        System.out.println("Lista de productos: ");
        listaProductos.forEach(System.out::println);

        double granTotal = listaProductos.stream()
                .mapToDouble(x -> (x.getCantidad() * x.getPrecio()))
                .sum();
        System.out.println("Importe total: " + granTotal);
    }
}
