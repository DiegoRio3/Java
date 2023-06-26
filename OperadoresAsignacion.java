public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;
        i += 2;
        j -= 3;
        j *= 3;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        String sqlString = "select * from clientes";
        sqlString += " as c";
        sqlString += " where c.nombre='Andres'";
        System.out.println("sqlString = " + sqlString);
    }
}
