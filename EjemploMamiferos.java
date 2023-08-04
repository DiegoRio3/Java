public class EjemploMamiferos {

    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Sudafrica", 1.2, 1.9, 190, "Panthera Leo", 0.10, 74, 15, 110);
        Mamifero tigre = new Tigre("India", 1.2, 3.50, 250, "Panthera Tigris", 7.5, 65, "Bengala");
        Mamifero guepardo = new Guepardo("Sabana Africana", 0.9, 1.5, 60, "Acinonyx Jubatus", 0.03, 130);
        Mamifero lobo = new Lobo("Norte America", 0.9, 1.6, 55, "Canis Lupus", "Blanco", 3.5, 3, "Tibetano");
        Mamifero perro = new Perro("Domestico", 0.7, 0.5, 50, "Canis Lupus Familiaris", "Marron", 3.0, 230);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

       for (Mamifero animal : mamiferos) {
           if (animal != null) {
               System.out.println("Información del mamífero: " + animal.getClass().getSimpleName() +
                       ", de la familia de los " + animal.getClass().getSuperclass().getSimpleName());
               System.out.println(animal);
           }
           System.out.println();
       }
    }
}
