/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ordenaminetos.main;

import static mx.itson.ordenamientos.business.Ordenamiento_Quicksort.quickSort;

/**
 *
 * @author PC AGRA
 */
public class Main_Quicksort {
    public static void main(String[] args) {
        int[] arreglo = {12, 4, 9, 1, 5};

        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
    
    
}
