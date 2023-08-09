public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo() {
    }

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + color + " suele comer entre 3 y 3,5 kg de carne.";
    }

    @Override
    public String dormir() {
        return "El lobo " + especieLobo + " duerme un promedio de 8 horas.";
    }

    @Override
    public String correr() {
        return "EL lobo alcanza una velocidad maxima de 60 km/h. El lobo tiene una camada de " + numCamada;
    }

    @Override
    public String comunicarse() {
        return "Los Lobos se comunican entre ellos con aullidos, lenguaje del cuerpo, y aroma. Aullar se usa para semblar el grupo, comunicar entre ellos mismos, y para proteger sus territorios. Durante la noche, los aullidos se pueden escuchar kilómetros de donde están.";
    }

    @Override
    public String toString() {
        return "Numero Camada= " + numCamada +
                ", Especie= '" + especieLobo + '\'' +
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
