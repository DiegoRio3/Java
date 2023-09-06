import java.util.Date;

public class Comics extends Libro implements IProducto {
    private String personaje;

    public Comics(int precio, String autor, String titulo, String editorial, Date fechaPublicacion, String personaje) {
        super(precio, autor, titulo, editorial, fechaPublicacion);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() + (getPrecio() * 0.5);
    }
}
