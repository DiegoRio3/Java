import java.util.List;

public class EjemploBolsa {

    public static void main(String[] args) {
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProducto(new Lacteo("Leche Entera", 500, 2, 800));
        bolsaLacteos.addProducto(new Lacteo("Yogurt Bebible", 400, 4, 500));
        bolsaLacteos.addProducto(new Lacteo("Manteca", 900, 3, 1200));
        bolsaLacteos.addProducto(new Lacteo("Danette", 500, 4, 100));
        bolsaLacteos.addProducto(new Lacteo("Queso Cremoso", 1000, 1, 1500));

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.addProducto(new Fruta("Manzana", 500, 200, "Rojo"));
        bolsaFrutas.addProducto(new Fruta("Banana", 700, 300, "Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Sandia", 1000, 3000, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Palta", 800, 350, "Negro"));
        bolsaFrutas.addProducto(new Fruta("Mandarina", 250, 250, "Naranja"));

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Skip", 1000, "Liquido para lavar ropa", 5));
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 500, "Liquido lavaplatos", 2));
        bolsaLimpieza.addProducto(new Limpieza("Shampoo", 800, "Shampoo", 1));
        bolsaLimpieza.addProducto(new Limpieza("Acondicionador", 900, "Acondicionador", 1));
        bolsaLimpieza.addProducto(new Limpieza("Jabón Liquido", 400, "Jabón Liquido", 0.5));

        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();
        bolsaNoPerecible.addProducto(new NoPerecible("Lentejas", 500, 100, 400));
        bolsaNoPerecible.addProducto(new NoPerecible("Arroz", 400, 1000, 500));
        bolsaNoPerecible.addProducto(new NoPerecible("Fideos", 300, 800, 300));
        bolsaNoPerecible.addProducto(new NoPerecible("Harina", 500, 1000, 600));
        bolsaNoPerecible.addProducto(new NoPerecible("Aceite", 1200, 1500, 900));

        System.out.println("=*=*=*=*=*=*= Lácteos =*=*=*=*=*=*=");
        detalleBolsa(bolsaLacteos);
        System.out.println("\n=*=*=*=*=*=*= Frutas =*=*=*=*=*=*=");
        detalleBolsa(bolsaFrutas);
        System.out.println("\n=*=*=*=*=*=*= Artículos de Limpieza =*=*=*=*=*=*=");
        detalleBolsa(bolsaLimpieza);
        System.out.println("\n=*=*=*=*=*=*= No Perecibles =*=*=*=*=*=*=");
        detalleBolsa(bolsaNoPerecible);
    }

    public static <T extends Producto> void detalleBolsa(BolsaSupermercado<T> bolsa) {
        List<T> productos = bolsa.getProductos();

        for (T producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());

            if (producto instanceof Fruta fruta) {
                System.out.println("Peso: " + fruta.getPeso());
                System.out.println("Color: " + fruta.getColor());

            } else if (producto instanceof Limpieza limpieza) {
                System.out.println("Componentes: " + limpieza.getComponentes());
                System.out.println("Litros: " + limpieza.getLitros());

            } else if (producto instanceof Lacteo lacteo) {
                System.out.println("Cantidad: " + lacteo.getCantidad());
                System.out.println("Proteínas: " + lacteo.getProteinas());

            } else if (producto instanceof NoPerecible noPerecible) {
                System.out.println("Contenido: " + noPerecible.getContenido());
                System.out.println("Calorías: " + noPerecible.getCalorias());
            }

            System.out.println();
        }
    }
}
