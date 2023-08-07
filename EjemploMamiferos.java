public class EjemploMamiferos {

    public static void main(String[] args) {
        Mamifero[] mamiferos = {new Leon("Sudafrica", 1.2, 1.9, 190, "Panthera Leo", 0.10, 74, 15, 110),
                new Tigre("India", 1.2, 3.50, 250, "Panthera Tigris", 7.5, 65, "Bengala"),
                new Guepardo("Sabana Africana", 0.9, 1.5, 60, "Acinonyx Jubatus", 0.03, 130),
                new Lobo("Norte America", 0.9, 1.6, 55, "Canis Lupus", "Blanco", 3.5, 3, "Tibetano"),
                new Perro("Domestico", 0.7, 0.5, 50, "Canis Lupus Familiaris", "Marron", 3.0, 230)
        };

       for (Mamifero animal : mamiferos) {
           if (null != animal) {
               System.out.println("Información del mamífero: " + animal.getClass().getSimpleName() +
                       ", de la familia de los " + animal.getClass().getSuperclass().getSimpleName());
               System.out.println(animal);
           }
           System.out.println();
       }
    }
}
