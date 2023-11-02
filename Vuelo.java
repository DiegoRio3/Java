/*
Una lista de objetos List del tipo Vuelo que mantenga el mismo orden de registro de la tabla.
La clase Vuelo debe contener los atributos nombre (string), origen (string), destino (string),
fecha de llegada que incluya fecha y hora (java.util.Date) y cantidad de pasajeros.
Se pide ordenar por llagada de forma ascendente, obtener el ultimo vuelo en llegar y también
se pide el vuelo que tiene menor número de pasajeros.
Como recurso se adjunta la tabla en Excel.
El resultado final debería ser, similar a:

    ... listado ordenado por fecha llegada ascendente ...
    El último vuelo en llegar es CMP 111: Panama City, aterriza el Tue Aug 31 15:15:00 2021
    El vuelo con menor número de pasajeros es AVA 241: Bogota, con 25 pasajeros.
*/

package org.diego.vuelo;

import java.util.Date;

public class Vuelo {
    String nombre;
    String origen;
    String destino;
    Date fechaLlegada;
    int cantidadPasajeros;

    public Vuelo() {
    }

    public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo = '" + nombre + '\'' +
                ", origen = '" + origen + '\'' +
                ", destino = '" + destino + '\'' +
                ", fecha de llegada = " + fechaLlegada +
                ", Pasajeros = " + cantidadPasajeros;
    }
}
