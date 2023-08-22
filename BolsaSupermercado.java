import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto> {
    private List<T> productos;

    //public BolsaSupermercado(List<T> productos) {
    //    this.productos = productos;
    //}

    public BolsaSupermercado() {
        productos = new ArrayList<>();
    }

    public void addProducto(T producto) {
        if (productos.size() < 5) {
            productos.add(producto);
        } else {
            System.out.println("No hay mas espacio");
        }
    }

    public List<T> getProductos() {
        return productos;
    }
}
