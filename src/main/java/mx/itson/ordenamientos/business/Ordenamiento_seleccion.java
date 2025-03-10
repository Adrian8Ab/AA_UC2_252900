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
    // Método que implementa el algoritmo de ordenamiento por selección
    public static void Ordenamiento_seleccion(int[] lista) {
        int n = lista.length; // (1) Asignación de la longitud del arreglo
        
        // Recorre el arreglo hasta la penúltima posición
        for (int i = 0; i < n - 1; i++) {
            int minimo = i; // (2) Se asume que el mínimo está en la posición i
            
            // Busca el menor elemento en la parte no ordenada
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minimo]) { // (3) Comparación: verifica si lista[j] es menor que lista[minimo]
                    minimo = j; // (4) Asignación de un nuevo mínimo si se encuentra un valor menor
                }
            }
            
            // Intercambiar elementos si se encontró un nuevo mínimo
            int temp = lista[i]; // (5) Almacena temporalmente el valor de lista[i]
            lista[i] = lista[minimo]; // (6) Asigna el valor mínimo encontrado a lista[i]
            lista[minimo] = temp; // (7) Completa el intercambio colocando el valor original en lista[minimo]
            
            //Operacionesraciones elemetales = 7
        }
    }
}