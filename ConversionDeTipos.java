public class ConversionDeTipos {
    public static void main(String[] args) {
        //Modo 1
        int otroNumeroInt = 100;
        System.out.println("Otro numero Int: " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Otro numero Str: " + otroNumeroStr);

        //Modo 2
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("Otro numero Str: " + otroNumeroStr);

        //Forzar conversion
        int i = 1000;
        short s = (short) i;
        System.out.println("s: " + s);
    }
}
