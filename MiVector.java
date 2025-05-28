/**
 * Clase MiVector
 * Gestiona un array de enteros con operaciones básicas.
 * Autor: Yasir Halifi
 * Versión: 1.0
 * Fecha: 25/11/2024
 */

import java.util.Scanner;

public class MiVector {
    private int[] v;
    private int tam;

    /**
     * Constructor que inicializa el array con tamaño fijo de 3.
     */
    public MiVector() {
        tam = 3;
        v = new int[tam];
    }

    /**
     * Comprueba si el array está vacío (tamaño igual a 0).
     * @return true si el array está vacío, false en caso contrario.
     */
    public boolean arrayVacio() {
        if (tam == 0) {
            return true;
        }
        return false;
    }

    /**
     * Permite al usuario introducir valores por teclado en el array.
     * Solicita exactamente tantos valores como el tamaño del array.
     * @throws java.util.InputMismatchException si se introduce un valor no entero.
     */
    public void valorArray() {
        System.out.println("Introduce " + tam + " valores:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tam; i++) {
            v[i] = scanner.nextInt();
        }
    }

    /**
     * Muestra por pantalla todos los valores del array.
     */
    public void muestraArray() {
        for (int i = 0; i < tam; i++) {
            System.out.println(v[i]);
        }
    }

    /**
     * Devuelve el tamaño del array.
     * @return número de elementos del array.
     */
    public int getTam() {
        return tam;
    }

    /**
     * Vacía el array reduciendo su tamaño a cero.
     */
    public void vaciaArray() {
        do {
            tam--;
        } while (tam != 0);
    }
}
