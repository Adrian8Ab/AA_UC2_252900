/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.ordenamientos.ordenamientos;

/**
 *
 * @author PC AGRA
 */
public class Ordenamientos {

    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de Bubble Sort.
     * Recorre el arreglo varias veces y compara elementos adyacentes,
     * intercambiándolos si están en el orden incorrecto.
     *
     * @param arr Arreglo de enteros a ordenar.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Obtiene la longitud del arreglo.

        // Recorre el arreglo (n - 1) veces.
        for (int i = 0; i < n - 1; i++) { 
            // Recorre el arreglo desde el inicio hasta la posición (n - i - 1),
            // ya que en cada iteración los elementos más grandes se van colocando al final.
            for (int j = 0; j < n - i - 1; j++) { 
                // Compara el elemento actual con el siguiente.
                if (arr[j] > arr[j + 1]) { 
                    // Si el elemento actual es mayor que el siguiente, se intercambian.
                    int temp = arr[j]; // Guarda el valor del elemento actual en una variable temporal.
                    arr[j] = arr[j + 1]; // Mueve el elemento siguiente a la posición actual.
                    arr[j + 1] = temp; // Coloca el valor guardado en la posición siguiente.
                }
            }
        }
    }
}
