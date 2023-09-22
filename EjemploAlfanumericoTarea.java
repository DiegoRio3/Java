package org.diego.alfanumerico.threads;

import org.diego.alfanumerico.runnable.AlfanumericoTarea;

public class EjemploAlfanumericoTarea {

    public static void main(String[] args) {
        new Thread(new AlfanumericoTarea(Tipo.NUMERO)).start();
        new Thread(new AlfanumericoTarea(Tipo.LETRA)).start();
    }

    public synchronized static void imprimirHilo (Tipo tipo) {
        if (tipo == Tipo.NUMERO) {
            for (int i = 1; i < 10; i++) {
                System.out.println("Numero: " + i);
            }

        } else if (tipo == Tipo.LETRA) {
            for (char letra = 'A'; letra <= 'Z'; letra++) {
                System.out.println(letra);
            }
        }
    }
}

/*
Diferencias con el ChatGPT:

org.diego.alfanumerico.runnable.AlfanumericoTarea tareaNumero = new org.diego.alfanumerico.runnable.AlfanumericoTarea(org.diego.alfanumerico.threads.Tipo.NUMERO);
org.diego.alfanumerico.runnable.AlfanumericoTarea tareaLetra = new org.diego.alfanumerico.runnable.AlfanumericoTarea(org.diego.alfanumerico.threads.Tipo.LETRA);
Thread hiloNumero = new Thread(tareaNumero);
Thread hiloLetra = new Thread(tareaLetra);
hiloNumero.start();
hiloLetra.start();

Usar:
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
*/