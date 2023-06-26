import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMath, claseHis, claseLen;
        double sumMath = 0, sumHis = 0, sumaLen = 0;
        claseMath = new double[5];
        claseHis = new double[5];
        claseLen = new double[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 5 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMath.length; i++) {
            claseMath[i] = s.nextDouble();
            sumMath += claseMath[i];
        }
        System.out.println("Ingrese 5 notas de estudiantes para historia");
        for (int i = 0; i < claseHis.length; i++) {
            claseHis[i] = s.nextDouble();
            sumHis += claseHis[i];
        }
        System.out.println("Ingrese 5 notas de estudiantes para lengua");
        for (int i = 0; i < claseLen.length; i++) {
            claseLen[i] = s.nextDouble();
            sumaLen += claseLen[i];
        }
        //la suma de las notas en el curso te las da con otro for pero me pareció innecesario
        double promMath = (sumMath/ claseMath.length);
        double promHis = (sumHis/ claseHis.length);
        double promLen = (sumaLen/claseLen.length);
        System.out.println("Promedio clase matemática: " + promMath);
        System.out.println("Promedio clase historia: " + promHis);
        System.out.println("Promedio clase lengua: " + promLen);
        double promedioTotal = (promHis + promLen + promMath)/3;
        System.out.println("Promedio total del curso: " + promedioTotal);
        System.out.println("Ingrese el identificador del alumno (de 0 a 6): ");
        int id = s.nextInt();
        double promedioAlumno = (claseMath[id] + claseHis[id] + claseLen[id])/3;
        System.out.println("Promedio alumno nro: " + id + ": " + promedioAlumno);
    }
}
