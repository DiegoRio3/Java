/*
Assignment 34: Calcular importe de cada producto de una lista y sumarlo
Calcular importe de cada producto y el gran total
El siguiente requerimiento es para una lista de productos List<Producto> , de 3 a 5 elementos,
se pide calcular el importe (precio por cantidad) y sumarlos.
La clase Producto debe tener el atributo precio del tipo double y cantidad int, entonces utilizando stream
 convertir la lista de productos en el gran total del tipo double.
 */

package org.diego.api.stream.ejemplos;

import org.diego.api.stream.ejemplos.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class Assignment34 {

    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(300, 3));
        listaProductos.add(new Producto(200, 2));
        listaProductos.add(new Producto(500, 1));
        listaProductos.add(new Producto(400, 5));
        listaProductos.add(new Producto(100, 6));

        System.out.println("Lista de productos: ");
        System.out.println(listaProductos);

        double granTotal = listaProductos.stream()
                .mapToDouble(x -> (x.getCantidad() * x.getPrecio()))
                .peek(System.out::println)
                .sum();
        System.out.println("Importe total: " + granTotal);
    }
}
