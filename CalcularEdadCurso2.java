import java.util.*;
import java.text.*;

class CalcularEdadCurso2 {
    public static void main(String arg[]) throws ParseException
    {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yy");
        Date d = sdf1.parse("12-04-1968 11:23:45");
        String s = sdf2.format(d); System.out.println(s);
        System.out.println("d = " + d);
    }
}