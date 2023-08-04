public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro() {
    }

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Con una fuerza de mordida de " + fuerzaMordida +", un perro se alimenta fundamentalmente de carne, es su mayor fuente de energía y de aportación de proteínas. Pero también complementa este alimento con frutas, hortalizas o pescado."
                + "Con un tamaño de colmillos de " + tamanoColmillos;
    }

    @Override
    public String dormir() {
        return "El perro duerme entre 12 y 14 horas al dia.";
    }

    @Override
    public String correr() {
        return "En promedio un perro puede correr entre 20 y 32 km/h.";
    }

    @Override
    public String comunicarse() {
        return "La comunicación de un perro puede ser con ladridos, gruñidos, lloriqueo, grito, aullido, suspiro, jadeo.";
    }

    @Override
    public String toString() {
        return "fuerzaMordida= " + fuerzaMordida +
                ", Color= '" + color + '\'' +
                ", Tamaño Colmillos= " + tamanoColmillos +
                ", Habitat= '" + habitat + '\'' +
                ", Altura= " + altura +
                ", Largo= " + largo +
                ", Peso= " + peso +
                ", Nombre Científico= '" + nombreCientifico + "'" +
                "\n" + dormir() +
                "\n" + comer() +
                "\n" + correr() +
                "\n" + comunicarse();
    }
}
