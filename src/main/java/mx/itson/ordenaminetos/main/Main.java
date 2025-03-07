/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ordenaminetos.main;
 import java.util.Scanner;
import mx.itson.ordenamientos.ordenamientos.Ordenamientos;
/**
 *
 * @author PC AGRA
 */
public class Main {
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario.

        // Solicitar al usuario el tamaño del arreglo.
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt(); // Lee el tamaño del arreglo ingresado por el usuario.
        int[] arr = new int[n]; // Declara e inicializa un arreglo de tamaño 'n'.

        // Solicitar al usuario los elementos del arreglo.
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) { // Itera desde 0 hasta n-1 para llenar el arreglo.
            System.out.print("Elemento " + (i + 1) + ": "); // Muestra el número del elemento a ingresar.
            arr[i] = scanner.nextInt(); // Lee un número ingresado por el usuario y lo almacena en el arreglo.
        }

        // Llamar al método bubbleSort de la clase Ordenamientos para ordenar el arreglo.
        Ordenamientos.bubbleSort(arr);

        // Mostrar el arreglo ordenado.
        System.out.println("Arreglo ordenado:");
        for (int num : arr) { // Recorre el arreglo ordenado e imprime cada elemento.
            System.out.print(num + " "); // Muestra cada número separado por un espacio.
        }
    }
}
    

