/*

Assignment 28: Hilo Alfanumérico

Para la tarea se pide implementar una clase llamada org.diego.alfanumerico.runnable.AlfanumericoTarea que implemente la interface Runnable,
y tenga como atributo un enum llamado org.diego.alfanumerico.threads.Tipo.
El enum org.diego.alfanumerico.threads.Tipo tiene dos elementos NUMERO Y LETRA.
Si el tipo es NUMERO, mostrara los números del 1 al 10, excluyente el último.
Si el tipo es LETRA, mostrar las letras de la 'A' a la 'Z', inclusivo el último.
Crea un par de hilos de diferentes tipos y ejecutarlos.

 */

package org.diego.alfanumerico.runnable;

import org.diego.alfanumerico.threads.Tipo;

import static org.diego.alfanumerico.threads.EjemploAlfanumericoTarea.imprimirHilo;

public class AlfanumericoTarea implements Runnable {
    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        imprimirHilo(this.tipo);
    }
}
