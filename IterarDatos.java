/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interar;

/**
 *
 * @author Yannick
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class DatosJava {
    public static void main(String[] args) {
        List<Integer> listaDatos = new ArrayList<>();

        // Generar la lista de 5000 números enteros del 1 al 5000
        for (int i = 1; i <= 5000; i++) {
            listaDatos.add(i);
        }

        // Desordenar la lista
        Collections.shuffle(listaDatos);

        boolean primeraVez = true;
        boolean continuarBusqueda = true;
        Scanner scanner = new Scanner(System.in);

        do {
            if (primeraVez) {
                
                System.out.println("***Lista de numero de Yannick***");
                int contador = 0;
                for (Integer dato : listaDatos) {
                    System.out.print(dato + " ");
                    contador++;
                    if (contador % 100 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
                primeraVez = false;
            }

            
            System.out.print("Ingrese un numero para buscar (si quiere terminar la busqueda ingrese 0): ");
            int numeroBuscar = scanner.nextInt();

            if (numeroBuscar == 0) {
                continuarBusqueda = false;
            } else {
                
                Instant tiempoInicio = Instant.now();
                int posicion = -1;
                for (int i = 0; i < listaDatos.size(); i++) {
                    if (listaDatos.get(i) == numeroBuscar) {
                        posicion = i;
                        break;
                    }
                }
                Instant tiempoFin = Instant.now();
                Duration tiempoTranscurrido = Duration.between(tiempoInicio, tiempoFin);

                // Mostrar el resultado de la búsqueda con milisegundos con 8 decimales
                if (posicion != -1) {
                    System.out.println("El numero " + numeroBuscar + " se encontro en la posicion: " + posicion);
                } else {
                    System.out.println("El numero " + numeroBuscar + " no se encontro en la lista.");
                }
                System.out.printf("Tiempo de busqueda: %.8f milisegundos\n\n", tiempoTranscurrido.toNanos() / 1_000_000.0);
            }
        } while (continuarBusqueda);

        System.out.println("---Yawy se despide---");
    }
}