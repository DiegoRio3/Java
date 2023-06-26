import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor generado en el objeto properties");
            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println("ps.getProperty(\"config.puerto.servidor\") = " + ps.getProperty("config.puerto.servidor"));
            System.out.println("ps.getProperty(\"config.autor.nombre\") = " + ps.getProperty("config.autor.nombre"));
            System.out.println("ps.getProperty(\"config.autor.email\") = " + ps.getProperty("config.autor.email"));
            ps.list(System.out);
        } catch(Exception e) {
            System.out.println("no existe el archivo " + e);
        }
    }
}
