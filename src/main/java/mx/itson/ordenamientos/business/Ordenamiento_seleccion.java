/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ordenamientos.business;
/**
 *
 * @author PC AGRA
 */
public class Ordenamiento_seleccion {
    public static void Ordenamiento_seleccion(int[] lista) {
       
        int n = lista.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minimo]) {
                    minimo = j;
                }
            }
            // Intercambiar elementos
            int temp = lista[i];
            lista[i] = lista[minimo];
            lista[minimo] = temp;
        }
    }
    
}
