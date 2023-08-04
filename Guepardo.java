public class Guepardo extends Felino {
    public Guepardo() {
    }

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "La gacela Thompson es la presa más común del guepardo debido a la inferioridad en volumen y masa corporal."
                + "Tienen ana garra de " + tamanoGarras + " centímetros.";
    }

    @Override
    public String dormir() {
        return "El Guepardo puede dormir aproximadamente 12 horas por dia.";
    }

    @Override
    public String correr() {
        return "El Guepardo alcanza la velocidad maxima de 130 km/h.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo no es capaz de rugir, pero si tiene un repertorio de vocalizaciones basadas en gruñidos y ronroneos.";
    }

    @Override
    public String toString() {
        return "Tamaño Garras= " + tamanoGarras +
                ", Velocidad= " + velocidad +
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
