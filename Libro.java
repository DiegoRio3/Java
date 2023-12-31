import java.util.Date;

public class Libro extends Producto implements ILibro, IProducto {
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial, Date fechaPublicacion) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() + (getPrecio() * 0.5);
    }
}
