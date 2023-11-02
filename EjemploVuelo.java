package org.diego.vuelo;

import java.util.*;

public class EjemploVuelo {

    public static void main(String[] args) {
        LinkedList<Vuelo> vuelos = new LinkedList<>();

        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", new Date(2021, Calendar.AUGUST, 29, 5, 39), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", new Date(2021, Calendar.AUGUST, 31, 4, 45), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", new Date(2021, Calendar.AUGUST, 30, 16, 0), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", new Date(2021, Calendar.AUGUST, 29, 13, 22), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", new Date(2021, Calendar.AUGUST, 31, 14, 5), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", new Date(2021, Calendar.AUGUST, 31, 5, 20), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", new Date(2021, Calendar.AUGUST, 30, 8, 45), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", new Date(2021, Calendar.AUGUST, 29, 7, 41), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", new Date(2021, Calendar.AUGUST, 30, 10, 35), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Angeles", "Santiago", new Date(2021, Calendar.AUGUST, 29, 9, 14), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", new Date(2021, Calendar.AUGUST, 31, 8, 33), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", new Date(2021, Calendar.AUGUST, 31, 15, 15), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", new Date(2021, Calendar.AUGUST, 30, 8, 14), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", new Date(2021, Calendar.AUGUST, 29, 22, 53), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", new Date(2021, Calendar.AUGUST, 31, 9, 57), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", new Date(2021, Calendar.AUGUST, 31, 4, 0), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", new Date(2021, Calendar.AUGUST, 29, 7, 45), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas Fort Worth", "Santiago", new Date(2021, Calendar.AUGUST, 30, 7, 12), 58));
        vuelos.add(new Vuelo("LAT 501", "Paris", "Santiago", new Date(2021, Calendar.AUGUST, 29, 18, 29), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", new Date(2021, Calendar.AUGUST, 30, 15, 45), 39));

        System.out.println("Elementos de la lista: ");

        for (Vuelo v : vuelos) {
            System.out.println(v);
        }

        vuelos.sort(Comparator.comparing(Vuelo::getFechaLlegada));
        System.out.println("\nElementos de la lista ordenados por llegada de forma ascendente: ");

        for (Vuelo v : vuelos) {
            System.out.println(v);
        }

        System.out.println("\nEl ultimo vuelo en llegar es: " + vuelos.getLast().getNombre() + " " +
                vuelos.getLast().getOrigen() + ", aterriza el " + vuelos.getLast().getFechaLlegada());

        vuelos.sort(Comparator.comparing(Vuelo::getCantidadPasajeros));
        System.out.println("\nEl vuelo con menor cantidad de pasajeros es: " + vuelos.getFirst().getNombre() +
                " con " + vuelos.getFirst().getCantidadPasajeros() + " pasajeros.");
    }
}
