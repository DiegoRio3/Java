public class Tigre extends Felino {
    private String especieTigre;

    public Tigre() {
    }

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "Un Tigre puede consumir 40 kg de carne de una vez.";
    }

    @Override
    public String dormir() {
        return "Un Tigre duerme casi 16 hs diarias.";
    }

    @Override
    public String correr() {
        return "Un Tigre alcanza los " + velocidad + " 65 km/h.";
    }

    @Override
    public String comunicarse() {
        return "Tal como el " + especieTigre + "Un tigre es capaz de hacer rugidos impresionantemente fuertes, y el ruido de estos se puede escuchar a más de tres kilómetros.";
    }

    @Override
    public String toString() {
        return "Especie= '" + especieTigre + '\'' +
                ", Tamaño de Garras= " + tamanoGarras +
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
