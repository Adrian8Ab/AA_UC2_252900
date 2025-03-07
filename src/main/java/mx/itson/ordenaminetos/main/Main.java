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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Ingreso de elementos
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Ordenar con Bubble Sort
        Ordenamientos.bubbleSort(arr);

        // Mostrar arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

    

