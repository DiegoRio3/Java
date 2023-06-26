import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingrese la fecha de nacimiento con formato 'dd-MM-yyyy', para calcular la edad: ");
        try {
            Date fechaActual = new Date();
            Date fechaNacimiento = format.parse(scanner.next());
            //System.out.println("fechaActual = " + fechaActual);
            //System.out.println("fechaNacimiento = " + fechaNacimiento);
            String fechaActualStr = format.format(fechaActual);
            String fechaNacimientoStr = format.format(fechaNacimiento);
            System.out.println("fechaActualStr = " + fechaActualStr);
            System.out.println("fechaNacimientoStr = " + fechaNacimientoStr);
            int edad = fechaActual.getYear() - fechaNacimiento.getYear();
            System.out.println("edad = " + edad);

            LocalDate f1 = LocalDate.of(1990, 1, 18);
            LocalDate f2 = LocalDate.now();

            Period period = Period.between(f1, f2);

            System.out.println("Tienes " + period.getYears() + " años");

            if(fechaNacimiento.getMonth()>fechaActual.getMonth() || (fechaNacimiento.getMonth()==fechaActual.getMonth()&&fechaNacimiento.getDay()>fechaActual.getDay()))
                edad=edad-1;

            System.out.println("edad = " + edad);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo
java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos más adelante, también se pueden
apoyar de google que hay varios ejemplos.
 */
