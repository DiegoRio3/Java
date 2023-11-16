package org.diego.api.stream.ejemplos.models;

public class Producto2 {
    private final double precio;
    private final int cantidad;

    public Producto2(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto{ " +
                "precio= " + precio +
                ", cantidad= " + cantidad +
                '}';
    }
}
