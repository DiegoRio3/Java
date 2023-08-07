/*
Ejercicio 22: Almacen y Verduleria
Para la tarea se pide desarrollar un diseño orientado a objetos para un almacén y verdulería,
como requerimiento vamos a tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible,
todas tiene en común dos atributos el nombre (string) y precio (double) que deben heredar de la clase padre Producto,
pero además cada una van a tener dos atributos propios adicionales, sus métodos getter
y constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios).
Los atributos adicionales de cada clase se detalla en el siguiente diagrame de clase:

Para el ejemplo de la clase main se pide crear dos objetos por cada tipo de producto que deben ser almacenados
en un arreglo del tipo Producto, se debe mostrar iterando el arreglo, por cada uno el detalle completo,
el precio, nombre y los atributos adicionales.
*/

public class EjemploVerduleriaAlmacen {

    public static void main(String[] args) {
        Producto[ ] productos = new Producto[8];
        productos[0] = new Lacteo("Leche", 500, 3, 470);
        productos[1] = new Lacteo("Yogurt", 400, 2, 800);
        productos[2] = new Fruta("Manzana", 100, 250, "Rojo");
        productos[3] = new Fruta("Banana", 350, 410, "Amarillo");
        productos[4] = new Limpieza("Lavandina", 1200, "Lavandina", 1.5);
        productos[5] = new Limpieza("Perfumina", 1000, "Perfumina", 2.0);
        productos[6] = new NoPerecible("Harina", 500, 1, 500);
        productos[7] = new NoPerecible("Caramelos", 700, 50, 610);

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }
    }
}
