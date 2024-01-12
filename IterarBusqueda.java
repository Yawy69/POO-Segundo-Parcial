/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interar;

/**
 *
 * @author Yannick
 */
import java.util.Arrays;

public class Busqueda {
    public static class ResultadoBusqueda {
        boolean encontrado;
        int posicion;
        double tiempo;

        public ResultadoBusqueda(boolean encontrado, int posicion, double tiempo) {
            this.encontrado = encontrado;
            this.posicion = posicion;
            this.tiempo = tiempo;
        }
    }

    public static ResultadoBusqueda busquedaBinaria(int[] lista, int objetivo) {
        long inicio = System.currentTimeMillis();
        Arrays.sort(lista);

        int izquierda = 0;
        int derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int valorMedio = lista[medio];

            if (valorMedio == objetivo) {
                double fin = System.currentTimeMillis();
                double tiempo = (fin - inicio) / 1000.0; // Convertir a segundos
                return new ResultadoBusqueda(true, medio, tiempo);
            } else if (valorMedio < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        double fin = System.currentTimeMillis();
        double tiempo = (fin - inicio) / 1000.0; // Convertir a segundos
        return new ResultadoBusqueda(false, -1, tiempo);
    }

    public static ResultadoBusqueda busquedaLineal(int[] lista, int objetivo) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == objetivo) {
                double fin = System.currentTimeMillis();
                double tiempo = (fin - inicio) / 1000.0; // Convertir a segundos
                return new ResultadoBusqueda(true, i, tiempo);
            }
        }

        double fin = System.currentTimeMillis();
        double tiempo = (fin - inicio) / 1000.0; // Convertir a segundos
        return new ResultadoBusqueda(false, -1, tiempo);
    }

    public static void main(String[] args) {
        int[] miLista = new int[1_000_000];
        for (int i = 0; i < miLista.length; i++) {
            miLista[i] = i + 1;
        }

        int objetivo = 500000;

        ResultadoBusqueda resultadoBinaria = busquedaBinaria(miLista, objetivo);
        ResultadoBusqueda resultadoLineal = busquedaLineal(miLista, objetivo);

        if (resultadoBinaria.encontrado) {
            System.out.println("Búsqueda binaria: El número " + objetivo + " se encuentra en la posición " + resultadoBinaria.posicion + ".");
            System.out.println("Tiempo de ejecución: " + resultadoBinaria.tiempo + " segundos.");
        } else {
            System.out.println("Búsqueda binaria: El número " + objetivo + " no se encuentra en la lista.");
            System.out.println("Tiempo de ejecución: " + resultadoBinaria.tiempo + " segundos.");
        }

        if (resultadoLineal.encontrado) {
            System.out.println("Búsqueda lineal: El número " + objetivo + " se encuentra en la posición " + resultadoLineal.posicion + ".");
            System.out.println("Tiempo de ejecución: " + resultadoLineal.tiempo + " segundos.");
        } else {
            System.out.println("Búsqueda lineal: El número " + objetivo + " no se encuentra en la lista.");
            System.out.println("Tiempo de ejecución: " + resultadoLineal.tiempo + " segundos.");
        }
    }
}