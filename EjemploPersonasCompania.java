public class EjemploPersonasCompania {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Roco", "Sullivan", "M12t",
                "Avellaneda 1900", 60000.0, 1, 50000);
        gerente.aumentarRemuneracion(150);
        gerente.setPresupuesto(180000);

        System.out.println(gerente);
    }
}
