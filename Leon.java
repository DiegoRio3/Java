public class Leon extends Felino {
    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon() {
    }

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El Leon y su manada de " + numManada
                + ", se alimentan, siendo capaces de ingerir 30 kg de carne cada uno.";
    }

    @Override
    public String dormir() {
        return "Los leones duermen hasta 20 hs por día.";
    }

    @Override
    public String correr() {
        return "Como máximo, el leon corre 74 km/h, en periodos muy cortos";
    }

    @Override
    public String comunicarse() {
        return "El leon ruge con una potencia de " + potenciaRugidoDecibel
                + " decibeles, alcanzando 8 km de distancia.";
    }

    @Override
    public String toString() {
        return "Numero de Manada= " + numManada +
                ", Potencia Rugido en Decibeles= " + potenciaRugidoDecibel +
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
