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
        int n = arr.length; // (1) Asignación de la longitud del arreglo.

        // Recorre el arreglo (n - 1) veces.
        for (int i = 0; i < n - 1; i++) { // (2) Inicialización de 'i', (3) Comparación, (4) Incremento.
            // Recorre el arreglo desde el inicio hasta la posición (n - i - 1).
            for (int j = 0; j < n - i - 1; j++) { // (5) Inicialización de 'j', (6) Comparación, (7) Incremento.
                // Compara el elemento actual con el siguiente.
                if (arr[j] > arr[j + 1]) { // (8) Comparación de dos elementos.
                    // Si el elemento actual es mayor que el siguiente, se intercambian.
                    int temp = arr[j]; // (9) Asignación del valor actual a una variable temporal.
                    arr[j] = arr[j + 1]; // (10) Asignación del valor siguiente al actual.
                    arr[j + 1] = temp; // (11) Asignación del valor temporal a la siguiente posición.
                    
                    //TOTAL DE OPERACIONES = 11
                }
            }
        }
    }
}
